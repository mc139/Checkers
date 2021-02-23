package pl.maciejcieslik;

public class Figure {

    public Figure(Color Color, TypeOfFigure TypeOfFigure) {
    }

    Figure queenW = new Figure(Color.WHITE,TypeOfFigure.QUEEN);
    Figure pawnW = new Figure(Color.WHITE,TypeOfFigure.PAWN);
    Figure queenB = new Figure(Color.BLACK,TypeOfFigure.QUEEN);
    Figure pawnB = new Figure(Color.BLACK,TypeOfFigure.PAWN);
    Figure empty = new Figure(Color.NONE,TypeOfFigure.NONE);

    public Figure(Figure queenW, Figure pawnW, Figure queenB, Figure pawnB, Figure empty) {
        this.queenW = queenW;
        this.pawnW = pawnW;
        this.queenB = queenB;
        this.pawnB = pawnB;
        this.empty = empty;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "queenW=" + queenW +
                ", pawnW=" + pawnW +
                ", queenB=" + queenB +
                ", pawnB=" + pawnB +
                ", empty=" + empty +
                '}';
    }
}
