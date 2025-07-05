package Day17;

public class ChessBoard {
    
    private ChessPiece[][] board = new ChessPiece[8][8];
    
    ChessBoard  () {
        setEmpty();
    }

    ChessBoard(ChessPiece[][] pieces) {
        this.board = pieces;
    }


    public void setChessPiece(ChessPiece piece, int row, int col) {
        if (row < 8 && col < 8 && row >= 0 && col >= 0) {
            board[row][col] = piece;
        }
    }

    public void setEmpty() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    board[i][j] = ChessPiece.EMPTY;
                }
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static ChessPiece[][] getBoard(ChessBoard sourceBoard) {

        ChessPiece[][] pieces = new ChessPiece[sourceBoard.board.length][sourceBoard.board[0].length];

        for (int i = 0; i < sourceBoard.board.length; i++) {
            for (int j = 0; j < sourceBoard.board[i].length; j++) {
                pieces[i][j] = sourceBoard.board[i][j];
            }
        }
        return pieces;
    }

}
