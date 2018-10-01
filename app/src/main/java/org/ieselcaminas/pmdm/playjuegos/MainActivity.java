package org.ieselcaminas.pmdm.playjuegos;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

	@Override protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button buttonNewPlayer = findViewById(R.id.buttonNewPlayer);
		Button buttonPreferences = findViewById(R.id.buttonPreferences);
		Button buttonPlay =  findViewById(R.id.buttonPlay);
		android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		TextView titulo = (TextView) findViewById(R.id.textTitle);

		titulo.setTypeface(Typeface.createFromAsset(getAssets(), "Serpentine.ttf"));


		buttonNewPlayer.setOnClickListener(new View.OnClickListener()
		{
			@Override public void onClick(View v)
			{
				Intent intent = new Intent(getApplicationContext(),newplayer.class);
				startActivity(intent);
			}
		});

		buttonPreferences.setOnClickListener(new View.OnClickListener()
		{
			@Override public void onClick(View v)
			{
				Intent intent = new Intent(getApplicationContext(),preferencias.class);
				startActivity(intent);
			}
		});

		buttonPlay.setOnClickListener(new View.OnClickListener()
		{
			@Override public void onClick(View v)
			{
				Intent intent = new Intent(getApplicationContext(),games.class);
				startActivity(intent);
			}
		});

	}

	@Override public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater inflater = getMenuInflater(); inflater.inflate(R.menu.menu_main, menu); return true;
	}

	@Override public boolean onOptionsItemSelected(MenuItem item)
	{
		switch (item.getItemId())
		{
			case R.id.action_search:return true;
			case R.id.action_add:return true;
			default:return super.onOptionsItemSelected(item);
		}
	}
}
