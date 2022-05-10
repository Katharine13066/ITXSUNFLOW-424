package by.intexsoft.study.task1.creator;

import by.intexsoft.study.task1.transport.Transport;
import by.intexsoft.study.task1.transport.Truck;

public class TruckCreator extends TransportCreator{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
