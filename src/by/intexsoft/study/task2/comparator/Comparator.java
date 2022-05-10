package by.intexsoft.study.task2.comparator;

import by.intexsoft.study.task2.model.Figure;

public interface Comparator {

    double calculatePerimeter();

    default int comparePerimeters(Figure figure) {
        return Double.compare(calculatePerimeter(), figure.calculatePerimeter()) ;
    }
}
