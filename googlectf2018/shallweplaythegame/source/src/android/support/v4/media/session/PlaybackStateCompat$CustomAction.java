// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

// Referenced classes of package android.support.v4.media.session:
//            PlaybackStateCompat

public static final class d
    implements Parcelable
{

    public static final android.os.teCompat.CustomAction.d CREATOR = new android.os.Parcelable.Creator() {

        public PlaybackStateCompat.CustomAction a(Parcel parcel)
        {
            return new PlaybackStateCompat.CustomAction(parcel);
        }

        public PlaybackStateCompat.CustomAction[] a(int i)
        {
            return new PlaybackStateCompat.CustomAction[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    private final String a;
    private final CharSequence b;
    private final int c;
    private final Bundle d;
    private Object e;

    public static d a(Object obj)
    {
        if (obj == null || android.os.teCompat.CustomAction < 21)
        {
            return null;
        } else
        {
            d d1 = new <init>(<init>(obj), <init>(obj), <init>(obj), <init>(obj));
            d1.e = obj;
            return d1;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Action:mName='").append(b).append(", mIcon=").append(c).append(", mExtras=").append(d).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        TextUtils.writeToParcel(b, parcel, i);
        parcel.writeInt(c);
        parcel.writeBundle(d);
    }


    _cls1(Parcel parcel)
    {
        a = parcel.readString();
        b = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.el(parcel);
        c = parcel.readInt();
        d = parcel.readBundle();
    }

    d(String s, CharSequence charsequence, int i, Bundle bundle)
    {
        a = s;
        b = charsequence;
        c = i;
        d = bundle;
    }
}
