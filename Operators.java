package week1.day1;

public class Operators {
	public static void main(String[] args) {
		int a = 20; // = is an assignment operator to assign the right side value to the left side variable
		int b=10;
		float c=5F;
		float d=10F;
		
//arithmetic operators
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println(c+d);
		System.out.println(c-d);
		System.out.println(c*d);
		System.out.println(d/c);
		System.out.println(d%c);
		
//Comparison operator
		System.out.println(a>b);
		System.out.println(b>a);
		System.out.println(b==d);
		System.out.println(c!=a);

// unary operator
       System.out.println(a);
       System.out.println(a++);
       System.out.println(++a);
       System.out.println(c);
       System.out.println(--c);
       System.out.println(c--);
       System.out.println(c);
       
       int e = 5;
       e+=5; //this is equal to d=d+5
       System.out.println(e);
       e-=2;
       System.out.println(e);
       System.out.println(e*=5);
       //System.out.println(e/=8);
       System.out.println(e%=8);
       
       }

}
