package beeradviser;
import java.util.ArrayList;

public class BeerExpert {

    public ArrayList<String> getBrands(String color) {
        ArrayList<String> brands = new ArrayList<>();

        switch (color.toLowerCase()) {
            case "light":
                brands.add("Coors Light");
                brands.add("Bud Light");
                break;
            case "amber":
                brands.add("Amber Bock");
                brands.add("Fat Tire Amber Ale");
                break;
            case "brown":
                brands.add("Newcastle Brown Ale");
                brands.add("Samuel Smith’s Nut Brown Ale");
                break;
            case "dark":
                brands.add("Guinness");
                brands.add("Murphy’s Irish Stout");
                break;
            default:
                brands.add("No hay recomendaciones");
        }

        return brands;
    }
}

