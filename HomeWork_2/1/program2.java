import java.io.File;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class program2 {
    public static void main(String[] args) {
        String stringValue = "test";
        Logger log = Logger.getAnonymousLogger();
        File file = new File("F:/GeekBrains/Java/JavaHomeWork/HomeWork_2/1", "Result.txt");
        try {
            if (file.createNewFile()) log.log(Level.INFO, "File is created!");
            try (FileWriter fw = new FileWriter("F:/GeekBrains/Java/JavaHomeWork/HomeWork_2/1/Result.txt", false)) {
                fw.append(fillString(stringValue));
                log.log(Level.INFO, "Data written to file.");
            }
        } catch (Exception exp) {
            log.log(Level.WARNING, "Something went wrong ");
            System.out.println(exp.getMessage());
        }
    }

    private static String fillString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sb.append(str.toUpperCase());
            } else {
                sb.append(str.toLowerCase());
            }
        }
        return sb.toString();
    }
}