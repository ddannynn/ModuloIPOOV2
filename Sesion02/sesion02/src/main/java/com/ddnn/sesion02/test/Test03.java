package com.ddnn.sesion02.test;

import com.ddnn.sesion02.singleton.SoyUnico;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoyUnico obj1 = SoyUnico.getInstance("Obj1");
		SoyUnico obj2 = SoyUnico.getInstance("Obj2");
		
		System.out.println(obj1.getNombre());
		System.out.println(obj2.getNombre());

	}

}
