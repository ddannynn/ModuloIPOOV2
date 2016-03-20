package com.ddnn.sesion02.abstractfactory;

public class AutomovilGasolina extends Automovil {

	public AutomovilGasolina(String proveedor, String nroasientos) {
		super(proveedor, nroasientos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarCaracteristicas() {
		// TODO Auto-generated method stub
		System.out.println("Automovil gasolina de proveedor: " + proveedor + " con nro asientos: " + nroasientos);
		
	}

}
