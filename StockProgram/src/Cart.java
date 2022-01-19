import java.util.List;

public class Cart {
	private String userName;
	private List<Article> articles;

	public void listAllArticles() {
	}

	public void putArticle() {
	}

	public void calculatePrice() {
	}

	public Cart(String userName) {
		super();
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	@Override
	public String toString() {
		return "Cart [userName=" + userName + ", articles=" + articles + "]";
	}
	
	
}
