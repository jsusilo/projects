// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.community_app_admin.mobile;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Window;
import com.google.android.gms.maps.model.Marker;

// Referenced classes of package com.community_app_admin.mobile:
//            MainActivity, UserStoreDetailsActivity

class this._cls0
    implements com.google.android.gms.maps.kerClickListener
{

    final MainActivity this$0;

    public boolean onMarkerClick(final Marker arg0)
    {
        if (!MainActivity.access$14(MainActivity.this)) goto _L2; else goto _L1
_L1:
        (new android.app.lder(MainActivity.this)).setIcon(0x108009b).setTitle("Save Location").setMessage("Do you want to save this location ?").setPositiveButton("YES", new android.content.DialogInterface.OnClickListener() {

            final MainActivity._cls5 this$1;
            private final Marker val$arg0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface = getWindow().getLayoutInflater().inflate(0x7f030006, null);
                saveLocation(4, dialoginterface, arg0.getPosition());
            }

            
            {
                this$1 = MainActivity._cls5.this;
                arg0 = marker;
                super();
            }
        }).setNegativeButton("NO", new android.content.DialogInterface.OnClickListener() {

            final MainActivity._cls5 this$1;
            private final Marker val$arg0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                arg0.remove();
            }

            
            {
                this$1 = MainActivity._cls5.this;
                arg0 = marker;
                super();
            }
        }).show();
_L4:
        return true;
_L2:
        if (MainActivity.access$15(MainActivity.this))
        {
            Intent intent = new Intent(MainActivity.this, com/community_app_admin/mobile/UserStoreDetailsActivity);
            intent.putExtra("details", arg0.getSnippet());
            intent.putExtra("type", arg0.getTitle());
            startActivity(intent);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }


    _cls2.val.arg0()
    {
        this$0 = MainActivity.this;
        super();
    }
}
