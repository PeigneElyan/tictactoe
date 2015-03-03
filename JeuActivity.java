package com.KEQ.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class JeuActivity extends Activity{
	
	private ImageButton b1;
	private ImageButton b2;
	private ImageButton b3;
	private ImageButton b4;
	private ImageButton b5;
	private ImageButton b6;
	private ImageButton b7;
	private ImageButton b8;
	private ImageButton b9;
	private Case c1;
	private Case c2;
	private Case c3;
	private Case c4;
	private Case c5;
	private Case c6;
	private Case c7;
	private Case c8;
	private Case c9;
	private Grille grille;

	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.jeu_activity); 
	        
	        Bundle extras = getIntent().getExtras();
	        String nomJ1 = extras.getString("StringKey");
	        String nomJ2 = extras.getString("StringKey");
	        	        
	        b1 = (ImageButton) findViewById(R.id.image1);
	        b2 = (ImageButton) findViewById(R.id.image2);
	        b3 = (ImageButton) findViewById(R.id.image3);
	        b4 = (ImageButton) findViewById(R.id.image4);
	        b5 = (ImageButton) findViewById(R.id.image5);
	        b6 = (ImageButton) findViewById(R.id.image6);
	        b7 = (ImageButton) findViewById(R.id.image7);
	        b8 = (ImageButton) findViewById(R.id.image8);
	        b9 = (ImageButton) findViewById(R.id.image9);       
	        
			b1.setOnClickListener(new View.OnClickListener()
			{
	        	public void onClick(View arg0) {
	        		c1.changerImage();
				}
			});
			b2.setOnClickListener(new View.OnClickListener()
			{
	        	public void onClick(View arg0) {
	        		c2.changerImage();
				}
			});
			b3.setOnClickListener(new View.OnClickListener()
			{
	        	public void onClick(View arg0) {
	        		c3.changerImage();
				}
			});
			b4.setOnClickListener(new View.OnClickListener()
			{
	        	public void onClick(View arg0) {
	        		c4.changerImage();
				}
			});
			b5.setOnClickListener(new View.OnClickListener()
			{
	        	public void onClick(View arg0) {
	        		c5.changerImage();
				}
			});
			b6.setOnClickListener(new View.OnClickListener()
			{
	        	public void onClick(View arg0) {
	        		c6.changerImage();
				}
			});
			b7.setOnClickListener(new View.OnClickListener()
			{
	        	public void onClick(View arg0) {
	        		c7.changerImage();
				}
			});
			b8.setOnClickListener(new View.OnClickListener()
			{
	        	public void onClick(View arg0) {
	        		c8.changerImage();
				}
			});
			b9.setOnClickListener(new View.OnClickListener()
			{
	        	public void onClick(View arg0) {
	        		c9.changerImage();
				}
			});
			
			
			c1 = new Case(b1);
	        c2 = new Case(b2);
	        c3 = new Case(b3);
	        c4 = new Case(b4);
	        c5 = new Case(b5);
	        c6 = new Case(b6);
	        c7 = new Case(b7);
	        c8 = new Case(b8);
	        c9 = new Case(b9);
	        
	        Case tabCase[][] = new Case[3][3];
	        tabCase[1][1] = c1;
	        tabCase[1][2] = c2;
	        tabCase[1][3] = c3;
	        tabCase[2][1] = c4;
	        tabCase[2][2] = c5;
	        tabCase[2][3] = c6;
	        tabCase[3][1] = c7;
	        tabCase[3][2] = c8;
	        tabCase[3][3] = c9;
	        
	        grille = new Grille(tabCase);
	    }
}
