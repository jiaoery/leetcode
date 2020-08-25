package leetcode29;

import java.util.Arrays;

/**
 * @ClassName: Solution2901.java
 * @Description:
 * 1.���ȿ���h��Ԫ�ش��ڵ���ĳ��ֵ��N-h��Ԫ��С��ĳ��ֵ��
 *   ����Ȼ��һ����������������������Ȼ��Ȼ���뵽�Ƚ���������
 *   
 * 2.����������󣬶��ڸ�����ĳ��i,����֪��citations.length-iƪ���ĵ�������
 * >=citations[i],iƪ����������<=citations[i]
 * 
 * 3.������h=citations.length-i,��������hƪ���ķֱ�����������citations[i]
 * �Σ�����citations.length-h���ĵ�������������citation[i]�Ρ�
 * 
 * ��Ȼ��ˣ�ֻҪcitations[i]>=h������������
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��8��25�� ����10:27:36 
 */
public class Solution2901 {

	public int hIndex(int[] citations) {
		//������
		Arrays.sort(citations);
		for (int i = 0; i < citations.length; i++) {
			//��ǰ��h�Ķ�
			int h = citations.length - i;
			if(h<=citations[i]) {
				return h;
			}
		}
		return 0;
    }
}
