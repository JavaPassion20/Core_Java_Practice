/**
 * 
 */
package com.javapassion.neetesh;

import java.util.ArrayList;

/**
 * @author mapit
 *
 */
public class ColoursAL {
	
	private ArrayList<String> arrayList;
	
	
	private ColoursAL() {
		
		arrayList = new ArrayList<String>();
		arrayList.add("No Entries");
		
	}
	
	private ColoursAL(String colour1, String colour2, String colour3) {

		arrayList = new ArrayList<String>();
		arrayList.add(colour1);
		arrayList.add(colour2);
		arrayList.add(colour3);
		
	}
	
	private void showColours() {
		
		int x=0;
		for (String colours : arrayList) {
			System.out.println(colours);
			x++;
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColoursAL coloursAL = new ColoursAL();
		coloursAL.showColours();
		coloursAL = new ColoursAL("Red", "Blue", "Green");
		coloursAL.showColours();

	}

}
