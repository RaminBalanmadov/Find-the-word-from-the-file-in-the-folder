
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String path = "C:\\Users\\Ramin\\Desktop\\New folder";
        File folder = new File(path);
        File[] listFiles = folder.listFiles();
        String text = "";

        BufferedReader br;
        for (File listFile : listFiles) {
            if (listFile.isFile()) {
                FileReader fileReader;
                try {
                    fileReader = new FileReader(listFile.getAbsolutePath());
                    br = new BufferedReader(fileReader);
                    while ((text = br.readLine()) != null) {

                        if (text.equalsIgnoreCase(word)) {
                            
                            System.out.println(listFile.getAbsolutePath());
                            break;
                        }

                    }

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FileFinder.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FileFinder.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }

    }

}
