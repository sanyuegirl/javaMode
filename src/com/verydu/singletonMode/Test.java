package com.verydu.singletonMode;

/**
 * ����ģʽ��
 * 		����
 * 				����ģʽ��������ʱ�Ƚ�����������ʱ��ȡ������ٶȱȽϿ죬�̰߳�ȫ
 * 				����ģʽ��������ʱ�ȽϿ죬������ʱ��ȡ������ٶȱȽ������̲߳���ȫ
 * @author pc2
 * 2017��11��28�� ����11:52:25
 * TODO
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����ģʽ
		Singleton s1 = Singleton.getInstance();
		
		Singleton s2 = Singleton.getInstance();
		
		if(s1==s2){
		  System.err.println("����ģʽ��ͬһ��ʵ��");
		}else{
			System.err.println("����ģʽ����ͬһ��ʵ��");
		}
		
		//����ģʽ
		Singleton2 ss1 = Singleton2.getInstance();
		
		Singleton2 ss2 = Singleton2.getInstance();
		
		if(ss1 == ss2){
			System.err.println("����ģʽ��ͬһ��ʵ��");
		}else{
			System.err.println("����ģʽ����ͬһ��ʵ��");
		}
		
	}

}
