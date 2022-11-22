import models.Comet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Sorting {

    public Sorting(String pattern, ArrayList<Comet> comets){

        ArrayList<Comet> cometsAfterSort = new ArrayList<>();

        switch(pattern){
            case "NAME":
                cometsAfterSort = sortByName(comets);
                break;
            case "SIZE":
                cometsAfterSort = sortBySize(comets);
                break;
            case "PERIOD":
                cometsAfterSort = sortByPeriod(comets);
                break;
        }
        if(cometsAfterSort.size() != 0) print(cometsAfterSort);
        else System.out.println("Pattern is incorrect!");
    }

    private void print(ArrayList<Comet> comets) {
        for(Comet c : comets){
            String st = c.Title + "," + c.Exentr +
                    "," + c.Angle + "," + c.Size +
                    "," + c.Perigiliy + "," + c.Aphelic + "," + c.Period;
            System.out.println(st);
        }
    }

    private ArrayList<models.Comet> sortByPeriod(ArrayList<Comet> comets) {
        comets.sort(Comparator.comparing(Comet::getPeriod));
        return comets;
    }

    private ArrayList<models.Comet> sortBySize(ArrayList<Comet> comets) {
        comets.sort(Comparator.comparing(Comet::getSize));
        return comets;
    }

    private ArrayList<models.Comet> sortByName(ArrayList<Comet> comets) {
        comets.sort(Comparator.comparing(Comet::getTitle));
        return comets;
    }


}
