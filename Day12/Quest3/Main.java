package Day12.Quest3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<MusicBand> bands = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) { 
            MusicBand band = new MusicBand("Band " + i, 1996 + i); // Предполагается, что у класса есть конструктор с названием и годом основания
            bands.add(band);
        }

        for (MusicBand band : bands) {
            System.out.print(band.name + " (" + band.year + ") ");
        }
        
        System.out.println("\n");
        List<MusicBand> filteredBands = groupsAfter2000(bands);

        for (MusicBand band : filteredBands) {
            System.out.print(band.name + " (" + band.year + ") ");
        }
    }

    public static List<MusicBand> groupsAfter2000 (List<MusicBand> bands) {

        List<MusicBand> filteredBands = new ArrayList<>();

        for (MusicBand band : bands) {
            if (band.year >= 2000) {
                filteredBands.add(band);
            }
        }
        return filteredBands;
    }  
}
