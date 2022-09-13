package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class TextInputLayout extends View {
    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TextInputLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
