package com.maquina.TW004_Maquina_Leire;

public class Maquina {
	private double cambios;
	private Refresco refresco;
	private int refrescosVendidos;
	
	public Maquina(double c, Refresco r)
	{
		cambios = c;
		refresco = r;
		this.refrescosVendidos = 0;
	}

	public double getCambios() {
		return cambios;
	}

	public Refresco getRefresco() {
		return refresco;
	}
	
	
	private void vender(Refresco refrescoVendido, double dinero)
	{
		if(refrescoVendido.getStock() > 0)
		{
			refrescoVendido.setStock(-1);
			refrescosVendidos++;
			
			double precioRefresco = refrescoVendido.getPrecio();
			double dineroDevuelto = dinero - precioRefresco;
			
			if(dineroDevuelto > cambios)
			{
				System.out.println("No hay cambios");
			}else {
				cambios += precioRefresco;
				System.out.println(dineroDevuelto);
			}
			
		}else {
			System.out.println("No quedan refrescos");
		}
		
	}
	
	private String generarInforme(Refresco r)
	{
		String s = "Se han vendido " + this.refrescosVendidos + "y su precio total es " + r.getPrecio()*this.refrescosVendidos;
		System.out.println(s);
		return s;
		
	}
	
	private String mostrarEstadoActual(Refresco r)
	{
		String s = "Quedan " + r.getStock() + "y quedan" + this.cambios;
		System.out.println(s);
		return s;
	}
	
	public static void main(String[] args) {
		Refresco r = new Refresco(2.0, 1,"");
		
		Maquina m = new Maquina(50, r);
		
		m.vender(r, 5);
		m.vender(r, 5);
		
	}
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


