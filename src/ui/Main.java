package ui;
import java.util.Scanner;
import model.Minimarket;
import exceptions.IDNoMatchException;
public class Main {

	public static void main(String[] args) throws IDNoMatchException {
		Scanner sc = new Scanner(System.in);
		int option;
	
	    Minimarket mm = new Minimarket();
	   
	    System.out.println("=============Menu Minimarket=============");
	    System.out.print("1.Ingresar usuario\n2.Personas que han intentado ingresar\n3.Salir\n");
	    option = sc.nextInt();
	    int contador= 0;
	    if (option==1) {
	    int menu = 1;
	    while(menu==1) {
	    switch(option) {
	    	case 1:
	    		contador++;
	    		String t;
	    		int i;
	    		System.out.println("\nDigite el tipo de documento en mayuscula\nPara cedula de ciudadania CC\nPara cedula de extranjeria CE\nPara pasaporte PP\nPara tarjeta de identidad TI");
	    		t = sc.next();
	    		System.out.println("Digite el numero de documento \n ");
	    		i = sc.nextInt();
	    		mm.addPerson(t, i);
	    		System.out.println("desea agregar mas?, 1=si, 2=no ");
	    		menu = sc.nextInt();
	    		break;
	    	case 2:
	    		System.out.println(contador);
	    		break;
	    	case 3:
	    		 System.exit(3);
	    		break;
	    }
	    }
	    System.out.print("2.Personas que han intentado ingresar\n3.Salir\n");
	    int option2 = sc.nextInt();
	    switch(option2) {
    	case 2:
    		System.out.println(contador);
    		break;
    	case 3:
    		System.exit(3);
    		break;
	}
	    		
	    		
	    }
	}
}
