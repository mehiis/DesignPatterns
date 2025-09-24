package Structural.Bridge;

//CODE COPIED FROM: https://github.com/jojozhuang/design-patterns-java/blob/bd60de5b7543dc459276a4a6cc87aae6258665d4/design-pattern-bridge/src/main/java/johnny/designpattern/bridge/Bike.java

public class Bike extends Vehicle {
    public Bike(Workshop workShop1, Workshop workShop2)
    {
        super(workShop1, workShop2);
    }

    //MY CODE
    public Bike(Workshop workShop1, Workshop workShop2, Workshop workShop3)
    {
        super(workShop1, workShop2, workShop3);
    }
    //MY CODE END

    @Override
    public void manufacture()
    {
        System.out.print("Bike ");
        workShop1.work();
        workShop2.work();

        //MY CODE
        if (workShop3 != null) {
            System.out.print("Your bike was also ");
            workShop3.work();
        }
        //MY CODE END
    }
}