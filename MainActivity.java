package com.KEQ.tictactoe;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends ActionBarActivity {

	private ImageButton jouerIA; 
	private ImageButton parametre; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		jouerIA = (ImageButton) findViewById(R.id.bouton_jouer);
		parametre = (ImageButton) findViewById(R.id.bouton_parametre);
		
		jouerIA.setOnClickListener(new View.OnClickListener()
		{
        	public void onClick(View arg0) {
        		Intent OptionJeu = new Intent(getApplicationContext(), OptionDePartieActivity.class);
    			startActivity(OptionJeu);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
