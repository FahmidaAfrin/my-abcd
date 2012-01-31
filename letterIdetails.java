package com.example.learnABCD;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class letterIdetails extends Activity implements OnClickListener
{
	
	
	ImageButton letterJ;
	Button mainmenuI;
@Override
protected void onCreate(Bundle savedInstanceState) 
{
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.i);
	
	letterJ=(ImageButton)findViewById(R.id.imageButton1);
	mainmenuI=(Button)findViewById(R.id.mainmenuI);
	mainmenuI.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentmainmenui=new Intent(letterIdetails.this,LearnABCDActivity.class);
			startActivity(Intentmainmenui);
			
		}
	});
	
	
letterJ.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentj=new Intent(letterIdetails.this,letterJdetails.class);
			startActivity(Intentj);			
		}
	});

	
}


@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
