package info.iridiumcao.algorithm.basic;

public class Fibonacci {
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		for (int i = 1; i < 20; i++) {
			System.out.print("f(" + i + ") = " + f.fibonnaci(i) + ", ");
		}
		
		System.out.println();
		
		for (int i = 1; i < 20; i++) {
			System.out.print("f(" + i + ") = " + f.fibonnaci2(i) + ", ");
		}
	}

	// 递归算法
	public int fibonnaci(int i) {
		if (i < 0)
			return 0;
		if (i == 1 || i == 2)
			return 1;
		return fibonnaci(i - 1) + fibonnaci(i - 2);
	}
	
	// 直接应用通项公式
	// f(n) = ((1+5^(1/2))^n - (1-5^(1/2))^n)/(2^n * 5^(1/2))
	public int fibonnaci2(int n) {
		return (int) ((Math.pow(1 + Math.sqrt(5), n) - Math.pow(1 - Math.sqrt(5), n))/(Math.pow(2, n)*Math.sqrt(5)));
	}
}
