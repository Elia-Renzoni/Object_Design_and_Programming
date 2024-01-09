package thesis.management;

public enum ThesisState {
    IN_PREPARAZIONE("In Preparazione"),
    IN_REVISIONE("In Revisione"),
    APPROVATA("Approvata"),
    RIFIUTATA("Rifiutata");

    private String value;

    private ThesisState(final String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
