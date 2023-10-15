import java.util.List;

public class HotDrinksMachine implements VendingMachine{
    List<HotDrink> hotDrinks;

    public HotDrinksMachine(List<HotDrink> products) {
        this.hotDrinks = products;
    }

    public List<HotDrink> getHotDrinks() {
        return hotDrinks;
    }

    public void setHotDrinks(List<HotDrink> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    @Override
    public Product getProduct(String name) {
        for (HotDrink item : hotDrinks) {
            if(item.getName().equals(name))
                return item;
        }
        return null;
    }

    @Override
    public Product getProduct(String name, double volume) {
        return null;
    }

    public Product getProduct(String name, double volume, int temperature){
        for (HotDrink hotDrink : hotDrinks) {
            if(hotDrink.getName().equals(name) && hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature)
                return hotDrink;
        }
        return null;
    }
    public void addHotDrink(HotDrink hotDrink){
        this.hotDrinks.add(hotDrink);
    }
}

