import java.util.List;

public class Shop {
	private List<Article> articles;
	private List<Cart> carts;

	public void listAllArticles() {

	}

	public Shop() {
		super();
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public List<Cart> getCarts() {
		return carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}

	@Override
	public String toString() {
		return "Shop [articles=" + articles + ", carts=" + carts + "]";
	}
	
	
}
