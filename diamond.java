package shape;

import java.util.Arrays;

public class diamond {
	
	public static String createString(char A1, int num) {
        // return statement
		String dash = "";
		
		for(int i = 1; i <= num; i++) {
	    	  dash = dash + A1;
		}
	    return dash;
    }
	
	public static String[] createDiamond(char a1, int base) {
		int size = (base + 1)/2;
		String[] aline = new String[base];
		// print diamond upper half
        int j = 0;
        for(int i = 1; i <= size; i++) {
        	String result = createString(a1, i);
        	String space = createString(' ', size-i);
        	String result1 = createString(a1, i-1);
        	j = i - 1;
        	aline[j] = space + result + result1 + space;
        	
        	//for(int j = 1; j <= size3; j++) {
        	//	aline = aline + " " + dline;
        	//}
        	//System.out.println(aline);
        	
        }
 
       // print diamond lower half
        for(int i = size-1; i >= 1; i--) {
        	String result = createString(a1, i);
        	String space = createString(' ', size-i);
        	String result1 = createString(a1, i-1);
        	j++;
        	aline[j] = space + result + result1 + space;
        	//for(int j = 1; j <= size3; j++) {
        	//	bline = bline + " " + cline;
        	//}
        	//System.out.println(bline);
        	
        }
        //diamond end here       
		return aline;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char a1 = '$';
        int num = 20;
        String bar = createString(' ', num);
        //System.out.println(bar);
         
        int base = 11;
        int dsize = 10;
        System.out.println(bar);
        String pline = "";
		String[] diamond = createDiamond('$', base);
		for(int i = 0; i <= diamond.length-1; i++) {
			String dline = diamond[i];
			pline = bar;
			for(int j = 1; j <= dsize; j++) {
				pline = pline + dline + " ";
				
			}
			System.out.println(pline);
			
		}
		
		int start = 10;
		int end = 30;
		int size = end - start + 1;
		int[] array = new int[size];
		int sum = 0;
		//for (int i: array)
		for(int i = 0; i <= array.length-1; i++) {
			array[i] = i + 10;
		}
		for (int i = 0; i <= array.length-1; i++) {
		
			
			sum += array[i];
			
		
		//int sum1 = Arrays.stream(array).sum();
		
		
		}	
		System.out.println("The sum is " + sum);
	}
}	


