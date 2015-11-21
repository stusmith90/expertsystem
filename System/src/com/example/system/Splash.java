package com.example.system;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle Splashisexecuted) {
		// TODO Auto-generated method stub
		super.onCreate(Splashisexecuted);
		
		setContentView(R.layout.splash);
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(5000);
					
				} catch (InterruptedException e){
					
					e.printStackTrace();
					
				}finally{
					Intent openSystem = new Intent("com.example.system.MENU");
					startActivity(openSystem);
					
				}
			}
		};
		timer.start();
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
	
	
	

}
