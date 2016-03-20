package com.ddnn.sesion02.abstractfactory;

public class ScooterGasolina extends Scooter {

	public ScooterGasolina(String modelo, String color) {
		super(modelo, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarCaracteristicas() {
		// TODO Auto-generated method stub
		System.out.println("Scooter gasolina modelo: " + modelo + " de color: " + color);
		
	}

}
