// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.b;

import android.support.v4.g.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class android.support.v4.b.b
{
    public static interface a
    {
    }

    public static interface b
    {
    }


    int a;
    b b;
    a c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;

    public String a(Object obj)
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        android.support.v4.g.d.a(obj, stringbuilder);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public final void a()
    {
        d = true;
        f = false;
        e = false;
        b();
    }

    public void a(int i, b b1)
    {
        if (b != null)
        {
            throw new IllegalStateException("There is already a listener registered");
        } else
        {
            b = b1;
            a = i;
            return;
        }
    }

    public void a(a a1)
    {
        if (c != null)
        {
            throw new IllegalStateException("There is already a listener registered");
        } else
        {
            c = a1;
            return;
        }
    }

    public void a(b b1)
    {
        if (b == null)
        {
            throw new IllegalStateException("No listener register");
        }
        if (b != b1)
        {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else
        {
            b = null;
            return;
        }
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.print(s);
        printwriter.print("mId=");
        printwriter.print(a);
        printwriter.print(" mListener=");
        printwriter.println(b);
        if (d || g || h)
        {
            printwriter.print(s);
            printwriter.print("mStarted=");
            printwriter.print(d);
            printwriter.print(" mContentChanged=");
            printwriter.print(g);
            printwriter.print(" mProcessingChange=");
            printwriter.println(h);
        }
        if (e || f)
        {
            printwriter.print(s);
            printwriter.print("mAbandoned=");
            printwriter.print(e);
            printwriter.print(" mReset=");
            printwriter.println(f);
        }
    }

    protected void b()
    {
    }

    public void b(a a1)
    {
        if (c == null)
        {
            throw new IllegalStateException("No listener register");
        }
        if (c != a1)
        {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else
        {
            c = null;
            return;
        }
    }

    public void c()
    {
        d = false;
        d();
    }

    protected void d()
    {
    }

    public void e()
    {
        f();
        f = true;
        d = false;
        e = false;
        g = false;
        h = false;
    }

    protected void f()
    {
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        android.support.v4.g.d.a(this, stringbuilder);
        stringbuilder.append(" id=");
        stringbuilder.append(a);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
