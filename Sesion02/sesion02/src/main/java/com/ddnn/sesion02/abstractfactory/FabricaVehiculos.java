package com.ddnn.sesion02.abstractfactory;

//Definiendo un contrato: QUE realizara la fabrica
public interface FabricaVehiculos {
	
	Automovil crearAutomovil(String proveedor, String nroasientos);
	Scooter crearScooter(String modelo, String color);

}
