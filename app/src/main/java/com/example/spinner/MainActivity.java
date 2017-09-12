package com.example.spinner;

import com.example.spinner.R.string;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		String[]items={"Hi","Hello","Welcome"};

		String[]webs={"Select","Google","yahoo","facebook"};
		Spinner sp=(Spinner)findViewById(R.id.spdata);
		Spinner sp2=(Spinner)findViewById(R.id.spData);
		ArrayAdapter<String>adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item,items);
		sp.setAdapter(adapter);
		ArrayAdapter<String>adapter2=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item,webs);
		sp2.setAdapter(adapter2);
		sp.setOnItemSelectedListener(new OnItemSelectedListener() {
			
			@Override
			public void onItemSelected(AdapterView<?> parent, View arg1, int position, long arg2) {
				String spText=(String) parent.getItemAtPosition(position);
				Toast.makeText(MainActivity.this,spText,5000).show();
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
		});
		sp2.setOnItemSelectedListener(new OnItemSelectedListener() {
			
			@Override
			public void onItemSelected(AdapterView<?> parent, View arg1, int position, long arg2) {
				String spText2=(String) parent.getItemAtPosition(position);
				Toast.makeText(MainActivity.this,spText2,5000).show();
				if(spText2=="Google")
				{
					Intent browse=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));
					startActivity(browse);
				}
				if(spText2=="yahoo")
				{
					Intent browse=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.yahoo.com"));
					startActivity(browse);
				}
				if(spText2=="facebook")
				{
					Intent browse=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.facebook.com"));
					startActivity(browse);
				}
				
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
