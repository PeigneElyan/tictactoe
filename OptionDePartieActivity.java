package com.KEQ.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class OptionDePartieActivity extends Activity {

	private EditText nomJ1;
	private EditText nomJ2;
	private RadioButton rb_croix;
	private RadioButton rb_rond;
	private Button start;
	
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.jeu_activity); 
	        
	        	        
	        start = (Button) findViewById(R.id.start_game);
	        nomJ1 = (EditText) findViewById(R.id.edit_nomJ1);
	        nomJ2 = (EditText) findViewById(R.id.edit_nomJ2);
	        rb_croix = (RadioButton) findViewById(R.id.rb_croix);
	        rb_rond = (RadioButton) findViewById(R.id.rb_rond);   
	        
			start.setOnClickListener(new View.OnClickListener()
			{
	        	public void onClick(View arg0) {
	        		Intent Jeu = new Intent(getApplicationContext(), JeuActivity.class);
	        		Jeu.putExtra("NomJ1", nomJ1.getText().toString());
	        		Jeu.putExtra("NomJ2", nomJ2.getText().toString());
	        		Jeu.putExtra("Rond", rb_rond.isActivated());
	    			startActivity(Jeu);
				}
			});
	    }
}
