# Chess Game

A simple console-based chess game written in Java.

## How to Run

1. Compile the Java source files:
   ```bash
   javac -cp src src/ChessGame.java
   ```

2. Run the chess game:
   ```bash
   java -cp src ChessGame
   ```

## How to Play

1. The chess board is displayed with numbers representing pieces:
   - 1 = Pawn
   - 2 = Bishop  
   - 3 = Knight
   - 4 = Rook
   - 5 = Queen
   - 6 = King

2. The board coordinates are:
   - Columns: A-H (left to right)
   - Rows: 1-8 (bottom to top)

3. To make a move:
   - Enter the column letter (A-H) of the piece you want to move
   - Enter the row number (1-8) of the piece you want to move
   - If it's a valid piece, you'll be prompted for the destination
   - Enter the destination column letter (A-H)
   - Enter the destination row number (1-8)

4. Type "quit" when prompted for coordinates to exit the game

## Current Features

- Basic chess board setup with all pieces in starting positions
- Console-based interface
- Pawn movement (forward one square, two squares from starting position, diagonal capture)
- Basic move validation for pawns

## Note

This is a basic implementation with limited move validation. Currently only pawn movements are fully implemented.