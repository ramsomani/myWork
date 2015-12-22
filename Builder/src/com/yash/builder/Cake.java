package com.yash.builder;

public class Cake {
	private String flavor;
	private int size;
	private int pound;
	
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public float getPound() {
		return pound;
	}
	public void setPound(int pound) {
		this.pound = pound;
	}
	
	public Cake(builder builder) {
		this.flavor = builder.flavor;
		this.size = builder.size;
		this.pound = builder.pound;
	}


	static class builder
	 {
		private String flavor;
		private int size;
		private int pound;
		public builder(String flavor, int size, int pound) {
			super();
			this.flavor = flavor;
			this.size = size;
			this.pound = pound;
		}
		
		public Cake build() {
			return new Cake(this);
		}

	 }
}
