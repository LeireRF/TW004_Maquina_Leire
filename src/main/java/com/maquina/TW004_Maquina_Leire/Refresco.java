package com.maquina.TW004_Maquina_Leire;

public class Refresco {
	private double precio;
	private int stock;
	private String nombre;
	private int refrescoVendido;
//	private Tipo tipo;
	
public Refresco(double p, int s, String n)
{
	precio = p;
	stock = s;
	nombre = n;
//	tipo = t;
}

public double getPrecio() {
	return precio;
}

public int getStock() {
	return stock;
}


public void setStock(int stock) {
	this.stock += stock;
}

public String getNombre() {
	return nombre;
}

public int getRefrescoVendido() {
	return refrescoVendido;
}

public void sumarRefrescoVendido()
{
	this.refrescoVendido++;
}



}
