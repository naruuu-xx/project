package tmall.bean;
/***
 * 
 * @author xueto
 *实现表内属性的getter setter方法
 *和product 有多对一的关系 因此在此引入product
 */

public class ProductImage {
	
	private String type;
	private Product product;
	private int id;

	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
}
