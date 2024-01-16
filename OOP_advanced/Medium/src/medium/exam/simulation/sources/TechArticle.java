package medium.exam.simulation.sources;

public class TechArticle extends Article {
	private String category;
	private String articleContent;
	
	
	public TechArticle(String title, String author, int date, int id, String category, String articleContent) {
		super(title, author, date, id);
		this.category = category;
		this.articleContent = articleContent;
	}

	@Override
	public String getCategory() {
		return this.category;
	}

	@Override
	public void viewArticleContent() {
		System.out.println(this.articleContent);
	}

	@Override
	public String getArticleContent() {
		return this.articleContent;
	}

}
