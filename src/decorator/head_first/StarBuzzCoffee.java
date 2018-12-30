package decorator.head_first;

import decorator.head_first.bevereges.Beverege;
import decorator.head_first.bevereges.DarkRoast;
import decorator.head_first.bevereges.Espresso;
import decorator.head_first.bevereges.HouseBlend;
import decorator.head_first.condiments.Moca;
import decorator.head_first.condiments.Soy;
import decorator.head_first.condiments.Whip;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverege beverege = new Espresso();
        System.out.println(beverege.getDiscription() + " $" + beverege.cost());

//        Beverege beverege1 = new DarkRoast();
//        beverege1 = new Moca(beverege1);
//        beverege1 = new Moca(beverege1);
//        beverege1 = new Whip(beverege1);
        Beverege beverege1 = new Whip(new Moca(new Moca(new DarkRoast())));
        System.out.println(beverege1.getDiscription() + " $" + beverege1.cost());

        Beverege beverege2 = new HouseBlend();
        beverege2 = new Soy(beverege2);
        beverege2 = new Moca(beverege2);
        beverege2 = new Whip(beverege2);
        System.out.println(beverege2.getDiscription() + " $" + beverege2.cost());
    }
}
