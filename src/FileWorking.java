import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWorking {

    private BufferedReader file;

    public FileWorking(){
        try {
            file = new BufferedReader(new FileReader("./src/data_comets.csv"));
        } catch (FileNotFoundException ex){
            System.out.println("file not found");
        }
    }

    public ArrayList<models.Comet> initComets() {
        if(file == null) return null;
        ArrayList<models.Comet> comets = new ArrayList<models.Comet>();
        try {
            String line;
            while ((line = file.readLine()) != null) {
                models.Comet comet = new models.Comet();
                Scanner scanner = new Scanner(line);
                scanner.useDelimiter(",");

                comet.Title = scanner.next();
                comet.Exentr = Float.parseFloat(scanner.next());
                comet.Angle = Float.parseFloat(scanner.next());
                comet.Size = Float.parseFloat(scanner.next());
                comet.Perigiliy = Float.parseFloat(scanner.next());
                comet.Aphelic = Float.parseFloat(scanner.next());
                comet.Period = Float.parseFloat(scanner.next());

                comets.add(comet);
            }
        } catch (IOException e){
            System.out.println("Error while tried to read the file");
        }
        return (comets);
    }

}
