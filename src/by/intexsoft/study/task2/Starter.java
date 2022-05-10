package by.intexsoft.study.task2;

import by.intexsoft.study.task2.model.Circle;
import by.intexsoft.study.task2.model.Figure;
import by.intexsoft.study.task2.model.Square;

public class Starter {

    public static void main(String [] args){

        Figure circle = new Circle(2.0);
        Figure square = new Square(5.0);

        System.out.println("Circle perimeter " + circle.calculatePerimeter());
        System.out.println("Square perimeter " + square.calculatePerimeter());
        System.out.println("Compare circle and square "+circle.comparePerimeters(square));
        System.out.println("Compare square and circle "+square.comparePerimeters(circle));
    }
}
