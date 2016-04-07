package com.test;


public class Test {
	public static void main(String[] args) {
		System.out.print("{");
		for (int i = 2016; i >= 1900; i--) {
			System.out.print(String.format("%d:'%d', ", i, i));
		}
		System.out.print("}");
	}
}
