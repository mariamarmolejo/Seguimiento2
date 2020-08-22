package model;

public class Person {
	public static final String CEDULA_CIUDADANIA = "CC";
	public static final String CEDULA_EXTRANJERIA = "CE";
	public static final String TARJETA_IDENTIDAD = "TI";
	public static final String PASAPORTE = "PP";
	private String type;
	private int id;
	
	public Person(String ty, int i) {
		type = ty;
		id = i;
	}
	
	public String getType() {
		return type;
	}
	
	public int getId() {
		return id;
	}
}
