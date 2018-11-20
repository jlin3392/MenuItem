public class Trio implements MenuItem{

    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public Trio(Sandwich sandwich, Salad salad, Drink drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    public String getName() {
        return this.sandwich + "/" + this.salad + "/" + this.drink + " Trio";
    }

    public double getPrice() {
        if (this.sandwich.getPrice() > this.salad.getPrice() && this.sandwich.getPrice() > this.drink.getPrice()) {
            double highest = this.sandwich.getPrice();
            if (this.salad.getPrice() > this.drink.getPrice()) {
                double middle = this.drink.getPrice();
            }
        } else if (this.sandwich.getPrice() > this.salad.getPrice() && !(this.sandwich.getPrice() > this.drink.getPrice())) {
            double middle = this.sandwich.getPrice();
        }
    }

}
