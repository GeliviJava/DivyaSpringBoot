/**
 * 
 */
package com.div.model;

/**
 * @author Admini
 *
 */
public class Student {
	
	public String stName;
	
	public String addr;
	
	public Long sno;
	
	public float totMarks;

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Long getSno() {
		return sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public float getTotMarks() {
		return totMarks;
	}

	public void setTotMarks(float totMarks) {
		this.totMarks = totMarks;
	}

	@Override
	public String toString() {
		return "Student [stName=" + stName + ", addr=" + addr + ", sno=" + sno + ", totMarks=" + totMarks + "]";
	}
	
	

}
