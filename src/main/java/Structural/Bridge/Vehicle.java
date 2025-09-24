package Structural.Bridge;

//CODE COPIED FROM: https://github.com/jojozhuang/design-patterns-java/blob/bd60de5b7543dc459276a4a6cc87aae6258665d4/design-pattern-bridge/src/main/java/johnny/designpattern/bridge/Vehicle.java

public abstract class Vehicle {
    protected Workshop workShop1;
    protected Workshop workShop2;
    protected Workshop workShop3; //MY CODE

    protected Vehicle(Workshop workShop1, Workshop workShop2)
    {
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
    }

    //MY CODE
    protected Vehicle(Workshop workShop1, Workshop workShop2, Workshop workShop3) {
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
        this.workShop3 = workShop3;
    }
    //MY CODE END


    abstract public void manufacture();
}

