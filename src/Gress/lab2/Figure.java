package Gress.lab2;

import java.util.ArrayList;

public abstract class Figure {
    ArrayList<Coordinates> arrOfVertex = new ArrayList<>();

    public Figure() {
    }

    public Figure(ArrayList<Coordinates> arrOfVertex) {
        this.arrOfVertex = arrOfVertex;
    }

    public abstract double countArea();


}
