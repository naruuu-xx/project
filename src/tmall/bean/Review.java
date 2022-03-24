package tmall.bean;

import java.util.Date;
/***
 * 
 * @author xueto
 * 1. 基本属性的getter、setter
 * 2. 与User的多对一关系
 * 3. 与Product 的多对一关系
 *前端可以清楚呈现，目前尚未完成前端功能
 */
public class Review {
	private String content;
	private Date createDate;
	private User user;
	private Product product;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
}
