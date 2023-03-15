package testing;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = createList();
		System.out.println(a);
		int b = a.indexOf("jumped");
		a.add(b, "abc");
		System.out.println(a);
		b = a.indexOf("jumped");
		a.add(0, "abc");
		System.out.println(a);
		for (int i = 0; i < a.size(); i += 2) {
			System.out.println(a.get(i));
		}
		b = a.indexOf("and");
		a.set(b, "or");
		System.out.println(a);
		ArrayList<Integer> c = createListInt();
		System.out.println(c);
		ArrayList<Integer> d = addNumbers(c);
		System.out.println(d);
		ArrayList<Integer> e = removeEvens(d);
		System.out.println(e);
		indexItem(a);
		printItem(a);
		testError();
		twoDArray();
 	}
	
	public static ArrayList<Integer> createListInt() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(9);
		return list;

	}
	public static ArrayList<Integer> addNumbers(ArrayList<Integer> ary) {
		int size = ary.size();
		System.out.println("size:"+size);
		for (int i = 0; i < ary.size(); i++) {
			System.out.println("ary.size():"+ary.size());
			ary.add(i, 10);
			i++;
	
		}
		return ary;
		
	}
	public static ArrayList<Integer> removeEvens(ArrayList<Integer> list) {
		for ( int i = 0; i < list.size(); i++) {
		int n = list.get(i);
		if (n % 2 == 0) {
			list.remove(i);
			i--;
			}
	    }
		return list;
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
	public static void indexItem(ArrayList<String> a) {
		 if (a.size() == 0) {
			 	System.out.println("The array is empty:" + a);
			 	return;
		 } else {
			 	for (int i = 0; i < a.size(); i++) {
			 		System.out.println("Index of item is: "  + i + ":\t" + a.get(i));
			
			 	}
			
         }
	}
	public static void printItem(ArrayList<String> a) {
		 if (a.size() == 0) {
			 	System.out.println("The array is empty:" + a);
			 	return;
		 } else {
			 	for (String i : a) {
			 		System.out.println("Index of item is: " + a.indexOf(i) + " " + i);
			
			 	}
			
        }
	}
	public static void testError() {
	    String[] s1 = {"John", "Mary", "Ron", "Fred"};
		
        ArrayList<String> names = new ArrayList<String>();
		
        for (int i = 0; i < 12; i++) {
              names.add(s1[i%s1.length]);
        }
        //System.out.println(names);
        for (int i = 0; i < names.size(); i++) {
             if (names.get(i).equals("Ron")) {
                  names.remove(i);
            }
        }
        System.out.println(names);
		
		
	}
    public static void twoDArray() {
    	int matrix[][] = {{11, 2, 3, 4, 5, 8, 9, 20}, {1, 2, 32, 41, 24, 28, 6, 0}, {1, 2, 13, 4, 43, 29, 2, 8}};
    	for (int i = 0; i < matrix.length; i++) {
    			matrix[i][1] = matrix[i][4];
    	if (matrix[i][4] % 2 == 0) {
    			System.out.println(i);
    		}
    	}
    }	
   	
}
