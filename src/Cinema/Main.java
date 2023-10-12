package Cinema;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Film starWars = new Film("Star wars", "Dans une galaxie lointaine...", new Date());
        Film jumanji = new Film("Jumanji", "Un jeu de société maléfique", new Date());
        Film cloudAtlas = new Film("Cloud Atlas", "Des destins qui s'entremêlent", new Date());
        Film theCommitments = new Film("The Commitments", "Un groupe de soul irlandais", new Date());

        Salle sallePetite = new Salle(20);
        Salle salleMoyenne = new Salle(50);
        Salle salleGrande = new Salle(100);

        List<Salle> listeDeSalles = new ArrayList<>();
        listeDeSalles.add(sallePetite);
        listeDeSalles.add(salleMoyenne);
        listeDeSalles.add(salleGrande);

        Cinema laCineTheque = new Cinema("La Cinéthèque", listeDeSalles);

        laCineTheque.addFilm(starWars);
        laCineTheque.addFilm(jumanji);
        laCineTheque.addFilm(cloudAtlas);
        laCineTheque.addFilm(theCommitments);

        laCineTheque.scheduleSeance(starWars, new Date(), new Time(18,30,0), sallePetite);
        laCineTheque.scheduleSeance(jumanji, new Date(), new Time(21,0,0), sallePetite);
        laCineTheque.scheduleSeance(jumanji, new Date(), new Time(22,0,0), salleMoyenne);
        laCineTheque.scheduleSeance(cloudAtlas, new Date(), new Time(117,30,0), salleMoyenne);
        laCineTheque.scheduleSeance(cloudAtlas, new Date(), new Time(20,30,0), salleGrande);
        laCineTheque.scheduleSeance(theCommitments, new Date(), new Time(15,0,0), salleGrande);

        System.out.println("Voici les séances pour Cloud Atlas à la Cinéthèque aujourd'hui:");
        System.out.println(laCineTheque.getAllSeancesForFilmOnDate(cloudAtlas, new Date()));

        Client jean = new Client("Jean", "jean@adresse.com");
        Client dominique = new Client("Dominique", "dominique@autradresse.fr");

        dominique.reserve(laCineTheque.getSeanceListe().get(0), laCineTheque.getSeanceListe().get(0).getSalle(), "A3");
        dominique.reserve(laCineTheque.getSeanceListe().get(2), laCineTheque.getSeanceListe().get(2).getSalle(), "B4");
        jean.reserve(laCineTheque.getSeanceListe().get(3), laCineTheque.getSeanceListe().get(3).getSalle(), "C9");
        jean.reserve(laCineTheque.getSeanceListe().get(5), laCineTheque.getSeanceListe().get(5).getSalle(), "H5");

        System.out.println(dominique.getReservationList());
        System.out.println(jean.getReservationList());

    }

}
