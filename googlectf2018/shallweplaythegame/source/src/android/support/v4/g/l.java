// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.g;


// Referenced classes of package android.support.v4.g:
//            c

public class l
    implements Cloneable
{

    private static final Object a = new Object();
    private boolean b;
    private int c[];
    private Object d[];
    private int e;

    public l()
    {
        this(10);
    }

    public l(int i)
    {
        b = false;
        if (i == 0)
        {
            c = c.a;
            d = c.c;
        } else
        {
            i = android.support.v4.g.c.a(i);
            c = new int[i];
            d = new Object[i];
        }
        e = 0;
    }

    private void d()
    {
        int i1 = e;
        int ai[] = c;
        Object aobj[] = d;
        int i = 0;
        int j;
        int k;
        for (j = 0; i < i1; j = k)
        {
            Object obj = aobj[i];
            k = j;
            if (obj != a)
            {
                if (i != j)
                {
                    ai[j] = ai[i];
                    aobj[j] = obj;
                    aobj[i] = null;
                }
                k = j + 1;
            }
            i++;
        }

        b = false;
        e = j;
    }

    public l a()
    {
        Object obj;
        try
        {
            obj = (l)super.clone();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        try
        {
            obj.c = (int[])c.clone();
            obj.d = (Object[])((Object []) (d)).clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return ((l) (obj));
        }
        return ((l) (obj));
    }

    public Object a(int i)
    {
        return a(i, null);
    }

    public Object a(int i, Object obj)
    {
        i = android.support.v4.g.c.a(c, e, i);
        if (i < 0 || d[i] == a)
        {
            return obj;
        } else
        {
            return d[i];
        }
    }

    public int b()
    {
        if (b)
        {
            d();
        }
        return e;
    }

    public void b(int i)
    {
        i = android.support.v4.g.c.a(c, e, i);
        if (i >= 0 && d[i] != a)
        {
            d[i] = a;
            b = true;
        }
    }

    public void b(int i, Object obj)
    {
        int j = android.support.v4.g.c.a(c, e, i);
        if (j >= 0)
        {
            d[j] = obj;
            return;
        }
        int k = ~j;
        if (k < e && d[k] == a)
        {
            c[k] = i;
            d[k] = obj;
            return;
        }
        j = k;
        if (b)
        {
            j = k;
            if (e >= c.length)
            {
                d();
                j = ~android.support.v4.g.c.a(c, e, i);
            }
        }
        if (e >= c.length)
        {
            int i1 = android.support.v4.g.c.a(e + 1);
            int ai[] = new int[i1];
            Object aobj[] = new Object[i1];
            System.arraycopy(c, 0, ai, 0, c.length);
            System.arraycopy(((Object) (d)), 0, ((Object) (aobj)), 0, d.length);
            c = ai;
            d = aobj;
        }
        if (e - j != 0)
        {
            System.arraycopy(c, j, c, j + 1, e - j);
            System.arraycopy(((Object) (d)), j, ((Object) (d)), j + 1, e - j);
        }
        c[j] = i;
        d[j] = obj;
        e = e + 1;
    }

    public void c()
    {
        int j = e;
        Object aobj[] = d;
        for (int i = 0; i < j; i++)
        {
            aobj[i] = null;
        }

        e = 0;
        b = false;
    }

    public void c(int i)
    {
        b(i);
    }

    public void c(int i, Object obj)
    {
        if (e != 0 && i <= c[e - 1])
        {
            b(i, obj);
            return;
        }
        if (b && e >= c.length)
        {
            d();
        }
        int j = e;
        if (j >= c.length)
        {
            int k = android.support.v4.g.c.a(j + 1);
            int ai[] = new int[k];
            Object aobj[] = new Object[k];
            System.arraycopy(c, 0, ai, 0, c.length);
            System.arraycopy(((Object) (d)), 0, ((Object) (aobj)), 0, d.length);
            c = ai;
            d = aobj;
        }
        c[j] = i;
        d[j] = obj;
        e = j + 1;
    }

    public Object clone()
    {
        return a();
    }

    public int d(int i)
    {
        if (b)
        {
            d();
        }
        return c[i];
    }

    public Object e(int i)
    {
        if (b)
        {
            d();
        }
        return d[i];
    }

    public String toString()
    {
        if (b() <= 0)
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder(e * 28);
        stringbuilder.append('{');
        int i = 0;
        while (i < e) 
        {
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(d(i));
            stringbuilder.append('=');
            Object obj = e(i);
            if (obj != this)
            {
                stringbuilder.append(obj);
            } else
            {
                stringbuilder.append("(this Map)");
            }
            i++;
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

}
