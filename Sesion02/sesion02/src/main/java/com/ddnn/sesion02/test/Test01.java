package com.ddnn.sesion02.test;

import com.ddnn.sesion02.dominio.Ciudad;
import com.ddnn.sesion02.dominio.Fecha;
import com.ddnn.sesion02.dominio.Persona;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha f1 = new Fecha(2, 10, 1980);
		Fecha f2 = new Fecha(27, 10, 1972);
		
		Ciudad cn1 = new Ciudad(44, "Trujillo");
		Ciudad cn2 = new Ciudad(01, "Lima");
		
		Ciudad cr1 = new Ciudad(44, "Trujillo");
		Ciudad cr2 = new Ciudad(44, "Trujillo");
		
		Persona per1 = new Persona(12345678, "Luis", "D�az", f1, cn1, cr1);
		Persona per2 = new Persona(87654321, "Mar�a", "Lopez", f2, cn2, cr2);
		
		System.out.println(per1);
		System.out.println(per2);

	}

}
