import Board.*;
import java.util.*;

public class ChessGame {

        public static void main(String [ ] args) {
            boolean state = true;
            Board board = new Board();
            Scanner sc = new Scanner(System.in);
            String xString;
            int xOne = -1;
            int yOne = -1;
            int xTwo = -1;
            int yTwo = -1;
            int piece = -1;
            do {

                System.out.println("    ------CHESS------");

                for (int i = 7; i >= 0; i--) {
                    System.out.print(i + 1 + " - |");
                    for (int j = 0; j <= 7; j++) {
                        if (j < 7) {
                            System.out.print(board.boardGrid[j][i] + " ");
                        } else {
                            System.out.print(board.boardGrid[j][i] + "|");
                        }
                    }
                    System.out.print("\n");
                }
                //System.out.println("    ^ ^ ^ ^ ^ ^ ^ ^");
                System.out.println("    -----------------");
                System.out.println("     A B C D E F G H");
                System.out.println("Select X: \"A B C D E F G H\"");

                xString = sc.nextLine();
                switch (xString) {
                    case "A":
                        xOne = 0;
                        break;
                    case "B":
                        xOne = 1;
                        break;
                    case "C":
                        xOne = 2;
                        break;
                    case "D":
                        xOne = 3;
                        break;
                    case "E":
                        xOne = 4;
                        break;
                    case "F":
                        xOne = 5;
                        break;
                    case "G":
                        xOne = 6;
                        break;
                    case "H":
                        xOne = 7;
                        break;
                    case "quit":
                        state = false;
                        break;
                    default:
                        System.out.println("Incompatible coordinate");
                        xOne = -1;
                        break;
                }
                if(xOne != -1) {
                    System.out.println("Select Y: \"1 2 3 4 5 6 7 8\"");
                    yOne = sc.nextInt();
                    sc.nextLine();
                    switch (yOne) {
                        case 1:
                            yOne = 0;
                            break;
                        case 2:
                            yOne = 1;
                            break;
                        case 3:
                            yOne = 2;
                            break;
                        case 4:
                            yOne = 3;
                            break;
                        case 5:
                            yOne = 4;
                            break;
                        case 6:
                            yOne = 5;
                            break;
                        case 7:
                            yOne = 6;
                            break;
                        case 8:
                            yOne = 7;
                            break;
                        default:
                            System.out.println("Incompatible coordinate");
                            yOne = -1;
                            break;
                    }

                    if (xOne != -1 && yOne != -1 && board.boardGrid[xOne][yOne] > 0) {
                        piece = board.FindPiece(xOne, yOne);
                        if (board.boardGrid[xOne][yOne] == 1 && board.boardGrid[xOne][yOne + 1] == 0
                                || board.boardGrid[xOne][yOne] == 1 && board.boardGrid[xOne + 1][yOne + 1] > 0
                                || board.boardGrid[xOne][yOne] == 1 && board.boardGrid[xOne - 1][yOne + 1] > 0) {
                            System.out.println("Select X to move to: \"A B C D E F G H\"");
                            xString = sc.nextLine();
                            switch (xString) {
                                case "A":
                                    xTwo = 0;
                                    break;
                                case "B":
                                    xTwo = 1;
                                    break;
                                case "C":
                                    xTwo = 2;
                                    break;
                                case "D":
                                    xTwo = 3;
                                    break;
                                case "E":
                                    xTwo = 4;
                                    break;
                                case "F":
                                    xTwo = 5;
                                    break;
                                case "G":
                                    xTwo = 6;
                                    break;
                                case "H":
                                    xTwo = 7;
                                    break;
                                case "quit":
                                    state = false;
                                    break;
                                default:
                                    System.out.println("Incompatible coordinate");
                                    xTwo = -1;
                                    break;
                            }
                            if (xTwo != -1) {
                                System.out.println("Select Y to move to: \"1 2 3 4 5 6 7 8\"");
                                yTwo = sc.nextInt();
                                sc.nextLine();
                                switch (yTwo) {
                                    case 1:
                                        yTwo = 0;
                                        break;
                                    case 2:
                                        yTwo = 1;
                                        break;
                                    case 3:
                                        yTwo = 2;
                                        break;
                                    case 4:
                                        yTwo = 3;
                                        break;
                                    case 5:
                                        yTwo = 4;
                                        break;
                                    case 6:
                                        yTwo = 5;
                                        break;
                                    case 7:
                                        yTwo = 6;
                                        break;
                                    case 8:
                                        yTwo = 7;
                                        break;
                                    default:
                                        System.out.println("Incompatible coordinate");
                                        yTwo = -1;
                                        break;
                                }
                            }

                            if (xOne == xTwo && yTwo - yOne == 1 || xOne == xTwo && yTwo - yOne == 2) {
                                //board.whiteList.get(i);
                                if(yTwo - yOne == 1) {
                                    board.boardGrid[xOne][yOne] = 0;
                                    board.boardGrid[xTwo][yTwo] = 1;
                                    board.MovePiece(xTwo, yTwo, piece);
                                }
                                else if(yOne == 1){
                                    board.boardGrid[xOne][yOne] = 0;
                                    board.boardGrid[xTwo][yTwo] = 1;
                                    board.MovePiece(xTwo, yTwo, piece);
                                }
                                else{
                                    System.out.println("Illegal move");
                                }
                            }
                            else if(yTwo - yOne == 1 && xOne - xTwo == 1 && board.boardGrid[xTwo][yTwo] > 0){
                                board.boardGrid[xOne][yOne] = 0;
                                board.boardGrid[xTwo][yTwo] = 1;
                                board.MovePiece(xTwo, yTwo, piece);
                            }
                            else if(yTwo - yOne == 1 && xOne - xTwo == -1 && board.boardGrid[xTwo][yTwo] > 0){
                                board.boardGrid[xOne][yOne] = 0;
                                board.boardGrid[xTwo][yTwo] = 1;
                                board.MovePiece(xTwo, yTwo, piece);
                            }
                            else{
                                System.out.println("Illegal move");
                            }
                        }
                        else if (board.boardGrid[xOne][yOne] == 2 && board.boardGrid[xOne + 1][yOne + 1] == 0) {

                        }
                    }
                }
            }while(state == true);
        }
}
