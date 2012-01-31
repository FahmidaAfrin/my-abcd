package com.example.learnABCD;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class letterOdetails extends Activity implements OnClickListener
{
	
	
	ImageButton letterP;
	Button mainmenuO;
@Override
protected void onCreate(Bundle savedInstanceState) 
{
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.o);
	
	letterP=(ImageButton)findViewById(R.id.imageButton1);
	mainmenuO=(Button)findViewById(R.id.mainmenuO);
	mainmenuO.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentmainmenuo=new Intent(letterOdetails.this,LearnABCDActivity.class);
			startActivity(Intentmainmenuo);
			
		}
	});
	
	
letterP.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentp=new Intent(letterOdetails.this,letterPdetails.class);
			startActivity(Intentp);			
		}
	});

	
}


@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
