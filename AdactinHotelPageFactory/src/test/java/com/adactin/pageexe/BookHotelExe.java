package com.adactin.pageexe;

import com.adactin.base.BaseClass;
import com.adactin.locaters.BookHotelLocaters;

public class BookHotelExe extends SelectHotelExe{
	public static void first_Name_Exe() {
		BaseClass.sendKeysData(new BookHotelLocaters().getFirstName(), excelRead_reuse(3, 0));
	}
	
	public static void last_name_Exe() {
		BaseClass.sendKeysData(new BookHotelLocaters().getLastName(), excelRead_reuse(3, 1));
	}
	
	public static void billing_Add_Exe() {
		BaseClass.sendKeysData(new BookHotelLocaters().getBilling_Address(), excelRead_reuse(3, 2));
	}
	
	public static void cardNum_Exe() {
		BaseClass.sendKeysData(new BookHotelLocaters().getCreditCard_Num(), excelRead_reuse(3, 3));
	}
	
	public static void card_Type_Exe() {
		BaseClass.select_by_visibleText(new BookHotelLocaters().getCreditCard_Type() , excelRead_reuse(3,4));

	}	
	
	public static void expiry_Month_Exe() {
		BaseClass.select_by_visibleText(new BookHotelLocaters().getExpiryMonth() , excelRead_reuse(3,5));

	}	
	
	public static void expiry_Year_Exe() {
		BaseClass.select_by_visibleText(new BookHotelLocaters().getExpiryYear() , excelRead_reuse(3,6));

	}	
	
	public static void ccv_Num_Exe() {
		BaseClass.sendKeysData(new BookHotelLocaters().getCcvNum(), excelRead_reuse(3, 3));
	}
	
	public static void bookNow_Button_Exe() {
		BaseClass.click_element(new BookHotelLocaters().getBookNow_button());
	}
	
	public static void order_ID_Num() {
		BaseClass.excelWrite(0, 1, BaseClass.getAttribute_of_Element(new BookHotelLocaters().getOrder_No(), "value"));
		System.out.println("Executed properly");
	}
}
