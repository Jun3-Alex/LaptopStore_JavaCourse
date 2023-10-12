package Lesson6.Hometask;

public class Notebook {

    private int ram, hardDrive;
    private String brand, os, colour;

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "ram=" + ram + "Gb"+
                ", hardDrive=" + hardDrive + "Gb"+
                ", brand='" + brand + '\'' +
                ", os='" + os + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return brand.hashCode() + 7*ram + 13*hardDrive + 17*os.hashCode() + 19*colour.hashCode();
    }

}


