package com.exercise19stacksandheaps;

import java.util.Stack;
public class StacksandHeaps {

	public static void main(String[] args) 
	{
	//Variables declaration 	
		String cad= "Au fond j'crois qu'la Terre est ronde\r\n" + 
				"Pour une seule bonne raison\r\n" + 
				"Après avoir fait l'tour du monde\r\n" + 
				"Tout ce qu'on veut c'est être à la maison\r\n" + 
				"T'as besoin d'une voiture pour aller travailler\r\n" + 
				"Tu travailles pour rembourser la voiture que tu viens d'acheter (viens d'acheter)\r\n" + 
				"Tu vois l'genre de cercle vicieux\r\n" + 
				"Le genre de truc qui donne envie de tout faire sauf de mourir vieux ('rir vieux)\r\n" + 
				"Tu peux courir à l'infini\r\n" + 
				"À la poursuite du bonheur la Terre est ronde autant l'attendre ici ('tendre ici)\r\n" + 
				"J'suis pas feignant mais j'ai la flemme\r\n" + 
				"Et ça va finir en arrêt maladie pour toute la semaine ('te la semaine)\r\n" + 
				"J'veux profiter des gens que j'aime\r\n" + 
				"J'veux prendre le temps avant qu'le temps me prenne et m'emmène (et m'emmène)\r\n" + 
				"J'ai des centaines de trucs sur le feu\r\n" + 
				"Mais je ferai juste ce que je veux quand même\r\n" + 
				"Au fond j'crois qu'la Terre est ronde\r\n" + 
				"Pour une seule bonne raison\r\n" + 
				"Après avoir fait l'tour du monde\r\n" + 
				"Tout ce qu'on veut c'est être à la maison";
		
		
		
		Stack<Character> letters = new Stack<Character>();
		char[] lettersArray = cad.toCharArray();
		
			for(Character c: lettersArray)
			{
				if(Character.toUpperCase(c)=='A')
				{
					letters.push(c);
				}
			}
			while(!letters.isEmpty())
			{
				System.out.println(letters.pop());
			}
	}

}
