package tmall.bean;
/***
 * 
 * @author xueto
 *1. 基本属性的getter、setter
 *2. 与Product的多对一关系
 *3. 与Property的多对一关系
 *一个分类有多个属性，
 *一个属性有多个属性值，
 *一个产品也有多个属性值
 */
public class PropertyValue {
	private String value;
	private Product product;
	private Property property;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Property getProperty() {
		return property;
	}
	public void setProperty(Property property) {
		this.property = property;
	}
}
