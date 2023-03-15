package unit407_wk_SZ;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> foo = createList();
		System.out.println(foo);
		ArrayList<String> bar = addAdjective(foo);
		System.out.println(bar);
		ArrayList<String> bar1 = updateColor(bar);
		System.out.println(bar1);
		ArrayList<String> bar2 = removeTheCat(bar1);
		System.out.println(bar2);
		ArrayList<String> bar3 = convertToSentence(bar2);
		System.out.println(bar3);
		ArrayList<Integer> bar4 = sequence(17,11,273);
		System.out.println(bar4.toString());
		ArrayList<Integer> bar5 = createDivisibleSubset(bar4, 3);
		System.out.println(bar5.toString());
		ArrayList<Integer> bar6 = removeDivisible(bar4, 3);
		System.out.println(bar6);
		ArrayList<String> bar7 = getLines();
		averageLineLength(bar7);
		foo.add("the");
		System.out.println("Arraylist with duplicate items: " +foo);
		
		ArrayList<String> bar8 = removeDuplicates(foo);
		System.out.println("Remove duplicate items: "+ bar8);
	}
	
	public static ArrayList<String> createList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("The");
		list.add("fox");
		list.add("jumped");
		list.add("over");
		list.add("the");
		list.add("cat");
		list.add("and");
		list.add("dog");
				
		return list;
	}
	public static ArrayList<String> addAdjective(ArrayList<String> x) {
		 int z = x.indexOf("fox");
		 x.add(z, "red");
		 //System.out.print(z);
		 x.add(z, "quick");
		 z = x.indexOf("dog");
		 x.add(z, "lazy");	     
		 return x;
		
	}
	public static ArrayList<String> updateColor(ArrayList<String> y) {
		int z = y.indexOf("red");
		String abc = y.set(z, "brown");
		return y;
	}
	public static ArrayList<String> removeTheCat(ArrayList<String> z) {
		String def = z.remove(z.indexOf("cat"));
		def = z.remove(z.indexOf("and"));
		return z;
	}
	public static ArrayList<String> convertToSentence(ArrayList<String> a) {
		int sum = 0;
		for(int i = 0; i < a.size(); i++) {
		String s = a.get(i);
		sum += s.length();
		}
		return a;
	
	}
	public static ArrayList<Integer> sequence(int s, int d, int m) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		int number = s; 
		while (number <= m) {
			numList.add(number);
			 number += d;
		} 
		numList.add(m);
		return numList;
	}
	public static ArrayList<Integer> createDivisibleSubset(ArrayList<Integer> c, int x) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for (int i : c) {
			if (i % x == 0) {
				numList.add(i);
			}
		}
		return numList;
	}
	
	public static ArrayList<Integer> removeDivisible(ArrayList<Integer> c, int x) {
		for (int i = c.size() - 1; i >= 0; i--) {
			if (c.get(i) % x == 0) {
				c.remove(i);
			}
		}
		return c;
	}
	public static ArrayList<String> getLines() {
		ArrayList<String> c = new ArrayList<String>();
	    Scanner console = new Scanner(System.in);
	    String ans= console.nextLine();
	    while ( ! ans.equals("!go")) {
			c.add(ans);
		    ans = console.nextLine();
	    }
	    console.close();
	    return c;
	}

	public static void averageLineLength(ArrayList<String> d) {
		int sum = 0;
		int linecount = 0;
        if (d.size() == 0)
        	System.out.println("The ArrayList is empty, the average line length is zero");
		else {
		    for (String i : d) {
		    	System.out.println(i + " " + i.length());
		    	sum += i.length();
		    	linecount++;
		      }
		     int avg = sum / linecount;
		     System.out.println("average line length:" + avg);
		}    
		     
	}

	public static ArrayList<String> removeDuplicates(ArrayList<String> e) {
		//ArrayList<String> e = (ArrayList<String>) t.clone();
		
		for (int i = e.size()-1; i >= 0; i--) {
			
			String k = e.get(i);
			for (int j = i-1; j >= 0; j--) { 
				
				if (k.equals(e.get(j))) {
					e.remove(j);
					
				}	
			}
		}
		return e;
		
	}
}
	
	



