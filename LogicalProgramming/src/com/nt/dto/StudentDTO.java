package com.nt.dto;

public class StudentDTO {

	private int sno;
	private Double sal;
	public StudentDTO(int sno, Double sal) {
		super();
		this.sno = sno;
		this.sal = sal;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "StudentDTO [sno=" + sno + ", sal=" + sal + "]";
	}
	
}
