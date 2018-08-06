// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.g.a;

// Referenced classes of package android.support.v4.media:
//            c

public final class MediaMetadataCompat
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public MediaMetadataCompat a(Parcel parcel)
        {
            return new MediaMetadataCompat(parcel);
        }

        public MediaMetadataCompat[] a(int i)
        {
            return new MediaMetadataCompat[i];
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
    static final a a;
    private static final String c[] = {
        "android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"
    };
    private static final String d[] = {
        "android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"
    };
    private static final String e[] = {
        "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"
    };
    final Bundle b;
    private Object f;

    MediaMetadataCompat(Parcel parcel)
    {
        b = parcel.readBundle();
    }

    public static MediaMetadataCompat a(Object obj)
    {
        if (obj != null && android.os.Build.VERSION.SDK_INT >= 21)
        {
            Parcel parcel = Parcel.obtain();
            android.support.v4.media.c.a(obj, parcel, 0);
            parcel.setDataPosition(0);
            MediaMetadataCompat mediametadatacompat = (MediaMetadataCompat)CREATOR.createFromParcel(parcel);
            parcel.recycle();
            mediametadatacompat.f = obj;
            return mediametadatacompat;
        } else
        {
            return null;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeBundle(b);
    }

    static 
    {
        a = new a();
        a.put("android.media.metadata.TITLE", Integer.valueOf(1));
        a.put("android.media.metadata.ARTIST", Integer.valueOf(1));
        a.put("android.media.metadata.DURATION", Integer.valueOf(0));
        a.put("android.media.metadata.ALBUM", Integer.valueOf(1));
        a.put("android.media.metadata.AUTHOR", Integer.valueOf(1));
        a.put("android.media.metadata.WRITER", Integer.valueOf(1));
        a.put("android.media.metadata.COMPOSER", Integer.valueOf(1));
        a.put("android.media.metadata.COMPILATION", Integer.valueOf(1));
        a.put("android.media.metadata.DATE", Integer.valueOf(1));
        a.put("android.media.metadata.YEAR", Integer.valueOf(0));
        a.put("android.media.metadata.GENRE", Integer.valueOf(1));
        a.put("android.media.metadata.TRACK_NUMBER", Integer.valueOf(0));
        a.put("android.media.metadata.NUM_TRACKS", Integer.valueOf(0));
        a.put("android.media.metadata.DISC_NUMBER", Integer.valueOf(0));
        a.put("android.media.metadata.ALBUM_ARTIST", Integer.valueOf(1));
        a.put("android.media.metadata.ART", Integer.valueOf(2));
        a.put("android.media.metadata.ART_URI", Integer.valueOf(1));
        a.put("android.media.metadata.ALBUM_ART", Integer.valueOf(2));
        a.put("android.media.metadata.ALBUM_ART_URI", Integer.valueOf(1));
        a.put("android.media.metadata.USER_RATING", Integer.valueOf(3));
        a.put("android.media.metadata.RATING", Integer.valueOf(3));
        a.put("android.media.metadata.DISPLAY_TITLE", Integer.valueOf(1));
        a.put("android.media.metadata.DISPLAY_SUBTITLE", Integer.valueOf(1));
        a.put("android.media.metadata.DISPLAY_DESCRIPTION", Integer.valueOf(1));
        a.put("android.media.metadata.DISPLAY_ICON", Integer.valueOf(2));
        a.put("android.media.metadata.DISPLAY_ICON_URI", Integer.valueOf(1));
        a.put("android.media.metadata.MEDIA_ID", Integer.valueOf(1));
        a.put("android.media.metadata.BT_FOLDER_TYPE", Integer.valueOf(0));
        a.put("android.media.metadata.MEDIA_URI", Integer.valueOf(1));
        a.put("android.media.metadata.ADVERTISEMENT", Integer.valueOf(0));
        a.put("android.media.metadata.DOWNLOAD_STATUS", Integer.valueOf(0));
    }
}
