package com.KEQ.tictactoe;


public class Grille {

	private static Case grille[][];
	
		public Grille(Case tabCase[][])
		{
			grille= tabCase;
		}
		
		
		public boolean fin(Joueur j)
		{
			if (pleine())
				return true;
			if (gagne(j.getSymbol()))
				return true;
			
			return false;
		}
		
		public boolean gagne(int symbol)
		{
			if (gagne_ligne(symbol) || gagne_colone(symbol) || gagne_diagonale(symbol))
				return true;
			
			return false;
		}
		
		private static boolean gagne_ligne(int symbol)
		{
			int i,j;
			int count=0;
			for (i=0; i<3; i++){
				for(j=0; j<3;j++){
					if(grille[i][j].getEtat() == symbol)
						count++;
				}
				if (count==3)
					return true;
				count=0;
			}
			return false;
		}
		
		private static boolean gagne_colone(int symbol)
		{
			int i,j;
			int count=0;
			for (i=0; i<3; i++){
				for(j=0; j<3;j++){
					if(grille[j][i].getEtat() == symbol)
						count++;
				}
				if (count==3)
					return true;
				count=0;
			}
			return false;
		}
		
		private static boolean gagne_diagonale(int symbol)
		{
			if(grille[0][0].getEtat() == symbol && grille[1][1].getEtat() == symbol && grille[2][2].getEtat() == symbol)
				return true;
			if(grille[0][2].getEtat() == symbol && grille[1][1].getEtat() == symbol && grille[2][0].getEtat() == symbol)
				return true;
			
			return false;
		}
		
		public boolean pleine()
		{
			int i,j=0;
			for(i=0; i<3; i++){
				for(j=0;j<3;j++)
					if(grille[i][j].getEtat() == Case.RIEN)
						return false;
			}
			return true;
		}
		
}