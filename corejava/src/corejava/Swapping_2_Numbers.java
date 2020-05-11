package corejava;

public class Swapping_2_Numbers {

	public static void main(String[] args) {
		int a=10,b=20;
		
		System.out.println("before swapping.."+a+" "+b);
	/*//	Logic 1:
		int c=a;
		a=b;
		b=c;*/
		
	/*// logic :- 2
		a=a+b;    //  10+20 30
		b=a-b;    //  30-20 10
		a=a-b;    // 30-10 20
		
	
*/	
		/*// logic :- 3
		a=a*b;      // 10*20 =200
		b=a/b;      // 200/20 =10
		a=a/b;      // 200/10 =20
*/	
			
		b=a+b - (a=b);
		/*b= 10+20 -(20);
		b= 30-20;
		b=10;
		a=20;*/
		
		System.out.println("after swapping.."+a+" "+b);

		
		
	}

}
