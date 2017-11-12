package Board;

import Pieces.*;
import java.util.ArrayList;



public class Board {

    public int[][] boardGrid = new int[8][8];
    private ArrayList<Piece> whiteList;
    private ArrayList<Piece> blackList;

    public Board(){
        whiteList = new ArrayList<>();
        blackList = new ArrayList<>();

        for(int i = 0; i <= 7; i++) {
            //pawns white
            boardGrid[i][1] = 1;
            whiteList.add(new Pawn(i, 1, 1));
            //pawns black
            boardGrid[i][6] = 1;
            blackList.add(new Pawn(i, 6, 1));
        }
        for(int j = 3; j < 6; j++) {
            for(int k = 0; k <= 7; k++) {
                //empty spaces
                boardGrid[k][j] = 0;

            }
        }

        //white
        //pawns
        for(int i = 0; i <= 7; i++) {
            boardGrid[i][1] = 1;
        }
        //king
        boardGrid[4][0] = 6;
        //queen
        boardGrid[3][0] = 5;
        //rooks
        boardGrid[0][0] = 4;
        boardGrid[7][0] = 4;
        //knights
        boardGrid[1][0] = 3;
        boardGrid[6][0] = 3;
        //bishops
        boardGrid[2][0] = 2;
        boardGrid[5][0] = 2;

        //black
        //pawns
        for(int i = 0; i <= 7; i++) {
            boardGrid[i][6] = 1;
        }
        //black
        //king
        boardGrid[4][7] = 6;
        //queen
        boardGrid[3][7] = 5;
        //rooks
        boardGrid[7][7] = 4;
        boardGrid[0][7] = 4;
        //knights
        boardGrid[1][7] = 3;
        boardGrid[6][7] = 3;
        //bishops
        boardGrid[2][7] = 2;
        boardGrid[5][7] = 2;


    }

    public int findPiece(int x, int y){
        for(int i = 0; i < whiteList.size(); i++) {
            if(whiteList.get(i).getX() == x){
                if(whiteList.get(i).getY() == y){
                    return i;
                }
            }
        }
        return -1;
    }

    public void modifyPiece(int index, int x, int y){
        whiteList.get(index).setX(x);
        whiteList.get(index).setY(x);
    }


}
