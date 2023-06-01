import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler_teclado = new Scanner(System.in);
		String nome1 = "Primeiro Valor";
		String nome2 = "Segundo Valor";
		
		System.out.println(nome1 + " \nDigite o primeiro número: ");
		int x = ler_teclado.nextInt();
		System.out.println(nome2 + " \nDigite o segundo número:");
		int y = ler_teclado.nextInt();
		
		int z = x;
		    x = 0;
		x = y;
		    y = 0;
		y = z;
		
		System.out.println("O valor "+ x +" Agora está em "+ nome1);
		System.out.println("O valor "+ y +" Agora está em "+ nome2);
		
		System.out.println("A soma dos dois números é: " + (x+y));
		
		
		
	}
}
