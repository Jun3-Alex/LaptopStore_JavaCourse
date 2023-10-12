package Lesson6.Hometask;

public class NotebookList {
    private final Store store = new Store();

    public void addNotebooks() {
        Notebook laptop1 = new Notebook();
        laptop1.setBrand("Asus");
        laptop1.setRam(4);
        laptop1.setHardDrive(512);
        laptop1.setOs("Windows 10");
        laptop1.setColour("Silver");

        Notebook laptop2 = new Notebook();
        laptop2.setBrand("Lenovo");
        laptop2.setRam(8);
        laptop2.setHardDrive(1024);
        laptop2.setOs("Windows 10 Pro");
        laptop2.setColour("Black");

        Notebook laptop3 = new Notebook();
        laptop3.setBrand("HP");
        laptop3.setRam(4);
        laptop3.setHardDrive(512);
        laptop3.setOs("Linux");
        laptop3.setColour("White");

        Notebook laptop4 = new Notebook();
        laptop4.setBrand("MacBook");
        laptop4.setRam(8);
        laptop4.setHardDrive(1024);
        laptop4.setOs("MacOS");
        laptop4.setColour("Silver");

        Notebook laptop5 = new Notebook();
        laptop5.setBrand("Huawei");
        laptop5.setRam(8);
        laptop5.setHardDrive(2048);
        laptop5.setOs("ChromeOS");
        laptop5.setColour("DarkBlue");

        store.addNotebook(laptop1);
        store.addNotebook(laptop2);
        store.addNotebook(laptop3);
        store.addNotebook(laptop4);
        store.addNotebook(laptop5);
    }

    public Store getStore() {
        return store;
    }
}
