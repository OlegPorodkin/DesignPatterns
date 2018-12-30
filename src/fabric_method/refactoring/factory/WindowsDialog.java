package fabric_method.refactoring.factory;

import fabric_method.refactoring.buttons.Button;
import fabric_method.refactoring.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
