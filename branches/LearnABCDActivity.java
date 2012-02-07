package com.example.learnABCD;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class LearnABCDActivity extends Activity implements OnClickListener
{
	ImageButton A;
	ImageButton B;
	ImageButton C;
	ImageButton D;
	ImageButton E;
	ImageButton F;
	ImageButton G;
	ImageButton H;
	ImageButton I;
	ImageButton J;
	ImageButton K;
	ImageButton L;
	ImageButton M;
	ImageButton N;
	ImageButton O;
	ImageButton P;
	ImageButton Q;
	ImageButton r;
	ImageButton S;
	ImageButton T;
	ImageButton U;
	ImageButton V;
	ImageButton W;
	ImageButton X;
	ImageButton Y;
	ImageButton Z;
	
	
	
    /*Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        A=(ImageButton)findViewById(R.id.imageButton1);
        B=(ImageButton)findViewById(R.id.imageButton2);
        C=(ImageButton)findViewById(R.id.imageButton3);
        D=(ImageButton)findViewById(R.id.imageButton4);
        E=(ImageButton)findViewById(R.id.imageButton5);
        F=(ImageButton)findViewById(R.id.imageButton6);
        G=(ImageButton)findViewById(R.id.imageButton7);
        H=(ImageButton)findViewById(R.id.imageButton8);
        I=(ImageButton)findViewById(R.id.imageButton9);
        J=(ImageButton)findViewById(R.id.imageButton10);
        K=(ImageButton)findViewById(R.id.imageButton11);
        L=(ImageButton)findViewById(R.id.imageButton12);
        M=(ImageButton)findViewById(R.id.imageButton13);
        N=(ImageButton)findViewById(R.id.imageButton14);
        O=(ImageButton)findViewById(R.id.imageButton15);
        P=(ImageButton)findViewById(R.id.imageButton16);
        Q=(ImageButton)findViewById(R.id.imageButton17);
        r=(ImageButton)findViewById(R.id.imageButton18);
        S=(ImageButton)findViewById(R.id.imageButton19);
        T=(ImageButton)findViewById(R.id.imageButton20);
        U=(ImageButton)findViewById(R.id.imageButton21);
        V=(ImageButton)findViewById(R.id.imageButton22);
        W=(ImageButton)findViewById(R.id.imageButton23);
        X=(ImageButton)findViewById(R.id.imageButton24);
        Y=(ImageButton)findViewById(R.id.imageButton25);
        Z=(ImageButton)findViewById(R.id.imageButton26);
        
        A.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentA=new Intent(LearnABCDActivity.this,letterAdetails.class);
				startActivity(IntentA);
			}
		});
        
        B.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent IntentB=new Intent(LearnABCDActivity.this,letterBdetails.class);
			startActivity(IntentB);
			}
		});
        
        
        C.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent IntentC=new Intent(LearnABCDActivity.this,letterCdetails.class);
			startActivity(IntentC);
			}
		});
        
        
        D.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentD=new Intent(LearnABCDActivity.this,letterDdetails.class);
				startActivity(IntentD);
			}
		});
        
        E.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentE=new Intent(LearnABCDActivity.this,letterEdetails.class);
				startActivity(IntentE);
			}
		});

        F.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentF=new Intent(LearnABCDActivity.this,letterFdetails.class);
				startActivity(IntentF);
			}
		});
        G.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentG=new Intent(LearnABCDActivity.this,letterGdetails.class);
				startActivity(IntentG);
			}
		});
        
        H.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentH=new Intent(LearnABCDActivity.this,letterHdetails.class);
				startActivity(IntentH);
			}
		});
        
        I.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentI=new Intent(LearnABCDActivity.this,letterIdetails.class);
				startActivity(IntentI);
			}
		});
        
        J.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentJ=new Intent(LearnABCDActivity.this,letterJdetails.class);
				startActivity(IntentJ);
			}
		});
        
        K.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentK=new Intent(LearnABCDActivity.this,letterKdetails.class);
				startActivity(IntentK);
			}
		});
        L.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentL=new Intent(LearnABCDActivity.this,letterLdetails.class);
				startActivity(IntentL);
			}
		});
        
        M.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentM=new Intent(LearnABCDActivity.this,letterMdetails.class);
				startActivity(IntentM);
			}
		});
        
        N.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentN=new Intent(LearnABCDActivity.this,letterNdetails.class);
				startActivity(IntentN);
			}
		});
        
        O.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentO=new Intent(LearnABCDActivity.this,letterOdetails.class);
				startActivity(IntentO);
			}
		});
        
        P.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentP=new Intent(LearnABCDActivity.this,letterPdetails.class);
				startActivity(IntentP);
			}
		});
        
        Q.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentQ=new Intent(LearnABCDActivity.this,letterQdetails.class);
				startActivity(IntentQ);
			}
		});
        r.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent Intentr=new Intent(LearnABCDActivity.this,letterRdetails.class);
				startActivity(Intentr);
			}
		});
        
        S.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentS=new Intent(LearnABCDActivity.this,letterSdetails.class);
				startActivity(IntentS);
			}
		});
        T.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentT=new Intent(LearnABCDActivity.this,letterTdetails.class);
				startActivity(IntentT);
			}
		});
        
        U.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentU=new Intent(LearnABCDActivity.this,letterUdetails.class);
				startActivity(IntentU);
			}
		});
        
        V.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentV=new Intent(LearnABCDActivity.this,letterVdetails.class);
				startActivity(IntentV);
			}
		});
        
        W.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentW=new Intent(LearnABCDActivity.this,letterWdetails.class);
				startActivity(IntentW);
			}
		});
        
        X.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentX=new Intent(LearnABCDActivity.this,letterXdetails.class);
				startActivity(IntentX);
			}
		});
        Y.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentY=new Intent(LearnABCDActivity.this,letterYdetails.class);
				startActivity(IntentY);
			}
		});
        
        Z.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentZ=new Intent(LearnABCDActivity.this,letterZdetails.class);
				startActivity(IntentZ);
			}
		});
      }


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}


}