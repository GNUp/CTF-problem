// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.Parcel;

// Referenced classes of package android.support.v4.media:
//            MediaDescriptionCompat, a

static final class 
    implements android.os.ptionCompat._cls1
{

    public MediaDescriptionCompat a(Parcel parcel)
    {
        if (android.os.ptionCompat < 21)
        {
            return new MediaDescriptionCompat(parcel);
        } else
        {
            return MediaDescriptionCompat.a(android.support.v4.media.a.a(parcel));
        }
    }

    public MediaDescriptionCompat[] a(int i)
    {
        return new MediaDescriptionCompat[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
