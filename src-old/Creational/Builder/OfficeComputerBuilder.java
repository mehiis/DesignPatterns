package Creational.Builder;

public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCpu(Grade grade) {
        computer.addCpu(grade.equals(grade.BASIC) ? "Intel Core i3" : "Intel Core i7");
    }

    @Override
    public void buildRam(Grade grade) {
        computer.addRam(grade.equals(grade.BASIC) ? 8 : 16);
    }

    @Override
    public void buildHardDrive(Grade grade) {
        computer.addHardDrive(grade.equals(grade.BASIC) ? "500 Gb" : "1 Tb");
    }

    @Override
    public void buildGpu(Grade grade) {
        computer.addGpu(grade.equals(grade.BASIC) ? "NVIDIA GTX 1050" : "NVIDIA RTX 3090");
    }

    @Override
    public void buildOs() {
        computer.addOs("Linux");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
