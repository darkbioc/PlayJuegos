package org.ieselcaminas.pmdm.playjuegos;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class games extends AppCompatActivity
{
	ArrayList<String> selections = new ArrayList<String>();
	CheckBox checkAngry,checkDragon,checkHill,checkRadiant,checkSoccer,checkNinja;
	CheckBox[] checkBoxes = new CheckBox[6];
	ArrayList<String> optionsList = new ArrayList<String>();
	FloatingActionButton fab;
	String options="";
	@Override protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_games);
		android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		checkAngry=findViewById(R.id.checkAngry);
		checkDragon=findViewById(R.id.checkDragon);
		checkHill=findViewById(R.id.checkHill);
		checkRadiant=findViewById(R.id.checkRadiant);
		checkSoccer=findViewById(R.id.checkSoccer);
		checkNinja=findViewById(R.id.checkNinja);
		checkBoxes[0]=checkAngry;
		checkBoxes[1]=checkDragon;
		checkBoxes[2]=checkHill;
		checkBoxes[3]=checkRadiant;
		checkBoxes[4]=checkSoccer;
		checkBoxes[5]=checkNinja;
		fab=findViewById(R.id.floatingActionButton4);
		fab.setOnClickListener(new View.OnClickListener()
		{
			@Override public void onClick(View v)
			{
				optionsList.clear();
				checkCheckeds();
				if(optionsList.isEmpty())
				{
					Toast.makeText(getApplicationContext(),"No hay selección",Toast.LENGTH_SHORT).show();
				}
				else
				{
					options = "";
					for(String s: optionsList)
					{
						options=options+s+" ";
					}
					Toast.makeText(getApplicationContext(),options,Toast.LENGTH_SHORT).show();

				}
			}
		});

	}

	public void checkCheckeds()
	{
		for(int i = 0;i<checkBoxes.length;i++)
		{
			if(checkBoxes[i].isChecked())
			{
				optionsList.add(checkBoxes[i].getText().toString());
			}
		}
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
