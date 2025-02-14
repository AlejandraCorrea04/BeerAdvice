package Raza;

import java.util.ArrayList;

public class razadviser {

    public ArrayList<String> getRaza(String raza) {
        ArrayList<String> razas = new ArrayList<>();

        switch (raza.toLowerCase()) {
            case "pastor":
                razas.add("Pastor Aleman");
                razas.add("Pastor Catalan");
                break;
            case "pinscher":
                razas.add("Pinscher Aleman");
                razas.add("Pinscher Miniatura");
                break;
            case "pomerania":
                razas.add("Pomerania estandar ");
                razas.add("Pomerania miniatura");
                break;
            case "bulldog":
                razas.add("Bulldog ingles");
                razas.add("Bulldog frances");
                break;
            default:
                razas.add("No hay recomendaciones");
        }

        return razas;
    }
}
