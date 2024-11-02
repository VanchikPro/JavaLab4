public class Room {
    private double length;
    private double width;
    private double height;

    public Room(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double WallSquare() {
        return 2 * height * (length + width);
    }

    public double Size() {
        return length * width * height;
    }

    public double FloorSquare() {
        return length * width;
    }

    public double calculatePrice(double price) {
        return FloorSquare() * price;
    }
}
