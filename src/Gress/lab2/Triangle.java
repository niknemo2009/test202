package Gress.lab2;

import java.util.ArrayList;

public class Triangle extends Figure {

    public Triangle(ArrayList<Coordinates> arrOfVertex) {
        super(arrOfVertex);
    }

    @Override
    public double countArea() {
        double ab = Coordinates.countLength(arrOfVertex.get(0), arrOfVertex.get(1));
        double ac = Coordinates.countLength(arrOfVertex.get(0), arrOfVertex.get(2));
        double bc = Coordinates.countLength(arrOfVertex.get(1), arrOfVertex.get(2));
        double p = (ab + ac + bc) / 2;
        double area = Math.round(Math.sqrt(p*(p - ab) * (p - ac) * (p - bc)));
        return area;
    }
}
