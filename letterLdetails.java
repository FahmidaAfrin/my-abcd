package com.example.learnABCD;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class letterLdetails extends Activity implements OnClickListener
{
	
	
	ImageButton letterM;
	Button mainmenuL;
@Override
protected void onCreate(Bundle savedInstanceState) 
{
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.m);
	
	letterM=(ImageButton)findViewById(R.id.imageButton1);
	mainmenuL=(Button)findViewById(R.id.mainmenuL);
	mainmenuL.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentmainmenul=new Intent(letterLdetails.this,LearnABCDActivity.class);
			startActivity(Intentmainmenul);
			
		}
	});
	
	
letterM.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentm=new Intent(letterLdetails.this,letterMdetails.class);
			startActivity(Intentm);			
		}
	});

	
}


@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}

