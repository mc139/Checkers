package pl.maciejcieslik;

public class Figure {

    public Figure(Color Color, TypeOfFigure TypeOfFigure) {
    }

    Figure queenW = new Figure(Color.WHITE,TypeOfFigure.QUEEN);
    Figure pawnW = new Figure(Color.WHITE,TypeOfFigure.PAWN);
    Figure queenB = new Figure(Color.BLACK,TypeOfFigure.QUEEN);
    Figure pawnB = new Figure(Color.BLACK,TypeOfFigure.PAWN);
    Figure empty = new Figure(Color.NONE,TypeOfFigure.NONE);

    @Override
    public String toString() {
        if(Color.WHITE && TypeOfFigure.PAWN ){
            return "WP";
        }
    }
}
