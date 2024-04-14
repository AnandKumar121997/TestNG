package com.adactin.locaters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelLocaters extends SearchHotelLoctaters{
	
	public SelectHotelLocaters() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "radiobutton_0")
	private WebElement select_Button;
	
	@FindBy(id = "continue")
	private WebElement continue_button;
	
	public WebElement getContinte_Button() {
		return select_Button;
	}
	
	public WebElement getContinue_button() {
		return continue_button;
	}

}
