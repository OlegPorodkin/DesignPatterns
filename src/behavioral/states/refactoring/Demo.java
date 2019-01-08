package behavioral.states.refactoring;

import behavioral.states.refactoring.ui.Player;
import behavioral.states.refactoring.ui.UI;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
