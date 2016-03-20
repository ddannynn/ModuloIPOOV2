package com.ddnn.sesion02.abstractfactory;

public abstract class Automovil {
	
	protected String proveedor;
	protected String nroasientos;
	public Automovil(String proveedor, String nroasientos) {
		super();
		this.proveedor = proveedor;
		this.nroasientos = nroasientos;
	}
	
	public abstract void mostrarCaracteristicas();

}
