import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InputMismatchException {

		Scanner sc = new Scanner(System.in);
		//CARROS
		Carro nissanVersa = new Carro();
		nissanVersa.setMarca("Nissan");
		nissanVersa.setModelo("2022");
		nissanVersa.setColor("Negro");
		nissanVersa.setPrecio(400000);
		nissanVersa.setModeloCompleto("Nissan Versa 2022");
		
		Carro fordRaptor = new Carro();
		fordRaptor.setMarca("Ford");
		fordRaptor.setModelo("2022");
		fordRaptor.setColor("Negro Espacial");
		fordRaptor.setPrecio(1943000);
		fordRaptor.setModeloCompleto("Ford Raptor 2022");
		
		// TIPOS DE LLANTAS \\
		//		CALLE		\\
		Llanta llantaCoche1 = new Llanta();
		llantaCoche1.setLlantaMarca("Michelin");
		llantaCoche1.setMedidaLlanta("120-90-21");
		llantaCoche1.setTipoLlanta("Calle");
		llantaCoche1.setTipoRin("Aluminio");

		// TIPOS DE LLANTAS \\
		//		 4X4		\\
		Llanta llantaCamioneta = new Llanta();
		llantaCamioneta.setLlantaMarca("Bridgestone");
		llantaCamioneta.setMedidaLlanta("200-90-24");
		llantaCamioneta.setTipoLlanta("Terraceria");
		llantaCamioneta.setTipoRin("Aluminio Plus");
		
		// MOTOR NISSAN
		Motor nissanMotor = new Motor();
		nissanMotor.setCv("118 Caballo de fuerza");
		nissanMotor.setLitros("1.6 L");
		nissanMotor.setTipoMotor("V4 CVT con D-Step Logic");
		
		// MOTOR RAPTOR
		Motor raptorMotor = new Motor();
		raptorMotor.setCv("450 Caballo de fuerza");
		raptorMotor.setLitros("3.5 L");
		raptorMotor.setTipoMotor("V6 Ecoboost");
		
		// PUERTAS NISSAN
		Puertas nissanPuertas = new Puertas();
		nissanPuertas.setDimPuertasDelanteras("100cm x 150cm");
		nissanPuertas.setDimPuertrasTraseras("90cm x 150cm");
		nissanPuertas.setTipoPuerta("Electricas");
		nissanPuertas.setTipoVidrios("Ahumados");
		
		// PUERTAS RAPTOR
		Puertas raptorPuertas = new Puertas();
		raptorPuertas.setDimPuertasDelanteras("115cm x 160cm");
		raptorPuertas.setDimPuertrasTraseras("75cm x 160cm");
		raptorPuertas.setTipoPuerta("Electricas");
		raptorPuertas.setTipoVidrios("Ahumados");
		
		
		// CAJUELA NISSAN
		Cajuela nissanCajuela = new Cajuela();
		nissanCajuela.setConSonido("No");
		nissanCajuela.setTamanoCajuela("482 Litros");
		
		// CAJUELA RAPTOR
		Cajuela raptorCajuela = new Cajuela();
		raptorCajuela.setConSonido("No");
		raptorCajuela.setTamanoCajuela("1495 Litros");
		
		// ASIENTOS
		Asientos nissanAsientos = new Asientos();
		nissanAsientos.setEquipoAsiento("Calefaccion y movimiento");
		nissanAsientos.setMaterialAsiento("Cuero");
		nissanAsientos.setTipoAsientos("Normales");
		
		Asientos raptorAsientos = new Asientos();
		raptorAsientos.setEquipoAsiento("Calefaccion y movimiento");
		raptorAsientos.setMaterialAsiento("Cuero premium");
		raptorAsientos.setTipoAsientos("Deportivos");
		
		// VOLANTES
		Volante nissanVolante = new Volante();
		nissanVolante.setMaterialVolante("Cuero");
		nissanVolante.setTipoVolante("Normal");
		nissanVolante.setVolanteTamano("45cm");
		
		Volante raptorVolante = new Volante();
		raptorVolante.setMaterialVolante("Cuero");
		raptorVolante.setTipoVolante("Normal");
		raptorVolante.setVolanteTamano("45cm");
		
		// SONIDO
		Sonido nissanSonido = new Sonido();
		nissanSonido.setMarcaSonido("Bose");
		nissanSonido.setNumeroBocinas("8");
		nissanSonido.setTipoControl("Digital");
		
		Sonido raptorSonido = new Sonido();
		raptorSonido.setMarcaSonido("Bose");
		raptorSonido.setNumeroBocinas("15");
		raptorSonido.setTipoControl("Digital");
		
		// INTERIORES
		Interior nissanInterior = new Interior();
		nissanInterior.setMaterialInterior("Premium");
		nissanInterior.setAsientos(nissanAsientos);
		nissanInterior.setSonido(nissanSonido);
		nissanInterior.setVolante(nissanVolante);

		Interior raptorInterior = new Interior();
		raptorInterior.setMaterialInterior("Premium");
		raptorInterior.setAsientos(raptorAsientos);
		raptorInterior.setSonido(raptorSonido);
		raptorInterior.setVolante(raptorVolante);
		
		//PASANDO INFORMACION
		nissanVersa.setLlanta(llantaCoche1);
		nissanVersa.setCajuela(nissanCajuela);
		nissanVersa.setInterior(nissanInterior);
		nissanVersa.setMotor(nissanMotor);
		nissanVersa.setPuertas(nissanPuertas);
		
		fordRaptor.setLlanta(llantaCamioneta);
		fordRaptor.setCajuela(raptorCajuela);
		fordRaptor.setInterior(raptorInterior);
		fordRaptor.setMotor(raptorMotor);
		fordRaptor.setPuertas(raptorPuertas);
		
		Boolean menu = false;
		boolean menu2 = true;

		try {
			while (menu2) {
				
				System.out.println("INGRESA UN NUMERO\n");
				System.out.println("1. Nissan Versa 2022");
				System.out.println("2: Ford Raptor 2022\n");
				System.out.println("3. Salir\n");
				
				Carro modelVeh = null;
				Integer option = sc.nextInt();
				
				if(option == 1) {
					modelVeh =  nissanVersa;
				} else if(option == 2) {
					modelVeh = fordRaptor;
				} else if (option == 3) {
					break;
				}
	
				while (option == 1 || option == 2) {
					option = 0;
					System.out.println("¿Qué desea imprimir de " + modelVeh.getModeloCompleto() + "\n");
					System.out.println("1. Imprimir todo el vehiculo");
					System.out.println("2. Imprimir llanta");
					System.out.println("3. Imprimir motor");
					System.out.println("4. Imprimir puertas");
					System.out.println("5. Imprimir cajuela");
					System.out.println("6. Imprimir interior");
					System.out.println("7. Imprimir asientos");
					System.out.println("8. Imprimir volante");
					System.out.println("9. Imprimir Sonido\n");
					System.out.println("INGRESA UN NÚMERO\n");
					
					option = sc.nextInt();
					
					//IMPRIME TODO EL VEHICULO
					while (option == 1) {
						System.out.println("IMPRIMIENDO TODO EL VEHICULO:");
						System.out.println("Caracteristicas:\n");
						System.out.println("Auto: " + modelVeh.getModeloCompleto());
						System.out.println("Color: " + modelVeh.getColor());
						System.out.println("Marca: " + modelVeh.getMarca());
						System.out.println("Modelo: " + modelVeh.getModelo() + "\n");
						// 2. LLANTAS
						System.out.println("LLANTAS:");
						System.out.println("Marca llanta: " + modelVeh.getLlanta().getLlantaMarca());
						System.out.println("Medida llanta: " + modelVeh.getLlanta().getMedidaLlanta());
						System.out.println("Tipo llanta: " + modelVeh.getLlanta().getTipoLlanta());
						System.out.println("Tipo rin: " + modelVeh.getLlanta().getTipoRin() + "\n");
						// 3. MOTOR
						System.out.println("MOTOR:");
						System.out.println("Caballos de fuerza: " + modelVeh.getMotor().getCv());
						System.out.println("Litros: " + modelVeh.getMotor().getLitros());
						System.out.println("Tipo de motor: " + modelVeh.getMotor().getTipoMotor());
						// 4. PUERTAS
						System.out.println("PUERTAS:");
						System.out.println("Dimension de puertas delanteras: " + modelVeh.getPuertas().getDimPuertasDelanteras());
						System.out.println("Dimension de puertas traseras: " + modelVeh.getPuertas().getDimPuertrasTraseras());
						System.out.println("Tipo de puertas: " + modelVeh.getPuertas().getTipoPuerta());
						System.out.println("Tipo de vidrios: " + modelVeh.getPuertas().getTipoVidrios());
						// 5. CAJUELA
						System.out.println("CAJUELA:");
						System.out.println("Sonido en cajuela: " + modelVeh.getCajuela().getConSonido());
						System.out.println("Tamaño de cajuela: " + modelVeh.getCajuela().getTamanoCajuela() + "\n");
						// 6. INTERIOR
						System.out.println("INTERIOR:");
						System.out.println("Material de interior: " + modelVeh.getInterior().getMaterialInterior());
						System.out.println("Equipos en asiento: " + modelVeh.getInterior().getAsientos().getEquipoAsiento() + "\n");
						// 7. ASIENTOS
						System.out.println("ASIENTOS:");
						System.out.println("Equipo en asientos: " + modelVeh.getInterior().getAsientos().getEquipoAsiento());
						System.out.println("Material de asientos: " + modelVeh.getInterior().getAsientos().getMaterialAsiento());
						System.out.println("Tipo de asientos: " + modelVeh.getInterior().getAsientos().getTipoAsientos());
						// 8. VOLANTE
						System.out.println("VOLANTE:");
						System.out.println("Volante: " + modelVeh.getInterior().getVolante().getMaterialVolante());
						System.out.println("Precio: " + modelVeh.getPrecio() + "\n");
						// 9. SONIDO
						System.out.println("SONIDO:");
						System.out.println("Marca de sonido: " + modelVeh.getInterior().getSonido().getMarcaSonido());
						System.out.println("Numero de bocinas: " + modelVeh.getInterior().getSonido().getNumeroBocinas());
						System.out.println("Tipo de control: " + modelVeh.getInterior().getSonido().getTipoControl() + "\n");
						// SALIDA 
						System.out.println("Ingresa cualquier tecla para salir\n");
						String exitOption = sc.next();
						option = 0;
						break;
					}
			
					//IMPRIME LLANTA
					while (option == 2) {
						System.out.println("Llanta de " + modelVeh.getModeloCompleto() + "\n");
						System.out.println("Marca llanta: " + modelVeh.getLlanta().getLlantaMarca());
						System.out.println("Medida llanta: " + modelVeh.getLlanta().getMedidaLlanta());
						System.out.println("Tipo llanta: " + modelVeh.getLlanta().getTipoLlanta());
						System.out.println("Tipo rin: " + modelVeh.getLlanta().getTipoRin() + "\n");
						//SALIDA 
						System.out.println("Ingresa cualquier tecla para salir\n");
						String exitOption = sc.next();
						option = 0;
						break;
					}
					//IMPRIME MOTOR
					while (option == 3) {
						System.out.println("Motor de " + modelVeh.getModeloCompleto() + "\n");
						System.out.println("Caballos de fuerza: " + modelVeh.getMotor().getCv());
						System.out.println("Litros: " + modelVeh.getMotor().getLitros());
						System.out.println("Tipo de motor" + modelVeh.getMotor().getTipoMotor()+ "\n");
						//SALIDA 
						System.out.println("Ingresa cualquier tecla para salir\n");
						String exitOption = sc.next();
						option = 0;
						break;
					}
					//IMPRIME PUERTA
					while (option == 4) {
						System.out.println("Puerta de " + modelVeh.getModeloCompleto() + "\n");
						System.out.println("Dimension de puertas delanteras " + modelVeh.getPuertas().getDimPuertasDelanteras());
						System.out.println("Dimension de puertas traseras: " + modelVeh.getPuertas().getDimPuertrasTraseras());
						System.out.println("Tipo de puertas: " + modelVeh.getPuertas().getTipoPuerta());
						System.out.println("Tipo de vidrios: " + modelVeh.getPuertas().getTipoVidrios()+ "\n");
						//SALIDA 
						System.out.println("Ingresa cualquier tecla para salir\n");
						String exitOption = sc.next();
						option = 0;
						break;
					}
					//IMPRIME CAJUELA
					while (option == 5) {
						System.out.println("Cajuela de " + modelVeh.getModeloCompleto() + "\n");
						System.out.println("Sonido en cajuela: " + modelVeh.getCajuela().getConSonido());
						System.out.println("Tamaño de cajuela: " + modelVeh.getCajuela().getTamanoCajuela() + "\n");
						//SALIDA 
						System.out.println("Ingresa cualquier tecla para salir\n");
						String exitOption = sc.next();
						option = 0;
						break;
					}
					//IMPRIME INTERIOR
					while (option == 6) {
						System.out.println("Interior de " + modelVeh.getModeloCompleto() + "\n");
						System.out.println("Material de interior: " + modelVeh.getInterior().getMaterialInterior());
						System.out.println("Equipos en asiento: " + modelVeh.getInterior().getAsientos().getEquipoAsiento() + "\n");
						//SALIDA 
						System.out.println("Ingresa cualquier tecla para salir\n");
						String exitOption = sc.next();
						option = 0;
						break;
					}
					//IMPRIME ASIENTOS
					while (option == 7) {
						System.out.println("Asientos de " + modelVeh.getModeloCompleto() + "\n");
						System.out.println("Equipo en asientos: " + modelVeh.getInterior().getAsientos().getEquipoAsiento());
						System.out.println("Material de asientos: " + modelVeh.getInterior().getAsientos().getMaterialAsiento());
						System.out.println("Tipo de asientos: " + modelVeh.getInterior().getAsientos().getTipoAsientos()+ "\n");
						//SALIDA 
						System.out.println("Ingresa cualquier tecla para salir\n");
						String exitOption = sc.next();
						option = 0;
						break;
					}
					//IMPRIME VOLANTE
					while (option == 8) {
						System.out.println("Volante de " + modelVeh.getModeloCompleto() + "\n");
						System.out.println("Volante: " + modelVeh.getInterior().getVolante().getMaterialVolante());
						System.out.println("Precio: " + modelVeh.getPrecio() + "\n");
						//SALIDA 
						System.out.println("Ingresa cualquier tecla para salir\n");
						String exitOption = sc.next();
						option = 0;
						break;
					}
					//IMPRIME SONIDO
					while (option == 9) {
						System.out.println("Sonido de " + modelVeh.getModeloCompleto() + "\n");
						System.out.println("Marca de sonido: " + modelVeh.getInterior().getSonido().getMarcaSonido());
						System.out.println("Numero de bocinas: " + modelVeh.getInterior().getSonido().getNumeroBocinas());
						System.out.println("Tipo de control: " + modelVeh.getInterior().getSonido().getTipoControl() + "\n");
						//SALIDA 
						System.out.println("Ingresa cualquier tecla para salir\n");
						String exitOption = sc.next();
						option = 0;
						break;
					}

				}
			}
		} catch(InputMismatchException e) {
			System.out.println("DEBISTE INOTRODUCIR UN NUMERO, BABOSO");
		
		}
	}
}
