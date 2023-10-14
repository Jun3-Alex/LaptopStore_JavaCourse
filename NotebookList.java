package Lesson6.Hometask;

import java.util.ArrayList;
import java.util.List;

public class NotebookList {
    private final Store store = new Store();

    public Notebook createNotebook() {
        List<String> availableBrands = new ArrayList<>();
        availableBrands.add("Asus");
        availableBrands.add("Lenovo");
        availableBrands.add("HP");
        availableBrands.add("MacBook");
        availableBrands.add("Huawei");
        availableBrands.add("Dell");
        availableBrands.add("Acer");
        availableBrands.add("MSI");
        availableBrands.add("Sony");
        availableBrands.add("Toshiba");
        availableBrands.add("Samsung");
        availableBrands.add("LG");
        availableBrands.add("Microsoft");
        availableBrands.add("Fujitsu");
        availableBrands.add("Alienware");
        availableBrands.add("Razer");
        availableBrands.add("Panasonic");
        availableBrands.add("Google");
        availableBrands.add("Xiaomi");
        availableBrands.add("Chuwi");

        List<Integer> availableRAM = new ArrayList<>();
        availableRAM.add(2);
        availableRAM.add(4);
        availableRAM.add(8);
        availableRAM.add(16);
        availableRAM.add(32);

        List<Integer> availableHardDrive = new ArrayList<>();
        availableHardDrive.add(256);
        availableHardDrive.add(512);
        availableHardDrive.add(1024);
        availableHardDrive.add(2048);
        availableHardDrive.add(4096);

        List<String> availableOperatingSystems = new ArrayList<>();
        availableOperatingSystems.add("Windows 10");
        availableOperatingSystems.add("Windows 10 Pro");
        availableOperatingSystems.add("MacOS");
        availableOperatingSystems.add("ChromeOS");
        availableOperatingSystems.add("Linux");
        availableOperatingSystems.add("Ubuntu");
        availableOperatingSystems.add("Fedora");
        availableOperatingSystems.add("CentOS");
        availableOperatingSystems.add("FreeBSD");
        availableOperatingSystems.add("Android");
        availableOperatingSystems.add("IOS");
        availableOperatingSystems.add("Windows 11");
        availableOperatingSystems.add("Windows 7");
        availableOperatingSystems.add("MacOS Catalina");
        availableOperatingSystems.add("MacOS Big Sur");
        availableOperatingSystems.add("Ubuntu Server");
        availableOperatingSystems.add("Red Hat Enterprise Linux");
        availableOperatingSystems.add("Debian");
        availableOperatingSystems.add("Kali Linux");
        availableOperatingSystems.add("Arch Linux");

        List<String> availableColours = new ArrayList<>();
        availableColours.add("Silver");
        availableColours.add("Black");
        availableColours.add("White");
        availableColours.add("DarkBlue");
        availableColours.add("Red");
        availableColours.add("Gray");
        availableColours.add("Blue");
        availableColours.add("Green");
        availableColours.add("Yellow");
        availableColours.add("Purple");
        availableColours.add("Orange");
        availableColours.add("Pink");
        availableColours.add("Gold");
        availableColours.add("Brown");
        availableColours.add("Cyan");
        availableColours.add("Magenta");
        availableColours.add("Lime");
        availableColours.add("Teal");
        availableColours.add("Indigo");


        String brand = availableBrands.get((int) (Math.random() * availableBrands.size()));
        int ram = availableRAM.get((int) (Math.random() * availableRAM.size()));
        int hardDrive = availableHardDrive.get((int) (Math.random() * availableHardDrive.size()));
        String operatingSystem = availableOperatingSystems.get((int) (Math.random() * availableOperatingSystems.size()));
        String colour = availableColours.get((int) (Math.random() * availableColours.size()));

        Notebook notebook = new Notebook();
        notebook.setBrand(brand);
        notebook.setRam(ram);
        notebook.setHardDrive(hardDrive);
        notebook.setOs(operatingSystem);
        notebook.setColour(colour);

        return notebook;


    }

    public void addNotebooks() {
        Notebook laptop1 = createNotebook();
        Notebook laptop2 = createNotebook();
        Notebook laptop3 = createNotebook();
        Notebook laptop4 = createNotebook();
        Notebook laptop5 = createNotebook();
        Notebook laptop6 = createNotebook();
        Notebook laptop7 = createNotebook();
        Notebook laptop8 = createNotebook();
        Notebook laptop9 = createNotebook();
        Notebook laptop10 = createNotebook();
        Notebook laptop11 = createNotebook();
        Notebook laptop12 = createNotebook();
        Notebook laptop13 = createNotebook();
        Notebook laptop14 = createNotebook();
        Notebook laptop15 = createNotebook();
        Notebook laptop16 = createNotebook();
        Notebook laptop17 = createNotebook();
        Notebook laptop18 = createNotebook();
        Notebook laptop19 = createNotebook();
        Notebook laptop20 = createNotebook();

        store.addNotebook(laptop1);
        store.addNotebook(laptop2);
        store.addNotebook(laptop3);
        store.addNotebook(laptop4);
        store.addNotebook(laptop5);
        store.addNotebook(laptop6);
        store.addNotebook(laptop7);
        store.addNotebook(laptop8);
        store.addNotebook(laptop9);
        store.addNotebook(laptop10);
        store.addNotebook(laptop11);
        store.addNotebook(laptop12);
        store.addNotebook(laptop13);
        store.addNotebook(laptop14);
        store.addNotebook(laptop15);
        store.addNotebook(laptop16);
        store.addNotebook(laptop17);
        store.addNotebook(laptop18);
        store.addNotebook(laptop19);
        store.addNotebook(laptop20);
    }




    public Store getStore() {
        return store;
    }
}
