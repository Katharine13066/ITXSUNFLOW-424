package by.intexsoft.study.task2.model;

import by.intexsoft.study.task2.model.Figure;

public class Circle extends Figure {

    public Circle(double a) {
        this.a = a;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*a;
    }
}
