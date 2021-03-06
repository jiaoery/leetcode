# 解题思路

从题目分析：

* 1.甲板上的空间具备两个状态：X (战舰)和 .（空位）。
* 2.战舰的结构是：1xN（1行N列）或者 Nx1 (N行一列)。
* 3.战舰之间必须有至少一个水平或垂直的空位分隔。

那么，说明战舰X标记一定是连续的。那么是否可以只关注战舰的头部，对于其他部位直接忽略。那么如何判断一个标记X是头部还是身体。 其实如果一个标记位为身体，它一定具备以下特征：

* 它左边或上面的位置一定是X；如结构

  ```
   XXXX 
   
   X
   X
   X
  ```

  

   那么解题思路也就出来了。

  ## 1.1 遍历

  遍历所有标记点，按照以下流程判断：

  * 1.如果为‘.’空位直接跳过本次循环
  * 2.如果为X，需要判断两个条件：
    * 1.前一个元素为X，代表是身体，跳过本次循环
    * 2.上一个元素是X，代表身体，跳过本次循环
  * 3.如果越过前面条件，那么该元素点为头部，标记+1
  * 4.循环结束，返回标记数目

  ## 1.2 代码

  ```java
  public int countBattleships(char[][] board) {
  		//行
  		int rows = board.length;
  		//列
  		int columns = board[0].length;
  		//标记位
  		int count = 0;
  		for (int i = 0; i < rows; i++) {
  			for (int j = 0; j < columns; j++) {
  				//空位跳过
  				if(board[i][j] == '.') {
  					continue;
  				} 
  				//当前元素为X，上部元素也为X，身体
  				if(i>0 && board[i-1][j]=='X') {
  					continue;
  				}
  				//当前元素为X，左部元素也为X，身体
  				if(j>0 && board[i][j-1]=='X') {
  					continue;
  				}
  				//符合头部，标记+1
  				count++;
  			}
  		}
  		return count;
  	}
  ```
  


## 1.3 复杂度分析

* 时间复杂度：O(N),N为数组中元素个数
* 空间复杂度：O(1),仅仅使用固定的额外空间