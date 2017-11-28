package com.verydu.singletonMode;
/**
 * 懒汉模式：类加载时没有获取唯一实例，当用户加载getInstance()方法时，才获取了唯一实例
 * @author pc2
 * 2017年11月28日 上午11:42:13
 */
public class Singleton2 {
	
	//1. 将构造方法私有化，不允许外边直接创建对象
	private Singleton2(){}
	
	//2. 声明类的唯一实例，使用private static修饰
	private static Singleton2 instance;
	
	//3. 提供一个用户获取实例的方法，使用public static修饰
	public static Singleton2 getInstance(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
}
