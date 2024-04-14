package com.adactin.locaters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelLoctaters extends LoginPageLocaters{
	public SearchHotelLoctaters() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//select[@id=\"location\"]")
	private WebElement location;
	
	@FindBy(xpath = "//select[@id=\"hotels\"]")
	private WebElement hotel;
	
	@FindBy(xpath = "//select[@id=\"room_type\"]")
	private WebElement roomType;
	
	@FindBy(xpath = "//select[@id=\"room_nos\"]")
	private WebElement numberOf_Rooms;
	
	@FindBy(xpath = "//select[@id=\"adult_room\"]")
	private WebElement adults_Per_Room;
	
	public WebElement getSearch() {
		return search;
	}
	@FindBy(xpath = "//select[@id=\"child_room\"]")
	private WebElement children_Per_Room;

	@FindBy(id = "Submit")
	private WebElement search;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberOf_Rooms() {
		return numberOf_Rooms;
	}

	public WebElement getAdults_Per_Room() {
		return adults_Per_Room;
	}

	public WebElement getChildren_Per_Room() {
		return children_Per_Room;
	}
	
}
