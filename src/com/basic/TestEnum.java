package com.basic;

public class TestEnum {
	public static void main(String[] args) {
		Level level=Level.HIGH;
		System.out.println(level.getClass().getName());
		System.out.println(level.name());
		System.out.println(level.ordinal());
		System.out.println(level.levelCode);
	}

}
