package generators.fabric_method.refactoring.factory;

import generators.fabric_method.refactoring.buttons.Button;
import generators.fabric_method.refactoring.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
