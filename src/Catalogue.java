
public class Catalogue {
	private Product[] listofAllProducts;

	public Product[] getListofAllProducts() {
		Product product1 = new Product();
		product1.setProductId("1");
		product1.setProductName("Product 1");
		product1.setCost("100");
		Product product2 = new Product();
		product2.setProductId("2");
		product2.setProductName("Product 2");
		product2.setCost("200");
		listofAllProducts = new Product[2];
		listofAllProducts[0] = product1;
		listofAllProducts[1] = product2;
		return listofAllProducts;
	}

	public void setListofAllProducts(Product[] listofAllProducts) {
		this.listofAllProducts = listofAllProducts;
	}
}
