package com.example.slidingpanellayout;

import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.support.v4.widget.SlidingPaneLayout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

public class FirstPane extends Fragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v = inflater.inflate(R.layout.activity_first_pane, container, false);
        Button b = (Button) v.findViewById(R.id.closeButton);
        b.setOnClickListener(listener);
		return v;
	}

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ((PaneTest) getActivity()).OpenPane();
        }
    };



	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		// Inflate the menu; this adds items to the action bar if it is present.
		inflater.inflate(R.menu.first_pane, menu);
		super.onCreateOptionsMenu(menu, inflater);
	}

}
