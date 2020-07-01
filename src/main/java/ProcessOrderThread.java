public class ProcessOrderThread implements Runnable{
    StartMachine startMachine;
    Order order;
    public ProcessOrderThread(StartMachine startMachine, Order order) {
        this.startMachine = startMachine;
        this.order = order;
    }
    @Override
    public void run() {
        System.out.println("Order processing for " + order.beverage_type);
        if (this.order.beverage_type == "Hot Coffee") {
            this.startMachine.machine.beverages.hotCoffee.executeOrder(startMachine);
        }

        else if (this.order.beverage_type == "Hot Tea") {
            this.startMachine.machine.total_items_quantity.hot_water -= this.startMachine.machine.beverages.hotTea.hot_water;
            this.startMachine.machine.total_items_quantity.hot_milk -= this.startMachine.machine.beverages.hotTea.hot_milk;
            this.startMachine.machine.total_items_quantity.ginger_syrup -= this.startMachine.machine.beverages.hotTea.ginger_syrup;
            this.startMachine.machine.total_items_quantity.sugar_syrup -= this.startMachine.machine.beverages.hotTea.sugar_syrup;
            this.startMachine.machine.total_items_quantity.tea_leaves_syrup -= this.startMachine.machine.beverages.hotTea.tea_leaves_syrup;
        }

        else if (this.order.beverage_type == "Black Tea") {
            this.startMachine.machine.total_items_quantity.hot_water -= this.startMachine.machine.beverages.blackTea.hot_water;
            this.startMachine.machine.total_items_quantity.ginger_syrup -= this.startMachine.machine.beverages.blackTea.ginger_syrup;
            this.startMachine.machine.total_items_quantity.sugar_syrup -= this.startMachine.machine.beverages.blackTea.sugar_syrup;
            this.startMachine.machine.total_items_quantity.tea_leaves_syrup -= this.startMachine.machine.beverages.blackTea.tea_leaves_syrup;
        }
        else if (this.order.beverage_type == "Green Tea") {
            this.startMachine.machine.total_items_quantity.hot_water -= this.startMachine.machine.beverages.greenTea.hot_water;
            this.startMachine.machine.total_items_quantity.ginger_syrup -= this.startMachine.machine.beverages.greenTea.ginger_syrup;
            this.startMachine.machine.total_items_quantity.sugar_syrup -= this.startMachine.machine.beverages.greenTea.sugar_syrup;
            this.startMachine.machine.total_items_quantity.green_mixture -= this.startMachine.machine.beverages.greenTea.green_mixture;
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(order.beverage_type + " is prepared!");
    }
}
