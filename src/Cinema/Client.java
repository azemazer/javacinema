package Cinema;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String nom;
    private String email;
    private List<Reservation> reservationList = new ArrayList<>();

    public Client(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void reserve(Seance seance, Salle salle, String place) {
        if (seance.isFull())
            System.out.println("Cette séance est pleine");
        else
            reservationList.add(new Reservation(this, salle, seance, place));
    }


}
