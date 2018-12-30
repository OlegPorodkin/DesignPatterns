package fabric_method.refactoring.factory;

import fabric_method.refactoring.buttons.Button;
import fabric_method.refactoring.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
