package Pieces;

public class Pawn extends Piece{

    private int t_x;
    private int t_y;
    private int t_value;

    public Pawn(int x, int y, int value){ super(x, y, value);}


    boolean move(int x, int y, int val){
        if (x == t_y + 2 || y == t_y + 1 && val == 0){
            t_x = x;
            t_y = y;
            return true;
        }

        return false;
    }

    void attack(){

    }
}
