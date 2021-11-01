package com.maquina.TW004_Maquina_Leire;

import static org.junit.Assert.*;

import org.junit.Test;

public class Maquina2Test {

	@Test
	public void venderRefrescoSinStock() {
		Refresco r = new Refresco(2.3,0,"kas");
		Refresco[] arrayRefrescos = new Refresco[1];
		
		arrayRefrescos[0] = r;
		
		Maquina2 m = new Maquina2(20, arrayRefrescos);
		
		
			if(m.vender(0,3.0) != -2)
			{
				fail("No deberia haber refrescos para vender");
			}
		
		
	}
	
	@Test
	public void venderRefrescoSinCambiosSuficientes()
	{
		Refresco r = new Refresco(2.3,1,"kas");
		Refresco[] arrayRefrescos = new Refresco[1];
		
		arrayRefrescos[0] = r;
		
		Maquina2 m = new Maquina2(5, arrayRefrescos);
		
		if(m.vender(0, 10) != -1)
		{
			fail("No deberia devolver cambios porque no hay suficiente");
		}
		
	}
	
	@Test
	public void meterDineroNegativo()
	{
		Refresco r = new Refresco(2.3,1,"kas");
		Refresco[] arrayRefrescos = new Refresco[1];
		
		arrayRefrescos[0] = r;
		
		Maquina2 m = new Maquina2(5, arrayRefrescos);
		
		if(m.vender(0, -2.0) != -3)
		{
			fail("No deberia vender porque has metido dinero negativo");
		}
	}
	
	@Test
	public void meterDineroInsuficiente()
	{
		Refresco r = new Refresco(2.3,1,"kas");
		Refresco[] arrayRefrescos = new Refresco[1];
		
		arrayRefrescos[0] = r;
		
		Maquina2 m = new Maquina2(5, arrayRefrescos);
		
		if(m.vender(0, 2.0) != -4)
		{
			fail("No deberia vender porque has metido menos dinero del que vale el refresco");
		}
	}

}
