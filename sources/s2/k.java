package s2;

import android.util.Log;
import com.bumptech.glide.load.data.e;
import e3.b;
import h0.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import n3.a;
import q2.h;
import q2.j;

public final class k<DataType, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<DataType> f8617a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends j<DataType, ResourceType>> f8618b;

    /* renamed from: c  reason: collision with root package name */
    public final b<ResourceType, Transcode> f8619c;
    public final c<List<Throwable>> d;

    /* renamed from: e  reason: collision with root package name */
    public final String f8620e;

    public k(Class cls, Class cls2, Class cls3, List list, b bVar, a.c cVar) {
        this.f8617a = cls;
        this.f8618b = list;
        this.f8619c = bVar;
        this.d = cVar;
        this.f8620e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: s2.w<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: s2.w<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: s2.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: s2.v<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: s2.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: s2.w<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: s2.w<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: s2.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: s2.y} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final s2.w a(int r18, int r19, q2.h r20, com.bumptech.glide.load.data.e r21, s2.j.c r22) {
        /*
            r17 = this;
            r7 = r17
            r0 = r22
            h0.c<java.util.List<java.lang.Throwable>> r8 = r7.d
            java.lang.Object r1 = r8.b()
            s6.a.n(r1)
            r9 = r1
            java.util.List r9 = (java.util.List) r9
            r1 = r17
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r9
            s2.w r1 = r1.b(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0131 }
            r8.a(r9)
            s2.j r2 = s2.j.this
            r2.getClass()
            java.lang.Object r3 = r1.get()
            java.lang.Class r15 = r3.getClass()
            q2.a r3 = q2.a.RESOURCE_DISK_CACHE
            q2.a r0 = r0.f8609a
            s2.i<R> r4 = r2.f8597o
            r5 = 0
            if (r0 == r3) goto L_0x0048
            q2.l r3 = r4.e(r15)
            com.bumptech.glide.g r6 = r2.f8603v
            int r8 = r2.z
            int r9 = r2.A
            s2.w r6 = r3.b(r6, r1, r8, r9)
            r14 = r3
            goto L_0x004a
        L_0x0048:
            r6 = r1
            r14 = r5
        L_0x004a:
            boolean r3 = r1.equals(r6)
            if (r3 != 0) goto L_0x0053
            r1.d()
        L_0x0053:
            com.bumptech.glide.g r1 = r4.f8583c
            com.bumptech.glide.k r1 = r1.f2241b
            h3.d r1 = r1.d
            java.lang.Class r3 = r6.c()
            q2.k r1 = r1.a(r3)
            r3 = 0
            r13 = 1
            if (r1 == 0) goto L_0x0067
            r1 = r13
            goto L_0x0068
        L_0x0067:
            r1 = r3
        L_0x0068:
            if (r1 == 0) goto L_0x008e
            com.bumptech.glide.g r1 = r4.f8583c
            com.bumptech.glide.k r1 = r1.f2241b
            r1.getClass()
            java.lang.Class r5 = r6.c()
            h3.d r1 = r1.d
            q2.k r5 = r1.a(r5)
            if (r5 == 0) goto L_0x0084
            q2.h r1 = r2.C
            q2.c r1 = r5.h(r1)
            goto L_0x0090
        L_0x0084:
            com.bumptech.glide.k$d r0 = new com.bumptech.glide.k$d
            java.lang.Class r1 = r6.c()
            r0.<init>(r1)
            throw r0
        L_0x008e:
            q2.c r1 = q2.c.NONE
        L_0x0090:
            q2.f r8 = r2.L
            java.util.ArrayList r9 = r4.b()
            int r10 = r9.size()
            r11 = r3
        L_0x009b:
            if (r11 >= r10) goto L_0x00b0
            java.lang.Object r12 = r9.get(r11)
            w2.n$a r12 = (w2.n.a) r12
            q2.f r12 = r12.f9192a
            boolean r12 = r12.equals(r8)
            if (r12 == 0) goto L_0x00ad
            r8 = r13
            goto L_0x00b1
        L_0x00ad:
            int r11 = r11 + 1
            goto L_0x009b
        L_0x00b0:
            r8 = r3
        L_0x00b1:
            r8 = r8 ^ r13
            s2.l r9 = r2.B
            boolean r0 = r9.d(r8, r0, r1)
            if (r0 == 0) goto L_0x0128
            if (r5 == 0) goto L_0x011a
            int[] r0 = s2.j.a.f8608c
            int r8 = r1.ordinal()
            r0 = r0[r8]
            if (r0 == r13) goto L_0x00f5
            r8 = 2
            if (r0 != r8) goto L_0x00e1
            s2.y r0 = new s2.y
            com.bumptech.glide.g r1 = r4.f8583c
            t2.b r9 = r1.f2240a
            q2.f r10 = r2.L
            q2.f r11 = r2.w
            int r12 = r2.z
            int r1 = r2.A
            q2.h r4 = r2.C
            r8 = r0
            r13 = r1
            r16 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00fe
        L_0x00e1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown strategy: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x00f5:
            s2.f r0 = new s2.f
            q2.f r1 = r2.L
            q2.f r4 = r2.w
            r0.<init>(r1, r4)
        L_0x00fe:
            n3.a$c r1 = s2.v.f8690s
            java.lang.Object r1 = r1.b()
            s2.v r1 = (s2.v) r1
            s6.a.n(r1)
            r1.f8694r = r3
            r3 = 1
            r1.f8693q = r3
            r1.f8692p = r6
            s2.j$d<?> r2 = r2.f8602t
            r2.f8611a = r0
            r2.f8612b = r5
            r2.f8613c = r1
            r6 = r1
            goto L_0x0128
        L_0x011a:
            com.bumptech.glide.k$d r0 = new com.bumptech.glide.k$d
            java.lang.Object r1 = r6.get()
            java.lang.Class r1 = r1.getClass()
            r0.<init>(r1)
            throw r0
        L_0x0128:
            e3.b<ResourceType, Transcode> r0 = r7.f8619c
            r1 = r20
            s2.w r0 = r0.b(r6, r1)
            return r0
        L_0x0131:
            r0 = move-exception
            r1 = r0
            r8.a(r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.k.a(int, int, q2.h, com.bumptech.glide.load.data.e, s2.j$c):s2.w");
    }

    public final w<ResourceType> b(e<DataType> eVar, int i10, int i11, h hVar, List<Throwable> list) {
        List<? extends j<DataType, ResourceType>> list2 = this.f8618b;
        int size = list2.size();
        w<ResourceType> wVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            j jVar = (j) list2.get(i12);
            try {
                if (jVar.b(eVar.a(), hVar)) {
                    wVar = jVar.a(eVar.a(), i10, i11, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e10);
                }
                list.add(e10);
            }
            if (wVar != null) {
                break;
            }
        }
        if (wVar != null) {
            return wVar;
        }
        throw new r(this.f8620e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f8617a + ", decoders=" + this.f8618b + ", transcoder=" + this.f8619c + '}';
    }
}
