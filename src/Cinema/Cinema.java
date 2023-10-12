package Cinema;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cinema {

    private String nom;
    private List<Film> filmListe = new ArrayList<>();
    private List<Seance> seanceListe = new ArrayList<>();
    private List<Salle> salleListe = new ArrayList<>();

    public Cinema(String nom, List<Salle> salleListe) {
        this.nom = nom;
        this.salleListe = salleListe;
    }

    public void addFilm(Film film){
        this.filmListe.add(film);
    }

    public void removeFilm(Film film){
        this.filmListe.remove(film);
    }

    public void scheduleSeance(Film film, Date date, Time heure, Salle salle ){
        Seance seance = new Seance(film, date, heure, salle);
        this.seanceListe.add(seance);
    }

    public String getNom() {
        return nom;
    }

    public List<Film> getFilmListe() {
        return filmListe;
    }

    public List<Seance> getSeanceListe() {
        return seanceListe;
    }

    public List<Salle> getSalleListe() {
        return salleListe;
    }

    public List<Seance> getAllSeancesForFilmOnDate(Film film, Date date){
        List<Seance> listOfSeanceForFilmOnDate = new ArrayList<Seance>();
        for (Seance entry : this.seanceListe) {
            if (entry.getFilm() == film && entry.getDate() == date) {
                listOfSeanceForFilmOnDate.add(entry);
            }
        }
        return listOfSeanceForFilmOnDate;
    }
}
