package com.example.learnABCD;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class letterCdetails extends Activity implements OnClickListener
{
	
	
	ImageButton letterD;
	Button mainmenuC;
@Override
protected void onCreate(Bundle savedInstanceState) 
{
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.c);
	
	letterD=(ImageButton)findViewById(R.id.imageButton1);
	mainmenuC=(Button)findViewById(R.id.mainmenuC);
	mainmenuC.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentmainmenuc=new Intent(letterCdetails.this,LearnABCDActivity.class);
			startActivity(Intentmainmenuc);
			
		}
	});
	
	
letterD.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentd=new Intent(letterCdetails.this,letterDdetails.class);
			startActivity(Intentd);			
		}
	});

	
}


@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}

