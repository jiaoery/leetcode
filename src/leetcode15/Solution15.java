package leetcode15;

/**
 * @ClassName: Solution15.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��8��7�� ����10:23:30 
 */
public class Solution15 {
	
	 public boolean isSameTree(TreeNode p, TreeNode q) {
	        if(p==null && q ==null){
	            return true;
	        }
	        if(p!=null&&q!=null&&p.val==q.val){
	            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
	        }else{
	            return false;
	        }
	    }
}
