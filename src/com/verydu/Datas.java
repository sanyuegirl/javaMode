package com.verydu;

public class Datas {

	private String dd;
	
	private double chutu;
	
	private double sna;

	public String getDd() {
		return dd;
	}

	public void setDd(String dd) {
		this.dd = dd;
	}

	public double getChutu() {
		return chutu;
	}

	public void setChutu(double chutu) {
		this.chutu = chutu;
	}

	public double getSna() {
		return sna;
	}

	public void setSna(double sna) {
		this.sna = sna;
	}
	
	
	public int compareTo(Datas o){
		if(o == null){
		return -1;
		}
		if (this == o)
		return 0;
		return this.dd.compareTo(o.dd);
		}
	
}
