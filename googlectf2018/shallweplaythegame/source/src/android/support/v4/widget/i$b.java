// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v4.widget:
//            i

static class on extends on
{

    private static Field a;

    public void a(PopupWindow popupwindow, boolean flag)
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        a.set(popupwindow, Boolean.valueOf(flag));
        return;
        popupwindow;
        Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", popupwindow);
        return;
    }

    static 
    {
        try
        {
            a = android/widget/PopupWindow.getDeclaredField("mOverlapAnchor");
            a.setAccessible(true);
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", nosuchfieldexception);
        }
    }

    on()
    {
    }
}
