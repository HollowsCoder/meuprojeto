package a0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.Objects;
import java.util.WeakHashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f22a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<b, SparseArray<a>> f23b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f24c = new Object();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ColorStateList f25a;

        /* renamed from: b  reason: collision with root package name */
        public final Configuration f26b;

        public a(ColorStateList colorStateList, Configuration configuration) {
            this.f25a = colorStateList;
            this.f26b = configuration;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f27a;

        /* renamed from: b  reason: collision with root package name */
        public final Resources.Theme f28b;

        public b(Resources resources, Resources.Theme theme) {
            this.f27a = resources;
            this.f28b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f27a.equals(bVar.f27a) || !Objects.equals(this.f28b, bVar.f28b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Objects.hash(new Object[]{this.f27a, this.f28b});
        }
    }

    public static abstract class c {
        public final void a(int i10) {
            new Handler(Looper.getMainLooper()).post(new f(this, i10));
        }

        public final void b(Typeface typeface) {
            new Handler(Looper.getMainLooper()).post(new e(this, typeface));
        }

        public abstract void c(int i10);

        public abstract void d(Typeface typeface);
    }

    public static Typeface a(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i10, new TypedValue(), 0, (c) null, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        if (r9 != null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
        if (r9 != null) goto L_0x009f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a5 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface b(android.content.Context r14, int r15, android.util.TypedValue r16, int r17, a0.d.c r18, boolean r19, boolean r20) {
        /*
            r8 = r15
            r0 = r16
            r7 = r17
            r9 = r18
            android.content.res.Resources r10 = r14.getResources()
            r1 = 1
            r10.getValue(r15, r0, r1)
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x00c8
            java.lang.String r12 = r1.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r12.startsWith(r0)
            r13 = -3
            if (r0 != 0) goto L_0x0026
            if (r9 == 0) goto L_0x00a2
            goto L_0x009f
        L_0x0026:
            n.g<java.lang.String, android.graphics.Typeface> r0 = b0.e.f1936b
            java.lang.String r1 = b0.e.b(r10, r15, r7)
            java.lang.Object r1 = r0.b(r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x003a
            if (r9 == 0) goto L_0x008d
            r9.b(r1)
            goto L_0x008d
        L_0x003a:
            if (r20 == 0) goto L_0x003e
            goto L_0x00a2
        L_0x003e:
            java.lang.String r1 = r12.toLowerCase()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008f }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008f }
            if (r1 == 0) goto L_0x006d
            android.content.res.XmlResourceParser r0 = r10.getXml(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008f }
            a0.c$a r2 = a0.c.a(r0, r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008f }
            if (r2 != 0) goto L_0x005f
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008f }
            if (r9 == 0) goto L_0x00a2
            r9.a(r13)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008f }
            goto L_0x00a2
        L_0x005f:
            r1 = r14
            r3 = r10
            r4 = r15
            r5 = r17
            r6 = r18
            r7 = r19
            android.graphics.Typeface r0 = b0.e.a(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008f }
            goto L_0x00a3
        L_0x006d:
            b0.l r1 = b0.e.f1935a     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008f }
            r2 = r14
            r3 = r10
            r4 = r15
            r5 = r12
            r6 = r17
            android.graphics.Typeface r1 = r1.d(r2, r3, r4, r5, r6)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008f }
            if (r1 == 0) goto L_0x0082
            java.lang.String r2 = b0.e.b(r10, r15, r7)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008f }
            r0.c(r2, r1)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008f }
        L_0x0082:
            if (r9 == 0) goto L_0x008d
            if (r1 == 0) goto L_0x008a
            r9.b(r1)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008f }
            goto L_0x008d
        L_0x008a:
            r9.a(r13)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008f }
        L_0x008d:
            r0 = r1
            goto L_0x00a3
        L_0x008f:
            r0 = move-exception
            java.lang.String r1 = "Failed to read xml resource "
            goto L_0x0096
        L_0x0093:
            r0 = move-exception
            java.lang.String r1 = "Failed to parse xml resource "
        L_0x0096:
            java.lang.String r1 = r1.concat(r12)
            android.util.Log.e(r11, r1, r0)
            if (r9 == 0) goto L_0x00a2
        L_0x009f:
            r9.a(r13)
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            if (r0 != 0) goto L_0x00c7
            if (r9 != 0) goto L_0x00c7
            if (r20 == 0) goto L_0x00aa
            goto L_0x00c7
        L_0x00aa:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Font resource ID #0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r15)
            r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c7:
            return r0
        L_0x00c8:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Resource \""
            r2.<init>(r3)
            java.lang.String r3 = r10.getResourceName(r15)
            r2.append(r3)
            java.lang.String r3 = "\" ("
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r15)
            r2.append(r3)
            java.lang.String r3 = ") is not a Font: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.d.b(android.content.Context, int, android.util.TypedValue, int, a0.d$c, boolean, boolean):android.graphics.Typeface");
    }
}
