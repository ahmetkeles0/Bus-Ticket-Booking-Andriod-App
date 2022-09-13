package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class Toolbar extends View {
    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Toolbar(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
