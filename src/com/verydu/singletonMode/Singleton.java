package com.verydu.singletonMode;
/**
 * 单例模式Singletion
 * 应用场合：有些对象只需要一个就足够了，如古代皇帝，老婆
 * 作用：包住整个应用程序中某个实例有且只有一个
 * 类型：恶汉模式 ，懒汉模式
 * 饿汉模式：类加载时就获取了唯一实例
 * @author 木木
 * 2017年11月28日 上午11:24:03
 */
public class Singleton {
		//1. 将构造方法私有化，不允许外部直接创建对象
		private Singleton(){}
		
		//2. 创建类的唯一实例，使用privtae static修饰
		private static Singleton instance = new Singleton();
		
		//3. 提供一个用于获取实例的方法，使用public static修饰
		public static Singleton getInstance(){
			return instance;
		}
}
