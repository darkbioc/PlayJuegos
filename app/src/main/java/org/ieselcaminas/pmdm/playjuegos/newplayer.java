package org.ieselcaminas.pmdm.playjuegos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class newplayer extends AppCompatActivity
{

@Override protected void onCreate(Bundle savedInstanceState)
{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_newplayer);
	android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
	setSupportActionBar(toolbar);
}
@Override public boolean onCreateOptionsMenu(Menu menu) {
	MenuInflater inflater = getMenuInflater(); inflater.inflate(R.menu.menu_main, menu); return true;
}

@Override public boolean onOptionsItemSelected(MenuItem item) {
	switch (item.getItemId()) {
		case R.id.action_search:return true;
		case R.id.action_add:return true;
		default:return super.onOptionsItemSelected(item); }
}
}
