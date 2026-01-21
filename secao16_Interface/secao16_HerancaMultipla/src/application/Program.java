package application;

import entities.model.ComboDevice;

public class Program {
	public static void main(String[] args) {
		 ComboDevice c = new ComboDevice("2081");
		 
		 c.processDoc("AAAAAAAAAA");
	}
}
