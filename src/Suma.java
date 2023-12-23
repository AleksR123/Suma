import java.util.Scanner;

	public class Suma {

		public static void main(String[] args) {
		
	    int a,b,c,d,e;
	    int sumap=0, sumanep=0;
	    
	    Scanner tastatura = new Scanner(System.in);
	    System.out.println("Vnesete go prviot broj: ");
	    a=tastatura.nextInt();
	    System.out.println("Vnesete go vtoriot broj: ");
	    b=tastatura.nextInt();
	    System.out.println("Vnesete go tretiot broj: ");
	    c=tastatura.nextInt();
	    System.out.println("Vnesete go cetrtiot broj: ");
	    d=tastatura.nextInt();
	    System.out.println("Vnesete go pettiot broj: ");
	    e=tastatura.nextInt();
	    if (a%2==0) {
	    	sumap=sumap+a;
	    	} else {
	    		sumanep=sumanep+a;
	    	}
	    if (b%2==0) {
	    	sumap=sumap+b;
	    	} else {
	    		sumanep=sumanep+b;
	    	}
	    if (c%2==0) {
	    	sumap=sumap+c;
	    	} else {
	    		sumanep=sumanep+c;
	    	}
	    if (d%2==0) {
	    	sumap=sumap+d;
	    	} else {
	    		sumanep=sumanep+d;
	    	}
	    if (e%2==0) {
	    	sumap=sumap+e;
	    	} else {
	    		sumanep=sumanep+e;
	    	}
	    System.out.println("Sumata na parnite broevi e:" +sumap);
	    System.out.println("Sumata na parnite broevi e:"+sumanep);
		
		}

}
