import com.google.gson.annotations.SerializedName;

public class Beverages {
    @SerializedName("black_tea")
    BlackTea blackTea;

    @SerializedName("green_tea")
    GreenTea greenTea;

    @SerializedName("hot_coffee")
    HotCoffee hotCoffee;

    @SerializedName("hot_tea")
    HotTea hotTea;
}
