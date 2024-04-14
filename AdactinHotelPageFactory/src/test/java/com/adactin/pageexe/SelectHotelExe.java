package com.adactin.pageexe;

import com.adactin.base.BaseClass;
import com.adactin.locaters.SelectHotelLocaters;

public class SelectHotelExe extends SearchHotelExe{
	public static void select_button_exe() {
		BaseClass.click_element(new SelectHotelLocaters().getContinte_Button());
	}
	
	public static void continute_button_exe() {
		BaseClass.click_element(new SelectHotelLocaters().getContinue_button());
	}

}
