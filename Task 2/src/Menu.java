import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    // Отображение главного меню
    public void displayMenu() {
        System.out.println("\n--- Главное меню ---");
        System.out.println("1. Выполнить расчет");
        System.out.println("2. Информация о программе");
        System.out.println("3. Информация о разработчике");
        System.out.println("4. Выход");
        System.out.print("Выберите опцию: ");
    }

    // Корректный выбор опции меню
    public int Choice() {
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= 4) {
                    return choice;
                } else {
                    System.out.print("Ошибка: выберите опцию от 1 до 4. \nПовторите ввод: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Ошибка: введите число. \nПовторите ввод: ");
            }
        }
    }

    // Информация о программе
    public void displayProgramInfo() {
        System.out.println("Эта программа рассчитывает кинетическую энергию объекта по формуле: E = 0.5 * m * v^2.");
    }

    // Информация о разработчике
    public void displayDeveloperInfo() {
        System.out.println("Разработчик программы: Дорофиенко Иван Сергеевич РИМ-140970.");
    }
}
