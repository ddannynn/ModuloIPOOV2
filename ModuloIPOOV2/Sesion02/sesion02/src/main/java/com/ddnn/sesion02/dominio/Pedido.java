package com.ddnn.sesion02.dominio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private String nroPedido;
	private Fecha fechaPedido;
	
	//Asociacion -> Composicion
	private List<LineaPedido> lineasPedido;

	public Pedido() {
		lineasPedido = new ArrayList<LineaPedido>();
	}

	public String getNroPedido() {
		return nroPedido;
	}

	public void setNroPedido(String nroPedido) {
		this.nroPedido = nroPedido;
	}

	public Fecha getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Fecha fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public List<LineaPedido> getLineasPedido() {
		return lineasPedido;
	}

	public void setLineasPedido(List<LineaPedido> lineasPedido) {
		this.lineasPedido = lineasPedido;
	}

	@Override
	public String toString() {
		return "Pedido [nroPedido=" + nroPedido + ", fechaPedido=" + fechaPedido + ", lineasPedido=" + lineasPedido
				+ "]";
	}

}
