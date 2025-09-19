package Creational.Builder;

public class Computer {

    private String cpu;
    private int ram;
    private String hardDrive;
    private String gpu;
    private String os;

    public void addCpu(String cpu){
        this.cpu = cpu;
    }

    public void addRam(int ram){
        this.ram = ram;
    }

    public void addHardDrive(String hardDrive){
        this.hardDrive = hardDrive;
    }

    public void addGpu(String gpu){
        this.gpu = gpu;
    }

    public void addOs(String os){
        this.os = os;
    }

    public String getSpecs(){
        return "CPU: " + cpu + "\nRAM: " + ram + " GB\nHard Drive: " + hardDrive + "\nGPU: " + gpu + "\nOS: " + os;
    }


}
