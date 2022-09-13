package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class AppBarLayout extends View {
    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AppBarLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
