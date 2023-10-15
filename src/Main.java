import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
//        BottleOfWatter b1 = new BottleOfWatter("1", 1, 1);
//        BottleOfWatter b2 = new BottleOfWatter("2", 2, 2);
//        BottleOfWatter b3 = new BottleOfWatter("5", 4, 3);
//        BottleOfWatter b4 = new BottleOfWatter("15", 123, 1);
//        BottleOfWatter b5 = new BottleOfWatter("20", 6, 5);
//
//        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(new ArrayList<>());
//        vendingMachine.addBottleOfWater(b1);
//        vendingMachine.addBottleOfWater(b2);
//        vendingMachine.addBottleOfWater(b3);
//        vendingMachine.addBottleOfWater(b4);
//        vendingMachine.addBottleOfWater(b5);
//        System.out.println(vendingMachine.getProduct("20", 5));
//        System.out.println(vendingMachine.getProduct("20", 100));
//
//        for (BottleOfWatter b : vendingMachine.getBottleOfWatters()) {
//            System.out.println(b);
//        }

        HotDrink tea = new HotDrink("1", 100, 300, 70);
        HotDrink coffee = new HotDrink("2", 150, 250, 75);
        HotDrink fruitDrink = new HotDrink("3", 80, 400, 80);
        HotDrinksMachine hotMachine = new HotDrinksMachine(new ArrayList<>());
        hotMachine.addHotDrink(tea);
        hotMachine.addHotDrink(coffee);
        hotMachine.addHotDrink(fruitDrink);

        HotDrink product = (HotDrink) hotMachine.getProduct("3", 400, 80);
        if (product != null) {
            System.out.println(product);
        } else {
            System.out.println("Product is not found");
        }

        for (HotDrink hd : hotMachine.getHotDrinks()) {
            System.out.println(hd);
        }
    }
}
