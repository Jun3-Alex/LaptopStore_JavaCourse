package Lesson6.Hometask;

import java.util.List;

public class Main {
    /* Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    Создать множество ноутбуков.
    Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
    отвечающие фильтру. Критерии фильтрации можно хранить в Map.
    Например:
    Введите цифру, соответствующую необходимому критерию:
    1 - ОЗУ
    2 - Объем ЖД
    3 - Операционная система
    4 - Цвет …
    Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
    Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
    Работу сдать как обычно ссылкой на гит репозиторий
    Частые ошибки:
    1. Заставляете пользователя вводить все существующие критерии фильтрации
    2. Невозможно использовать более одного критерия фильтрации одновременно
    3. При выборке выводятся ноутбуки, которые удовлетворяют только одному фильтру, а не всем введенным пользователем
    4. Работа выполнена только для каких то конкретных ноутбуков, и если поменять характеристики ноутбуков или
    добавить еще ноутбук, то программа начинает работать некорректно*/
    public static void main(String[] args) {

        NotebookList notebookList = new NotebookList();
        notebookList.addNotebooks();

        FilterMenu filterMenu = new FilterMenu(notebookList.getStore());

        System.out.println("Введите критерии фильтрации:");
        System.out.println("1 - Производитель");
        System.out.println("2 - ОЗУ");
        System.out.println("3 - Объем ЖД");
        System.out.println("4 - Операционная система");
        System.out.println("5 - Цвет");
        System.out.println("6 - Посмотреть весь ассортимент");

        List<Notebook> filteredNotebooks = filterMenu.applyFilters();

        for (Notebook notebook : filteredNotebooks) {
            System.out.println(notebook);
        }
    }
}



