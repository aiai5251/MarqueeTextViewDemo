package com.lvmama.www.marqueetextviewdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by shiyaorong on 15/12/15.
 */
public class MarqueeText extends TextView {
    public MarqueeText(Context context) {
        super(context);
    }

    public MarqueeText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MarqueeText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    //一个view上使用一次，重写这个TextView，就可以让所有textView都承载这个方法
    @Override
    public boolean isFocused() {
        return true;
    }

}
