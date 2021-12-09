package leetcode139;

public class Solution13901 {
    public boolean validTicTacToe(String[] board) {
        int xCount = 0;
        int oCount = 0;
        //summary 'x' and '0' 's count
        for (String mark:board) {
            for (int i =0;i<mark.length();i++){
                char c = mark.charAt(i);
                if(c=='X'){
                    xCount++;
                }
                if (c=='O'){
                    oCount++;
                }
            }
        }
        //except situation
        if(xCount!=oCount&&xCount!=oCount+1){
            return false;
        }

        if(win(board,'X')&&xCount!=oCount+1){
            return false;
        }

        if(win(board,'O')&&xCount!=oCount){
            return false;
        }

        return true;

    }

    public boolean win(String[] bord,char p){
        for (int i = 0; i <3; i++) {
            //row
            if(p==bord[0].charAt(i)&&p==bord[1].charAt(i)&&p==bord[2].charAt(i)){
                return true;
            }
            //column
            if(p==bord[i].charAt(0)&&p==bord[i].charAt(1)&&p==bord[i].charAt(2)){
                return true;
            }
        }
        //正对角线
        if(p==bord[0].charAt(0)&&p==bord[1].charAt(1)&&p==bord[2].charAt(2)){
            return true;
        }
        //写对角线
        if (p==bord[0].charAt(2)&&p==bord[1].charAt(1)&&p==bord[2].charAt(0)){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Solution13901 solution = new Solution13901();
        String[] board1 = {"XOX","O O","XOX"};
        System.out.println("result:"+solution.validTicTacToe(board1));

        String[] board2 = {"XXX","   X","OOO"};
        System.out.println("result:"+solution.validTicTacToe(board2));

        String[] board3 = {"XOX"," X ","   "};
        System.out.println("result:"+solution.validTicTacToe(board3));

        String[] board4 = {"OXX","XOX","OXO"};
        System.out.println("result:"+solution.validTicTacToe(board4));
    }
}
