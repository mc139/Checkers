package pl.maciejcieslik;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static pl.maciejcieslik.Color.WHITE;

public class Board  {

    List<Figure> boardRows = new ArrayList<>();

    public Figure getFigure(int row, int col){
        return boardRows.get(row);
    }

    void setFigure(int row, Figure figure){
        boardRows.add(row,figure);
    }

//    @Override
//    public String toString() {
//        return "Board{" +
//                "boardRows=" + boardRows +
//                ", queenW=" + queenW +
//                ", pawnW=" + pawnW +
//                ", queenB=" + queenB +
//                ", pawnB=" + pawnB +
//                ", empty=" + empty +
//                '}';
//    }
}
