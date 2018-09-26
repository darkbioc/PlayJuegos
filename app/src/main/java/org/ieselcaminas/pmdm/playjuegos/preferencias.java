package org.ieselcaminas.pmdm.playjuegos;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

public class preferencias extends AppCompatActivity
{
	String option="";
	RadioGroup rGroup;
	SeekBar sBar;
	RatingBar rBar;
	FloatingActionButton fab;
	@Override protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_preferencias);
		android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		rGroup = (RadioGroup) findViewById(R.id.radioGroup);
		sBar = findViewById(R.id.seekBar);
		rBar = findViewById(R.id.ratingBar);
		fab = findViewById(R.id.floatingActionButton);
		rGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()

		{

			public void onCheckedChanged(RadioGroup rGroup, int checkedId)

			{

				RadioButton checkedRadioButton = (RadioButton)rGroup.findViewById(checkedId);

				option = checkedRadioButton.getText().toString();

			}

		});
		sBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
		{
			@Override public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
			{
				rBar.setRating((float)sBar.getProgress());
			}

			@Override public void onStartTrackingTouch(SeekBar seekBar)
			{

			}

			@Override public void onStopTrackingTouch(SeekBar seekBar)
			{

			}
		});
		rBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener()
		{
			@Override public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser)
			{
				sBar.setProgress((int)rating);
			}
		});
		fab.setOnClickListener(new View.OnClickListener()
		{
			@Override public void onClick(View v)
			{
				if(option.equals(""))
				{
					Toast.makeText(getApplicationContext(),"No has pulsado ninguna opción",Toast.LENGTH_SHORT).show();
				}
				else
				{
					Toast.makeText(getApplicationContext(),option+". Puntuación: "+(int)rBar.getRating(),Toast.LENGTH_SHORT).show();
				}
			}
		});

	}
}
