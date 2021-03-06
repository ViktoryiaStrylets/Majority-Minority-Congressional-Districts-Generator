package com.maxminmajcdg;

public enum PartyCategory {
	 DEMOCRATIC("DEMOCRATIC"), 
	 REPUBLICAN("REPUBLICAN"), 
	 GREEN("GREEN"), 
	 INDEPENDENT("INDEPENDENT"),
	 OTHER("OTHER");
	 
	private String val;
	
	private PartyCategory(String val) {
		this.val = val;
	}
	
	public static PartyCategory fromValue(String val) {
		for (PartyCategory d : values()) {
			if (d.val.equalsIgnoreCase(val)) {
				return d;
			}
		}
		throw new IllegalArgumentException("Unkown enum type " + val);
	}
}
