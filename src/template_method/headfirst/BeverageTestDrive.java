package template_method.headfirst;

public class BeverageTestDrive {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}
