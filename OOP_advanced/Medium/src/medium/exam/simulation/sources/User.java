package medium.exam.simulation.sources;

public class User {
	public static void main(String ...args) {
		ArtArticle art1 = new ArtArticle("Cromatismi Sinfonici: Un'Esplorazione dei Colori Vibranti nella Pittura Contemporanea", "Elia Renzoni", 12, 1, Categories.ART_FIRST.getCategory(), "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed nec turpis vel orci commodo hendrerit.");
		TechArticle tech1 = new TechArticle("Blockchain oltre le Criptovalute: Applicazioni Innovative e Impatti Sociali", "Selene Renzoni", 11, 2, Categories.TECH_FIRST.getCategory(), "vitae lectus vel libero vestibulum condimentum. ");
		
		ArtArticle art2 = new ArtArticle("Scultrice dell'Anima: L'Arte di Plasmare l'Emozione attraverso la Scultura Astratta", "Selene Renzoni", 11, 3, Categories.ART_SECOND.getCategory(), "hendrerit quam a metus hendrerit, ut hendrerit nulla tincidunt. Integer euismod massa sit amet purus");
		TechArticle tech2 = new TechArticle("Evoluzione dell'Intelligenza Artificiale: Dalle Origini alle Prospettive Future", "Massimo Recalcati", 55, 4, Categories.TECH_SECOND.getCategory(), "Integer feugiat, mi ac fermentum suscipit, risus turpis volutpat elit, vel vestibulum risus elit id veli");
		
		TechArticle tech3 = new TechArticle("Cybersecurity nel 2024: Le Nuove Minacce Digitali e le Strategie di Difesa Avanzate", "Joseph Bee", 44, 5, Categories.TECH_FIRST.getCategory(), "vitae lectus vel libero vestibulum condimentum. Ut hendrerit quam a metus hendrerit, ut hendrerit nulla");
		
		ArticleManagement manager = new ArticleManagement();
		manager.addArticle(art2);
		manager.addArticle(art1);
		manager.addArticle(tech1);
		manager.addArticle(tech3);
		manager.addArticle(tech2);
		
		System.out.println(manager.searchArticleByAuthor("Selene Renzoni").getArticleId());
		System.out.println(manager.searchArticleByCategory("Distributed System").getArticleId());
		System.out.println(manager.searchArticleByContentKeyWord("metus").getArticleId());
		
		manager.viewArticles();
		
		
	}
}
