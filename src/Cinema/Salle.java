package Cinema;

import java.util.List;

public class Salle {
    private int capacite;
    private List<String> placeListe;

    public int getCapacite() {
        return capacite;
    }

    public List<String> getPlaceListe() {
        return placeListe;
    }

    public Salle(int capacite) {
        this.capacite = capacite;
        this.placeListe = Place.stringPlaces(capacite);
    }
}
