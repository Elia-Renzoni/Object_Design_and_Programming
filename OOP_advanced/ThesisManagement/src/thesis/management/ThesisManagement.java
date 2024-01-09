package thesis.management;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ThesisManagement <E extends Thesis> {
    private Set<E> thesis;

    public ThesisManagement() {
        this.thesis = new TreeSet<>((t1, t2) -> {
        	if (t1.getDate() > t2.getDate())
        		return -1;
        	else if (t1.getDate() < t2.getDate())
        		return 1;
        	else 
        		return 0;
        });
    }

    public void addThesis(E thesis) {
        this.thesis.add(thesis);
        System.out.println("New thesis added");
    }

    public List<String> viewApprovedThesis() {
        return this.thesis.stream()
            .map(n -> n.getState().getValue())
            .filter(n -> n.equals("Approvata"))
            .collect(Collectors.toList());
    }

    public String searchThesisByTitle(final String titleToSearch) {
        return this.thesis.stream()
            .map(n -> n.getTitle())
            .filter(n -> n.equals(titleToSearch))
            .findAny()
            .get();
    }

    public String searchThesisByAuthor(final String authorToSearch) {
        return this.thesis.stream()
            .map(n -> n.getAuthor())
            .filter(n -> n.equals(authorToSearch))
            .findAny()
            .get();
    }

    public List<String> searchThesisBySupervisor(final String supervisor) {
        return this.thesis.stream()
            .map(n -> n.getSupervisor())
            .filter(n -> n.equals(supervisor))
            .collect(Collectors.toList());
    }

    public Set<E> getThesis() {
        return this.thesis;
    }
}
