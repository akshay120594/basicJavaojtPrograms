package polymorphism.p1;

import java.util.Arrays;

public class G {

	// a is variable argument . we can pass any no of values for this argument
	// variable argument must be last parameter
	
	public static void m1(int b,int... a) {
			
		System.out.println(Arrays.toString(a));
	
		System.out.println(b);
	
	}

	public static void main(String[] args) {
		
		m1(10,20,30);
	}

}
