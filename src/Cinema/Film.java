package Cinema;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Film {
    private String nom;
    private String synopsis;
    private Date dateDeSortie;

    public Film(String nom, String synopsis, Date dateDeSortie) {
        this.nom = nom;
        this.synopsis = synopsis;
        this.dateDeSortie = dateDeSortie;
    }
}
