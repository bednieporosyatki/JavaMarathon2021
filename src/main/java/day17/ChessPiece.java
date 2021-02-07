package day17;

public enum ChessPiece {

    KING_WHITE("\u2654", 100), // Король
    QUEEN_WHITE("\u2655", 9), // ферзь
    ROOK_WHITE("\u2656", 5), // Ладья
    BISHOP_WHITE("\u2657", 3.5), // слон
    KNIGHT_WHITE("\u2658", 3), // конь
    PAWN_WHITE("\u2659", 1), // пешка

    KING_BKACK("\u265A", 100), // Король
    QUEEN_BKACK("\u265B", 9), // ферзь
    ROOK_BKACK("\u265C", 5), // Ладья
    BISHOP_BKACK("\u265D", 3.5), // слон
    KNIGHT_BKACK("\u265E", 3), // конь
    PAWN_BKACK("\u265F", 1), // пешка
    EMPTY("_",-1);
    ChessPiece(String translation, double power) {
        this.translation = translation;
        this.power = power;
    }

    public String getTranslation() {
        return translation;
    }

    public double getPower() {
        return power;
    }

    private String translation;
    private double power;


}
