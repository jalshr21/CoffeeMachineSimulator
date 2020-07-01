import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OperateMachine {
    static StartMachine startMachine;
    static ExecutorService executor;
    public static void main(String[] args) throws InterruptedException {
        OperateMachine operateMachine = new OperateMachine();
        startMachine = operateMachine.readDataFromJSON();
        executor = Executors.newFixedThreadPool(startMachine.machine.outlets.count_n);
        System.out.println();
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("What would you like to order? \n" +
                    "1. Black Tea \n" +
                    "2. Green Tea \n" +
                    "3. Hot Coffee \n" +
                    "4. Hot Tea \n" +
                    "5. Refill Machine \n" +
                    "6. Close Machine");
            String s = in. nextLine();
            if (s.equals("Close Machine")) {
                System.out.println("Thank You");
                break;
            }
            else if (s.equals("Refill Machine")) {
                System.out.println("Enter Ingredient Name and quantity");
                String ingredient = in.nextLine();
                int amount = Integer.parseInt(in.nextLine());
                operateMachine.UpdateIngredient(ingredient, amount);
            }
            else {
                System.out.println("Enter number of cups");
                int quantity = Integer.parseInt(in.nextLine());
                Order order = new Order();
                order.beverage_type = s;
                order.quantity = quantity;
                operateMachine.ProcessOrders(order);
            }
        }
    }

    private void ProcessOrders(Order order) {
        Runnable worker = new ProcessOrderThread(this.startMachine, order);
        executor.execute(worker);
    }

    private void UpdateIngredient(String ingredient, int amount) {
        if (ingredient.equals("Ginger"))
            startMachine.machine.total_items_quantity.ginger_syrup += amount;
        if (ingredient.equals("Green"))
            startMachine.machine.total_items_quantity.green_mixture += amount;
        if (ingredient.equals("Milk"))
            startMachine.machine.total_items_quantity.hot_milk += amount;
        if (ingredient.equals("Water"))
            startMachine.machine.total_items_quantity.hot_water += amount;
        if (ingredient.equals("Sugar"))
            startMachine.machine.total_items_quantity.sugar_syrup += amount;
        if (ingredient.equals("Tea"))
            startMachine.machine.total_items_quantity.tea_leaves_syrup += amount;
    }

    StartMachine readDataFromJSON (){
        Gson gson = new Gson();
        JsonReader reader = null;
        try {
            reader = new JsonReader(new FileReader("src/main/resources/input.json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StartMachine startMachine = gson.fromJson(reader, StartMachine.class);
        return startMachine;
    }
}
