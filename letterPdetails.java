package com.example.learnABCD;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class letterPdetails extends Activity implements OnClickListener
{
	
	
	ImageButton letterQ;
	Button mainmenuP;
@Override
protected void onCreate(Bundle savedInstanceState) 
{
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.p);
	
	letterQ=(ImageButton)findViewById(R.id.imageButton1);
	mainmenuP=(Button)findViewById(R.id.mainmenuP);
	mainmenuP.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentmainmenup=new Intent(letterPdetails.this,LearnABCDActivity.class);
			startActivity(Intentmainmenup);
			
		}
	});
	
	
letterQ.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentq=new Intent(letterPdetails.this,letterQdetails.class);
			startActivity(Intentq);			
		}
	});

	
}


@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
