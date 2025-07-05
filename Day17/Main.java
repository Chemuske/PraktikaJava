package Day17;

public class Main {
    public static void main(String[] args) {
        
        ChessBoard chessBoard1 = new ChessBoard();
//Доп вариант (свой)
        // Black
        chessBoard1.setChessPiece(ChessPiece.ROOK_BLACK, 0, 0);
        chessBoard1.setChessPiece(ChessPiece.ROOK_BLACK, 0, 5);
        
        chessBoard1.setChessPiece(ChessPiece.KING_BLACK, 0, 6);
        
        chessBoard1.setChessPiece(ChessPiece.PAWN_BLACK, 1, 4);
        chessBoard1.setChessPiece(ChessPiece.PAWN_BLACK, 1, 5);
        chessBoard1.setChessPiece(ChessPiece.PAWN_BLACK, 1, 7);
        chessBoard1.setChessPiece(ChessPiece.PAWN_BLACK, 2, 0);
        chessBoard1.setChessPiece(ChessPiece.PAWN_BLACK, 2, 6);

        chessBoard1.setChessPiece(ChessPiece.KNIGHT_BLACK, 2, 2);
        
        chessBoard1.setChessPiece(ChessPiece.QUEEN_BLACK, 3, 0);

        chessBoard1.setChessPiece(ChessPiece.BISHOP_BLACK, 4, 3);

        // White
        chessBoard1.setChessPiece(ChessPiece.ROOK_WHITE, 1, 1);
        chessBoard1.setChessPiece(ChessPiece.ROOK_WHITE, 7, 5);

        chessBoard1.setChessPiece(ChessPiece.BISHOP_WHITE, 3, 3);
        chessBoard1.setChessPiece(ChessPiece.BISHOP_WHITE, 5, 4);

        chessBoard1.setChessPiece(ChessPiece.PAWN_WHITE, 4, 4);
        chessBoard1.setChessPiece(ChessPiece.PAWN_WHITE, 5, 5);
        chessBoard1.setChessPiece(ChessPiece.PAWN_WHITE, 6, 0);
        chessBoard1.setChessPiece(ChessPiece.PAWN_WHITE, 6, 5);
        chessBoard1.setChessPiece(ChessPiece.PAWN_WHITE, 6, 7);
        
        chessBoard1.setChessPiece(ChessPiece.QUEEN_WHITE, 6, 3);

        chessBoard1.setChessPiece(ChessPiece.KING_WHITE, 7, 6);
        
        System.out.println("\n Доска 1");
        chessBoard1.printBoard();

//Вариант (по заданию)
        ChessBoard chessBoard2 = new ChessBoard(ChessBoard.getBoard(chessBoard1));

        System.out.println("\n Доска 2");
        chessBoard2.printBoard();
        
        
        // ChessPiece[] chessPieces = new ChessPiece[8];
        // int count = 0;
        // for (ChessPiece chessPiece : chessPieces) {
        //     if (count < 4) {
        //         chessPieces[count] = ChessPiece.PAWN_WHITE;
        //     } else {
        //         chessPieces[count] = ChessPiece.ROOK_BLACK;
        //     }

        //     System.out.print(chessPieces[count++] + " ");
        // }
    }
    
}
