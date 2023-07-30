import java.time.LocalDate;

public class Mascota {
	private String uuid;
	private String nombre;
	private String apellido;
	private int edad;
	private LocalDate fecha_nacimiento;
	private LocalDate fecha_partida;
	private Kahu cuidador;
	private final Boolean isAGoodPet = Boolean.TRUE;

	public Mascota (){}

	public Mascota (String uuid, String nombre, String apellido, int edad, LocalDate fecha_nacimiento, LocalDate fecha_partida, Kahu cuidador){
		this.uuid = uuid;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fecha_nacimiento = fecha_nacimento;
		this.fecha_partida = fecha_partida;
		this.cuidador = cuidador;
	}

	public String getUuid (){
		return uuid;
	}

	public String getNombre (){
		return nombre;
	}

	public String getApellido (){
		return apellido;
	}

	public int getEdad (){
		return edad;
	}

	public LocalDate getFechaNacimiento (){
		return fecha_nacimiento;
	}

	public LocalDate getFechaPartida (){
		return fecha_partida;
	}

	public Kahu getCuidador (){
		return cuidador;
	}

	public Boolean getAlwaysAGoodPet(){
		return isAGoodPet;
	}

	@Override
	public String toString(){
		StringBuilder strb = new StringBuilder;
		strb.add("Mascota ->");
		strb.add(" uuid ").add(uuid);
		strb.add(" nombre ").add(nombre);
		strb.add(" apellido ").add(apellido);
		strb.add(" edad ").add(edad);
		strb.add(" fecha de nacimiento ").add(fecha_nacimiento);
		strb.add(" fecha de partida ").add(fecha_partida);
		strb.add(" obviamente siempre son los mejores seres, ¿es una buena mascota? ").add(isAGoodPet);
		return strb.toString();
	}
}
