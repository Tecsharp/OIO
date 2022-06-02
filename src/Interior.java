
public class Interior {
	
	private Asientos asientos;
	private Volante volante;
	private String materialInterior;
	private Sonido sonido;
	
	public Interior() {
		materialInterior = "";
		asientos = new Asientos();
		volante = new Volante();
		sonido = new Sonido();
	}
	
	
	public Asientos getAsientos() {
		return asientos;
	}
	public void setAsientos(Asientos asientos) {
		this.asientos = asientos;
	}
	public Volante getVolante() {
		return volante;
	}
	public void setVolante(Volante volante) {
		this.volante = volante;
	}
	public String getMaterialInterior() {
		return materialInterior;
	}
	public void setMaterialInterior(String materialInterior) {
		this.materialInterior = materialInterior;
	}
	public Sonido getSonido() {
		return sonido;
	}
	public void setSonido(Sonido sonido) {
		this.sonido = sonido;
	}
	

}
