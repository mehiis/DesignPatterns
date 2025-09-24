package Structural.Bridge;

//CODE COPIED FROM: https://github.com/jojozhuang/design-patterns-java/blob/bd60de5b7543dc459276a4a6cc87aae6258665d4/design-pattern-bridge/src/main/java/johnny/designpattern/bridge/Produce.java

public class Produce implements Workshop {
    @Override
    public void work()
    {
        System.out.print("Produced");
    }
}