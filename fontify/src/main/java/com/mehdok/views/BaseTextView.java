package com.mehdok.views;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * @author mehdok (mehdok@gmail.com) on 6/2/2017.
 */

public abstract class BaseTextView extends AppCompatTextView {
    public BaseTextView(Context context) {
        super(context);
    }

    public BaseTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    protected void init(FontType fontType) {
        Typeface typeface = TypefaceUtil.getInstance().getTypeFace(getContext(), fontType);

        if (typeface != null) {
            setTypeface(typeface);
        }
    }
}
