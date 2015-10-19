package com.example.dialogpractice;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	private Button startDialog;
	private Button startListDialog;
	private Button startLayoutDialog;
	private Button startTimerpickerDialog;
	private Button startDatepickerDialog;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        startDialog = (Button) findViewById(R.id.start_dialog);
        startListDialog = (Button) findViewById(R.id.start_list_dialog);
        startLayoutDialog = (Button) findViewById(R.id.start_layout_dialog);
        startTimerpickerDialog = (Button) findViewById(R.id.start_timepicker_dialog);
        startDatepickerDialog = (Button) findViewById(R.id.start_datepicker_dialog);
        
        startDialog.setOnClickListener(this);
        startListDialog.setOnClickListener(this);
        startLayoutDialog.setOnClickListener(this);
        startTimerpickerDialog.setOnClickListener(this);
        startDatepickerDialog.setOnClickListener(this);
        
    }

	@Override
	public void onClick(View v) {
		switch(v.getId()) {
		case R.id.start_dialog:
			ShareDialogFragment dialog = new ShareDialogFragment();
			dialog.show(getFragmentManager(), "share_dialog");
			break;
		case R.id.start_list_dialog:
			ListDialogFragment listDialog = new ListDialogFragment();
			listDialog.show(getFragmentManager(), "list_dialog");
			break;
		case R.id.start_layout_dialog:
			LayoutDialogFragment layoutDialot = new LayoutDialogFragment();
			layoutDialot.show(getFragmentManager(), "layout_dialog");
			break;
		case R.id.start_timepicker_dialog:
			TimePickerFragment tpFragment = new TimePickerFragment();
			tpFragment.show(getFragmentManager(), "timerpicker_dialog");
			break;
		case R.id.start_datepicker_dialog:
			DatePickerFragment dpFragment = new DatePickerFragment();
			dpFragment.show(getFragmentManager(), "datepicker_dialog");
			break;
		default:
			break;
		
		}
	}

    
}
