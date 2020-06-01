package Builder;

public class AProductBuilder extends ProductBuilder{

	public AProductBuilder(){
		super.product = new Product();
	}
	
	@Override
	public void buildType() {
		product.setType("A TYPE");
		
	}

}
