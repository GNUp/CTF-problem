// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.widget:
//            ai

public static class h extends android.view.roup.MarginLayoutParams
{

    public float g;
    public int h;

    public rams(int i, int j)
    {
        super(i, j);
        h = -1;
        g = 0.0F;
    }

    public g(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = -1;
        context = context.obtainStyledAttributes(attributeset, android.support.v7.a.inearLayoutCompat_Layout);
        g = context.getFloat(android.support.v7.a.inearLayoutCompat_Layout_android_layout_weight, 0.0F);
        h = context.getInt(android.support.v7.a.inearLayoutCompat_Layout_android_layout_gravity, -1);
        context.recycle();
    }

    public rams(android.view.roup.LayoutParams layoutparams)
    {
        super(layoutparams);
        h = -1;
    }
}
