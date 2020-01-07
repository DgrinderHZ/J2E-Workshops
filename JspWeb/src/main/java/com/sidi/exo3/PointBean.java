package com.sidi.exo3;


public class PointBean {

	private double abs;
	private double ord;
	private double norme;
	
	
	
	public PointBean(double abs, double ord) {
		super();
		this.abs = abs;
		this.ord = ord;
		this.norme = calculerNorme();
	}
	public double getAbs() {
		return abs;
	}
	public void setAbs(double abs) {
		this.abs = abs;
	}
	public double getOrd() {
		return ord;
	}
	public void setOrd(double ord) {
		this.ord = ord;
	}
	public double getNorme() {
		return norme;
	}
	
	private double calculerNorme() {
		double norme;
		norme = Math.sqrt(this.abs*this.abs + this.ord*this.ord);
		return norme;
	}
	
}
