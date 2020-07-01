public abstract class Beverage {
    String name;
    int hot_water;
    int ginger_syrup;
    int sugar_syrup;

    public Beverage(String name, int hot_water, int ginger_syrup, int sugar_syrup) {
        this.name =name;
        this.hot_water = hot_water;
        this.ginger_syrup = ginger_syrup;
        this.sugar_syrup = sugar_syrup;
    }

    public Beverage() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHot_water() {
        return hot_water;
    }

    public void setHot_water(int hot_water) {
        this.hot_water = hot_water;
    }

    public int getGinger_syrup() {
        return ginger_syrup;
    }

    public void setGinger_syrup(int ginger_syrup) {
        this.ginger_syrup = ginger_syrup;
    }

    public int getSugar_syrup() {
        return sugar_syrup;
    }

    public void setSugar_syrup(int sugar_syrup) {
        this.sugar_syrup = sugar_syrup;
    }
}
