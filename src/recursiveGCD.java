/* O(log n) */
public class recursiveGCD {
public static int recursiveGCD(int a, int b){
	if (b == 0)
		return a;
	return recursiveGCD(b,a%b);
}

public static void main(String []a){
	System.out.print(recursiveGCD(81,63));
}
}
