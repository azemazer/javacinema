package Cinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Place {
    private String numero;
    private Map<Seance, Boolean> isOccupied;

    public static List<String> stringPlaces(int nombreDePlaces) {
        List<String> totalLetterStringList = new ArrayList<String>();
        List<String> totalStringList = new ArrayList<String>();
        totalLetterStringList.add("A");
        totalLetterStringList.add("B");
        totalLetterStringList.add("C");
        totalLetterStringList.add("D");
        totalLetterStringList.add("E");
        totalLetterStringList.add("F");
        totalLetterStringList.add("G");
        totalLetterStringList.add("H");
        totalLetterStringList.add("I");
        totalLetterStringList.add("J");

        for (String letter : totalLetterStringList) {
            for (int i = 1; i <= 10; i++) {
                totalStringList.add(letter + i);
            }
        }

        final int currentSize = 100;
        if (currentSize > nombreDePlaces) {
            totalStringList.subList(nombreDePlaces, currentSize).clear();
        }
        ;

        return totalStringList;
    }
}
