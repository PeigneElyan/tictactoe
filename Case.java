package com.KEQ.tictactoe;

import android.widget.ImageButton;

public class Case {

	public static final int RIEN = 0;
	public static final int CROIX = 1;
	public static final int ROND = 2;
	
	protected ImageButton image;
	protected int etat;
	
	public Case(ImageButton image) {
		super();
		this.image = image;
		this.etat = RIEN;
	}
	
	public void changerImage(){
		if(etat == RIEN){
			image.setImageResource(R.drawable.croix);
			etat = CROIX;
		}else if(etat == CROIX){
			image.setImageResource(R.drawable.rond);
			etat = ROND;
		}else if(etat == ROND){
			image.setImageResource(R.drawable.rien);
			etat = RIEN;
		}
	}

	public int getEtat() {
		return etat;
	}
	
}
