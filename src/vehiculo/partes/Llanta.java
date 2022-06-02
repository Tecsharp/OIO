package vehiculo.partes;

public class Llanta {
	
	private String llantaMarca;
	private String medidaLlanta;
	private String tipoLlanta;
	private String tipoRin; //Aluminio o acero
	
	public Llanta() {
		
		llantaMarca = "";
		medidaLlanta = "";
		tipoLlanta = "";
	}

	public void setTipoLlanta(String valueTireType) {
		tipoLlanta = valueTireType;
	}
	
	public void setLlantaMarca(String valueTireMark) {
		llantaMarca = valueTireMark;
	}
	
	public void setMedidaLlanta(String valueTireSize) {
		medidaLlanta = valueTireSize;
	}
	

	public String getTipoLlanta() {
		return tipoLlanta;
	}
	
	public String getLlantaMarca() {
		return llantaMarca;
	}
	
	public String getMedidaLlanta() {
		return medidaLlanta;
	}

	public String getTipoRin() {
		return tipoRin;
	}

	public void setTipoRin(String tipoRin) {
		this.tipoRin = tipoRin;
	}

}
