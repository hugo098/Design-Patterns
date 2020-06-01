package Builder;

public class ProductDirector {
	private ProductBuilder pb;
	
	public void setProductBuilder(ProductBuilder pb) { 
		this.pb = pb; 
	}
	
    public Product getProduct() {
    	return pb.getProduct(); 
    }
    
    public void buildProduct(Long id, String description, Long price) {
    	pb.buildId(id);
    	pb.buildDescription(description);
    	pb.buildPrice(price);
    	pb.buildType();
    }
}
