package day17;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

/*
Урок 48: Enum (Перечисления).

Доп. статьи:
Статья из Википедии про шахматные фигуры: https://ru.wikipedia.org/wiki/Шахматные_фигуры


Задачи:

1. Создайте Enum “Шахматная фигура” (англ. ChessPiece).
Всего существует 6 различных шахматных фигур: король (англ. king), ферзь (англ. queen), ладья (англ. rook), слон (англ. bishop), конь (англ. knight) и пешка (англ. pawn).
В нашей программе, у каждой шахматной фигуры есть следующие характеристики:
Ценность фигуры - вещественное число
Строковое обозначение фигуры

В нашем перечислении необходимо создать 12 фигур - 6 белых и 6 черных. Названия фигур в перечислении должны иметь следующий вид:
KING_WHITE, KING_BLACK, QUEEN_WHITE, QUEEN_BLACK, и так далее

У каждой фигуры должны быть заданы две характеристики - ее ценность и строковое обозначение.

Ценности шахматных фигур приведены в таблице:
Пешка  1
Конь   3
Слон   3.5
Ладья  5
Ферзь  9
Король 100

Строковые обозначения шахматных фигур приведены в таблице:
Пешка (белая)  ♙
Конь (белый)   ♘
Слон (белый)   ♗
Ладья (белая)  ♖
Ферзь (белый)  ♕
Король (белый) ♔

Пешка (черная)  ♟
Конь (черный)   ♞
Слон (черный)   ♝
Ладья (черная)  ♜
Ферзь (черный)  ♛
Король (черный) ♚

Используя созданный Enum, в методе main() класса Task1 создайте массив, содержащий 4 белых пешки и 4 черных ладьи.
Выведите содержимое этого массива на экран, используя строковые обозначения шахматных фигур.

Вывод в консоль должен быть таким:
♙ ♙ ♙ ♙ ♜ ♜ ♜ ♜

* */
public class Task1 {


    public static void main(String[] args) {

        ChessPiece[] chessPieces = new ChessPiece[8];

        chessPieces[0] = ChessPiece.PAWN_WHITE;
        chessPieces[1] = ChessPiece.PAWN_WHITE;
        chessPieces[2] = ChessPiece.PAWN_WHITE;
        chessPieces[3] = ChessPiece.PAWN_WHITE;

        chessPieces[4] = ChessPiece.ROOK_BKACK;
        chessPieces[5] = ChessPiece.ROOK_BKACK;
        chessPieces[6] = ChessPiece.ROOK_BKACK;
        chessPieces[7] = ChessPiece.ROOK_BKACK;

        for (ChessPiece x : chessPieces) {
            System.out.print(x.getTranslation());
        }


    }
}