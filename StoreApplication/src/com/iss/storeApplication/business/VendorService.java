package com.iss.storeApplication.business;
// test
import com.iss.storeApplication.dao.VendorDao;
import com.iss.storeApplication.domain.Vendor;

/*
 * Milan
 */
public class VendorService {

	private static VendorDao vendorDao=new VendorDao();
	
	public static Vendor getFirstVendor(String categoryCode)
	{
		return vendorDao.getFirstVendor(categoryCode);
	} 
}
