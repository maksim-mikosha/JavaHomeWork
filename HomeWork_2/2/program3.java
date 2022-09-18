import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class program3 {
    public static void main(String[] args) {
        Logger log = Logger.getAnonymousLogger();
        try {
            File f  = new File("F:/GeekBrains/Java/JavaHomeWork/HomeWork_2/2/Rating.txt");
            FileInputStream in = new FileInputStream(f);
            try (BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"))) {
                String s;
                while ((s = br.readLine()) != null) {
                    String[] words = s.split(" ");
                    log.info("Output string");
                    System.out.printf("Ученик %s получил сегодня %s \n", words[0], words[1]);
                }
            } catch (Exception ex) {
                log.log(Level.WARNING, "Something went wrong ", ex.getMessage());
            }
        } catch (Exception exp) {
            log.log(Level.WARNING, "Something went wrong ", exp.getMessage());
        }
    }
}