package generators.fabric_method.refactoring.factory;

import generators.fabric_method.refactoring.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
