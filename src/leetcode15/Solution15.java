package leetcode15;

/**
 * @ClassName: Solution15.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年8月7日 上午10:23:30 
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
