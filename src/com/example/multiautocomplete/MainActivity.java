package com.example.multiautocomplete;

import in.androiddevelopmentanddiscussion.multiautocompletetextview.R;
import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends Activity 
{
	
	MultiAutoCompleteTextView mtv;
	
	String s[]={"John David "," John Smith ","joy Fisher"," peter Roberts","Daniel Smith ","Daniel Martin","Joyce Tyler"," David Bell ","Jacintha Vance","Janet Parker"};
	

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mtv = (MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView1);
		
		mtv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
		
		ArrayAdapter<String> adp = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,s);
		
		mtv.setThreshold(1);
		mtv.setAdapter(adp);
	}

}
