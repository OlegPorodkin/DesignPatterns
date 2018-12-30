package command.headfirst.function;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private String room;
    private int speed;

    public CeilingFan(String room) {
        this.room = room;
        this.speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(room + " fan is on high!");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(room + " fan is on medium!");
    }

    public void low() {
        speed = LOW;
        System.out.println(room + " fan is on low!");
    }

    public void off() {
        speed = OFF;
        System.out.println(room + " fan is off!");
    }

    public int getSpeed() {
        return speed;
    }
}
