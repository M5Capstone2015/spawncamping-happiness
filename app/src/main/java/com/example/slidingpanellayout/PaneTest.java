package com.example.slidingpanellayout;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.widget.SlidingPaneLayout;
import android.view.Menu;
import android.view.View;

public class PaneTest extends Activity {
	
	SlidingPaneLayout pane;

    public void OpenPane()
    {
        pane.closePane();
    }

    public void _OpenPane()
    {
        pane.openPane();
    }
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pane_test);
		pane = (SlidingPaneLayout) findViewById(R.id.slidingpanelayout);
		
		pane.setPanelSlideListener(new SlidingPaneLayout.SimplePanelSlideListener()
		{

			@Override
			public void onPanelClosed(View panel) {
				// TODO Auto-generated method stub
				switch (panel.getId()) {
				case R.id.fragment_secondpane:
					getFragmentManager().findFragmentById(R.id.fragment_firstpane).setHasOptionsMenu(false);
					getFragmentManager().findFragmentById(R.id.fragment_secondpane).setHasOptionsMenu(true);
					break;
				default:
					break;
				}
				
			}

			@Override
			public void onPanelOpened(View panel) {
				// TODO Auto-generated method stub
				switch (panel.getId()) {
				case R.id.fragment_secondpane:
					getFragmentManager().findFragmentById(R.id.fragment_firstpane).setHasOptionsMenu(true);
					getFragmentManager().findFragmentById(R.id.fragment_secondpane).setHasOptionsMenu(false);
					break;
				default:
					break;
				}
			}

			@Override
			public void onPanelSlide(View panel, float slideOffset) {
				// TODO Auto-generated method stub
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pane_test, menu);
		return true;
	}

}
