package Lesson6.Hometask;

import java.util.*;

public class FilterMenu {
    private final Scanner scanner;
    private final Store store;

    public FilterMenu(Store store) {
        this.store = store;
        scanner = new Scanner(System.in);
    }

    public List<Notebook> applyFilters() {
        Map<String, Object> filters = new HashMap<>();
        boolean continueFiltering = true;

        while (continueFiltering) {
            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Введите производителя:");
                        String brand = scanner.next();
                        brand = brand.substring(0, 1).toUpperCase() + brand.substring(1).toLowerCase();
                        if (!store.isBrandAvailable(brand)) {
                            System.out.println("Производитель " + brand + " отсутствует в наличии.");
                        }
                        filters.put("Brand", brand);
                        break;
                    case 2:
                        System.out.println("Введите требуемое значение ОЗУ:");
                        int ram = scanner.nextInt();
                        filters.put("RAM", ram);
                        break;
                    case 3:
                        System.out.println("Введите требуемое значение объема ЖД:");
                        int hardDrive = scanner.nextInt();
                        filters.put("HardDriveCapacity", hardDrive);
                        break;
                    case 4:
                        System.out.println("Введите операционную систему:");
                        String os = scanner.next();
                        os = os.substring(0, 1).toUpperCase() + os.substring(1).toLowerCase();
                        if (!store.isOperatingSystemAvailable(os)) {
                            System.out.println("Операционная система " + os + " отсутствует в наличии.");
                        }
                        filters.put("OperatingSystem", os);
                        break;
                    case 5:
                        System.out.println("Введите цвет:");
                        String colour = scanner.next();
                        colour = colour.substring(0, 1).toUpperCase() + colour.substring(1).toLowerCase();
                        if (!store.isColourAvailable(colour)) {
                            System.out.println("Цвет " + colour + " отсутствует в наличии.");
                        }
                        filters.put("Colour", colour);
                        break;
                    case 6:
                        System.out.println("Ноутбуки в наличии:");
                        return store.filterNotebooks(new HashMap<>());

                    default:
                        System.out.println("Ноутбука с выбранными критериями нет в наличии.");
                }

                System.out.println("Хотите продолжить фильтрацию? (1 - да, 0 - нет)");
                int continueChoice = scanner.nextInt();
                continueFiltering = (continueChoice == 1);
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод. Введите цифру, соответствующую меню.");
                scanner.nextLine();
            }
        }return store.filterNotebooks(filters);
    }
}
