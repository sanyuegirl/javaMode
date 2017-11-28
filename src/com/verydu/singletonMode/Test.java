package com.verydu.singletonMode;

/**
 * 单例模式：
 * 		区别：
 * 				饿汉模式：加载类时比较慢，单运行时获取对象的速度比较快，线程安全
 * 				懒汉模式：加载类时比较快，但运行时获取对象的速度比较慢，线程不安全
 * @author pc2
 * 2017年11月28日 上午11:52:25
 * TODO
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//饿汉模式
		Singleton s1 = Singleton.getInstance();
		
		Singleton s2 = Singleton.getInstance();
		
		if(s1==s2){
		  System.err.println("饿汉模式是同一个实例");
		}else{
			System.err.println("饿汉模式不是同一个实例");
		}
		
		//懒汉模式
		Singleton2 ss1 = Singleton2.getInstance();
		
		Singleton2 ss2 = Singleton2.getInstance();
		
		if(ss1 == ss2){
			System.err.println("懒汉模式是同一个实例");
		}else{
			System.err.println("饿汉模式不是同一个实例");
		}
		
	}

}
