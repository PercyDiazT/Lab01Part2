package Ejercicio1Part2;

public enum Mes {
	ENERO(1,31),
	FEBRERO(2,28),
	MARZO(3,30),
	ABRIL(4,31),
	MAYO(5,30),
	JUNIO(6,31),
	JULIO(7,30),
	AGOSTO(8,31),
	SEPTIEMBRE(9,30),
	OCTUBRE(10,31),
	NOVIEMBRE(11,30),
	DICIEMBRE(12,31);
	
	private int n;
	private int dias;
	
	private Mes(int n, int dias) {
		this.n = n;
		this.dias = dias;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public int getN() {
		return this.n;
	}
	
	public void setDias(int dias) {
		this.dias = dias;
	}
	
	public int getDias() {
		return this.dias;
	}
	
	public String toString() {
		return  this.name().toLowerCase()+
				" es el "+ this.getN()+"° mes y tiene "+
				this.getDias()+" dias.";
	}
}
