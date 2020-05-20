package com.Hiber.Demo.util;

import com.Hiber.Demo.Dao.DaoClass;
import com.Hiber.Demo.Dto.Phone;

public class test 
{
	public static void main(String[] args) 
	{
		Phone phone = new Phone();
		phone.setId(1);
		phone.setBrandName("Samsung");
		phone.setModelNo("S10+");
		phone.setPrice(69000.50);
		phone.setColor("Black");
		
		DaoClass dao = new DaoClass();
		dao.savePhone(phone);
	}
}
