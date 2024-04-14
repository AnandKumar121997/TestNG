package com.adactin.pageexe;

import com.adactin.base.BaseClass;

public class SearchHotelExe extends LoginPageExe{
	public static void location_() {
		BaseClass.select_by_visibleText(new SearchHotelExe().getLocation(), excelRead_reuse(1, 0));
	}
	
	public static void hotels_() {
		BaseClass.select_by_visibleText(new SearchHotelExe().getHotel(), excelRead_reuse(1, 1));
	}
	
	public static void roomType_() {
		BaseClass.select_by_visibleText(new SearchHotelExe().getRoomType(), excelRead_reuse(1, 2));
	}
	
	public static void numberOf_Rooms_() {
		BaseClass.select_by_visibleText(new SearchHotelExe().getNumberOf_Rooms(), excelRead_reuse(1, 3));
	}
	
	public static void adults_Per_Room_() {
		BaseClass.select_by_visibleText(new SearchHotelExe().getAdults_Per_Room(), excelRead_reuse(1, 4));
	}
	
	public static void children_Per_Room() {
		BaseClass.select_by_visibleText(new SearchHotelExe().getChildren_Per_Room(), excelRead_reuse(1, 5));
	}
	
	public static void search_Button() {
		BaseClass.click_element(new SearchHotelExe().getSearch());
	}

}
