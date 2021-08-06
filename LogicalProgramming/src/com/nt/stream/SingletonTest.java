package com.nt.stream;

public final class SingletonTest {

	private static volatile SingletonTest  INSTANCE = null;
	public int a;
	public int b;
	public int c;
	
	private SingletonTest(int a,int b,int c) throws IllegalAccessException {
		this.a=a;
		this.b=b;
		this.c=c;
		if(INSTANCE!=null)
			throw new IllegalAccessException("this class not support object creation trhough cons plese use factory method");

	}
	public static SingletonTest getInstance() throws IllegalAccessException {
		if (INSTANCE == null)
			synchronized (SingletonTest.class){
				if (INSTANCE == null) {
					INSTANCE = new SingletonTest(10,20,30);//object creation with default value the initilization
					INSTANCE.a=10;
					INSTANCE.a=20;
					INSTANCE.a=30;
					
				}
			}
		return INSTANCE;
	}
}
