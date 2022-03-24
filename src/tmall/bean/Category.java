package tmall.bean;
/***
 * bean包是什么:
 * Bean包就是专门放置属性类的，比如在数据库中创建了一个表，
 * 那么你可以把这个表的各个字段，分别定义成属性放置在一个类里，并写明setter和getter方法，
 * 然后把这个类放置在bean包下面
 * 
 */
import java.util.List;

public class Category {

	private String name;
	private int id;
	List<Product> products;
	List<List<Product>> productsByRow;
	/*
	 * productsByRow这个属性的类型是List<List<Product>> productsByRow。
	 * 即一个分类又对应多个 List<Product>，提供这个属性，
	 * 是为了在前端首页竖状导航的分类名称右边显示产品列表。
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Category [name=" + name + "]";
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<List<Product>> getProductsByRow() {
		return productsByRow;
	}

	public void setProductsByRow(List<List<Product>> productsByRow) {
		this.productsByRow = productsByRow;
	}

}
