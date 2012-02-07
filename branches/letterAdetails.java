package com.example.learnABCD;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class letterAdetails extends Activity implements OnClickListener
{
	Button MainmenuA;
	ImageButton letterB;
  @Override
protected void onCreate(Bundle savedInstanceState)
  {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.a);
	letterB=(ImageButton)findViewById(R.id.imageButton1);
	MainmenuA=(Button)findViewById(R.id.mainmenuA);
	MainmenuA.setOnClickListener(new OnClickListener() 
	{
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent IntentMainmenua=new Intent(letterAdetails.this,LearnABCDActivity.class);
			startActivity(IntentMainmenua);
		}
	});
	
letterB.setOnClickListener(new OnClickListener()
{
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentb=new Intent(letterAdetails.this,letterBdetails.class);
			startActivity(Intentb);			
		}
	});

}
@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	
}
    
}
