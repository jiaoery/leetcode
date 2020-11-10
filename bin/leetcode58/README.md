# 解题思路

## 引入正则

第一思路就是根据空格的正则方法来解决这个问题。但是在解题的过程中遇到了一些问题

* 引入判断的正则  ''\\\s+''这里的意思是按照空格（\\t）区分
* 根据切割后的字符数组，判断长度

本来很完美，但是解题过程中发现了不少问题。

* 1.开头为空格的时候会多算一个字符串
* 2.结尾为空格的是hi会多算一个字符串

最终在操作前，将原来的字符串trim()

```java
/**
     * Returns a string whose value is this string, with any leading and trailing
     * whitespace removed.
     * <p>
     * If this {@code String} object represents an empty character
     * sequence, or the first and last characters of character sequence
     * represented by this {@code String} object both have codes
     * greater than {@code '\u005Cu0020'} (the space character), then a
     * reference to this {@code String} object is returned.
     * <p>
     * Otherwise, if there is no character with a code greater than
     * {@code '\u005Cu0020'} in the string, then a
     * {@code String} object representing an empty string is
     * returned.
     * <p>
     * Otherwise, let <i>k</i> be the index of the first character in the
     * string whose code is greater than {@code '\u005Cu0020'}, and let
     * <i>m</i> be the index of the last character in the string whose code
     * is greater than {@code '\u005Cu0020'}. A {@code String}
     * object is returned, representing the substring of this string that
     * begins with the character at index <i>k</i> and ends with the
     * character at index <i>m</i>-that is, the result of
     * {@code this.substring(k, m + 1)}.
     * <p>
     * This method may be used to trim whitespace (as defined above) from
     * the beginning and end of a string.
     *
     * @return  A string whose value is this string, with any leading and trailing white
     *          space removed, or this string if it has no leading or
     *          trailing white space.
     */
    public String trim() {
        int len = value.length;
        int st = 0;
        char[] val = value;    /* avoid getfield opcode */

        while ((st < len) && (val[st] <= ' ')) {
            st++;
        }
        while ((st < len) && (val[len - 1] <= ' ')) {
            len--;
        }
        return ((st > 0) || (len < value.length)) ? substring(st, len) : this;
    }
```

简单解释就是去除掉开头和结尾的空格。最后使用正则，就可以通过了

### 1.1 代码

```java
public int countSegments(String s) {
		String trim = s.trim();
        if(trim.equals("")){
            return 0; 
        }
        //使用正则匹配\s 代表空格
        String[] words = trim.split("\\s+");
        return words.length;
    }
```

### 1.2 复杂度分析

时间复杂度：O(n),`split` 内置函数时间复杂度为n

空间复杂度：O(n),`split` 内置空间复杂度为n

以下为split源码。

