package com.example.learnABCD;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class letterDdetails extends Activity implements OnClickListener
{
	
	
	ImageButton letterE;
	Button mainmenuD;
@Override
protected void onCreate(Bundle savedInstanceState) 
{
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.d);
	
	letterE=(ImageButton)findViewById(R.id.imageButton1);
	mainmenuD=(Button)findViewById(R.id.mainmenuD);
	mainmenuD.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentmainmenud=new Intent(letterDdetails.this,LearnABCDActivity.class);
			startActivity(Intentmainmenud);
			
		}
	});
	
	
letterE.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intente=new Intent(letterDdetails.this,letterEdetails.class);
			startActivity(Intente);			
		}
	});

	
}


@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
