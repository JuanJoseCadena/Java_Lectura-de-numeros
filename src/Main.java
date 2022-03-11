
import java.math.BigInteger;
import java.util.Scanner;

public class Main 
{
	
	public static void main(String[] args) 
	{
		
		System.out.println("Escribe un n�mero entero entre 1 y 9999999999999. Sin comas, puntos ni espacios");
		
		Scanner lector = new Scanner(System.in);
		
		BigInteger num = new BigInteger("0");
		
		try {
			
			String dato = lector.nextLine();
			
			if (dato.trim().equals("")) 
			{
				System.out.println("No se ha detectado ningun valor. Por favor, vuelve a intentarlo introduciendo un n�mero entero entre 1 y 9999999999999");
				System.exit(0);
			}
			
			num = num.add(new BigInteger(dato));
			
			BigInteger min = new BigInteger("1");
		
			BigInteger max = new BigInteger("9999999999999");
		
			int x = num.compareTo(max);
		
			int y = num.compareTo(min);
		
			if (y==-1) 
			{
				System.out.println("El n�mero introducido es demasiado peque�o, por favor introduzca un n�mero entero mayor o igual a 1");
			}
			else
				if(x==1) 
				{
					System.out.println("El n�mero introducido es demasiado grande, por favor introduzca un n�mero entero menor o igual a 9999999999999");
				}
				else
				{
					System.out.println("El n�mero introducido es: " + num);
				
					String digitos = num.toString();
					System.out.println("El n�mero introducido tiene: " + digitos.length() + " digitos");
					
					String inverso="";
						for (int i = digitos.length()-1; i>=0; i--) 
						{
							inverso += digitos.charAt(i);
						}
					
						System.out.println("El inverso del n�mero introducido es: " + inverso);
				}
		
		
		}
		catch(Exception e) {
		
			System.out.println("Se ha introducido un valor que no corresponde a un n�mero entero, por favor vuelve a intentarlo introduciendo un n�mero entero");
		}
		
	}


}
