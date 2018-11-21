public class Trio implements MenuItem{

    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;
    private String name;

    public Trio(Sandwich sandwich, Salad salad, Drink drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    public String getName() {
        return sandwich.getName() + " / " + salad.getName() + " / " + drink.getName() + " Trio";
    }

    public double getPrice() {
        double sandwich = this.sandwich.getPrice();
        double salad = this.salad.getPrice();
        double drink = this.drink.getPrice();

        if (sandwich > drink) {
            if (drink > salad) {
                return sandwich + drink;
            } else {
                return sandwich + salad;
            }
        } else if (sandwich > salad) {
            return sandwich + drink;
        } else {
            return salad + drink;
        }
    }
}
