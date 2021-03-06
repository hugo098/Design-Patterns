package Builder;

public class BuilderTest {

	public static void main(String[] args) {
		
		ProductDirector[] director= new ProductDirector[2];			
		director[0] = new ProductDirector();
		director[1] = new ProductDirector();
		
		ProductBuilder AProduct = new AProductBuilder();		
		ProductBuilder BProduct = new BProductBuilder();
		
		
		director[0].setProductBuilder(AProduct);
		director[1].setProductBuilder(BProduct);
		
		director[0].buildProduct(1L, "PRODUCTO A1", 500000L);
		director[1].buildProduct(2L, "PRODUCTO B1", 600000L);
		
		Product productA = director[0].getProduct();		
		Product productB = director[1].getProduct();
		
		System.out.println(productA.information());		
		System.out.println(productB.information());
		
		

	}

}
