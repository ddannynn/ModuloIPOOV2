package com.ddnn.sesion02.dominio;

public class LineaPedido {
	private int cantidad;
	
	//Asociacion -> Agragacion
	private Producto producto;
	
	public LineaPedido(int cantidad, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "LineaPedido [cantidad=" + cantidad + ", producto=" + producto + "]";
	}

}
