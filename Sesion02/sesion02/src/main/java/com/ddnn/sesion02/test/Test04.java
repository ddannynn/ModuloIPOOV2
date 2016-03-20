package com.ddnn.sesion02.test;

import java.util.Scanner;

import com.ddnn.sesion02.abstractfactory.Automovil;
import com.ddnn.sesion02.abstractfactory.AutomovilElectricidad;
import com.ddnn.sesion02.abstractfactory.FabricaVehiculoElectrico;
import com.ddnn.sesion02.abstractfactory.FabricaVehiculoGasolina;
import com.ddnn.sesion02.abstractfactory.FabricaVehiculos;
import com.ddnn.sesion02.abstractfactory.Scooter;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Automovil a1 = new AutomovilElectricidad(proveedor, nroasientos);
		//Automovil a2 = new AutomovilElectricidad(proveedor, nroasientos);
		
		Scanner r = new Scanner(System.in);
		FabricaVehiculos fabrica;
		
		Automovil[] automoviles = new Automovil[2];
		Scooter[] scooters = new Scooter[2];
		
		System.out.println("Desea comprar vehiculo E(1) o G(2)");
		String o = r.next();
		
		if (o.equals("1"))
			fabrica = new FabricaVehiculoElectrico();
		else
			fabrica = new FabricaVehiculoGasolina();
		
		//Llenar los arreglos
		for (int i = 0; i < automoviles.length; i++) {
			automoviles[i] = fabrica.crearAutomovil("Proveedor1", "4");
		}
		
		for (int i = 0; i < scooters.length; i++) {
			scooters[i] = fabrica.crearScooter("Mod 1", "Negro");
		}
		
		//Reportes
		for (Automovil automovil : automoviles) {
			automovil.mostrarCaracteristicas();
		}
		
		for (Scooter scooter : scooters) {
			scooter.mostrarCaracteristicas();
		}

	}

}
