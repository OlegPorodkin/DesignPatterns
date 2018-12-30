package command.headfirst.function;

public class Stereo {

    String room;

    public Stereo(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println(room + " stereo is On!");
    }

    public void off() {
        System.out.println(room +  " stereo is Off!");
    }

    public void setCD() {
        System.out.println(room + " stereo is set for CD input");
    }

    public void setDVD() {
        System.out.println(room + " DVD inject");
    }

    public void setVolume(int i) {
        System.out.println(room + " stereo volume set to " + i);
    }

    public void setRadio() {
    }
}
