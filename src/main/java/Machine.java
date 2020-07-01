import com.google.gson.annotations.SerializedName;

public class Machine {
    @SerializedName("outlets")
    Outlets outlets;

    @SerializedName("total_items_quantity")
    Ingredients total_items_quantity;

    @SerializedName("beverages")
    Beverages beverages;
}
