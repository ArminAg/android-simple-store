package solutions.hedron.simple_store.services;

import java.util.ArrayList;

import solutions.hedron.simple_store.models.CategoryItem;

/**
 * Created by armin on 25/01/2017.
 */
public class DataService {
    private static DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
    }

    public ArrayList<CategoryItem> getGameItems(){
        ArrayList<CategoryItem> gamesList = new ArrayList<>();
        gamesList.add(new CategoryItem("Flight Simulator", "flightplanmusic"));
        gamesList.add(new CategoryItem("Bicycle Racing", "bicyclemusic"));
        gamesList.add(new CategoryItem("Kids Game", "kidsmusic"));

        return gamesList;
    }

    public ArrayList<CategoryItem> getProductivityItems(){
        ArrayList<CategoryItem> productivityList = new ArrayList<>();
        productivityList.add(new CategoryItem("Password Protect", "keymusic"));
        productivityList.add(new CategoryItem("Flight Planner", "flightplanmusic"));
        productivityList.add(new CategoryItem("Business Planning", "socialmusic"));

        return productivityList;
    }

    public ArrayList<CategoryItem> getHealthItems(){
        ArrayList<CategoryItem> healthList = new ArrayList<>();
        healthList.add(new CategoryItem("Music Player", "vinylmusic"));
        healthList.add(new CategoryItem("Meditation", "socialmusic"));
        healthList.add(new CategoryItem("Riding Bicycle", "bicyclemusic"));

        return healthList;
    }
}
