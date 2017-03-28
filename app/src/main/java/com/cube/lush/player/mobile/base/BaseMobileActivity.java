package com.cube.lush.player.mobile.base;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Base activity that performs actions common to all activities in the app.
 */
public class BaseMobileActivity extends AppCompatActivity
{
    @Override
    protected void attachBaseContext(Context newBase)
    {
        // Context wrapper to apply custom fonts
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}