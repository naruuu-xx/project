package tmall.bean;
/***
 * bean����ʲô:
 * Bean������ר�ŷ���������ģ����������ݿ��д�����һ����
 * ��ô����԰������ĸ����ֶΣ��ֱ�������Է�����һ�������д��setter��getter������
 * Ȼ�������������bean������
 * 
 */
import java.util.List;

public class Category {

	private String name;
	private int id;
	List<Product> products;
	List<List<Product>> productsByRow;
	/*
	 * productsByRow������Ե�������List<List<Product>> productsByRow��
	 * ��һ�������ֶ�Ӧ��� List<Product>���ṩ������ԣ�
	 * ��Ϊ����ǰ����ҳ��״�����ķ��������ұ���ʾ��Ʒ�б�
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
