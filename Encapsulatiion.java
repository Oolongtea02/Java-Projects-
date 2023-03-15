package classes_test;

public class Encapsulatiion {

		public class Container {
		    private int numArray[]= {0,0,0};
		    public int[] getNumArray() {
		        return numArray;
		    }
		    public void setNumArray(int index, int value){
		        numArray[index] = value;
		    }    
		}

		public static class Main {
		    public static void main(String[] args) {
		        Container conte = new Container();
		        System.out.println(totalArray(conte.getNumArray()));
		        conte.getNumArray()[2]++;
		        System.out.println(totalArray(conte.getNumArray()));
		    }
		    private static int totalArray (int v[]){
		        int total=0;
		        for (int conta =0; conta<v.length;conta++){
		            total+=v[conta];
		        }
		        return total;
		    }
		}
	}


