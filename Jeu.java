package com.KEQ.tictactoe;




public class Jeu {

	private Grille grille;
	private Joueur p1,p2;
	
	public Jeu(int vs)
	{
		//grille = new Grille();
		if(vs == 0)
		{
			p1 = new JoueurHumain("Joueur 1",'X',grille);
			p2 = new JoueurHumain("Joueur 2",'O',grille);
		}
/*		if(vs == 1)	// L'humain commence
		{
			p1 = new JoueurHumain("Joueur 1",'X',grille);
			p2 = new JoueurIA("HAL 9000",'O',grille);
		}
		else	// L'IA commence
		{
			p2 = new JoueurHumain("Joueur 1",'X',grille);
			p1 = new JoueurIA("IHAL 9000",'O',grille);
		}
*/	}
	

	
	public boolean LanceJeu()	// Retourn vrai si il y a un vainqueur, faux si match nul
	{
		int count=0;	//Nombre de cases remplies
		while(count<9)
		{
			//grille.afficher();
			p1.joue();
			if(grille.gagne(p1.getSymbol()))
			{
				System.out.println("Vainqueur: "+p1.getNom());
				return true;
			}
			count++;
			if(count<9)	
			{
				//grille.afficher();
				p2.joue();
				if(grille.gagne(p2.getSymbol()))
				{
					System.out.println("Vainqueur: "+p2.getNom());
					return true;
				}		
				count++;
			}
		}
		System.out.println("Match nul");
		return false;
		
	}
	
}
