package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import e1.a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f959a;
        if (aVar.h(1)) {
            obj = aVar.m();
        }
        remoteActionCompat.f959a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f960b;
        if (aVar.h(2)) {
            charSequence = aVar.g();
        }
        remoteActionCompat.f960b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f961c;
        if (aVar.h(3)) {
            charSequence2 = aVar.g();
        }
        remoteActionCompat.f961c = charSequence2;
        Object obj2 = remoteActionCompat.d;
        if (aVar.h(4)) {
            obj2 = aVar.k();
        }
        remoteActionCompat.d = (PendingIntent) obj2;
        boolean z = remoteActionCompat.f962e;
        if (aVar.h(5)) {
            z = aVar.e();
        }
        remoteActionCompat.f962e = z;
        boolean z10 = remoteActionCompat.f963f;
        if (aVar.h(6)) {
            z10 = aVar.e();
        }
        remoteActionCompat.f963f = z10;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f959a;
        aVar.n(1);
        aVar.v(iconCompat);
        CharSequence charSequence = remoteActionCompat.f960b;
        aVar.n(2);
        aVar.q(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f961c;
        aVar.n(3);
        aVar.q(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.d;
        aVar.n(4);
        aVar.t(pendingIntent);
        boolean z = remoteActionCompat.f962e;
        aVar.n(5);
        aVar.o(z);
        boolean z10 = remoteActionCompat.f963f;
        aVar.n(6);
        aVar.o(z10);
    }
}
