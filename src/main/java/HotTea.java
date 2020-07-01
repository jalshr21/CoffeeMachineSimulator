public class HotTea extends Beverage {
    int tea_leaves_syrup;
    int hot_milk;
    public HotTea(int hot_water, int ginger_syrup, int sugar_syrup, int tea_leaves_syrup, int hot_milk) {
        super("Hot Tea", hot_water, ginger_syrup, sugar_syrup);
        this.tea_leaves_syrup = tea_leaves_syrup;
        this.hot_milk = hot_milk;
    }

    public HotTea() {
    }

    public int getTea_leaves_syrup() {
        return tea_leaves_syrup;
    }

    public void setTea_leaves_syrup(int tea_leaves_syrup) {
        this.tea_leaves_syrup = tea_leaves_syrup;
    }

    public int getHot_milk() {
        return hot_milk;
    }

    public void setHot_milk(int hot_milk) {
        this.hot_milk = hot_milk;
    }
}
