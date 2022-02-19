package leetcode153;

public class Solution15301 {
    int[][] direct = {{-1,-2},{-2,-1},{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2}};
    public double knightProbability(int n, int k, int row, int column) {
        double[][] record = new double[n][n];
        //初始化
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                record[i][j] =1;
            }
        }

        for (int temp=0;temp<k;temp++) {
            double[][] newRecord = new double[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int[] dir:direct){
                        int x= i+dir[0];
                        int y= j+dir[1];
                        if(x>=0&&x<n&&y>=0&&y<n){
                            newRecord[i][j]+=record[x][y] /8;
                        }
                    }
                }
            }
            record = newRecord.clone();
        }
        return record[row][column];
    }


}
