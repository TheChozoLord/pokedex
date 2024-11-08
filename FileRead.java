package Pokedex;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class FileRead {
    public ArrayList<String[]> readPokemonData(String filename) throws FileNotFoundException {
        File file = new File(filename);
        ArrayList<String[]> pokemonData = new ArrayList<>();

        try {
            Scanner console = new Scanner(file);

            while (console.hasNextLine()) {
                String line = console.nextLine();
                String[] data = line.split(","); // Split each line by comma

                // Check if the line has the expected number of data fields
                if (data.length == 5) {
                    pokemonData.add(data); // Add the data to the list
                } else {
                    System.out.println("Invalid data format in line: " + line);
                }
            }
            console.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
            throw e; // Re-throw exception to handle it in the calling function
        }

        return pokemonData;
    }
}
