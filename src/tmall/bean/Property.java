package tmall.bean;
/***
 * 
 * @author xueto
 * 和表中的基本属性对应，有相应的getter,setter方法
 *因为和Category是多对一的关系 因此这里也需要引入Category属性。
 *
 */

public class Property {

	private String name;
	private Category category;
	private int id;

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
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
}
