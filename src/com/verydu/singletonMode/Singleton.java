package com.verydu.singletonMode;
/**
 * ����ģʽSingletion
 * Ӧ�ó��ϣ���Щ����ֻ��Ҫһ�����㹻�ˣ���Ŵ��ʵۣ�����
 * ���ã���ס����Ӧ�ó�����ĳ��ʵ������ֻ��һ��
 * ���ͣ���ģʽ ������ģʽ
 * ����ģʽ�������ʱ�ͻ�ȡ��Ψһʵ��
 * @author ľľ
 * 2017��11��28�� ����11:24:03
 */
public class Singleton {
		//1. �����췽��˽�л����������ⲿֱ�Ӵ�������
		private Singleton(){}
		
		//2. �������Ψһʵ����ʹ��privtae static����
		private static Singleton instance = new Singleton();
		
		//3. �ṩһ�����ڻ�ȡʵ���ķ�����ʹ��public static����
		public static Singleton getInstance(){
			return instance;
		}
}
