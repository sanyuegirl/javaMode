package com.verydu;

import java.text.Collator;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;


public class Aa {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ParseException{
		List<Datas> data = new ArrayList<>();
		Datas d1 =new Datas();
		d1.setDd("星期一");
		d1.setChutu(155.7);
		Datas d2 = new Datas();
		d2.setDd("星期日");
		d2.setChutu(180.7);
		Datas d3 = new Datas();
		d3.setDd("星期二");
		d3.setChutu(110.7);
		Datas d4 = new Datas();
		d4.setDd("星期六");
		d4.setChutu(10.7);
		Datas d5 = new Datas();
		d5.setDd("星期四");
		d5.setChutu(10.7);
		Datas d6 = new Datas();
		d6.setDd("星期三");
		d6.setChutu(10.7);
		Datas d7 = new Datas();
		d7.setDd("星期五");
		d7.setChutu(10.7);
		data.add(d2);
		data.add(d1);
		data.add(d3);
		data.add(d4);
		data.add(d5);
		data.add(d6);
		data.add(d7);
		
		Collections.sort(data,new Comparator<Datas>() {

			@Override
			public int compare(Datas o1, Datas o2) {
				Datas info1=  o1;
	        	Datas info2= o2;
				return info1.getDd().compareTo(info2.getDd());//升序
			}
		});

		 for (Datas datas : data) {
			System.out.println(datas.getDd());
		}
	}

	 class ComparatorUser implements Comparator{

	        @Override
	        public int compare(Object object1, Object object2) {
	        	Datas info1= (Datas) object1;
	        	Datas info2= (Datas) object2;
	            //按bean的名字排序
	            return Collator.getInstance(Locale.CHINESE).compare(info1.getDd(), info2.getDd());
	        }
	    }
	
	public static String getWeeks(String myDate) throws ParseException{
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyyMMdd"); 
		Date fDate=formatDate.parse(myDate);
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
		return sdf.format(fDate);
	}
	

}
