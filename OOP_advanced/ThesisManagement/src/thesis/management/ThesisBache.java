package thesis.management;

public class ThesisBache extends Thesis {
    private final String classDegree;

    public ThesisBache(final String title, final String author, final int date, final ThesisState state, final String supervisor, final String classDegree) {
        super(title, author, date, state, supervisor);
        this.classDegree = classDegree;
    }

    @Override
    public String toString() {
        return super.getTitle() + " " + super.getAuthor() + " "
               + super.getDate() + " " + super.getState().getValue() + " "
               + super.getSupervisor() + " " + this.classDegree;
    }
    
}