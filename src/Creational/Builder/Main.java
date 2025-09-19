package Creational.Builder;

public class Main {
    public static void main(String[] args) {
        OfficeComputerBuilder officeComputerBuilder = new OfficeComputerBuilder();
        GamingComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();

        //Construct BASIC office computer
        ComputerDirector director = new ComputerDirector(officeComputerBuilder);
        director.constructComputer();
        System.out.println(officeComputerBuilder.getComputer().getSpecs());

        //Construct PREMIUM office computer
        ComputerDirector director2 = new ComputerDirector(officeComputerBuilder, Grade.PREMIUM);
        director2.constructComputer();
        System.out.println("\n\n" + officeComputerBuilder.getComputer().getSpecs());

    }
}
