package vending_machine;

class Drink {
    private String name;
    private int price;

    public Drink() {
        this.name = "물";
        this.price = 0;
    }

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}

public class VendingMachine {
    
    public Drink makeCoca() {
        return new Coca();
    }
    
    public Drink makeSprite() {
        return new Sprite();
    }
    
    public Drink makeCoffee() {
        return new Coffee();
    }

}
