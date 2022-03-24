# 解题思路

既然是二叉树层序遍历，并且需要一层层完成



## 1.1 代码

```java
public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        //使用一个队列来实现层序遍历
        Queue<TreeNode> queue =new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            //判断每一层的层数
            int count = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            while(count>0){
                TreeNode treeNode = queue.poll();
                list.add(treeNode.val);
                if(treeNode.left!=null){
                    queue.offer(treeNode.left);
                }
                if(treeNode.right!=null){
                    queue.offer(treeNode.right);
                }
                count--;
            }
            result.add(list);
        }
        return result;
    }
}
```

