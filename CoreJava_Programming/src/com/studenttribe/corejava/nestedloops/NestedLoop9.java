//Nested Loops9
package Loops;

public class NestedLoop9 {

	public static void main(String[] args) {
		int n=25;
		
		for(int i=1;i<=5;i++) {
		
			System.out.println("");
			for(int j=1;j<=5;j++) { 
				
				System.out.print(" "+n);
			       n--;
			}
		}
	}

}
