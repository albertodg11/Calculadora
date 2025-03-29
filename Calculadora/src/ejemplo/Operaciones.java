package ejemplo;
public class Operaciones {
	// Operación sumar
	public int sumar(int a, int b) {
       return a + b;
   }
	
	// Operación restar
	public int restar(int a, int b) {
	    return a - b;
	}
	
	// Operación multiplicar
	public int multiplicar(int a, int b) {
		return a * b;
	}
	
	// Operación dividir
	public int dividir(int a, int b) {
		if (b == 0) {
			System.out.println("Error: No se puede dividir entre 0.");
           return 0;
          
       } else {
           return a / b;
       }
   }
	public static void main(String[] args) {
		// Proyecto calculadora
		
		int a = 5;
		int b = 6;
		
		// Llamamos al método e imprimimos el resultado en consola
		System.out.println("La suma de " + a + " y " + b + " es: " + new Operaciones().sumar(a, b));
	}
}