```java
/**
     * Splits this string around matches of the given
     * <a href="../util/regex/Pattern.html#sum">regular expression</a>.
     *
     * <p> The array returned by this method contains each substring of this
     * string that is terminated by another substring that matches the given
     * expression or is terminated by the end of the string.  The substrings in
     * the array are in the order in which they occur in this string.  If the
     * expression does not match any part of the input then the resulting array
     * has just one element, namely this string.
     *
     * <p> When there is a positive-width match at the beginning of this
     * string then an empty leading substring is included at the beginning
     * of the resulting array. A zero-width match at the beginning however
     * never produces such empty leading substring.
     *
     * <p> The {@code limit} parameter controls the number of times the
     * pattern is applied and therefore affects the length of the resulting
     * array.  If the limit <i>n</i> is greater than zero then the pattern
     * will be applied at most <i>n</i>&nbsp;-&nbsp;1 times, the array's
     * length will be no greater than <i>n</i>, and the array's last entry
     * will contain all input beyond the last matched delimiter.  If <i>n</i>
     * is non-positive then the pattern will be applied as many times as
     * possible and the array can have any length.  If <i>n</i> is zero then
     * the pattern will be applied as many times as possible, the array can
     * have any length, and trailing empty strings will be discarded.
     *
     * <p> The string {@code "boo:and:foo"}, for example, yields the
     * following results with these parameters:
     *
     * <blockquote><table cellpadding=1 cellspacing=0 summary="Split example showing regex, limit, and result">
     * <tr>
     *     <th>Regex</th>
     *     <th>Limit</th>
     *     <th>Result</th>
     * </tr>
     * <tr><td align=center>:</td>
     *     <td align=center>2</td>
     *     <td>{@code { "boo", "and:foo" }}</td></tr>
     * <tr><td align=center>:</td>
     *     <td align=center>5</td>
     *     <td>{@code { "boo", "and", "foo" }}</td></tr>
     * <tr><td align=center>:</td>
     *     <td align=center>-2</td>
     *     <td>{@code { "boo", "and", "foo" }}</td></tr>
     * <tr><td align=center>o</td>
     *     <td align=center>5</td>
     *     <td>{@code { "b", "", ":and:f", "", "" }}</td></tr>
     * <tr><td align=center>o</td>
     *     <td align=center>-2</td>
     *     <td>{@code { "b", "", ":and:f", "", "" }}</td></tr>
     * <tr><td align=center>o</td>
     *     <td align=center>0</td>
     *     <td>{@code { "b", "", ":and:f" }}</td></tr>
     * </table></blockquote>
     *
     * <p> An invocation of this method of the form
     * <i>str.</i>{@code split(}<i>regex</i>{@code ,}&nbsp;<i>n</i>{@code )}
     * yields the same result as the expression
     *
     * <blockquote>
     * <code>
     * {@link java.util.regex.Pattern}.{@link
     * java.util.regex.Pattern#compile compile}(<i>regex</i>).{@link
     * java.util.regex.Pattern#split(java.lang.CharSequence,int) split}(<i>str</i>,&nbsp;<i>n</i>)
     * </code>
     * </blockquote>
     *
     *
     * @param  regex
     *         the delimiting regular expression
     *
     * @param  limit
     *         the result threshold, as described above
     *
     * @return  the array of strings computed by splitting this string
     *          around matches of the given regular expression
     *
     * @throws  PatternSyntaxException
     *          if the regular expression's syntax is invalid
     *
     * @see java.util.regex.Pattern
     *
     * @since 1.4
     * @spec JSR-51
     */
    public String[] split(String regex, int limit) {
        /* fastpath if the regex is a
         (1)one-char String and this character is not one of the
            RegEx's meta characters ".$|()[{^?*+\\", or
         (2)two-char String and the first char is the backslash and
            the second is not the ascii digit or ascii letter.
         */
        char ch = 0;
        if (((regex.value.length == 1 &&
             ".$|()[{^?*+\\".indexOf(ch = regex.charAt(0)) == -1) ||
             (regex.length() == 2 &&
              regex.charAt(0) == '\\' &&
              (((ch = regex.charAt(1))-'0')|('9'-ch)) < 0 &&
              ((ch-'a')|('z'-ch)) < 0 &&
              ((ch-'A')|('Z'-ch)) < 0)) &&
            (ch < Character.MIN_HIGH_SURROGATE ||
             ch > Character.MAX_LOW_SURROGATE))
        {
            int off = 0;
            int next = 0;
            boolean limited = limit > 0;
            ArrayList<String> list = new ArrayList<>();
            while ((next = indexOf(ch, off)) != -1) {
                if (!limited || list.size() < limit - 1) {
                    list.add(substring(off, next));
                    off = next + 1;
                } else {    // last one
                    //assert (list.size() == limit - 1);
                    list.add(substring(off, value.length));
                    off = value.length;
                    break;
                }
            }
            // If no match was found, return this
            if (off == 0)
                return new String[]{this};

            // Add remaining segment
            if (!limited || list.size() < limit)
                list.add(substring(off, value.length));

            // Construct result
            int resultSize = list.size();
            if (limit == 0) {
                while (resultSize > 0 && list.get(resultSize - 1).length() == 0) {
                    resultSize--;
                }
            }
            String[] result = new String[resultSize];
            return list.subList(0, resultSize).toArray(result);
        }
        return Pattern.compile(regex).split(this, limit);
    }
```

## 2.枚举法

虽然问题解决了，但是耗时和空间都比较大；是否可以在次基础上继续优化呢？

当然是。。。。有的。是否可以采取枚举的办法去采集符合条件的字符串呢

* 符合条件的字符串:
  *  首字母不为空格的字符串 如 “love”
  * 非首字母但是格式为 空格+字符 的字符串，如“love is love”

### 2.1 代码

```java
public int countSegments(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			//第一个不是空字符串，++1
			if(i==0&&s.charAt(i)!=' ') {
				count++;
			}
			
			if (i!=0&&s.charAt(i-1)==' '&&s.charAt(i)!=' ') {
				count++;
			}
			
		}
		return count;
	}
```

### 2.2 复杂度分析

时间复杂度： O(n) ,字符串需要被遍历一次

空间复杂度：O(n),仅仅使用常数级的额外空间

ps：最终提交结果很感人