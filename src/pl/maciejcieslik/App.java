package pl.maciejcieslik;

public class App {

    public static void main(String[] args) {
        Board board = new Board();
        board.createNewBoard();

        board.setFigure(1, 1, new Queen(Color.BLACK));
        System.out.println(board);
        board.setFigure(2, 2, new Pawn(Color.WHITE));
        System.out.println(board);

        board.move(2,2,4,4);
        System.out.println(board);

        //GridPane , Image, ImageView,
        //Grafika Planszy, Grafiki reprezentujace piony(przezroczyste tło)
    }
}
