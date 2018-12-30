package command.headfirst.function;

public class GarageDoor {
    String s;

    public GarageDoor(String s) {
        this.s = s;
    }

    public void up(){
        System.out.println("Door opened!");
    }

    public void down(){
        System.out.println("Door closed!");
    }

    public void stop(){
        System.out.println("Door stop!");
    }

    public void lightOn(){
        System.out.println();
    }

    public void lightOff(){
        System.out.println();
    }
}
