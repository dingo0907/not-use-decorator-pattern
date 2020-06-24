public class HouseBlend extends Beverage {

    public HouseBlend() {
        setDescription("HouseBlend");
        setMilk(true);
        setMocha(true);
        setSoy(false);
        setWhip(true);
    }

    public double cost(double HouseBlend_cost) {
        double cost = super.cost(HouseBlend_cost);
        return cost;
    }
}
