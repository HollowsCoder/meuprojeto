package x;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import y.a;

public final class p implements Iterable<Intent> {

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList<Intent> f9431o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public final Context f9432p;

    public p(Context context) {
        this.f9432p = context;
    }

    public final void e(ComponentName componentName) {
        Context context = this.f9432p;
        ArrayList<Intent> arrayList = this.f9431o;
        int size = arrayList.size();
        while (true) {
            try {
                Intent b10 = f.b(context, componentName);
                if (b10 != null) {
                    arrayList.add(size, b10);
                    componentName = b10.getComponent();
                } else {
                    return;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e10);
            }
        }
    }

    public final void h() {
        ArrayList<Intent> arrayList = this.f9431o;
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            Object obj = a.f9523a;
            a.C0162a.a(this.f9432p, intentArr, (Bundle) null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f9431o.iterator();
    }
}
