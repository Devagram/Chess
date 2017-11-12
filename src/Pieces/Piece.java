package Pieces;

public abstract class Piece {

    private int t_x;
    private int t_y;
    private int t_value;

    public Piece(int x, int y, int value){
        t_x = x;
        t_y = y;
        t_value = value;
    }

    public boolean move(){
        return true;
    }

    public void setX(int x){
        t_x = x;
    }

    public void setY(int y){
        t_y = y;
    }

    public void setValue(int value){
        t_value = value;
    }

    public int getX(){
        return t_x;
    }

    public int getY(){
        return t_y;
    }

    public int getValue(){
        return t_value;
    }

}
