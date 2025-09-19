package Creational.Builder;

public interface ComputerBuilder{
    void buildCpu(Grade grade);
    void buildRam(Grade grade);
    void buildHardDrive(Grade grade);
    void buildGpu(Grade grade);
    void buildOs();
    Computer getComputer();
}
