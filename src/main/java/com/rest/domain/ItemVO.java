package com.rest.domain;


//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class ItemVO {
	
	/*
	 * 
	 * temId varchar(50) PK 
temName varchar(50) 
temPrice int(11) 
temUserId varchar(50) 
temStock int(11) 
temText varchar(500) 
temImg varchar(2
	 */
	
private String temId;
private String temName;
private int temPrice;
private String temUserId;
private int temStock;
private String temText;
private String temImg;

public ItemVO(String temId, String temName, int temPrice, String temUserId, 
		int temStock, String temText,String temImg) {
	super();
	this.temId = temId;
	this.temName = temName;
	this.temPrice = temPrice;
	this.temUserId = temUserId;
	this.temStock = temStock;
	this.temText = temText;
	this.temImg = temImg;
}

public String getTemId() {
	return temId;
}

public void setTemId(String temId) {
	this.temId = temId;
}

public String getTemName() {
	return temName;
}

public void setTemName(String temName) {
	this.temName = temName;
}

public int getTemPrice() {
	return temPrice;
}

public void setTemPrice(int temPrice) {
	this.temPrice = temPrice;
}

public String getTemUserId() {
	return temUserId;
}

public void setTemUserId(String temUserId) {
	this.temUserId = temUserId;
}

public int getTemStock() {
	return temStock;
}

public void setTemStock(int temStock) {
	this.temStock = temStock;
}

public String getTemText() {
	return temText;
}

public void setTemText(String temText) {
	this.temText = temText;
}

public String getTemImg() {
	return temImg;
}

public void setTemImg(String temImg) {
	this.temImg = temImg;
}


	

}
