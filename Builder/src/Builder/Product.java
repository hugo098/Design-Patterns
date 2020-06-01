package Builder;

public class Product {

	private Long id;

	private String description;

	private Long price;
	
	private String type;

	///////////////////////////////////////////////////////////////////////////////////
	/*
	 * GET METHODS
	 */
	
	public Long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public Long getPrice() {
		return price;
	}
	
	public String getType() {
		return type;
	}

	///////////////////////////////////////////////////////////////////////////////////
	/*
	 * SET METHODS
	 */

	public void setId(Long id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(Long price) {
		this.price = price;
	}
	
	public void setType(String type) {
		this.type = type;
	}	
	
	///////////////////////////////////////////////////////////////////////////////////
	
	public String information() {
		return "Product [id=" + id + ", description=" + description + ", price=" + price + "]";
	}

}
