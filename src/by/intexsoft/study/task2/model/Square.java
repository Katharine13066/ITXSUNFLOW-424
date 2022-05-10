package by.intexsoft.study.task2.model;

import by.intexsoft.study.task2.model.Figure;

public class Square extends Figure {

    public Square(double a) {
        this.a = a;
    }
    @Override
    public double calculatePerimeter() {
        return 4*a;
    }
}
