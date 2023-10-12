package Lesson6.Hometask;

import java.util.*;

public class Store {
    private final Set<Notebook> notebooks = new HashSet<>();

    public void addNotebook(Notebook notebook) {
        notebooks.add(notebook);
    }

    public List<Notebook> filterNotebooks(Map<String, Object> filters) {
        List<Notebook> filteredNotebooks = new ArrayList<>();

        for (Notebook notebook : notebooks) {
            if (passesFilters(notebook, filters)) {
                filteredNotebooks.add(notebook);
            }
        }

        return filteredNotebooks;
    }

    private boolean passesFilters(Notebook notebook, Map<String, Object> filters) {
        for (Map.Entry<String, Object> entry : filters.entrySet()) {
            String filterName = entry.getKey();
            Object filterValue = entry.getValue();

            if (!meetsFilterCriteria(notebook, filterName, filterValue)) {
                return false;
            }
        }

        return true;
    }

    private boolean meetsFilterCriteria(Notebook notebook, String filterName, Object filterValue) {
        switch (filterName) {
            case "Brand" ->{
                String notebookBrand = notebook.getBrand();
                String filterBrand = (String) filterValue;
                return notebookBrand.equalsIgnoreCase(filterBrand);
            }
            case "RAM" -> {
                int notebookRam = notebook.getRam();
                int filterRam = (int) filterValue;
                return notebookRam >= filterRam;
            }
            case "HardDriveCapacity" -> {
                int notebookHardDrive = notebook.getHardDrive();
                int filterHardDrive = (int) filterValue;
                return notebookHardDrive >= filterHardDrive;
            }
            case "OperatingSystem" -> {
                String notebookOs = notebook.getOs();
                String filterOs = (String) filterValue;
                return notebookOs.equalsIgnoreCase(filterOs);
            }
            case "Colour" -> {
                String notebookColor = notebook.getColour();
                String filterColor = (String) filterValue;
                return notebookColor.equalsIgnoreCase(filterColor);
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Store{" + "notebooks=" + notebooks + '}';
    }
}
