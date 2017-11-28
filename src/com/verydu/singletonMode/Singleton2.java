package com.verydu.singletonMode;
/**
 * ����ģʽ�������ʱû�л�ȡΨһʵ�������û�����getInstance()����ʱ���Ż�ȡ��Ψһʵ��
 * @author pc2
 * 2017��11��28�� ����11:42:13
 */
public class Singleton2 {
	
	//1. �����췽��˽�л������������ֱ�Ӵ�������
	private Singleton2(){}
	
	//2. �������Ψһʵ����ʹ��private static����
	private static Singleton2 instance;
	
	//3. �ṩһ���û���ȡʵ���ķ�����ʹ��public static����
	public static Singleton2 getInstance(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
}
