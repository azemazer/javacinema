package Cinema;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Seance {

    private Film film;
    private Date date;
    private Time horaire;
    private Salle salle;
    private List<Reservation> reservationList = new ArrayList<>();

    public Seance(Film film, Date date, Time horaire, Salle salle) {
        this.film = film;
        this.date = date;
        this.horaire = horaire;
        this.salle = salle;
    }
    public Film getFilm() {
        return film;
    }

    public Date getDate() {
        return date;
    }

    public Time getHoraire() {
        return horaire;
    }

    public Salle getSalle() {
        return salle;
    }

    public void addReservation(Reservation reservation) {
        this.reservationList.add(reservation);
    }

    public boolean isFull(){
        return (this.salle.getCapacite() == this.reservationList.size());
    }

}
