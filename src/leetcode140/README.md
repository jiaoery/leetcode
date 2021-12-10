# 解题思路

想到的方式，就是用hashmap做字符统计，然后在根据word中每个字符的符合情况进行比较，若是都满足，就比较两个字符串的长短。具体代码如下：

# 1.HashMap 统计字符

## 1.1 代码

```java
public class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character,Integer> pairs = new HashMap<>();
        int count = 0;
        //summary
        for (int i = 0; i < licensePlate.length() ; i++) {
            char ch = licensePlate.toLowerCase().charAt(i);
            if (Character.isLowerCase(ch)){
                pairs.put(ch,pairs.getOrDefault(ch,0)+1);
                count++;
            }
        }

        int index = -1;
        for (int i = 0;i<words.length;i++) {
            int sum = 0;
            HashMap<Character,Integer> pair1 = (HashMap<Character, Integer>) pairs.clone();
            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].toLowerCase().charAt(j);
                if(pair1.getOrDefault(ch,0)!=0){
                    sum++;
                    pair1.put(ch,pair1.getOrDefault(ch,0)-1);
                }
            }
            if(sum==count && (index<0||words[index].length()>words[i].length())){
                index = i;
            }
        }

        return words[index];
    }
}
```

## 1.2 复杂度分析

* 时间复杂度：O(m+n),m为licensePlate的长度，n为words中所有字符串的长度
* 空间复杂度：O(C），C为hashmap需要的空间，由于这里只使用26个小写字母，那么空间复杂度最高为O(26),也就是O(1)

# 2.数组方式实现

由于空间中只要有26个小写字母；那么是否可以直接用一个长度为26的数组来比较呢？答案是肯定的，然后官方也是给的这个答案的方法，（自己写的效率比不过官方的），就直接贴官方实现方式了

## 2.1代码

```java
public class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] cnt = new int[26];
        for (int i = 0; i < licensePlate.length(); ++i) {
            char ch = licensePlate.charAt(i);
            if (Character.isLetter(ch)) {
                ++cnt[Character.toLowerCase(ch) - 'a'];
            }
        }
        int idx = -1;
        for (int i = 0; i < words.length; ++i) {
            int[] c = new int[26];
            for (int j = 0; j < words[i].length(); ++j) {
                char ch = words[i].charAt(j);
                ++c[ch - 'a'];
            }
            boolean ok = true;
            for (int j = 0; j < 26; ++j) {
                if (c[j] < cnt[j]) {
                    ok = false;
                    break;
                }
            }
            if (ok && (idx < 0 || words[i].length() < words[idx].length())) {
                idx = i;
            }
        }
        return words[idx];
    }
}
```

## 2.2 复杂度分析

* 时间复杂度：O(m+n),m为licensePlate的长度，n为words中所有字符串的长度
* 空间复杂度：O(C），C为hashmap需要的空间，由于这里只使用26个小写字母，那么空间复杂度最高为O(26),也就是O(1)