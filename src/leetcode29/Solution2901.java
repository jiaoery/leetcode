package leetcode29;

import java.util.Arrays;

/**
 * @ClassName: Solution2901.java
 * @Description:
 * 1.首先看到h个元素大于等于某个值，N-h个元素小于某个值，
 *   者显然是一个有序序列特征，所以自然而然的想到先将数组排序；
 *   
 * 2.将数组排序后，对于给定的某个i,我们知道citations.length-i篇论文的引用数
 * >=citations[i],i篇论文引用数<=citations[i]
 * 
 * 3.不妨设h=citations.length-i,即至多有h篇论文分别引用了至少citations[i]
 * 次，其中citations.length-h论文的引用数不多于citation[i]次。
 * 
 * 既然如此，只要citations[i]>=h，就满足题意
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年8月25日 上午10:27:36 
 */
public class Solution2901 {

	public int hIndex(int[] citations) {
		//先排序
		Arrays.sort(citations);
		for (int i = 0; i < citations.length; i++) {
			//当前的h的度
			int h = citations.length - i;
			if(h<=citations[i]) {
				return h;
			}
		}
		return 0;
    }
}
