package by.intexsoft.study.task1.creator;

import by.intexsoft.study.task1.transport.Ship;
import by.intexsoft.study.task1.transport.Transport;

public class ShipCreator extends TransportCreator{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
