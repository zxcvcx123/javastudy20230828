package ch05reference;

public class C10method {
	
	public static void method1(int[] a) {
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	}

	public static void main(String[] args) {
		
		int[] a = {3,4,5};
		int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
		
		int c1 = System.identityHashCode(a);
		int c2 = System.identityHashCode(a[0]);
		int c3 = System.identityHashCode(b);
		int c4 = System.identityHashCode(b[0]);
		int c5 = System.identityHashCode(b[1]);
		method1(a);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		
	}

}
