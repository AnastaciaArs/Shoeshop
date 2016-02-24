package com.iba.shoeshop;

import java.util.Comparator;

import com.iba.shoeshop.details.ShoeCommon;

public class NameComparator implements Comparator<ShoeCommon>{

	@Override
	public int compare(ShoeCommon o1, ShoeCommon o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
