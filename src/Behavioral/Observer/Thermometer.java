package Behavioral.Observer;

public class Thermometer extends Observer {
    String uniqueMessage;

    public Thermometer(Subject subscribeTo, String uniqueMessage) {
        subject = subscribeTo;
        subscribeTo.addObserver(this);

        this.uniqueMessage = uniqueMessage;
    }

    @Override
    public void update() {
        System.out.println(uniqueMessage + subject.getStatus()); //pull
    }
}
