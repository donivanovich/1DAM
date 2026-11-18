public class SeatLeon {
	
	// Atributos
	private String color;
	private boolean extras;
	private int puertas;
	private int motor;

	// Constructor completo
	public SeatLeon(String color, int puertas, int motor, boolean extras) {
		this.color = color;
		this.motor = motor;
		this.extras = extras;
		
		if (validarPuertas(puertas)) {
			this.puertas = puertas;
		} else {
			System.err.println("Número de puertas no válido. Asignando el valor predeterminado de 3 puertas.");
			this.puertas = 3; // valor predeterminado
		}
	}
	
	// Constructor sin extras
	public SeatLeon(String color, int puertas, int motor) {
		this.color = color;
		this.motor = motor;
		
		if (validarPuertas(puertas)) {
			this.puertas = puertas;
		} else {
			System.err.println("Número de puertas no válido. Asignando el valor predeterminado de 3 puertas.");
			this.puertas = 3; // valor predeterminado
		}
	}
	
	// Constructor vacío
	public SeatLeon() {}

	// Métodos Getter y Setter
	public String getColor() {
		return this.color.toUpperCase();
	}
	
	public void setColor(String color) {
		this.color = color.toLowerCase();
	}
	
	public boolean isExtras() {
		return extras;
	}

	public void setExtras(boolean extras) {
		this.extras = extras;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		if (validarPuertas(puertas)) {
			this.puertas = puertas;
		} else {
			System.err.println("Número de puertas no válido.");
		}
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}
	
	// Método privado para validar puertas
	private boolean validarPuertas(int puertas) {
		if (puertas == 3 || puertas == 5) {
			return true;
		} else {
			System.err.println("SeatLeon solo puede tener 3 o 5 puertas.");
			return false;
		}
	}

	// Método toString
	@Override
	public String toString() {
		return "SeatLeon [color=" + color + ", extras=" + extras + ", puertas=" + puertas + ", motor=" + motor + "]";
	}

	// Métodos adicionales
	public void acelerar() {
		System.out.println("Acelerando");
	}
	
	public void frenar() {
		System.out.println("Frenando");
	}
	
	public void girar(String direccion) {
		switch (direccion.toLowerCase()) {
			case "derecha": 
				System.out.println("Girando a la derecha");
				break;
			case "izquierda":
				System.out.println("Girando a la izquierda");
				break;
			default:
				System.out.println("Direccion incorrecta");
				break;
		}
	}
	
	public void marchaAtras() {
		System.out.println("Dando marcha atras");
	}
}