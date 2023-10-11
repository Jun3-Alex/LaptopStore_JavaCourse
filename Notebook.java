package Lesson6.Hometask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Notebook {
    private String model;
    private int ram;
    private int hardDriveCapacity;
    private String operatingSystem;
    private String colour;
    private List<String> availableModels;
    public Notebook(){
        availableModels = new ArrayList<>();
        availableModels.add("Asus");
        availableModels.add("Lenovo");
        availableModels.add("Macbook");
        availableModels.add("Vivobook");
        availableModels.add("MSI");
    }

    public String getModel() {
        return model;
    }

    public void setModel() {

        Random random = new Random();
        int randomIndex = random.nextInt(availableModels.size());
        model = availableModels.get(randomIndex);
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHardDriveCapacity() {
        return hardDriveCapacity;
    }

    public void setHardDriveCapacity(int hardDriveCapacity) {
        this.hardDriveCapacity = hardDriveCapacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return String.format("Model: %s", model);
    }
}


