package com.scp.models;

public final class Product {
	
	private final int prod_id;
	private final String prod_company;
	private final int prod_qty;
	private final float prod_price;
	

	public Product(int prod_id, String prod_company, int prod_qty, float prod_price) {
		super();
		this.prod_id = prod_id;
		this.prod_company = prod_company;
		this.prod_qty = prod_qty;
		this.prod_price = prod_price;
	}

	public int getProd_id() {
		return prod_id;
	}

	public String getProd_company() {
		return prod_company;
	}

	public int getProd_qty() {
		return prod_qty;
	}

	public float getProd_price() {
		return prod_price;
	}

	@Override
	public String toString() {
		return "Product [prod_id=" + prod_id + ", prod_company=" + prod_company + ", prod_qty=" + prod_qty + ", prod_price="
				+ prod_price + "]";
	}
	
	

}
