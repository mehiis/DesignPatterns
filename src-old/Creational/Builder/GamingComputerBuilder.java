package Creational.Builder;

public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    public GamingComputerBuilder(Grade grade) {
        this.computer = new Computer();
    }

    @Override
    public void buildCpu(Grade grade) {
        computer.addCpu(grade.equals(grade.BASIC) ? "Intel Core i7" : "Intel Core i9");
    }

    @Override
    public void buildRam(Grade grade) {
        computer.addRam(grade.equals(grade.BASIC) ? 32 : 128);
    }

    @Override
    public void buildHardDrive(Grade grade) {
        computer.addHardDrive(grade.equals(grade.BASIC) ? "2 Tb" : "4 Tb");
    }

    @Override
    public void buildGpu(Grade grade) {
        computer.addGpu(grade.equals(grade.BASIC) ? "NVIDIA RTX 3080" : "NVIDIA RTX 5090");
    }

    @Override
    public void buildOs() {
        computer.addOs("Windows 11");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
