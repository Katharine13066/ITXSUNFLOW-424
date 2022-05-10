package by.intexsoft.study.task1.transport;

public abstract class Transport {

    String transportID;
    String transportModel;

    @Override
    public String toString() {
        return "Transport{" +
                "transportID='" + transportID + '\'' +
                ", transportModel='" + transportModel + '\'' +
                '}';
    }

    abstract void deliver();
}
