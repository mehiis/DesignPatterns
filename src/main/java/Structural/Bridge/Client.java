package Structural.Bridge;

//CODE COPIED FROM: https://github.com/jojozhuang/design-patterns-java/blob/bd60de5b7543dc459276a4a6cc87aae6258665d4/design-pattern-bridge/src/main/java/johnny/designpattern/bridge/Client.java

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufacture();
        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();

        //MY CODE
        Vehicle vehicle3 = new Bike(new Produce(), new Assemble(), new Paint(PaintColors.RED));
        vehicle3.manufacture();
        Vehicle vehicle4 = new Car(new Produce(), new Assemble(), new Paint(PaintColors.GREEN));
        vehicle4.manufacture();
        //MY CODE ENDS
    }
}


