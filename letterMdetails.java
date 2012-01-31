package com.example.learnABCD;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class letterMdetails extends Activity implements OnClickListener
{
	
	
	ImageButton letterN;
	Button mainmenuM;
@Override
protected void onCreate(Bundle savedInstanceState) 
{
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.m);
	
	letterN=(ImageButton)findViewById(R.id.imageButton1);
	mainmenuM=(Button)findViewById(R.id.mainmenuM);
	mainmenuM.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentmainmenum=new Intent(letterMdetails.this,LearnABCDActivity.class);
			startActivity(Intentmainmenum);
			
		}
	});
	
	
letterN.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentn=new Intent(letterMdetails.this,letterNdetails.class);
			startActivity(Intentn);			
		}
	});

	
}


@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
