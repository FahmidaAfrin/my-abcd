package com.example.learnABCD;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class letterHdetails extends Activity implements OnClickListener
{
		ImageButton letterI;
	Button mainmenuH;
@Override
protected void onCreate(Bundle savedInstanceState) 
{
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.h);
	
	letterI=(ImageButton)findViewById(R.id.imageButton1);
	mainmenuH=(Button)findViewById(R.id.mainmenuH);
	mainmenuH.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentmainmenuh=new Intent(letterHdetails.this,LearnABCDActivity.class);
			startActivity(Intentmainmenuh);
			
		}
	});
	
	
letterI.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intenti=new Intent(letterHdetails.this,letterIdetails.class);
			startActivity(Intenti);			
		}
	});

	
}


@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
