package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class CoordinatorLayout extends View {
    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CoordinatorLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
