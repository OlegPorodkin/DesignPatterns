package generators.fabric_method.refactoring;

import generators.fabric_method.refactoring.factory.Dialog;
import generators.fabric_method.refactoring.factory.HtmlDialog;
import generators.fabric_method.refactoring.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }
}