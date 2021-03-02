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

    public void newBoard() {
        for (BoardRow rowsIteration : rows) {
            rowsIteration.BoardRow();
        }
    }

    @Override
    public String toString() {
        String board = "";
        for (int i = 0; i < 8; i++) {
            board +=
                    rows.get(i).getColumn().get(i) + " |" +
                            rows.get(i).getColumn().get(i) + " |" +
                            rows.get(i).getColumn().get(i) + " |" +
                            rows.get(i).getColumn().get(i) + " |" +
                            rows.get(i).getColumn().get(i) + " |" +
                            rows.get(i).getColumn().get(i) + " |" +
                            rows.get(i).getColumn().get(i) + " |" +
                            rows.get(i).getColumn().get(i) + " |" +
                            "\n";
        }
        return board;
    }

    public static void main(String[] args) {
        Board board = new Board();
        board.newBoard();

        board.setFigure(1, 1, new Queen(Color.BLACK));
        System.out.println(board);
        board.setFigure(2, 2, new Pawn(Color.WHITE));
        System.out.println(board);

    }
}

