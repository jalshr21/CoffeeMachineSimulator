public class BlackTea extends Beverage {
    int tea_leaves_syrup;
    public BlackTea(int hot_water, int ginger_syrup, int sugar_syrup, int tea_leaves_syrup) {
        super("Black Tea", hot_water, ginger_syrup, sugar_syrup);
        this.tea_leaves_syrup = tea_leaves_syrup;
    }

    public BlackTea() {
    }
    public int getTea_leaves_syrup() {
        return tea_leaves_syrup;
    }

    public void setTea_leaves_syrup(int tea_leaves_syrup) {
        this.tea_leaves_syrup = tea_leaves_syrup;
    }
}
