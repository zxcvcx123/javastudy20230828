package ch05reference;

public class C08array {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {1,2,3,4,5};
		int[] c = a;
		
		int c1 = System.identityHashCode(a);
		int c2 = System.identityHashCode(b);
		int c3 = System.identityHashCode(c);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		System.out.println(a[0]);
		a[0] = 33;
		System.out.println(a[0]);
		System.out.println(c[0]);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
