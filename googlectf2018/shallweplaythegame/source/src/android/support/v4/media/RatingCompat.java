// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public RatingCompat a(Parcel parcel)
        {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public RatingCompat[] a(int i)
        {
            return new RatingCompat[i];
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
    private final int a;
    private final float b;

    RatingCompat(int i, float f)
    {
        a = i;
        b = f;
    }

    public int describeContents()
    {
        return a;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("Rating:style=").append(a).append(" rating=");
        String s;
        if (b < 0.0F)
        {
            s = "unrated";
        } else
        {
            s = String.valueOf(b);
        }
        return stringbuilder.append(s).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeFloat(b);
    }

}
