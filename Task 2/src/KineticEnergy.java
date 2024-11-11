import java.util.Scanner;

public class KineticEnergy {
    private double mass;
    private double speed;

    // Метод для получения массы и скорости
    public double[] Parameters(Scanner scanner) {
        this.mass = ValidMass(scanner);
        this.speed = ValidSpeed(scanner);
        return new double[]{mass, speed}; // Массив для хранения массы и скорости
    }

    // Корректная масса
    private double ValidMass(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Введите массу объекта в килограммах: ");
                double mass = Double.parseDouble(scanner.nextLine());
                if (mass > 0) {
                    return mass;
                } else {
                    System.out.println("Ошибка: масса должна быть положительным числом.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число.");
            }
        }
    }

    // Корректная скорость 
    private double ValidSpeed(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Введите скорость объекта в метрах в секунду: ");
                double speed = Double.parseDouble(scanner.nextLine());
                if (speed >= 0) {
                    return speed;
                } else {
                    System.out.println("Ошибка: скорость не может быть отрицательной.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число.");
            }
        }
    }

    // Расчет кинетической энергии
    public double calculateEnergy(double[] parameters) {
        return 0.5 * parameters[0] * Math.pow(parameters[1], 2);
    }
}
