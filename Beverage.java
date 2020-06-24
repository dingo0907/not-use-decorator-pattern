public abstract class Beverage {

    private String description = "음료";
    private boolean milk = false;
    private boolean soy = false;
    private boolean mocha = false;
    private boolean whip = false;

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) { this.description = description; }
    public boolean hasMilk() { return this.milk; }
    public boolean hasSoy() { return this.soy; }
    public boolean hasMocha() { return this.mocha; }
    public boolean hasWhip() { return this.whip; }
    public void setMilk(boolean milk) { this.milk = milk; }
    public void setSoy(boolean soy) { this.soy = soy; }
    public void setMocha(boolean mocha) { this.mocha = mocha; }
    public void setWhip(boolean whip) { this.whip = whip; }

    public double cost(double beverage_cost) {

        if(hasMilk()) { beverage_cost += 2.0; }
        if(hasMocha()) { beverage_cost += 3.0; }
        if(hasSoy()) { beverage_cost += 4.0; }
        if(hasWhip()) { beverage_cost += 5.0; }

        return beverage_cost;

    }

}
