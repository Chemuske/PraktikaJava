package Day17;

public enum ChessPiece {
    KING_BLACK("♚", 100), QUEEN_BLACK("♛", 9), ROOK_BLACK("♜", 5), BISHOP_BLACK("♝", 3.5), KNIGHT_BLACK("♞", 3), PAWN_BLACK("♟", 1),
    KING_WHITE("♔", 100), QUEEN_WHITE("♕", 9), ROOK_WHITE("♖", 5), BISHOP_WHITE("♗", 3.5), KNIGHT_WHITE("♘", 3), PAWN_WHITE("♙", 1),
    EMPTY("_", -1);

    private final String symbol;
    @SuppressWarnings("unused")
    private double value;

    ChessPiece(String symbol, double value) {
        this.symbol = symbol;
        this.value = value;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
