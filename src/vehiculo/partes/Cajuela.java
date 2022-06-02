package vehiculo.partes;

public class Cajuela {
	
	private String tamanoCajuela;
	private String conSonido;
	
	public Cajuela() {
		tamanoCajuela = "";
		conSonido = "";
		
	}
	
	public String getTamanoCajuela() {
		return tamanoCajuela;
	}
	public void setTamanoCajuela(String tamanoCajuela) {
		this.tamanoCajuela = tamanoCajuela;
	}
	public String getConSonido() {
		return conSonido;
	}
	public void setConSonido(String conSonido) {
		this.conSonido = conSonido;
	}

}
