import java.util.Scanner;
 class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int num = 1;
		int total = 0;
		
		
		while (num < 11) {
		    System.out.println("Digite a nota "+ num+":");
		    int nota = sc.nextInt();
		     total = total + nota;
		        num = num + 1;
		        
		  }
	
		int media = total/10;
		System.out.println("Media das notas: " + media);
	
		    sc.close();
	}

	  }
