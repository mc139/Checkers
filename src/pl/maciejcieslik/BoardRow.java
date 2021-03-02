package pl.maciejcieslik;

import java.util.ArrayList;
import java.util.List;

public class BoardRow {

    List<Figure> columns = new ArrayList<>();

    public List<Figure> BoardRow() {
        for (int i = 0; i < 8; i++){
            columns.add(new None(Color.NONE));
        }
        return columns;
    }

    public List getColumn() {
        return columns;
    }
}
