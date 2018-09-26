// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.h.p;
import android.support.v7.widget.aw;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

// Referenced classes of package android.support.v7.view.menu:
//            j

public class ListMenuItemView extends LinearLayout
    implements p.a
{

    private j a;
    private ImageView b;
    private RadioButton c;
    private TextView d;
    private CheckBox e;
    private TextView f;
    private ImageView g;
    private Drawable h;
    private int i;
    private Context j;
    private boolean k;
    private Drawable l;
    private int m;
    private LayoutInflater n;
    private boolean o;

    public ListMenuItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.a.a.a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset);
        attributeset = aw.a(getContext(), attributeset, android.support.v7.a.a.j.MenuView, i1, 0);
        h = attributeset.a(android.support.v7.a.a.j.MenuView_android_itemBackground);
        i = attributeset.g(android.support.v7.a.a.j.MenuView_android_itemTextAppearance, -1);
        k = attributeset.a(android.support.v7.a.a.j.MenuView_preserveIconSpacing, false);
        j = context;
        l = attributeset.a(android.support.v7.a.a.j.MenuView_subMenuArrow);
        attributeset.a();
    }

    private void b()
    {
        b = (ImageView)getInflater().inflate(android.support.v7.a.a.g.abc_list_menu_item_icon, this, false);
        addView(b, 0);
    }

    private void c()
    {
        c = (RadioButton)getInflater().inflate(android.support.v7.a.a.g.abc_list_menu_item_radio, this, false);
        addView(c);
    }

    private void d()
    {
        e = (CheckBox)getInflater().inflate(android.support.v7.a.a.g.abc_list_menu_item_checkbox, this, false);
        addView(e);
    }

    private LayoutInflater getInflater()
    {
        if (n == null)
        {
            n = LayoutInflater.from(getContext());
        }
        return n;
    }

    private void setSubMenuArrowVisible(boolean flag)
    {
        if (g != null)
        {
            ImageView imageview = g;
            int i1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            imageview.setVisibility(i1);
        }
    }

    public void a(j j1, int i1)
    {
        a = j1;
        m = i1;
        if (j1.isVisible())
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        setVisibility(i1);
        setTitle(j1.a(this));
        setCheckable(j1.isCheckable());
        a(j1.f(), j1.d());
        setIcon(j1.getIcon());
        setEnabled(j1.isEnabled());
        setSubMenuArrowVisible(j1.hasSubMenu());
        setContentDescription(j1.getContentDescription());
    }

    public void a(boolean flag, char c1)
    {
        if (flag && a.f())
        {
            c1 = '\0';
        } else
        {
            c1 = '\b';
        }
        if (c1 == 0)
        {
            f.setText(a.e());
        }
        if (f.getVisibility() != c1)
        {
            f.setVisibility(c1);
        }
    }

    public boolean a()
    {
        return false;
    }

    public j getItemData()
    {
        return a;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        p.a(this, h);
        d = (TextView)findViewById(android.support.v7.a.a.f.title);
        if (i != -1)
        {
            d.setTextAppearance(j, i);
        }
        f = (TextView)findViewById(android.support.v7.a.a.f.shortcut);
        g = (ImageView)findViewById(android.support.v7.a.a.f.submenuarrow);
        if (g != null)
        {
            g.setImageDrawable(l);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        if (b != null && k)
        {
            android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutparams1 = (android.widget.LinearLayout.LayoutParams)b.getLayoutParams();
            if (layoutparams.height > 0 && layoutparams1.width <= 0)
            {
                layoutparams1.width = layoutparams.height;
            }
        }
        super.onMeasure(i1, j1);
    }

    public void setCheckable(boolean flag)
    {
        if (flag || c != null || e != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        Object obj1;
        if (a.g())
        {
            if (c == null)
            {
                c();
            }
            obj = c;
            obj1 = e;
        } else
        {
            if (e == null)
            {
                d();
            }
            obj = e;
            obj1 = c;
        }
        if (flag)
        {
            ((CompoundButton) (obj)).setChecked(a.isChecked());
            int i1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            if (((CompoundButton) (obj)).getVisibility() != i1)
            {
                ((CompoundButton) (obj)).setVisibility(i1);
            }
            if (obj1 != null && ((CompoundButton) (obj1)).getVisibility() != 8)
            {
                ((CompoundButton) (obj1)).setVisibility(8);
                return;
            }
            if (true)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        if (e != null)
        {
            e.setVisibility(8);
        }
        if (c != null)
        {
            c.setVisibility(8);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void setChecked(boolean flag)
    {
        Object obj;
        if (a.g())
        {
            if (c == null)
            {
                c();
            }
            obj = c;
        } else
        {
            if (e == null)
            {
                d();
            }
            obj = e;
        }
        ((CompoundButton) (obj)).setChecked(flag);
    }

    public void setForceShowIcon(boolean flag)
    {
        o = flag;
        k = flag;
    }

    public void setIcon(Drawable drawable)
    {
        boolean flag;
        if (a.i() || o)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        break MISSING_BLOCK_LABEL_19;
        if ((flag || k) && (b != null || drawable != null || k))
        {
            if (b == null)
            {
                b();
            }
            if (drawable != null || k)
            {
                ImageView imageview = b;
                if (!flag)
                {
                    drawable = null;
                }
                imageview.setImageDrawable(drawable);
                if (b.getVisibility() != 0)
                {
                    b.setVisibility(0);
                    return;
                }
            } else
            {
                b.setVisibility(8);
                return;
            }
        }
        return;
    }

    public void setTitle(CharSequence charsequence)
    {
        if (charsequence != null)
        {
            d.setText(charsequence);
            if (d.getVisibility() != 0)
            {
                d.setVisibility(0);
            }
        } else
        if (d.getVisibility() != 8)
        {
            d.setVisibility(8);
            return;
        }
    }
}
