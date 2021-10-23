package view;

public class ResultsFormatter {
    public String format(String selection, float apogee) {
        return String.format("Rocket %s flew up to a height of %.1f meters!",selection,apogee);
    }
}
