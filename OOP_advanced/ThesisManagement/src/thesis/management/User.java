package thesis.management;

public class User {
	public static void main(String ...args) {
		ThesisMaster tm1 = new ThesisMaster("Distributed System", "Mattia XY", 12, ThesisState.IN_PREPARAZIONE, "Elia Renzoni", "Computer Science");
		ThesisMaster tm2 = new ThesisMaster("Cloud Computing", "Angela Dern", 44, ThesisState.APPROVATA, "Marvin Vettori", "Computer Engineering");
		ThesisMaster tm3 = new ThesisMaster("Rust in fault tollerance system", "Marchionni Fabio", 6, ThesisState.IN_REVISIONE, "Lucia Andreoletti", "Computer Science");
		ThesisBache tb1 = new ThesisBache("Robot per lavaggio mani", "Lorenzo Giovanelli", 55, ThesisState.RIFIUTATA, "Sara Bellon", "Computer Science and Engineering");
		ThesisBache tb2 = new ThesisBache("JavaScript come Backend", "Manon Fiorot", 5, ThesisState.IN_PREPARAZIONE, "Cristiano Federici", "Computer Science and Management");
		ThesisPhD tphd = new ThesisPhD("New vawes in fault tollercance system", "Franceso Lorenzotti", 78, ThesisState.RIFIUTATA, "Jon Jones", "Distributed Computing and Cloud Systems");
		
		ThesisManagement thmng = new ThesisManagement();
		thmng.addThesis(tm1);
		thmng.addThesis(tm2);
		thmng.addThesis(tm3);
		thmng.addThesis(tb2);
		thmng.addThesis(tb1);
		thmng.addThesis(tphd);
		
		System.out.println(thmng.searchThesisByAuthor("Angela Dern"));
		thmng.searchThesisBySupervisor("Sara Bellon").stream()
				.forEachOrdered(n -> System.out.println(n));
		
		System.out.println(thmng.searchThesisByTitle("Distributed System"));
	}
}
