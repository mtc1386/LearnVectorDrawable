package com.cuizicheng.exercise.learnvectordrawable;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by cuizicheng on 2017/2/6.
 */

public class DemoVectorDrawableImageView extends ImageView {
    private AnimatedVectorDrawable mMoonToSunDrawable;
    private AnimatedVectorDrawable mSunToMoonDrawable;

    private boolean showMoon;

    public DemoVectorDrawableImageView(Context context) {
        super(context);
        init();
    }

    public DemoVectorDrawableImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DemoVectorDrawableImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public DemoVectorDrawableImageView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        mSunToMoonDrawable = (AnimatedVectorDrawable) getContext().getDrawable(R.drawable.vector_anim_switch_sun_to_moon);
        mMoonToSunDrawable = (AnimatedVectorDrawable) getContext().getDrawable(R.drawable.vector_anim_switch_moon_to_sun);
        setImageDrawable(mSunToMoonDrawable);
        showMoon = false;
    }


    public void toggle() {
        AnimatedVectorDrawable drawable = showMoon ? mMoonToSunDrawable : mSunToMoonDrawable;
        setImageDrawable(drawable);
        drawable.start();

        showMoon = !showMoon;
    }

}
