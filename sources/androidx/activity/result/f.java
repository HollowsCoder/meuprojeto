package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import c.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public Random f199a = new Random();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f200b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f201c = new HashMap();
    public final HashMap d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<String> f202e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final transient HashMap f203f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f204g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f205h = new Bundle();

    public static class a<O> {

        /* renamed from: a  reason: collision with root package name */
        public final b<O> f206a;

        /* renamed from: b  reason: collision with root package name */
        public final c.a<?, O> f207b;

        public a(b<O> bVar, c.a<?, O> aVar) {
            this.f206a = bVar;
            this.f207b = aVar;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final h f208a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<l> f209b = new ArrayList<>();

        public b(h hVar) {
            this.f208a = hVar;
        }
    }

    public final boolean a(int i10, int i11, Intent intent) {
        b<O> bVar;
        String str = (String) this.f200b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f203f.get(str);
        if (aVar == null || (bVar = aVar.f206a) == null || !this.f202e.contains(str)) {
            this.f204g.remove(str);
            this.f205h.putParcelable(str, new a(intent, i11));
            return true;
        }
        bVar.a(aVar.f207b.c(intent, i11));
        this.f202e.remove(str);
        return true;
    }

    public abstract void b(int i10, c.a aVar, @SuppressLint({"UnknownNullness"}) Intent intent);

    public final d c(String str, n nVar, c cVar, b bVar) {
        o r5 = nVar.r();
        if (!r5.f1394c.isAtLeast(h.c.STARTED)) {
            e(str);
            HashMap hashMap = this.d;
            b bVar2 = (b) hashMap.get(str);
            if (bVar2 == null) {
                bVar2 = new b(r5);
            }
            ActivityResultRegistry$1 activityResultRegistry$1 = new ActivityResultRegistry$1(this, str, bVar, cVar);
            bVar2.f208a.a(activityResultRegistry$1);
            bVar2.f209b.add(activityResultRegistry$1);
            hashMap.put(str, bVar2);
            return new d(this, str, cVar);
        }
        throw new IllegalStateException("LifecycleOwner " + nVar + " is attempting to register while current state is " + r5.f1394c + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final e d(String str, c.a aVar, b bVar) {
        e(str);
        this.f203f.put(str, new a(bVar, aVar));
        HashMap hashMap = this.f204g;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            bVar.a(obj);
        }
        Bundle bundle = this.f205h;
        a aVar2 = (a) bundle.getParcelable(str);
        if (aVar2 != null) {
            bundle.remove(str);
            bVar.a(aVar.c(aVar2.f193p, aVar2.f192o));
        }
        return new e(this, str, aVar);
    }

    public final void e(String str) {
        int nextInt;
        HashMap hashMap;
        HashMap hashMap2 = this.f201c;
        if (((Integer) hashMap2.get(str)) == null) {
            do {
                nextInt = this.f199a.nextInt(2147418112) + 65536;
                hashMap = this.f200b;
            } while (hashMap.containsKey(Integer.valueOf(nextInt)));
            hashMap.put(Integer.valueOf(nextInt), str);
            hashMap2.put(str, Integer.valueOf(nextInt));
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f202e.contains(str) && (num = (Integer) this.f201c.remove(str)) != null) {
            this.f200b.remove(num);
        }
        this.f203f.remove(str);
        HashMap hashMap = this.f204g;
        if (hashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + hashMap.get(str));
            hashMap.remove(str);
        }
        Bundle bundle = this.f205h;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap hashMap2 = this.d;
        b bVar = (b) hashMap2.get(str);
        if (bVar != null) {
            ArrayList<l> arrayList = bVar.f209b;
            Iterator<l> it = arrayList.iterator();
            while (it.hasNext()) {
                bVar.f208a.b(it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
