package com.ty.ecommercee.genericlibs;

import java.io.FileInputStream;
import java.util.Properties;

public class ProperfileData {

	public String getData(String key)
	{
		Properties prop = null;
		try {
			FileInputStream fin=new FileInputStream(Autoconstants.PROPERTYFILEPATH);
			 prop=new Properties();
			prop.load(fin);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
}
