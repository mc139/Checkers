package pl.maciejcieslik;

import java.util.ArrayList;
import java.util.List;


public class Board extends BoardRow {
    private List<BoardRow> rows = new ArrayList<>();
    private List<Figure> cols = new ArrayList<>();


    public Board() {
        for (int i = 0; i < 8; i++) {
            rows.add(new BoardRow());
        }
    }
    public void move(int row1, int col1,int row2,int col2){
        Figure figure = getFigure(row1,col1);
        setFigure(row2,col2,figure);
        setFigure(row1,col1,new None());
    }

    public boolean availableMove(int row1, int col1,int row2,int col2,Figure figure){
        if((row1 - row2)>1 && (col1- col2)>1 );
        return false;
    }

    public Figure getFigure(int row, int col) {
        return (Figure) rows.get(row).getColumn().get(col);
    }

    public Board(List<BoardRow> rows, List<Figure> cols) {
        this.rows = rows;
        this.cols = cols;
        for (int i = 0; i > 8; i++) {
            rows.add(new BoardRow());
        }
    }

    public void setFigure(int row, int col, Figure figure) {
        rows.get(row).getColumn().add(col, figure);
        rows.get(row).getColumn().remove(col +1);

    }

    public void createNewBoard() {
        for (BoardRow rowsIteration : rows) {
            rowsIteration.BoardRow();
        }
    }

    @Override
    public String toString() {
        String board = "";
        for(int row=0; row<8; row++){
            board+="|";
            for(int col =0; col<8; col ++){
                board += rows.get(row).getColumn().get(col) + "|";
            }
            board +="\n";
        }
        return board;
    }

}

