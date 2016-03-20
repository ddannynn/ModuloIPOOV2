package com.ddnn.sesion02.singleton;

//Patron de Singleton
public class SoyUnico {
	
	//1.
	//Atributo Instancia
	private String nombre;
	//Atributo clase
	private static SoyUnico soyUnico;
	
	//2.Tener un constructor privado
	private SoyUnico(String nombre) {
		this.nombre = nombre;
		System.out.println("Mi nombre es: " + nombre);
	}
	
	//3.
	public static SoyUnico getInstance(String nombre) {
		if (soyUnico == null)
			soyUnico = new SoyUnico(nombre);
		else
			System.out.println("No se puede crear el objeto " + nombre + " porque ya existe");
		
		return soyUnico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
