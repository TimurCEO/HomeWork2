import Task1.URLBuilder;
import Task2.CSVGenerator;
import Task3.KillEmptyLine;

public class Main {
    public static void main(String[] args) {
        String text = "line1\n\n\n\nline2\n\n\nline3\n\n";
        KillEmptyLine cln = new KillEmptyLine();
        System.out.println(cln.removeEmpLine(text));

    }
}
