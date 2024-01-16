package medium.exam.simulation.sources;

public class ArtArticle extends Article {
	private String category;
	private String articleContent;
	
	public ArtArticle(String title, String author, int date, int id, final String category, final String content) {
		super(title, author, date, id);
		this.category = category;
		this.articleContent = content;
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
