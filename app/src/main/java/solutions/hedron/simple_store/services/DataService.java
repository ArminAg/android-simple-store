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
        ArrayList<CategoryItem> games = new ArrayList<>();
        games.add(new CategoryItem("Flight Simulator", "flightplanmusic"));
        games.add(new CategoryItem("Bicycle Racing", "bicyclemusic"));
        games.add(new CategoryItem("Kids Game", "kidsmusic"));

        return games;
    }

    public ArrayList<CategoryItem> getProductivityItems(){
        ArrayList<CategoryItem> games = new ArrayList<>();
        games.add(new CategoryItem("Password Protect", "keymusic"));
        games.add(new CategoryItem("Flight Planner", "flightplanmusic"));
        games.add(new CategoryItem("Business Planning", "socialmusic"));

        return games;
    }

    public ArrayList<CategoryItem> getHealthItems(){
        ArrayList<CategoryItem> games = new ArrayList<>();
        games.add(new CategoryItem("Music Player", "vinylmusic"));
        games.add(new CategoryItem("Meditation", "socialmusic"));
        games.add(new CategoryItem("Riding Bicycle", "bicyclemusic"));

        return games;
    }
}
