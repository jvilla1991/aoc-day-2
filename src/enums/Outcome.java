package enums;

public enum Outcome {
    LOSE("X"),
    DRAW("Y"),
    WIN("Z");

    public final String label;

    private Outcome(String label) {
        this.label = label;
    }
}
