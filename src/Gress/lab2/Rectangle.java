package Gress.lab2;

import java.util.ArrayList;

public class Rectangle extends Figure {

    public Rectangle(ArrayList<Coordinates> arrOfVertex) { super(arrOfVertex); }

    @Override
    public double countArea() {
        double ab = Coordinates.countLength(arrOfVertex.get(0), arrOfVertex.get(1));
        double bc = Coordinates.countLength(arrOfVertex.get(1), arrOfVertex.get(2));
        double area = Math.round(ab * bc);
        return area;
    }
}
