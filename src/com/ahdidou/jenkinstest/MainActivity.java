package com.ahdidou.jenkinstest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
/**
 * 
 * @author ahdidou Mohamed
 *
 */
public class MainActivity extends Activity {
	//Commentaire
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/**
	 * updated Public Methode+Value
	 */
	public void publicMethode(int value) {
		
	}

}
