
	package com.example.campuscoffeeapp;

    import android.content.Intent;
    import android.content.res.AssetManager;
    import android.os.Bundle;
    import android.support.v7.app.ActionBarActivity;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.view.View;
    import android.widget.TextView;

    import java.io.InputStream;

//import com.example.myfirstapp.R;

	public class ClemensAbout extends ActionBarActivity {

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_clemens_about);
			
			TextView txtFileName = (TextView)findViewById(R.id.about_clemens);
			AssetManager assetManager=getAssets();
			InputStream input;
			try {
				
				input = assetManager.open("about.txt");
				int size = input.available();
				byte[] buffer = new byte [size];
				input.read(buffer);
				input.close();
				
				String text = new String(buffer);
				
				txtFileName.setText(text);
						
				}catch (Exception e) {
				e.printStackTrace();
				return;
			}
		}
		
	public void main(View view) {
	    	
	    	//Intent intent = new Intent(this, MainActivity.class);
	    	//startActivity(intent);
			finish();
			
	    	
	    	
	    }



		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.clemens_about, menu);
			return true;
		}

		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			// Handle action bar item clicks here. The action bar will
			// automatically handle clicks on the Home/Up button, so long
			// as you specify a parent activity in AndroidManifest.xml.
			int id = item.getItemId();
			if (id == R.id.action_settings) {
				return true;
			}
			return super.onOptionsItemSelected(item);
		}
		
		public void homePage(View view){
			//create new activity
			Intent intent = new Intent(this, ClemensPerkHome.class);
			//start next activity
			startActivity(intent);
		}

}
