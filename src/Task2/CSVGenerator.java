package Task2;

public class CSVGenerator {
    public static String generateCSV(String[] headers, String[][]
            data) {
        StringBuilder csv = new StringBuilder();

        csv.append(String.join(",", headers)).append("\n");

        for (String[] row : data) {
            csv.append(String.join(",", row)).append("\n");
        }
        return csv.toString().trim();
    }
}



