package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import i0.y;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import y.a;

public class f implements d0.a {

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f313y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f314a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f315b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f316c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public a f317e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<h> f318f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<h> f319g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f320h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<h> f321i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<h> f322j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f323k;
    public int l = 0;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f324m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f325n;

    /* renamed from: o  reason: collision with root package name */
    public View f326o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f327p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f328q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f329r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f330s = false;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList<h> f331t = new ArrayList<>();
    public final CopyOnWriteArrayList<WeakReference<j>> u = new CopyOnWriteArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    public h f332v;
    public boolean w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f333x;

    public interface a {
        boolean a(f fVar, MenuItem menuItem);

        void b(f fVar);
    }

    public interface b {
        boolean a(h hVar);
    }

    public f(Context context) {
        boolean z;
        boolean z10 = false;
        this.f314a = context;
        Resources resources = context.getResources();
        this.f315b = resources;
        this.f318f = new ArrayList<>();
        this.f319g = new ArrayList<>();
        this.f320h = true;
        this.f321i = new ArrayList<>();
        this.f322j = new ArrayList<>();
        this.f323k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = y.f6021a;
            if (Build.VERSION.SDK_INT >= 28) {
                z = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier == 0 || !resources2.getBoolean(identifier)) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                z10 = true;
            }
        }
        this.d = z10;
    }

    public final h a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = (-65536 & i12) >> 16;
        if (i14 < 0 || i14 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i15 = (f313y[i14] << 16) | (65535 & i12);
        h hVar = new h(this, i10, i11, i12, i15, charSequence, this.l);
        ArrayList<h> arrayList = this.f318f;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (arrayList.get(size).d <= i15) {
                    i13 = size + 1;
                    break;
                }
            } else {
                i13 = 0;
                break;
            }
        }
        arrayList.add(i13, hVar);
        p(true);
        return hVar;
    }

    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f315b.getString(i10));
    }

    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f315b.getString(i13));
    }

    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.view.MenuItem[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f314a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L_0x0012
            int r2 = r11.size()
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            r14 = r14 & 1
            if (r14 != 0) goto L_0x001a
            r7.removeGroup(r8)
        L_0x001a:
            if (r1 >= r2) goto L_0x005b
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L_0x002a
            r4 = r13
            goto L_0x002c
        L_0x002a:
            r4 = r12[r4]
        L_0x002c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            androidx.appcompat.view.menu.h r4 = r7.a(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            r4.setIcon((android.graphics.drawable.Drawable) r5)
            r4.f342g = r3
            if (r15 == 0) goto L_0x0058
            int r14 = r14.specificIndex
            if (r14 < 0) goto L_0x0058
            r15[r14] = r4
        L_0x0058:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.f.addIntentOptions(int, int, int, android.content.ComponentName, android.content.Intent[], android.content.Intent, int, android.view.MenuItem[]):int");
    }

    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f315b.getString(i10));
    }

    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, (CharSequence) this.f315b.getString(i13));
    }

    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        h a10 = a(i10, i11, i12, charSequence);
        m mVar = new m(this.f314a, this, a10);
        a10.f349o = mVar;
        mVar.setHeaderTitle(a10.f340e);
        return mVar;
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(j jVar, Context context) {
        this.u.add(new WeakReference(jVar));
        jVar.e(context, this);
        this.f323k = true;
    }

    public final void c(boolean z) {
        if (!this.f330s) {
            this.f330s = true;
            CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.u;
            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    jVar.b(this, z);
                }
            }
            this.f330s = false;
        }
    }

    public final void clear() {
        h hVar = this.f332v;
        if (hVar != null) {
            d(hVar);
        }
        this.f318f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f325n = null;
        this.f324m = null;
        this.f326o = null;
        p(false);
    }

    public final void close() {
        c(true);
    }

    public boolean d(h hVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.u;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f332v == hVar) {
            w();
            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    z = jVar.d(hVar);
                    if (z) {
                        break;
                    }
                }
            }
            v();
            if (z) {
                this.f332v = null;
            }
        }
        return z;
    }

    public boolean e(f fVar, MenuItem menuItem) {
        a aVar = this.f317e;
        return aVar != null && aVar.a(fVar, menuItem);
    }

    public boolean f(h hVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.u;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            j jVar = (j) next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                z = jVar.k(hVar);
                if (z) {
                    break;
                }
            }
        }
        v();
        if (z) {
            this.f332v = hVar;
        }
        return z;
    }

    public final MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f318f.get(i11);
            if (hVar.f337a == i10) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (findItem = hVar.f349o.findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final h g(int i10, KeyEvent keyEvent) {
        char c10;
        ArrayList<h> arrayList = this.f331t;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n10 = n();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = arrayList.get(i11);
            if (n10) {
                c10 = hVar.f345j;
            } else {
                c10 = hVar.f343h;
            }
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (n10 && c10 == 8 && i10 == 67))) {
                return hVar;
            }
        }
        return null;
    }

    public final MenuItem getItem(int i10) {
        return this.f318f.get(i10);
    }

    public final void h(ArrayList arrayList, int i10, KeyEvent keyEvent) {
        char c10;
        int i11;
        boolean z;
        ArrayList arrayList2 = arrayList;
        int i12 = i10;
        KeyEvent keyEvent2 = keyEvent;
        boolean n10 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent2.getKeyData(keyData) || i12 == 67) {
            ArrayList<h> arrayList3 = this.f318f;
            int size = arrayList3.size();
            for (int i13 = 0; i13 < size; i13++) {
                h hVar = arrayList3.get(i13);
                if (hVar.hasSubMenu()) {
                    hVar.f349o.h(arrayList2, i12, keyEvent2);
                }
                if (n10) {
                    c10 = hVar.f345j;
                } else {
                    c10 = hVar.f343h;
                }
                if (n10) {
                    i11 = hVar.f346k;
                } else {
                    i11 = hVar.f344i;
                }
                if ((modifiers & 69647) == (i11 & 69647)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if (c10 != cArr[0] && c10 != cArr[2]) {
                        if (n10 && c10 == 8) {
                            if (i12 != 67) {
                            }
                        }
                    }
                    if (hVar.isEnabled()) {
                        arrayList2.add(hVar);
                    }
                }
            }
        }
    }

    public final boolean hasVisibleItems() {
        if (this.f333x) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f318f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        boolean z;
        ArrayList<h> l8 = l();
        if (this.f323k) {
            CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.u;
            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    z10 |= jVar.i();
                }
            }
            ArrayList<h> arrayList = this.f321i;
            ArrayList<h> arrayList2 = this.f322j;
            arrayList.clear();
            arrayList2.clear();
            if (z10) {
                int size = l8.size();
                for (int i10 = 0; i10 < size; i10++) {
                    h hVar = l8.get(i10);
                    if ((hVar.f356x & 32) == 32) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(hVar);
                    } else {
                        arrayList2.add(hVar);
                    }
                }
            } else {
                arrayList2.addAll(l());
            }
            this.f323k = false;
        }
    }

    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return g(i10, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public f k() {
        return this;
    }

    public final ArrayList<h> l() {
        boolean z = this.f320h;
        ArrayList<h> arrayList = this.f319g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList<h> arrayList2 = this.f318f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = arrayList2.get(i10);
            if (hVar.isVisible()) {
                arrayList.add(hVar);
            }
        }
        this.f320h = false;
        this.f323k = true;
        return arrayList;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.f316c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z) {
        if (!this.f327p) {
            if (z) {
                this.f320h = true;
                this.f323k = true;
            }
            CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.u;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference next = it.next();
                    j jVar = (j) next.get();
                    if (jVar == null) {
                        copyOnWriteArrayList.remove(next);
                    } else {
                        jVar.f();
                    }
                }
                v();
                return;
            }
            return;
        }
        this.f328q = true;
        if (z) {
            this.f329r = true;
        }
    }

    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), (j) null, i11);
    }

    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        boolean z;
        h g10 = g(i10, keyEvent);
        if (g10 != null) {
            z = q(g10, (j) null, i11);
        } else {
            z = false;
        }
        if ((i11 & 2) != 0) {
            c(true);
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0059, code lost:
        if (r1 != false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0067, code lost:
        if ((r9 & 1) == 0) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00bf, code lost:
        if (r1 == false) goto L_0x00c1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(android.view.MenuItem r7, androidx.appcompat.view.menu.j r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.h r7 = (androidx.appcompat.view.menu.h) r7
            r0 = 0
            if (r7 == 0) goto L_0x00c5
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00c5
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f350p
            r2 = 1
            if (r1 == 0) goto L_0x0019
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x0019
            goto L_0x003e
        L_0x0019:
            androidx.appcompat.view.menu.f r1 = r7.f348n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L_0x0022
            goto L_0x003e
        L_0x0022:
            android.content.Intent r3 = r7.f342g
            if (r3 == 0) goto L_0x0034
            android.content.Context r1 = r1.f314a     // Catch:{ ActivityNotFoundException -> 0x002c }
            r1.startActivity(r3)     // Catch:{ ActivityNotFoundException -> 0x002c }
            goto L_0x003e
        L_0x002c:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L_0x0034:
            i0.b r1 = r7.A
            if (r1 == 0) goto L_0x0040
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0040
        L_0x003e:
            r1 = r2
            goto L_0x0041
        L_0x0040:
            r1 = r0
        L_0x0041:
            i0.b r3 = r7.A
            if (r3 == 0) goto L_0x004d
            boolean r4 = r3.a()
            if (r4 == 0) goto L_0x004d
            r4 = r2
            goto L_0x004e
        L_0x004d:
            r4 = r0
        L_0x004e:
            boolean r5 = r7.e()
            if (r5 == 0) goto L_0x005c
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00c4
            goto L_0x00c1
        L_0x005c:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x006a
            if (r4 == 0) goto L_0x0065
            goto L_0x006a
        L_0x0065:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00c4
            goto L_0x00c1
        L_0x006a:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0071
            r6.c(r0)
        L_0x0071:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0085
            androidx.appcompat.view.menu.m r9 = new androidx.appcompat.view.menu.m
            android.content.Context r5 = r6.f314a
            r9.<init>(r5, r6, r7)
            r7.f349o = r9
            java.lang.CharSequence r5 = r7.f340e
            r9.setHeaderTitle((java.lang.CharSequence) r5)
        L_0x0085:
            androidx.appcompat.view.menu.m r7 = r7.f349o
            if (r4 == 0) goto L_0x008c
            r3.f(r7)
        L_0x008c:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.j>> r9 = r6.u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L_0x0095
            goto L_0x00be
        L_0x0095:
            if (r8 == 0) goto L_0x009b
            boolean r0 = r8.h(r7)
        L_0x009b:
            java.util.Iterator r8 = r9.iterator()
        L_0x009f:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x00be
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            androidx.appcompat.view.menu.j r4 = (androidx.appcompat.view.menu.j) r4
            if (r4 != 0) goto L_0x00b7
            r9.remove(r3)
            goto L_0x009f
        L_0x00b7:
            if (r0 != 0) goto L_0x009f
            boolean r0 = r4.h(r7)
            goto L_0x009f
        L_0x00be:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00c4
        L_0x00c1:
            r6.c(r2)
        L_0x00c4:
            return r1
        L_0x00c5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.f.q(android.view.MenuItem, androidx.appcompat.view.menu.j, int):boolean");
    }

    public final void r(j jVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.u;
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            j jVar2 = (j) next.get();
            if (jVar2 == null || jVar2 == jVar) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    public final void removeGroup(int i10) {
        ArrayList<h> arrayList;
        int size = size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            arrayList = this.f318f;
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (arrayList.get(i12).f338b == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || arrayList.get(i12).f338b != i10) {
                    p(true);
                } else {
                    if (i12 >= 0 && i12 < arrayList.size()) {
                        arrayList.remove(i12);
                    }
                    i11 = i13;
                }
            }
            p(true);
        }
    }

    public final void removeItem(int i10) {
        ArrayList<h> arrayList;
        int size = size();
        int i11 = 0;
        while (true) {
            arrayList = this.f318f;
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (arrayList.get(i11).f337a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0 && i11 < arrayList.size()) {
            arrayList.remove(i11);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = getItem(i10);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((m) item.getSubMenu()).s(bundle);
                }
            }
            int i11 = bundle.getInt("android:menu:expandedactionview");
            if (i11 > 0 && (findItem = findItem(i11)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public final void setGroupCheckable(int i10, boolean z, boolean z10) {
        int i11;
        ArrayList<h> arrayList = this.f318f;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            h hVar = arrayList.get(i12);
            if (hVar.f338b == i10) {
                int i13 = hVar.f356x & -5;
                if (z10) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                hVar.f356x = i13 | i11;
                hVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    public final void setGroupEnabled(int i10, boolean z) {
        ArrayList<h> arrayList = this.f318f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = arrayList.get(i11);
            if (hVar.f338b == i10) {
                hVar.setEnabled(z);
            }
        }
    }

    public final void setGroupVisible(int i10, boolean z) {
        int i11;
        boolean z10;
        ArrayList<h> arrayList = this.f318f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            h hVar = arrayList.get(i12);
            if (hVar.f338b == i10) {
                int i13 = hVar.f356x;
                int i14 = i13 & -9;
                if (z) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                int i15 = i14 | i11;
                hVar.f356x = i15;
                if (i13 != i15) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            p(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f316c = z;
        p(false);
    }

    public final int size() {
        return this.f318f.size();
    }

    public final void t(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        if (view != null) {
            this.f326o = view;
            this.f324m = null;
            this.f325n = null;
        } else {
            if (i10 > 0) {
                this.f324m = this.f315b.getText(i10);
            } else if (charSequence != null) {
                this.f324m = charSequence;
            }
            if (i11 > 0) {
                Object obj = y.a.f9523a;
                this.f325n = a.c.b(this.f314a, i11);
            } else if (drawable != null) {
                this.f325n = drawable;
            }
            this.f326o = null;
        }
        p(false);
    }

    public final void v() {
        this.f327p = false;
        if (this.f328q) {
            this.f328q = false;
            p(this.f329r);
        }
    }

    public final void w() {
        if (!this.f327p) {
            this.f327p = true;
            this.f328q = false;
            this.f329r = false;
        }
    }
}
