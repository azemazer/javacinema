package Cinema;

public class Reservation {

    private Client client;
    private Salle salle;
    private Seance seance;
    private String place;

    public Reservation(Client client, Salle salle, Seance seance, String place) {
        this.client = client;
        this.salle = salle;
        this.seance = seance;
        this.place = place;
    }
}
