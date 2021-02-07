package day17;

public class ChessBoard {
    private ChessPiece[][] chessPiecesMas;

    public ChessBoard(ChessPiece[][] chessPiecesMas) {
        this.chessPiecesMas = chessPiecesMas;
    }

    public void print() {


        for (int i = 0; i < chessPiecesMas.length; i++) {
            for (int j = 0; j < chessPiecesMas[i].length; j++) {
                if (chessPiecesMas[i][j] == null)
                    chessPiecesMas[i][j] = ChessPiece.EMPTY;


                System.out.print(chessPiecesMas[i][j].getTranslation() + " "); // выводим массив

            }
            System.out.println();
        }

    }

}
