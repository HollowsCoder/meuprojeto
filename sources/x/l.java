package x;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.karumi.dexter.BuildConfig;
import e0.a;
import java.util.ArrayList;
import java.util.Iterator;
import n.d;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9427a;

    /* renamed from: b  reason: collision with root package name */
    public final Notification.Builder f9428b;

    /* renamed from: c  reason: collision with root package name */
    public final j f9429c;
    public final Bundle d = new Bundle();

    public l(j jVar) {
        Notification.Builder builder;
        boolean z;
        boolean z10;
        boolean z11;
        Bundle bundle;
        Bundle[] bundleArr;
        int i10;
        Icon icon;
        Bundle bundle2;
        int i11;
        new ArrayList();
        this.f9429c = jVar;
        Context context = jVar.f9408a;
        this.f9427a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            builder = new Notification.Builder(context, jVar.f9422q);
        } else {
            builder = new Notification.Builder(context);
        }
        this.f9428b = builder;
        Notification notification = jVar.f9424s;
        ArrayList<String> arrayList = null;
        Notification.Builder lights = builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, (RemoteViews) null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean z12 = true;
        int i12 = 0;
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z10);
        if ((notification.flags & 16) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        onlyAlertOnce.setAutoCancel(z11).setDefaults(notification.defaults).setContentTitle(jVar.f9411e).setContentText(jVar.f9412f).setContentInfo((CharSequence) null).setContentIntent(jVar.f9413g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent((PendingIntent) null, (notification.flags & 128) == 0 ? false : z12).setLargeIcon(jVar.f9414h).setNumber(jVar.f9415i).setProgress(0, 0, false);
        builder.setSubText((CharSequence) null).setUsesChronometer(false).setPriority(jVar.f9416j);
        Iterator<g> it = jVar.f9409b.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (next.f9397b == null && (i11 = next.f9402h) != 0) {
                next.f9397b = IconCompat.b(i11);
            }
            IconCompat iconCompat = next.f9397b;
            if (iconCompat != null) {
                icon = iconCompat.e((Context) null);
            } else {
                icon = null;
            }
            Notification.Action.Builder builder2 = new Notification.Action.Builder(icon, next.f9403i, next.f9404j);
            o[] oVarArr = next.f9398c;
            if (oVarArr != null) {
                int length = oVarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                if (oVarArr.length <= 0) {
                    for (int i13 = 0; i13 < length; i13++) {
                        builder2.addRemoteInput(remoteInputArr[i13]);
                    }
                } else {
                    o oVar = oVarArr[0];
                    throw null;
                }
            }
            Bundle bundle3 = next.f9396a;
            if (bundle3 == null) {
                bundle2 = new Bundle();
            }
            boolean z13 = next.d;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z13);
            int i14 = Build.VERSION.SDK_INT;
            builder2.setAllowGeneratedReplies(z13);
            int i15 = next.f9400f;
            bundle2.putInt("android.support.action.semanticAction", i15);
            if (i14 >= 28) {
                builder2.setSemanticAction(i15);
            }
            if (i14 >= 29) {
                builder2.setContextual(next.f9401g);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", next.f9399e);
            builder2.addExtras(bundle2);
            this.f9428b.addAction(builder2.build());
        }
        Bundle bundle4 = jVar.f9419n;
        if (bundle4 != null) {
            this.d.putAll(bundle4);
        }
        int i16 = Build.VERSION.SDK_INT;
        this.f9428b.setShowWhen(jVar.f9417k);
        this.f9428b.setLocalOnly(jVar.f9418m).setGroup((String) null).setGroupSummary(false).setSortKey((String) null);
        this.f9428b.setCategory((String) null).setColor(jVar.f9420o).setVisibility(jVar.f9421p).setPublicVersion((Notification) null).setSound(notification.sound, notification.audioAttributes);
        ArrayList<n> arrayList2 = jVar.f9410c;
        ArrayList<String> arrayList3 = jVar.f9425t;
        if (i16 < 28) {
            if (arrayList2 != null) {
                arrayList = new ArrayList<>(arrayList2.size());
                Iterator<n> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                    arrayList.add(BuildConfig.FLAVOR);
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    d dVar = new d(arrayList3.size() + arrayList.size());
                    dVar.addAll(arrayList);
                    dVar.addAll(arrayList3);
                    arrayList3 = new ArrayList<>(dVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            for (String addPerson : arrayList3) {
                this.f9428b.addPerson(addPerson);
            }
        }
        ArrayList<g> arrayList4 = jVar.d;
        if (arrayList4.size() > 0) {
            if (jVar.f9419n == null) {
                jVar.f9419n = new Bundle();
            }
            Bundle bundle5 = jVar.f9419n.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i17 = 0;
            while (i12 < arrayList4.size()) {
                String num = Integer.toString(i12);
                g gVar = arrayList4.get(i12);
                Object obj = m.f9430a;
                Bundle bundle8 = new Bundle();
                if (gVar.f9397b == null && (i10 = gVar.f9402h) != 0) {
                    gVar.f9397b = IconCompat.b(i10);
                }
                IconCompat iconCompat2 = gVar.f9397b;
                bundle8.putInt("icon", iconCompat2 != null ? iconCompat2.c() : i17);
                bundle8.putCharSequence("title", gVar.f9403i);
                bundle8.putParcelable("actionIntent", gVar.f9404j);
                Bundle bundle9 = gVar.f9396a;
                if (bundle9 == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", gVar.d);
                bundle8.putBundle("extras", bundle);
                o[] oVarArr2 = gVar.f9398c;
                if (oVarArr2 == null) {
                    bundleArr = null;
                } else {
                    Bundle[] bundleArr2 = new Bundle[oVarArr2.length];
                    if (oVarArr2.length <= 0) {
                        bundleArr = bundleArr2;
                    } else {
                        o oVar2 = oVarArr2[0];
                        new Bundle();
                        throw null;
                    }
                }
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", gVar.f9399e);
                bundle8.putInt("semanticAction", gVar.f9400f);
                bundle7.putBundle(num, bundle8);
                i12++;
                i17 = 0;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (jVar.f9419n == null) {
                jVar.f9419n = new Bundle();
            }
            jVar.f9419n.putBundle("android.car.EXTENSIONS", bundle5);
            this.d.putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i18 = Build.VERSION.SDK_INT;
        this.f9428b.setExtras(jVar.f9419n).setRemoteInputHistory((CharSequence[]) null);
        if (i18 >= 26) {
            this.f9428b.setBadgeIconType(0).setSettingsText((CharSequence) null).setShortcutId((String) null).setTimeoutAfter(0).setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty(jVar.f9422q)) {
                this.f9428b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i18 >= 28) {
            Iterator<n> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Notification.Builder builder3 = this.f9428b;
                it3.next().getClass();
                builder3.addPerson(n.a());
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f9428b.setAllowSystemGeneratedContextualActions(jVar.f9423r);
            this.f9428b.setBubbleMetadata((Notification.BubbleMetadata) null);
        }
        a.a();
    }
}
