package Creational.Builder;

enum Grade { BASIC, PREMIUM }


public class ComputerDirector {
    private ComputerBuilder builder;
    private Grade grade;

    public ComputerDirector(ComputerBuilder builder){
        this.builder = builder;
        this.grade = grade.BASIC;
    }

    public ComputerDirector(ComputerBuilder builder, Grade grade){
        this.builder = builder;
        this.grade = grade;
    }

    public void constructComputer(){
        builder.buildCpu(this.grade);
        builder.buildRam(this.grade);
        builder.buildHardDrive(this.grade);
        builder.buildGpu(this.grade);
        builder.buildOs();
    }
}
