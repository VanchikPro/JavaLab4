import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);  // Создание объекта меню
        KineticEnergy calculator = new KineticEnergy();  // Создание объекта KineticEnergy для ввода данных и расчетов

        boolean exit = false;

        while (!exit) {
            menu.displayMenu();
            int choice = menu.Choice();

            switch (choice) {
                case 1:
                    double[] parameters = calculator.Parameters(scanner);
                    double energy = calculator.calculateEnergy(parameters);
                    System.out.printf("Кинетическая энергия объекта в Джоулях: %.2f\n", energy);
                    break;
                case 2:
                    menu.displayProgramInfo();
                    break;
                case 3:
                    menu.displayDeveloperInfo();
                    break;
                case 4:
                    System.out.println("Выход из программы...");
                    exit = true;
                    break;
            }
        }
        scanner.close();
    }
}
