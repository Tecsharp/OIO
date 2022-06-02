
public class Carro {
	
	private String modeloCompleto;
	private Integer precio;
	private String Color;
	private String marca;
	private String modelo;
	private Llanta llanta;
	private Motor motor;
	private Puertas puertas;
	private Cajuela cajuela;
	private Interior interior;

	public Carro() {
		Color = "";
		modeloCompleto = "";
		precio = 0;
		marca = "";
		modelo = "";
		motor = new Motor();
		puertas = new Puertas();
		cajuela = new Cajuela();
		interior = new Interior();
		llanta = new Llanta();
		
		
	}
	
	//SET
	public void setColor(String colourCar) {
		Color = colourCar;	
	}
	
	public void setLlanta(Llanta llanta) {
		this.llanta = llanta;
	}
	
//	public void setTipoLlanta(String valueTireType) {
//		llanta.setTipoLlanta(valueTireType);
//	}
	
	//GET
	
	public String getColor() {
		
		return Color;
		
	}

	public Llanta getLlanta() {
		return llanta;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Puertas getPuertas() {
		return puertas;
	}

	public void setPuertas(Puertas puertas) {
		this.puertas = puertas;
	}

	public Cajuela getCajuela() {
		return cajuela;
	}

	public void setCajuela(Cajuela cajuela) {
		this.cajuela = cajuela;
	}

	public Interior getInterior() {
		return interior;
	}

	public void setInterior(Interior interior) {
		this.interior = interior;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public String getModeloCompleto() {
		return modeloCompleto;
	}

	public void setModeloCompleto(String modeloCompleto) {
		this.modeloCompleto = modeloCompleto;
	}


	
//	public String getTipoLlanta() {
//		return llanta.getTipoLlanta();
//		
//	}
	
}

