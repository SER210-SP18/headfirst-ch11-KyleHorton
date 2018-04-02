package kylehorton.ser210.quinnipiac.edu.starbuzz;

/**
 * Created by Kyleh on 2/19/2018.
 */

public class Drink {

    private String name;
    private String description;
    private int imageResourceId;

    //drinks is an array of drinks
    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of expresso shots with steamed milk", R.drawable.latte),
            new Drink("Cappuccino", "Expresso, hot milk, and a steamed milk foam", R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)
    };

    //each drink has a name, description, and an image resource
    private Drink(String name, String description, int imageResourceId){
        this.name  = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription(){
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return this.name;
    }


}
