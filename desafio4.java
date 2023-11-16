package desafio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class desafio4 {
	static String [] Nombre = new String [4];
	static String [] Apellido = new String [4];
	static int [] NumCamiseta= new int [4];
	static String respuesta;
	static Scanner datos = new Scanner(System.in);

	static String NombreS, ApellidoS, Posicion, SonCorrectos;
	static int NumCamisetaS, NumQueCambiar, NumQueSeCambiara;
	static boolean respuestaAgregarJugadorIncorrecta = false;
	static boolean SinCorrectos = false;

	static String [] NombreNJ = new String [4];
	static String [] ApellidoNJ = new String [4];
	static int [] NumCamisetaNJ= new int [4];

	public static void ingresarDatos() {
	for(int i = 0; i < Nombre.length - 1; i++) {
	System.out.println("Ingresar nombre del jugador");
	Nombre[i] = datos.next();

	System.out.println("Ingresar apellido del jugador");
	Apellido[i] = datos.next();

	System.out.println("Ingresar Numero de Camiseta del jugador");
	NumCamiseta[i] = datos.nextInt();
	}
	}
	public static void agregarJugador() {
	while(respuestaAgregarJugadorIncorrecta != true) {
	System.out.println("\nDesea agregar datos de un jugador suplente?(Elija entre si o no)");
	respuesta = datos.next();
	respuesta = respuesta.toLowerCase();

	if(respuesta.equals("si")){
	System.out.println("Ingresar Nombre de Jugador");
	Nombre[3] = datos.next();
	System.out.println("Ingresar Apellido de Jugador");
	Apellido[3] = datos.next();
	System.out.println("Ingresar Posicion de Jugador");
	Posicion = datos.next();
	System.out.println("Ingresar Numero de Camiseta de Jugador");
	NumCamiseta[3] = datos.nextInt();
	 
	analizarDatosCuatroJugadores();
	respuestaAgregarJugadorIncorrecta = true;

	}
	else if(respuesta.equals("no")) {
	analizarDatosTresJugadores();
	respuestaAgregarJugadorIncorrecta = true;
	}
	else {
	System.out.println("LA RESPUESTA DEBE SER SI O NO");
	}
	}
	}
	public static void  analizarDatosTresJugadores() {
	while(SinCorrectos != true){
	System.out.println("\tDatos de 3 Tugadores");
	for(int i = 0; i < Nombre.length - 1; i++) {
	System.out.println("\nNombre: "+Nombre[i] +" Apellido: "+Apellido[i]+" NumCamiseta: "+NumCamiseta[i]);
	}



	System.out.println("\nSon correctos los datos?");
	SonCorrectos = datos.next();
	SonCorrectos = SonCorrectos.toLowerCase();


	if(SonCorrectos.equals("si")) {
	SinCorrectos = true;
	}
	else if (SonCorrectos.equals("no")) {
	try {
	System.out.println("Qué numero de camiseta de jugador quiere cambiar?");
	NumQueCambiar= datos.nextInt();

	NumQueSeCambiara= NumQueCambiar - 1;


	System.out.println("Ingresar Nombre");
	Nombre[NumQueSeCambiara] = datos.next();
	System.out.println("Ingresar Apellido");
	Apellido[NumQueSeCambiara] = datos.next();
	System.out.println("Ingresar Numero de Camiseta");
	NumCamiseta[NumQueSeCambiara]=datos.nextInt();
	} catch(InputMismatchException e) {
	System.out.println("Error: Debés ingresar un dato valido.");
	}

	}
	}
	}
	public static void analizarDatosCuatroJugadores() {
	while(SinCorrectos != true){
	System.out.println("\tDatos de 4 Jugadores");
	for(int i = 0; i < Nombre.length ; i++) {
	System.out.println("\nNombre: "+Nombre[i] +" Apellido: "+Apellido[i]+" NumCamiseta: "+NumCamiseta[i]);
	}

	System.out.println("\nSon correctos los datos?");
	SonCorrectos = datos.next();
	SonCorrectos = SonCorrectos.toLowerCase();

	if(SonCorrectos.equals("si")) {
	SinCorrectos = true;
	}
	else if (SonCorrectos.equals("no")) {
	System.out.println("Qué numero de camiseta de jugador quiere cambiar?");
	NumQueCambiar= datos.nextInt();

	NumQueSeCambiara= NumQueCambiar - 1;

	System.out.println("Ingresar Nombre");
	Nombre[NumQueSeCambiara] = datos.next();
	System.out.println("Ingresar Apellido");
	Apellido[NumQueSeCambiara] = datos.next();
	System.out.println("Ingresar Numero de Camiseta");
	NumCamiseta[NumQueSeCambiara]=datos.nextInt();

	SinCorrectos = false;
	}
	else{
	System.out.println("tatatatatatataatta");
	}
	}
	}
	public static void main (String [] ars) {
	ingresarDatos();
	agregarJugador();
	}
	}

