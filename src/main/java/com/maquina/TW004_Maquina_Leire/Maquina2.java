package com.maquina.TW004_Maquina_Leire;

public class Maquina2 {
	private double cambios;
	private Refresco[] refrescos; 
	private int refrescosVendidos;
	
	public Maquina2(double c, Refresco[] r)
	{
		cambios = c;
		refrescos = r;
		this.refrescosVendidos = 0;
	}

	public double getCambios() {
		return cambios;
	}

	public Refresco getRefresco(int pos) {
		return refrescos[pos];
	}
	
	
	public int vender(int posVendido, double dinero)
	{
		if(dinero > 0)
		{
			if(refrescos[posVendido].getStock() > 0)
			{
				if(dinero > refrescos[posVendido].getPrecio())
				{
					refrescos[posVendido].setStock(-1); 
					refrescosVendidos++;
					refrescos[posVendido].sumarRefrescoVendido();
					
					double precioRefresco = refrescos[posVendido].getPrecio();
					double dineroDevuelto = dinero - precioRefresco;
					if(dineroDevuelto > cambios)
					{
						System.out.println("No hay cambios");
						return -1;
					}else {
						cambios += precioRefresco;
						System.out.println(dineroDevuelto + "Has comprado " + refrescos[posVendido].getNombre());
					}
					return 0;
					
				}else {
					System.out.println("Has metido dinero insuficiente");
					return -4;
				}
				
			}else {
				System.out.println("No quedan refrescos");
				return -2;
			}
		}else {
			System.out.println("No puedes meter dinero negativo");
			return -3;
		}
		
		
	}
	
	public  String generarInforme(Refresco[] r)
	{
		double dineroTotal = 0;
		for(int i = 0; i < r.length; i++)
		{
			dineroTotal = r[i].getPrecio()*r[i].getRefrescoVendido();
		}
		
		String s = "Se han vendido " + this.refrescosVendidos + "y su precio total es " + dineroTotal;
		System.out.println(s);
		return s;
		
	}
	
	public  String mostrarEstadoActual(Refresco[] r)
	{
		int stockRefrescos = 0;
		for(int i = 0; i < r.length; i++)
		{
			stockRefrescos += r[i].getStock();
			
		}
		String s = "Quedan " + stockRefrescos + "y quedan" + this.cambios;
		System.out.println(s);
		return s;
	}
	
	public static void main(String[] args) {
		Refresco[] refrescos = {
			new Refresco(2,10,"kas"),
			new Refresco(2.50,10,"ColaCola"),
			new Refresco(1.50,10,"agua"),		
			
		}; 
		
		Maquina2 m = new Maquina2(50, refrescos);
		
		m.vender(1, 5);
		m.vender(2, 5);
		
	}
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


