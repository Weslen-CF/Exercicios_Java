package applicantion;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Notas aluno = new Notas();
		
		aluno.name = sc.nextLine();
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		
		if (aluno.finalGrade() > 60.0) {
		System.out.printf("FINAL GRADE = %.2f%n", aluno.finalGrade());
		System.out.println("Pass");
		}
		else {
		System.out.printf("Final GRADE = %.2f%n", aluno.finalGrade());	
		System.out.println("FAILED");
		System.out.printf("MISSING %.2f POINTS%n", aluno.missingPoints());
		}
		
		
		sc.close();

	}

}
