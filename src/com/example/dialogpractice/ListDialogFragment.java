package com.example.dialogpractice;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.DialogFragment;
import android.widget.Toast;

public class ListDialogFragment extends DialogFragment{

	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		builder.setTitle("ÁÐ±ídialog");
		builder.setItems(R.array.color_array, new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				switch(which) {
				case 0:
					Toast.makeText(getActivity(), "Red Clicked", Toast.LENGTH_SHORT).show();
					break;
				case 1:
					Toast.makeText(getActivity(), "Green Clicked", Toast.LENGTH_SHORT).show();
					break;
				case 2:
					Toast.makeText(getActivity(), "Blue Clicked", Toast.LENGTH_SHORT).show();
					break;
				}
				dismiss();
			}
		})
		;
		return builder.create();
	}

}
