package com.spoloborota.teaching.storage.processor.type;

import com.spoloborota.teaching.storage.model.Model;

public class Add {
	
	public static String process(Model ram, String[] commandWords) {
		boolean isAdded = ram.add(new String[]{commandWords[1], commandWords[2]});
		if (isAdded) {
			return "Data added";
		} else {
			return "There is no selected storage";
		}
	}
}
