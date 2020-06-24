public class Espresso extends Beverage {

    public Espresso() {
        setDescription("Espresso");
        setMilk(false);
        setMocha(true);
        setSoy(false);
        setWhip(false);
    }

    public double cost(double Espresso_cost) {
        double cost = super.cost(Espresso_cost);
        return cost;
    }

}
