package Gress.lab2;

import Gress.lab2.Figure;

import java.util.ArrayList;

public class Trapezoid extends Figure {

    public Trapezoid(ArrayList<Coordinates> arrOfVertex) {
        super(arrOfVertex);
    }

    @Override
    public double countArea() {
       double ab = Coordinates.countLength(arrOfVertex.get(0), arrOfVertex.get(1));
       double bc = Coordinates.countLength(arrOfVertex.get(1), arrOfVertex.get(2));
       double cd = Coordinates.countLength(arrOfVertex.get(2), arrOfVertex.get(3));
       double ad = Coordinates.countLength(arrOfVertex.get(0), arrOfVertex.get(3));
       double ac = Coordinates.countLength(arrOfVertex.get(0), arrOfVertex.get(2));
       double p1 = (ab + bc + ac) / 2;
       double p2 = (ac + cd + ad) / 2;
       double area = Math.round(Math.sqrt(p1 * (p1 - ab) * (p1 - bc) * (p1 - ac)) + Math.sqrt(p2 * (p2 - ac) * (p2 - cd) * (p2 - ad)));
       return area;
    }
}
