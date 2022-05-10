package by.intexsoft.study.task1.transport;

public class Truck extends Transport {

    public Truck(){
        this.transportID = "23";
        this.transportModel = "TruckModel";
    }

    public Truck(String transportID, String transportModel){
        this.transportID = transportID;
        this.transportModel = transportModel;
    }

    @Override
    public void deliver() {
        System.out.println("by land");
    }
}
