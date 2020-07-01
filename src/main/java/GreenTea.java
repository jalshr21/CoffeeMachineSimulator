public class GreenTea extends Beverage {
    int green_mixture;
    public GreenTea(int hot_water, int ginger_syrup, int sugar_syrup, int green_mixture) {
        super("Green Tea", hot_water, ginger_syrup, sugar_syrup);
        this.green_mixture = green_mixture;
    }

    public GreenTea() {
    }

    public int getGreen_mixture() {
        return green_mixture;
    }

    public void setGreen_mixture(int green_mixture) {
        this.green_mixture = green_mixture;
    }
}
