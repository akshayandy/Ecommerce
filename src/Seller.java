
public class Seller extends User{
	private Product [] productsListed;
	
	@Override
	public Boolean verifyUser() {
		return true;
	}
	public Product[] getProductsListed() {
		return productsListed;
	}
	public void setProductsListed(Product[] productsListed) {
		this.productsListed = productsListed;
	}

}
