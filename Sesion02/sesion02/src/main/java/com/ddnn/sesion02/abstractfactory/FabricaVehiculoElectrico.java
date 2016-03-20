package com.ddnn.sesion02.abstractfactory;

public class FabricaVehiculoElectrico implements FabricaVehiculos {

	@Override
	public Automovil crearAutomovil(String proveedor, String nroasientos) {
		// TODO Auto-generated method stub
		return new AutomovilElectricidad(proveedor, nroasientos);
	}

	@Override
	public Scooter crearScooter(String modelo, String color) {
		// TODO Auto-generated method stub
		return new ScooterElectricidad(modelo, color);
	}

}
