package com.KEQ.tictactoe;

import java.util.Scanner;


public class JoueurHumain extends Joueur {

	public JoueurHumain(String n, int s, Grille g) {
		super(n, s, g);
	}

	public void joue()
	{
		int coordx = 10, coordy = 10;
		Scanner sc = new Scanner(System.in);
		while(coordx<1 || coordx>3)
		{
			System.out.print(nom+" Entrez la ligne : ");
			coordx = sc.nextInt();
		}
		while(coordy<1 || coordy>3)
		{
			System.out.print(nom+" Entrez la colonne : ");
			coordy = sc.nextInt();
		}
		//if (!grille.cocher(symbol, coordx-1, coordy-1))
				joue();
	}
}
