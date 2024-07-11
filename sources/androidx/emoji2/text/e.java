package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class e {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f1038i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static volatile e f1039j;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock f1040a;

    /* renamed from: b  reason: collision with root package name */
    public final n.d f1041b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1042c = 3;
    public final Handler d;

    /* renamed from: e  reason: collision with root package name */
    public final a f1043e;

    /* renamed from: f  reason: collision with root package name */
    public final g f1044f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1045g;

    /* renamed from: h  reason: collision with root package name */
    public final i.a f1046h;

    public static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        public volatile i f1047b;

        /* renamed from: c  reason: collision with root package name */
        public volatile m f1048c;

        public a(e eVar) {
            super(eVar);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final e f1049a;

        public b(e eVar) {
            this.f1049a = eVar;
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final g f1050a;

        /* renamed from: b  reason: collision with root package name */
        public int f1051b = 0;

        /* renamed from: c  reason: collision with root package name */
        public final i.a f1052c = new i.a();

        public c(g gVar) {
            this.f1050a = gVar;
        }
    }

    public interface d {
    }

    /* renamed from: androidx.emoji2.text.e$e  reason: collision with other inner class name */
    public static abstract class C0013e {
        public void a() {
        }
    }

    public static class f implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final ArrayList f1053o;

        /* renamed from: p  reason: collision with root package name */
        public final int f1054p;

        public f(List list, int i10, Throwable th) {
            if (list != null) {
                this.f1053o = new ArrayList(list);
                this.f1054p = i10;
                return;
            }
            throw new NullPointerException("initCallbacks cannot be null");
        }

        public final void run() {
            ArrayList arrayList = this.f1053o;
            int size = arrayList.size();
            int i10 = 0;
            if (this.f1054p != 1) {
                while (i10 < size) {
                    ((C0013e) arrayList.get(i10)).getClass();
                    i10++;
                }
                return;
            }
            while (i10 < size) {
                ((C0013e) arrayList.get(i10)).a();
                i10++;
            }
        }
    }

    public interface g {
        void a(h hVar);
    }

    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(m mVar);
    }

    public static class i {
    }

    public e(EmojiCompatInitializer.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1040a = reentrantReadWriteLock;
        g gVar = aVar.f1050a;
        this.f1044f = gVar;
        int i10 = aVar.f1051b;
        this.f1045g = i10;
        this.f1046h = aVar.f1052c;
        this.d = new Handler(Looper.getMainLooper());
        this.f1041b = new n.d();
        a aVar2 = new a(this);
        this.f1043e = aVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f1042c = 0;
            } catch (Throwable th) {
                this.f1040a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                gVar.a(new d(aVar2));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static e a() {
        e eVar;
        boolean z;
        synchronized (f1038i) {
            eVar = f1039j;
            if (eVar != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return eVar;
    }

    public final int b() {
        this.f1040a.readLock().lock();
        try {
            return this.f1042c;
        } finally {
            this.f1040a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z;
        boolean z10 = true;
        if (this.f1045g == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (b() != 1) {
                z10 = false;
            }
            if (!z10) {
                this.f1040a.writeLock().lock();
                try {
                    if (this.f1042c != 0) {
                        this.f1042c = 0;
                        this.f1040a.writeLock().unlock();
                        a aVar = this.f1043e;
                        e eVar = aVar.f1049a;
                        try {
                            eVar.f1044f.a(new d(aVar));
                        } catch (Throwable th) {
                            eVar.d(th);
                        }
                    }
                } finally {
                    this.f1040a.writeLock().unlock();
                }
            }
        } else {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
    }

    /* JADX INFO: finally extract failed */
    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1040a.writeLock().lock();
        try {
            this.f1042c = 2;
            arrayList.addAll(this.f1041b);
            this.f1041b.clear();
            this.f1040a.writeLock().unlock();
            this.d.post(new f(arrayList, this.f1042c, th));
        } catch (Throwable th2) {
            this.f1040a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.f1040a.writeLock().lock();
        try {
            this.f1042c = 1;
            arrayList.addAll(this.f1041b);
            this.f1041b.clear();
            this.f1040a.writeLock().unlock();
            this.d.post(new f(arrayList, this.f1042c, (Throwable) null));
        } catch (Throwable th) {
            this.f1040a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: android.text.SpannableString} */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x00f8, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00dc, code lost:
        if (r3.b(r15, r6, r13, r5.d.f1089b) != false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00de, code lost:
        if (r0 != null) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e0, code lost:
        r0 = new android.text.SpannableString(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e5, code lost:
        r10 = r5.d.f1089b;
        r3.f1064a.getClass();
        r0.setSpan(new androidx.emoji2.text.o(r10), r6, r13, 33);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a A[Catch:{ all -> 0x0167 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a6 A[Catch:{ all -> 0x0167 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence f(int r13, int r14, java.lang.CharSequence r15) {
        /*
            r12 = this;
            int r0 = r12.b()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x000a
            r0 = r2
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            if (r0 == 0) goto L_0x0181
            if (r13 < 0) goto L_0x0179
            if (r14 < 0) goto L_0x0171
            if (r13 > r14) goto L_0x0015
            r0 = r2
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            java.lang.String r3 = "start should be <= than end"
            s6.a.k(r3, r0)
            r0 = 0
            if (r15 != 0) goto L_0x001f
            return r0
        L_0x001f:
            int r3 = r15.length()
            if (r13 > r3) goto L_0x0027
            r3 = r2
            goto L_0x0028
        L_0x0027:
            r3 = r1
        L_0x0028:
            java.lang.String r4 = "start should be < than charSequence length"
            s6.a.k(r4, r3)
            int r3 = r15.length()
            if (r14 > r3) goto L_0x0035
            r3 = r2
            goto L_0x0036
        L_0x0035:
            r3 = r1
        L_0x0036:
            java.lang.String r4 = "end should be < than charSequence length"
            s6.a.k(r4, r3)
            int r3 = r15.length()
            if (r3 == 0) goto L_0x0170
            if (r13 != r14) goto L_0x0045
            goto L_0x0170
        L_0x0045:
            androidx.emoji2.text.e$a r3 = r12.f1043e
            androidx.emoji2.text.i r3 = r3.f1047b
            r3.getClass()
            boolean r4 = r15 instanceof androidx.emoji2.text.n
            if (r4 == 0) goto L_0x0056
            r5 = r15
            androidx.emoji2.text.n r5 = (androidx.emoji2.text.n) r5
            r5.a()
        L_0x0056:
            java.lang.Class<androidx.emoji2.text.j> r5 = androidx.emoji2.text.j.class
            if (r4 != 0) goto L_0x0076
            boolean r6 = r15 instanceof android.text.Spannable     // Catch:{ all -> 0x0167 }
            if (r6 == 0) goto L_0x005f
            goto L_0x0076
        L_0x005f:
            boolean r6 = r15 instanceof android.text.Spanned     // Catch:{ all -> 0x0167 }
            if (r6 == 0) goto L_0x0079
            r6 = r15
            android.text.Spanned r6 = (android.text.Spanned) r6     // Catch:{ all -> 0x0167 }
            int r7 = r13 + -1
            int r8 = r14 + 1
            int r6 = r6.nextSpanTransition(r7, r8, r5)     // Catch:{ all -> 0x0167 }
            if (r6 > r14) goto L_0x0079
            android.text.SpannableString r0 = new android.text.SpannableString     // Catch:{ all -> 0x0167 }
            r0.<init>(r15)     // Catch:{ all -> 0x0167 }
            goto L_0x0079
        L_0x0076:
            r0 = r15
            android.text.Spannable r0 = (android.text.Spannable) r0     // Catch:{ all -> 0x0167 }
        L_0x0079:
            if (r0 == 0) goto L_0x00a4
            java.lang.Object[] r5 = r0.getSpans(r13, r14, r5)     // Catch:{ all -> 0x0167 }
            androidx.emoji2.text.j[] r5 = (androidx.emoji2.text.j[]) r5     // Catch:{ all -> 0x0167 }
            if (r5 == 0) goto L_0x00a4
            int r6 = r5.length     // Catch:{ all -> 0x0167 }
            if (r6 <= 0) goto L_0x00a4
            int r6 = r5.length     // Catch:{ all -> 0x0167 }
            r7 = r1
        L_0x0088:
            if (r7 >= r6) goto L_0x00a4
            r8 = r5[r7]     // Catch:{ all -> 0x0167 }
            int r9 = r0.getSpanStart(r8)     // Catch:{ all -> 0x0167 }
            int r10 = r0.getSpanEnd(r8)     // Catch:{ all -> 0x0167 }
            if (r9 == r14) goto L_0x0099
            r0.removeSpan(r8)     // Catch:{ all -> 0x0167 }
        L_0x0099:
            int r13 = java.lang.Math.min(r9, r13)     // Catch:{ all -> 0x0167 }
            int r14 = java.lang.Math.max(r10, r14)     // Catch:{ all -> 0x0167 }
            int r7 = r7 + 1
            goto L_0x0088
        L_0x00a4:
            if (r13 == r14) goto L_0x015e
            int r5 = r15.length()     // Catch:{ all -> 0x0167 }
            if (r13 < r5) goto L_0x00ae
            goto L_0x015e
        L_0x00ae:
            androidx.emoji2.text.i$b r5 = new androidx.emoji2.text.i$b     // Catch:{ all -> 0x0167 }
            androidx.emoji2.text.m r6 = r3.f1065b     // Catch:{ all -> 0x0167 }
            androidx.emoji2.text.m$a r6 = r6.f1087c     // Catch:{ all -> 0x0167 }
            r5.<init>(r6)     // Catch:{ all -> 0x0167 }
            int r6 = java.lang.Character.codePointAt(r15, r13)     // Catch:{ all -> 0x0167 }
            r7 = r1
        L_0x00bc:
            r8 = r6
        L_0x00bd:
            r6 = r13
        L_0x00be:
            r9 = 33
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = 2
            if (r13 >= r14) goto L_0x0116
            if (r7 >= r10) goto L_0x0116
            int r10 = r5.a(r8)     // Catch:{ all -> 0x0167 }
            if (r10 == r2) goto L_0x0106
            if (r10 == r11) goto L_0x00fa
            r11 = 3
            if (r10 == r11) goto L_0x00d4
            goto L_0x00be
        L_0x00d4:
            androidx.emoji2.text.m$a r10 = r5.d     // Catch:{ all -> 0x0167 }
            androidx.emoji2.text.h r10 = r10.f1089b     // Catch:{ all -> 0x0167 }
            boolean r10 = r3.b(r15, r6, r13, r10)     // Catch:{ all -> 0x0167 }
            if (r10 != 0) goto L_0x00f8
            if (r0 != 0) goto L_0x00e5
            android.text.SpannableString r0 = new android.text.SpannableString     // Catch:{ all -> 0x0167 }
            r0.<init>(r15)     // Catch:{ all -> 0x0167 }
        L_0x00e5:
            androidx.emoji2.text.m$a r10 = r5.d     // Catch:{ all -> 0x0167 }
            androidx.emoji2.text.h r10 = r10.f1089b     // Catch:{ all -> 0x0167 }
            androidx.emoji2.text.e$i r11 = r3.f1064a     // Catch:{ all -> 0x0167 }
            r11.getClass()     // Catch:{ all -> 0x0167 }
            androidx.emoji2.text.o r11 = new androidx.emoji2.text.o     // Catch:{ all -> 0x0167 }
            r11.<init>(r10)     // Catch:{ all -> 0x0167 }
            r0.setSpan(r11, r6, r13, r9)     // Catch:{ all -> 0x0167 }
            int r7 = r7 + 1
        L_0x00f8:
            r6 = r8
            goto L_0x00bc
        L_0x00fa:
            int r9 = java.lang.Character.charCount(r8)     // Catch:{ all -> 0x0167 }
            int r13 = r13 + r9
            if (r13 >= r14) goto L_0x00be
            int r8 = java.lang.Character.codePointAt(r15, r13)     // Catch:{ all -> 0x0167 }
            goto L_0x00be
        L_0x0106:
            int r13 = java.lang.Character.codePointAt(r15, r6)     // Catch:{ all -> 0x0167 }
            int r13 = java.lang.Character.charCount(r13)     // Catch:{ all -> 0x0167 }
            int r13 = r13 + r6
            if (r13 >= r14) goto L_0x00bd
            int r8 = java.lang.Character.codePointAt(r15, r13)     // Catch:{ all -> 0x0167 }
            goto L_0x00bd
        L_0x0116:
            int r14 = r5.f1069a     // Catch:{ all -> 0x0167 }
            if (r14 != r11) goto L_0x012b
            androidx.emoji2.text.m$a r14 = r5.f1071c     // Catch:{ all -> 0x0167 }
            androidx.emoji2.text.h r14 = r14.f1089b     // Catch:{ all -> 0x0167 }
            if (r14 == 0) goto L_0x012b
            int r14 = r5.f1073f     // Catch:{ all -> 0x0167 }
            if (r14 > r2) goto L_0x012a
            boolean r14 = r5.c()     // Catch:{ all -> 0x0167 }
            if (r14 == 0) goto L_0x012b
        L_0x012a:
            r1 = r2
        L_0x012b:
            if (r1 == 0) goto L_0x0152
            if (r7 >= r10) goto L_0x0152
            androidx.emoji2.text.m$a r14 = r5.f1071c     // Catch:{ all -> 0x0167 }
            androidx.emoji2.text.h r14 = r14.f1089b     // Catch:{ all -> 0x0167 }
            boolean r14 = r3.b(r15, r6, r13, r14)     // Catch:{ all -> 0x0167 }
            if (r14 != 0) goto L_0x0152
            if (r0 != 0) goto L_0x0141
            android.text.SpannableString r14 = new android.text.SpannableString     // Catch:{ all -> 0x0167 }
            r14.<init>(r15)     // Catch:{ all -> 0x0167 }
            r0 = r14
        L_0x0141:
            androidx.emoji2.text.m$a r14 = r5.f1071c     // Catch:{ all -> 0x0167 }
            androidx.emoji2.text.h r14 = r14.f1089b     // Catch:{ all -> 0x0167 }
            androidx.emoji2.text.e$i r1 = r3.f1064a     // Catch:{ all -> 0x0167 }
            r1.getClass()     // Catch:{ all -> 0x0167 }
            androidx.emoji2.text.o r1 = new androidx.emoji2.text.o     // Catch:{ all -> 0x0167 }
            r1.<init>(r14)     // Catch:{ all -> 0x0167 }
            r0.setSpan(r1, r6, r13, r9)     // Catch:{ all -> 0x0167 }
        L_0x0152:
            if (r0 != 0) goto L_0x0155
            r0 = r15
        L_0x0155:
            if (r4 == 0) goto L_0x015c
            androidx.emoji2.text.n r15 = (androidx.emoji2.text.n) r15
            r15.b()
        L_0x015c:
            r15 = r0
            goto L_0x0166
        L_0x015e:
            if (r4 == 0) goto L_0x0166
            r13 = r15
            androidx.emoji2.text.n r13 = (androidx.emoji2.text.n) r13
            r13.b()
        L_0x0166:
            return r15
        L_0x0167:
            r13 = move-exception
            if (r4 == 0) goto L_0x016f
            androidx.emoji2.text.n r15 = (androidx.emoji2.text.n) r15
            r15.b()
        L_0x016f:
            throw r13
        L_0x0170:
            return r15
        L_0x0171:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "end cannot be negative"
            r13.<init>(r14)
            throw r13
        L_0x0179:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "start cannot be negative"
            r13.<init>(r14)
            throw r13
        L_0x0181:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Not initialized yet"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.e.f(int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void g(C0013e eVar) {
        if (eVar != null) {
            this.f1040a.writeLock().lock();
            try {
                if (this.f1042c != 1) {
                    if (this.f1042c != 2) {
                        this.f1041b.add(eVar);
                    }
                }
                this.d.post(new f(Arrays.asList(new C0013e[]{eVar}), this.f1042c, (Throwable) null));
            } finally {
                this.f1040a.writeLock().unlock();
            }
        } else {
            throw new NullPointerException("initCallback cannot be null");
        }
    }
}
