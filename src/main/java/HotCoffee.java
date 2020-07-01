public class HotCoffee extends Beverage {
    int tea_leaves_syrup;
    int hot_milk;
    public HotCoffee(int hot_water, int ginger_syrup, int sugar_syrup, int tea_leaves_syrup, int hot_milk) {
        super("Hot Coffee", hot_water, ginger_syrup, sugar_syrup);
        this.tea_leaves_syrup = tea_leaves_syrup;
        this.hot_milk = hot_milk;
    }

    public HotCoffee() {
    }

    public void executeOrder(StartMachine startMachine) {
        startMachine.machine.total_items_quantity.hot_water -= this.hot_water;
        startMachine.machine.total_items_quantity.hot_milk -= this.hot_milk;
        startMachine.machine.total_items_quantity.ginger_syrup -= this.ginger_syrup;
        startMachine.machine.total_items_quantity.sugar_syrup -= this.sugar_syrup;
        startMachine.machine.total_items_quantity.tea_leaves_syrup -= this.tea_leaves_syrup;
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
