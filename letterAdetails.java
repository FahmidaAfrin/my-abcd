package com.example.learnABCD;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class letterAdetails extends Activity implements OnClickListener
{
	Button Mainmenu;
  @Override
protected void onCreate(Bundle savedInstanceState)
  {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.a);
	Mainmenu=(Button)findViewById(R.id.Mainmenua);
	Mainmenu.setOnClickListener(new OnClickListener() 
	{
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent IntentMainmenu=new Intent(letterAdetails.this,LearnABCDActivity.class);
			startActivity(IntentMainmenu);
		}
	});
}
@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	
}
    
}

