package br.com.eduardo.cadastro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CadastroPessoal register = new CadastroPessoal();
		register.identification = register;// teste
		Scanner keyboard = new Scanner(System.in);
		Scanner confirm = new Scanner(System.in);

		System.out.println("Enter the data for registration.");
		System.out.print("**************************************\n");
		String s = "N"; // Receive the user's reply.
		String answer = " ";// Receives the response from the user of the response variable.
		while (true) {
			if (s.equals(answer)) {
				System.out.println("Data entry finished!...");
				break;
			}
			System.out.println("Enter the name.");
			register.setCadastroNome(keyboard.next());
			clearBuffer(keyboard);

			System.out.println("Enter the ID...");
			register.setCadastroCpf(keyboard.next());
			clearBuffer(keyboard);
			ArrayList<String> id = new ArrayList<>();
			id.add(register.getCadastroNome());
			id.add(register.getCadastroCpf());

//			System.out.println("Cadastro usuário " + id);

//			for (String ids : id) {
//				System.out.println("Cadastro usuário " + ids);
//			}
//			for (int i = 0; i < id.size(); i++) {
//				System.out.println("Casdastro usuário ");
//			}
//			id.forEach(ids -> {
//				System.out.println("Cadastro");
//				System.out.println(" usuário :" + ids);
//			});
			
			//A seguir a classe Colletions!
			Collections.sort(id);
			System.out.println(id);
			/*
			 * System.out.println("Registered User Name "
			 * +register.getCadastroNome()+" ID USER "+register.getCadastroCpf());
			 */

			System.out.println("Do you want register someone? Y/N");
			answer = confirm.next().toUpperCase();

		}

		keyboard.close();
		confirm.close();
	}

	private static void clearBuffer(Scanner keyboard) {
		if (keyboard.hasNextLine()) {
			keyboard.nextLine();
			
			
		}
	}

}