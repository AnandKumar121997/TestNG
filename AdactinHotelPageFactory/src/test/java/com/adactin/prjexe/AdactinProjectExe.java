package com.adactin.prjexe;

import com.adactin.pageexe.BookHotelExe;

public class AdactinProjectExe extends BookHotelExe{
	public static void main(String [] args) {
		browserLaunch(readProperty("url"));
		maximizee();
		username_exe();
		password_exe();
		login_exe();
		location_();
		hotels_();
		roomType_();
		numberOf_Rooms_();
		adults_Per_Room_();
		children_Per_Room();
		search_Button();
		select_button_exe();
		continute_button_exe();
		first_Name_Exe();
		last_name_Exe();
		billing_Add_Exe();
		cardNum_Exe();
		card_Type_Exe();
		expiry_Month_Exe();
		expiry_Year_Exe();
		ccv_Num_Exe();
		bookNow_Button_Exe();
		implicitWait(20);
		order_ID_Num();
		
	}

}
