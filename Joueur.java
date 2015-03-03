package com.KEQ.tictactoe;


public abstract class Joueur {

	protected String nom;
	protected int symbol;
	protected Grille grille;
	
	public Joueur(String n, int s, Grille g)
	{
		nom = n;
		symbol = s;
		grille = g;
	}
	
	public String getNom()
	{
		return nom;
	}
	
	public int getSymbol()
	{
		return symbol;
	}
	
	public abstract void joue();
	
}
