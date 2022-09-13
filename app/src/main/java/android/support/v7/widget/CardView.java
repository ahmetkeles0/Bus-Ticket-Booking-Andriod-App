package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class CardView extends View {
    public CardView(Context context) {
        this(context, null);
    }

    public CardView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CardView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
