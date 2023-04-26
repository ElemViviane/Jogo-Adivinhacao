import java.util.Random;
import java.util.Scanner;
//Código feito por Elem e Paulo.
public class JogoAdivinhacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroGerado = new Random().nextInt(10);
		int tentativas = 0;
		int numeroDigitado = 0;
		
		while (tentativas < 5) {
			System.out.println("Informe um número entre 0 e 10: ");
		    numeroDigitado = sc.nextInt();
			tentativas++;
			
			if (numeroDigitado == numeroGerado) {
				System.out.println("Parabéns você acertou!");
				System.out.print("Você acertou em: " + tentativas + " tentativas");
				break;
				
			} else if (numeroDigitado < numeroGerado) {
				System.out.println("Número digitado é menor que o número gerado!");
				
			} else {
				System.out.println("O número digitado é maior que o número gerado!");
			}
		}
		   if (numeroGerado != numeroDigitado) {
			   System.out.println("Você não acertou! o número gerado era o: " + numeroGerado);
			   
		   }
		}
	}
