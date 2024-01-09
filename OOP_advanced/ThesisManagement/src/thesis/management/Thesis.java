package thesis.management;

import java.util.Comparator;

public abstract class Thesis {
    private final String title;
    private final String author;
    private final int date;
    private final ThesisState state;
    private final String supervisor;

    public Thesis(final String title, final String author, final int date, final ThesisState state, final String supervisor) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.state = state;
        this.supervisor = supervisor;
    }

    public abstract String toString();
    
    
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getDate() {
        return this.date;
    }

    public ThesisState getState() {
        return this.state;
    }

    public String getSupervisor() {
        return this.supervisor;
    }
}
