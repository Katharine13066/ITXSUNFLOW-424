package by.intexsoft.study.task1;

import by.intexsoft.study.task1.creator.ShipCreator;
import by.intexsoft.study.task1.creator.TransportCreator;
import by.intexsoft.study.task1.creator.TruckCreator;
import by.intexsoft.study.task1.transport.Transport;

public class Starter {
    public static void main (String [] args){

        TransportCreator shipCreator = new ShipCreator();
        TransportCreator truckCreator = new TruckCreator();

        Transport ship = shipCreator.createTransport();
        Transport truck = truckCreator.createTransport();

        System.out.println(ship);
        System.out.println(truck);

    }
}
