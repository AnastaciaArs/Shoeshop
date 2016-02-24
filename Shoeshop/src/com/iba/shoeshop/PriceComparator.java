package com.iba.shoeshop;

import java.util.Comparator;

import com.iba.shoeshop.details.ShoeCommon;

public class PriceComparator implements Comparator<ShoeCommon>{

	@Override
	public int compare(ShoeCommon o1, ShoeCommon o2) {
		if(o1.getPrice()>o2.getPrice())
			return -1;
		else if(o1.getPrice()<o2.getPrice())
			return 1;
		else
		return 0;
	}

}
