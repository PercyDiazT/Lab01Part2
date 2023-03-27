package Ejercicio2;

public class Estudiante {
	private String nombres;
	private String apellidos;
	private int dni;
	private int anioIngreso;
	private int codigo;
	private String correo;
	
	public Estudiante(String nombres,String apellidos, int dni, 
			int anioIngreso) 
	{
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dni = dni;
		this.anioIngreso = anioIngreso;
		
		String part1Cod = String.valueOf(anioIngreso);
		String dniString = String.valueOf(dni);
		String part2Cod = dniString.substring(0,6);
		String codTexto = part1Cod + part2Cod;

		this.codigo = Integer.valueOf(codTexto);
		String arrNombres[] = nombres.split(" ");
		String arrApellidos[] = apellidos.split(" ");
		
		String part1Email = arrNombres[0];
		String part2Email = arrApellidos[0];	
		this.correo = part1Email.toLowerCase()+"."+
		part2Email.toLowerCase()+"@ucsm.edu.pe";
		
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getAnioIngreso() {
		return anioIngreso;
	}

	public void setAnioIngreso(int anioIngreso) {
		this.anioIngreso = anioIngreso;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "NOMBRES: "+this.nombres +"\nAPELLIDOS: "+ this.apellidos + "\nDNI: " + this.dni 
				+ "\nAño de Ingreso: "+this.anioIngreso+"\nCODIGO: " + this.codigo  + "\nCORREO: " + this.correo;
	}
}
