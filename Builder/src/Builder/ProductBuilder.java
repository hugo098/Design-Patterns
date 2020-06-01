package Builder;

public abstract class ProductBuilder {
	protected Product product;
	 
    public Product getProduct() { 
    	return product; 
    }
    
	public void buildId(Long id) {
		product.setId(id);
	}
	
	public void buildDescription(String description) {
		product.setDescription(description);
	}
	
	public void buildPrice(Long price) {
		product.setPrice(price);
	}
	
	public abstract void buildType();
	
	
	
}
