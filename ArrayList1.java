package basics;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Lothar");
		a1.add("Mitul");
		a1.add("12");
		
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
			
		}
		System.out.println(a1.get(0));
	
		/////////////////////////////////////////////////////
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(2);
		a2.add(3);
		a2.add(4);
		a2.add(6);
	
		for(int q=0;q<a2.size();q++) {
			System.out.println(a2.get(q));
		}
		System.out.println(a2.get(2));
		/////
	
	}
	

}
