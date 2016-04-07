package com.test;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;

public class Test {
	public static void main(String[] args) {
		System.out.print("{");
		for (int i = 2016; i >= 1900; i--) {
			System.out.print(String.format("%d:'%d', ", i, i));
		}
		System.out.print("}");
	}
}
