package com.example.learnABCD;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class letterFdetails extends Activity implements OnClickListener
{
	
	
	ImageButton letterG;
	Button mainmenuf;
@Override
protected void onCreate(Bundle savedInstanceState) 
{
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.f);
	
	letterG=(ImageButton)findViewById(R.id.imageButton1);
	mainmenuf=(Button)findViewById(R.id.mainmenuF);
	mainmenuf.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentmainmenuf=new Intent(letterFdetails.this,LearnABCDActivity.class);
			startActivity(Intentmainmenuf);
			
		}
	});
	
	
letterG.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentg=new Intent(letterFdetails.this,letterGdetails.class);
			startActivity(Intentg);			
		}
	});

	
}


@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
