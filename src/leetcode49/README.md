# 解题思路

# 1.暴力解法

首先的思路就是使用暴力解法，但是这里需要对当前数据的周围八个位置做判断；就涉及两个问题：

* 1.超域，若边界的位置改如何处理超域
* 2.如果当前节点修改后，后续节点使用该节点的值是否会导致脏数据

所以使用暴接的方法，就需要使用一个额外空间用来备份原数据（防止脏数据）

## 1.1 流程

* 1.引入一个位置数组 {1，0，-1}；分别代表当前位置向四周移动的距离；刚好可以把附近8个位置圈进来；但是当row和col都为0的时候；需要排除
* 2.备份拷贝一个备份数据copy；
* 3.遍历每个节点，并获取附近位置，判断是否符合边际条件
* 4.边继条件 r>=0&&r<数组行数&&c>=0&&c<数组列数
* 5.根据题目四个条件判断是否符合；符合就改变

## 1.2 代码

```java
public void gameOfLife(int[][] board) {
		// 区间区域
		int[] neighbors = { 0, 1, -1 };
		// copy副本
		int[][] copy = new int[board.length][board[0].length];
		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < copy[0].length; j++) {
				copy[i][j] = board[i][j];
			}
		}
		// 遍历面板每一个格子里的细胞
		for (int row = 0; row < copy.length; row++) {
			for (int col = 0; col < copy[0].length; col++) {
				// 记录相邻数据
				int neighbor = 0;
				for (int i = 0; i < neighbors.length; i++) {
					for (int j = 0; j < neighbors.length; j++) {
						if (neighbors[i] != 0 || neighbors[j] != 0) {
							int r = row + neighbors[i];
							int c = col + neighbors[j];
							// 边界条件判断
							if (r >= 0 && r < board.length && c >= 0 && c < board[0].length && copy[r][c] == 1) {
								neighbor++;
							}

						}
					}
				}
				// 情况1 3
				if (board[row][col]==1&&(neighbor < 2 || neighbor > 3)) {
					board[row][col] = 0;
				}
				// 情况3
				if (board[row][col]==0 && neighbor == 3) {
					board[row][col] = 1;
				}
			}
		}
	}
```

## 1.3 复杂度分析

* 时间复杂度：O(MN),M为行数，N为列数
* 空间复杂度：O(MN),M为行数，N为列数

# 2. 原地标记

暴力法虽然可以解决问题，但是由于引入了额外空间，不符合解题的进阶需求。是否可以在当前节点使用标记来标记变化前后的关系：

* 对于情况1 3 时由活的细胞转变为死细胞；标记为-1
* 对于情况4 时由于死的细胞转变为活细胞；标记为2
* 所以，判断之前是否为或者的细胞，只需要取当前节点的绝对值，判断是否为1；

ps: 这里也可以使用其他方式做标记，不用限制思维；解题中我都看到有大佬使用位运算，也算一种思路；

## 2.1 代码

```java
public static void gameOfLife(int[][] board) {
		// 区间区域
		int[] neighbors = { 0, 1, -1 };
		// 遍历所有节点
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				// 统计发生次数
				int neighbor = 0;
				for (int i = 0; i < neighbors.length; i++) {
					for (int j = 0; j < neighbors.length; j++) {
						// 除开当前节点
						if (neighbors[i] != 0 || neighbors[j] != 0) {
							int r = row + neighbors[i];
							int c = col + neighbors[j];
							// 边际条件判断
							if (r >= 0 && r < board.length && c >= 0 && c < board[0].length
									&& Math.abs(board[r][c]) == 1) {
								neighbor++;
							}
						}
					}
				}

				// 情况1 3 ；由活转死，标记为-1
				if ((board[row][col] == 1) && (neighbor > 3 || neighbor < 2)) {
					board[row][col] = -1;
				}

				// 情况4，由死转生，标记为2
				if (board[row][col] == 0 && neighbor == 3) {
					board[row][col] = 2;
				}
			}
		}

		// 根据标记位重新赋值
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				if (board[row][col] == 2) {
					board[row][col] = 1;
				} else if (board[row][col] == -1) {
					board[row][col] = 0;
				}
			}
		}
	}
```



## 2.2 复杂度分析   

* 时间复杂度：O(MN),M为行数，N为列数;节点遍历两次。O(2MN),简化为O(MN)
* 空间复杂度: O(1)，只是用固定的额外空间