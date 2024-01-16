package medium.exam.simulation.sources;

public abstract class Article {
	private String articleTitle;
	private String articleAuthor;
	private int pubblication;
	private int articleId;
	
	public Article(final String title, final String author, final int date, final int articleid) {
		this.articleTitle = title;
		this.articleAuthor = author;
		this.pubblication = date;
		this.articleId = articleid;
	}
	
	public String getArticleTitle() {
		return this.articleTitle;
	}
	
	public String getArticleAuthor() {
		return this.articleAuthor;
	}
	
	public int getArticlePubblication() {
		return this.pubblication;
	}
	
	public int getArticleId() {
		return this.articleId;
	}
	
	public abstract String getCategory();
	public abstract void viewArticleContent();
	public abstract String getArticleContent();
}
