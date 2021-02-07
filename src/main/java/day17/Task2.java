package day17;



public class Task2 {

    public static void main(String[] args) {
        ChessPiece[][] kasparov = new ChessPiece[8][8];
        kasparov[0][0] = ChessPiece.ROOK_BKACK;
        kasparov[0][5] = ChessPiece.ROOK_BKACK;
        kasparov[0][6] = ChessPiece.KING_BKACK;
        kasparov[1][1] = ChessPiece.ROOK_WHITE;
        kasparov[1][4] = ChessPiece.PAWN_BKACK;
        kasparov[1][5] = ChessPiece.PAWN_BKACK;
        kasparov[1][7] = ChessPiece.PAWN_BKACK;
        kasparov[2][0] = ChessPiece.PAWN_BKACK;
        kasparov[2][2] = ChessPiece.KNIGHT_BKACK;
        kasparov[2][6] = ChessPiece.PAWN_BKACK;
        kasparov[3][0] = ChessPiece.KING_BKACK;
        kasparov[3][3] = ChessPiece.BISHOP_WHITE;
        kasparov[4][3] = ChessPiece.BISHOP_BKACK;
        kasparov[4][4] = ChessPiece.PAWN_WHITE;
        kasparov[5][4] = ChessPiece.BISHOP_WHITE;
        kasparov[5][5] = ChessPiece.PAWN_WHITE;
        kasparov[6][0] = ChessPiece.PAWN_WHITE;
        kasparov[6][3] = ChessPiece.KING_WHITE;
        kasparov[6][5] = ChessPiece.PAWN_WHITE;
        kasparov[6][7] = ChessPiece.PAWN_WHITE;
        kasparov[7][5] = ChessPiece.ROOK_WHITE;
        kasparov[7][6] = ChessPiece.QUEEN_WHITE;
        ChessBoard chessBoard=new ChessBoard(kasparov);
        chessBoard.print();




    }
}
