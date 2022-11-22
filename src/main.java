import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) throws IOException {

        //Unable patterns: NAME, PERIOD, SIZE
        String pattern_for_sorting = "SIZE";

        ArrayList<models.Comet> comets = new FileWorking().initComets();
        if (comets == null) return;
        new Sorting(pattern_for_sorting, comets);
    }
}
