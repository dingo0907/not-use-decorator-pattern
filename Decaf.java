public class Decaf extends Beverage {

    public Decaf() {
        setDescription("Decaf");
        setMilk(true);
        setMocha(true);
        setSoy(false);
        setWhip(false);
    }

    public double cost(double Decaf_cost) {
        double cost = super.cost(Decaf_cost);
        return cost;
    }

}
