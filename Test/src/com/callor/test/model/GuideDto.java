package com.callor.test.model;

public class GuideDto {
	
	public String id;
	public String list;
	public String seq;
	public String guide;
	
	public GuideDto() {
		// TODO Auto-generated constructor stub
	}
	
	public GuideDto(String id, String list, String seq, String guide) {
		super();
		this.id = id;
		this.list = list;
		this.seq = seq;
		this.guide = guide;
	
	}
	
  	@Override
	public String toString() {
		return "GuideDto [id=" + id + ", list=" + list + ", seq=" + seq + ", guide=" + guide + "]";
	}
}
