package r7;

import androidx.appcompat.widget.x0;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import o7.b;
import o7.c;
import o7.d;
import o7.e;
import r7.d;

public final class f implements e {

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f8444f = Charset.forName("UTF-8");

    /* renamed from: g  reason: collision with root package name */
    public static final c f8445g;

    /* renamed from: h  reason: collision with root package name */
    public static final c f8446h;

    /* renamed from: i  reason: collision with root package name */
    public static final e f8447i = new e();

    /* renamed from: a  reason: collision with root package name */
    public OutputStream f8448a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, d<?>> f8449b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, o7.f<?>> f8450c;
    public final d<Object> d;

    /* renamed from: e  reason: collision with root package name */
    public final i f8451e = new i(this);

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8452a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                r7.d$a[] r0 = r7.d.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8452a = r0
                r7.d$a r1 = r7.d.a.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8452a     // Catch:{ NoSuchFieldError -> 0x001d }
                r7.d$a r1 = r7.d.a.SIGNED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8452a     // Catch:{ NoSuchFieldError -> 0x0028 }
                r7.d$a r1 = r7.d.a.FIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r7.f.a.<clinit>():void");
        }
    }

    static {
        d.a aVar = d.a.DEFAULT;
        a aVar2 = new a(1, aVar);
        HashMap hashMap = new HashMap();
        Class<d> cls = d.class;
        hashMap.put(cls, aVar2);
        f8445g = new c("key", x0.i(hashMap));
        a aVar3 = new a(2, aVar);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(cls, aVar3);
        f8446h = new c("value", x0.i(hashMap2));
    }

    public f(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, o7.d dVar) {
        this.f8448a = byteArrayOutputStream;
        this.f8449b = map;
        this.f8450c = map2;
        this.d = dVar;
    }

    public static int i(c cVar) {
        d dVar = (d) ((Annotation) cVar.f7749b.get(d.class));
        if (dVar != null) {
            return ((a) dVar).f8441a;
        }
        throw new b("Field has no @Protobuf config");
    }

    public final e a(c cVar, long j8) {
        g(cVar, j8, true);
        return this;
    }

    public final e b(c cVar, int i10) {
        d(cVar, i10, true);
        return this;
    }

    public final f c(c cVar, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            j((i(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f8444f);
            j(bytes.length);
            this.f8448a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object c10 : (Collection) obj) {
                c(cVar, c10, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry h10 : ((Map) obj).entrySet()) {
                h(f8447i, cVar, h10, false);
            }
            return this;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (!z || doubleValue != 0.0d) {
                j((i(cVar) << 3) | 1);
                this.f8448a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            }
            return this;
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z || floatValue != 0.0f) {
                j((i(cVar) << 3) | 5);
                this.f8448a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            }
            return this;
        } else if (obj instanceof Number) {
            g(cVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            d(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            j((i(cVar) << 3) | 2);
            j(bArr.length);
            this.f8448a.write(bArr);
            return this;
        } else {
            o7.d dVar = this.f8449b.get(obj.getClass());
            if (dVar != null) {
                h(dVar, cVar, obj, z);
                return this;
            }
            o7.f fVar = this.f8450c.get(obj.getClass());
            if (fVar != null) {
                i iVar = this.f8451e;
                iVar.f8457a = false;
                iVar.f8459c = cVar;
                iVar.f8458b = z;
                fVar.a(obj, iVar);
                return this;
            } else if (obj instanceof c) {
                d(cVar, ((c) obj).getNumber(), true);
                return this;
            } else if (obj instanceof Enum) {
                d(cVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                h(this.d, cVar, obj, z);
                return this;
            }
        }
    }

    public final void d(c cVar, int i10, boolean z) {
        if (!z || i10 != 0) {
            d dVar = (d) ((Annotation) cVar.f7749b.get(d.class));
            if (dVar != null) {
                a aVar = (a) dVar;
                int i11 = a.f8452a[aVar.f8442b.ordinal()];
                int i12 = aVar.f8441a;
                if (i11 == 1) {
                    j(i12 << 3);
                    j(i10);
                } else if (i11 == 2) {
                    j(i12 << 3);
                    j((i10 << 1) ^ (i10 >> 31));
                } else if (i11 == 3) {
                    j((i12 << 3) | 5);
                    this.f8448a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i10).array());
                }
            } else {
                throw new b("Field has no @Protobuf config");
            }
        }
    }

    public final e e(c cVar, Object obj) {
        c(cVar, obj, true);
        return this;
    }

    public final e f(c cVar, boolean z) {
        d(cVar, z ? 1 : 0, true);
        return this;
    }

    public final void g(c cVar, long j8, boolean z) {
        if (!z || j8 != 0) {
            d dVar = (d) ((Annotation) cVar.f7749b.get(d.class));
            if (dVar != null) {
                a aVar = (a) dVar;
                int i10 = a.f8452a[aVar.f8442b.ordinal()];
                int i11 = aVar.f8441a;
                if (i10 == 1) {
                    j(i11 << 3);
                    k(j8);
                } else if (i10 == 2) {
                    j(i11 << 3);
                    k((j8 >> 63) ^ (j8 << 1));
                } else if (i10 == 3) {
                    j((i11 << 3) | 1);
                    this.f8448a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j8).array());
                }
            } else {
                throw new b("Field has no @Protobuf config");
            }
        }
    }

    public final void h(o7.d dVar, c cVar, Object obj, boolean z) {
        OutputStream outputStream;
        b bVar = new b();
        try {
            outputStream = this.f8448a;
            this.f8448a = bVar;
            dVar.a(obj, this);
            this.f8448a = outputStream;
            long j8 = bVar.f8443o;
            bVar.close();
            if (!z || j8 != 0) {
                j((i(cVar) << 3) | 2);
                k(j8);
                dVar.a(obj, this);
            }
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void j(int i10) {
        while (((long) (i10 & -128)) != 0) {
            this.f8448a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f8448a.write(i10 & 127);
    }

    public final void k(long j8) {
        while ((-128 & j8) != 0) {
            this.f8448a.write((((int) j8) & 127) | 128);
            j8 >>>= 7;
        }
        this.f8448a.write(((int) j8) & 127);
    }
}
