package printOs.com;

public class Bike {
    private String color;
    private int speed;

    public Bike(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate(int increment) {
        speed += increment;
    }

    public void brake(int decrement) {
        speed -= decrement;
    }

    public void printInfo() {
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        Bike bike = new Bike("Red", 0);
        bike.printInfo();
        bike.accelerate(20);
        bike.printInfo();
        bike.brake(10);
        bike.printInfo();
    }
}