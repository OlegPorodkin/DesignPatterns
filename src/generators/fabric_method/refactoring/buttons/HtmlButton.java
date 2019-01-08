package generators.fabric_method.refactoring.buttons;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello world!'");
    }
}
