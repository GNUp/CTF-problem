// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.multidex;

import java.io.File;
import java.io.FileFilter;

// Referenced classes of package android.support.multidex:
//            b

class a
    implements FileFilter
{

    final b a;

    public boolean accept(File file)
    {
        return !file.getName().equals("MultiDex.lock");
    }

    (b b1)
    {
        a = b1;
        super();
    }
}
