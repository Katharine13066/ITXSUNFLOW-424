package by.intexsoft.study.task1.transport;

public class Ship extends Transport {

    public Ship() {
        this.transportID = "12";
        this.transportModel = "ShipModel";
    }

    public Ship(String transportID, String transportModel){
        this.transportID = transportID;
        this.transportModel = transportModel;
    }

    @Override
    public void deliver() {
        System.out.println("by sea");
    }
}
