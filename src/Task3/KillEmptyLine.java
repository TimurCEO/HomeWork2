package Task3;

public class KillEmptyLine {
    public static String removeEmpLine(String text) {
        String[] lines = text.split("\n");
        StringBuilder cleanText = new StringBuilder();
        for (String line : lines) {
            if (!line.trim().isEmpty()) {
                if (!cleanText.isEmpty()) {
                    cleanText.append("\n");
                }
                cleanText.append(line);
            }
        }
        return cleanText.toString();
    }
}