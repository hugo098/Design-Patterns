package Builder;

public class BProductBuilder extends ProductBuilder {

	public BProductBuilder(){
		super.product = new Product();
	}
	
	@Override
	public void buildType() {
		product.setType("B TYPE");
		
	}

}
