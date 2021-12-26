package com.maqcoding.sbmongomapppingref.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {

	private String state;
	private String city;
	private String pincode;
	
	
}
