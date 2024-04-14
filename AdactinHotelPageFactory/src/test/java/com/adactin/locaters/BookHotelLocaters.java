package com.adactin.locaters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelLocaters extends SelectHotelLocaters{
	public BookHotelLocaters() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "first_name")
	private WebElement firstName;
	
	@FindBy(id = "last_name")
	private WebElement lastName;
	
	@FindBy(id = "address")
	private WebElement billing_Address;
	
	@FindBy(id = "cc_num")
	private WebElement creditCard_Num;
	
	@FindBy(id = "cc_type")
	private WebElement creditCard_Type;
	
	@FindBy(id = "cc_exp_month")
	private WebElement expiryMonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement expiryYear;
	
	public WebElement getBookNow_button() {
		return bookNow_button;
	}

	@FindBy(id = "cc_cvv")
	private WebElement ccvNum;
	
	@FindBy(id = "book_now")
	private WebElement bookNow_button;
	
	@FindBy(xpath = "//input[@id=\"order_no\"]")
	private WebElement order_No;
	
	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getBilling_Address() {
		return billing_Address;
	}


	public WebElement getOrder_No() {
		return order_No;
	}


	public WebElement getCreditCard_Num() {
		return creditCard_Num;
	}


	public WebElement getCreditCard_Type() {
		return creditCard_Type;
	}


	public WebElement getExpiryMonth() {
		return expiryMonth;
	}


	public WebElement getExpiryYear() {
		return expiryYear;
	}


	public WebElement getCcvNum() {
		return ccvNum;
	}

	
	public WebElement getFirstName() {
		return firstName;
	}

	

}
