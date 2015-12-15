package com.spoloborota.teaching.storage.main;

import com.spoloborota.teaching.storage.model.Model;
import com.spoloborota.teaching.storage.model.RAM;
import com.spoloborota.teaching.storage.processor.Processor;
import com.spoloborota.teaching.storage.view.Console;;

/**
 * Main class
 * @author Spoloborota
 *
 */
public class Main {

	public static void main(String[] args) {
		Model ram = new RAM();
		Processor processor = new Processor(ram);
		Console console = new Console(processor);
		console.startListen();
	}

}
