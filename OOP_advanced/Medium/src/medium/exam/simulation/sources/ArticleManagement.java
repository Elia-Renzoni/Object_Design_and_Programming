package medium.exam.simulation.sources;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ArticleManagement {
	private Set<Article> articles;
	
	public ArticleManagement() {
		this.articles = new TreeSet<>((n1, n2) -> {
			if (n1.getArticlePubblication() > n2.getArticlePubblication())
				return -1;
			else if (n1.getArticlePubblication() < n2.getArticlePubblication())
				return 1;
			else
				return 0;
		});
	}
	
	public void addArticle(Article article) {
		if (!(this.checkIfPresent(article.getArticleId()))) {
			this.articles.add(article);
			System.out.println("New Article Added !");
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public void viewArticles() {
		this.articles.stream()
			.forEachOrdered(n -> System.out.println(n));
	}
	
	public Article searchArticleByAuthor(final String author) {
		return this.articles.stream()
				.filter(n -> n.getArticleAuthor().equals(author))
				.findAny()
				.orElseThrow(IllegalArgumentException::new);
	}
	
	public Article searchArticleByCategory(final String category) {
		return this.articles.stream()
				.filter(n -> n.getCategory().equals(category))
				.findAny()
				.orElseThrow(InvalidCategoryException::new);
	}
	
	public List<Article> searchArticleByPubblication(final int periodTime) {
		return this.articles.stream()
				.filter(n -> n.getArticlePubblication() <= periodTime && periodTime >= n.getArticlePubblication())
				.collect(Collectors.toList());
	}
	
	public Article searchArticleByLength(final int length) {
		return this.articles.stream()
				.filter(n -> n.getArticleContent().length() == length)
				.findAny()
				.orElseThrow(IllegalArgumentException::new);
	}
	
	public Article searchArticleByTenchology(final String techonology) {
		return this.articles.stream()
				.filter(n -> n instanceof TechArticle)
				.filter(n -> n.getCategory().equals(techonology))
				.findAny()
				.orElseThrow(InvalidCategoryException::new);
	}
	
	public Article searchArticleByContentKeyWord(final String keyword) {
		return this.articles.stream()
				.filter(n -> n.getArticleContent().contains(keyword))
				.findAny()
				.orElseThrow(IllegalArgumentException::new);
	}
	
	private boolean checkIfPresent(final int id) {
		return this.articles.stream()
				.mapToInt(n -> n.getArticleId())
				.anyMatch(n -> n == id);
	}
}
