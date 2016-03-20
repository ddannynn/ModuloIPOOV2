package com.ddnn.sesion02.abstractfactory;

public class FabricaVehiculoGasolina implements FabricaVehiculos {

	@Override
	public Automovil crearAutomovil(String proveedor, String nroasientos) {
		// TODO Auto-generated method stub
		return new AutomovilGasolina(proveedor, nroasientos);
	}

	@Override
	public Scooter crearScooter(String modelo, String color) {
		// TODO Auto-generated method stub
		return new ScooterGasolina(modelo, color);
	}

}
