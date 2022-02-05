package calculadora2;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}
	//Fase VERDE
	//------------------------------------------
	public int restar(int a, int b) {
		return 0;
	}
	public int sumar(int a, int b) {
		return 0;
	}
	public int multiplicar(int a, int b) {
		return 0;
	}
	public int dividir(int a, int b) {
		return 0;
	}
	//------------------------------------------
	
	//Fase de REFACTORIZACIÓN
	//------------------------------------------
	//Metodos a utilizar para las distintas operaciones:
	
		//Resta
			public static int resta (int n1, int n2) {
				int resultado = 0;
				resultado = n1 - n2;
				return resultado;
			}
			//Suma
		  public static int suma  (int n1, int n2) {
			  int resultado = 0 ;
			  resultado = n1 + n2 ;
			  return resultado ;
		  }     
		  //Multiplicación
		  public static int multiplica (int n1, int n2) {
			  int resultado = 0;
			  resultado = n1*n2;
			  return resultado;
		  }
		  //División
		public static int divide (int n1, int n2) {
				  int resultado = 0;
				  resultado = n1/n2;
				  return resultado;
			  
		  }
	//------------------------------------------	
}