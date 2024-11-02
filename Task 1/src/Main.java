import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = CorrectValue(scanner, "Введите длину комнаты (в метрах): ");
        double width = CorrectValue(scanner, "Введите ширину комнаты (в метрах): ");
        double height = CorrectValue(scanner, "Введите высоту комнаты (в метрах): ");

        Room room = new Room(length, width, height);

        System.out.println("Площадь стен: " + room.WallSquare() + " кв. м");
        System.out.println("Объем комнаты: " + room.Size() + " куб. м");
        System.out.println("Площадь пола: " + room.FloorSquare() + " кв. м");

        double price = 420;
        System.out.println("Цена аренды: " + room.calculatePrice(price) + " рублей");

        scanner.close();
    }

    private static double CorrectValue(Scanner scanner, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                if (value > 0) {
                    break;
                } else {
                    System.out.println("Ошибка: значение должно быть положительным числом.");
                }
            } else {
                System.out.println("Ошибка: введите корректное число.");
                scanner.next();
            }
        }
        return value;
    }
}
