package br.com.caelum.model;

public class Fibonacci {
	
//	public long fibo(int n) {
//		if(n < 2) {
//			return n;
//		}else {
//			return fibo(n - 1) + fibo (n - 2);
//		}
//	}
	
	public int fibo(int n) {
		return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
	}

}
