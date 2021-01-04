package codinGame;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciceCodinGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Saisissez une somme :");
		String somme = in.next();
		//Supprime les '+' de la somme saisie
		String[] sommeSplit = somme.split("\\+");
		String sommeTrier = "";
		//Création de notre tableau d'entier
		int[] sommeSplitConvertToInt = new int[sommeSplit.length];
		for (int i = 0; i < sommeSplitConvertToInt.length; i++) {
			//Copie notre nombre dans notre tableau d'entier 
			sommeSplitConvertToInt[i] = Integer.parseInt(sommeSplit[i]);
		}
		//Range le tableau d'entier par ordre décroissant
		Arrays.sort(sommeSplitConvertToInt);
		//Création de notre résultat 
		for (int i = 0; i < sommeSplitConvertToInt.length; i++) {
			//Si il s'agit du dernier nombre de notre tableau d'entier 
			if(i == sommeSplitConvertToInt.length-1 ) {
				sommeTrier += sommeSplitConvertToInt[i];
			}else {
				sommeTrier += sommeSplitConvertToInt[i] + "+";
			}
		}
		System.out.println(sommeTrier);
	}

}
