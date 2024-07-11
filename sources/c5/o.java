package c5;

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
import o7.f;

public final class o implements e {

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f2167f = Charset.forName("UTF-8");

    /* renamed from: g  reason: collision with root package name */
    public static final c f2168g;

    /* renamed from: h  reason: collision with root package name */
    public static final c f2169h;

    /* renamed from: i  reason: collision with root package name */
    public static final n f2170i = n.f2166a;

    /* renamed from: a  reason: collision with root package name */
    public OutputStream f2171a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, d<?>> f2172b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, f<?>> f2173c;
    public final d<Object> d;

    /* renamed from: e  reason: collision with root package name */
    public final q f2174e = new q(this);

    static {
        l lVar = l.DEFAULT;
        i iVar = new i(1, lVar);
        HashMap hashMap = new HashMap();
        Class<m> cls = m.class;
        hashMap.put(cls, iVar);
        f2168g = new c("key", x0.i(hashMap));
        i iVar2 = new i(2, lVar);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(cls, iVar2);
        f2169h = new c("value", x0.i(hashMap2));
    }

    public o(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, d dVar) {
        this.f2171a = byteArrayOutputStream;
        this.f2172b = map;
        this.f2173c = map2;
        this.d = dVar;
    }

    public static int h(c cVar) {
        m mVar = (m) ((Annotation) cVar.f7749b.get(m.class));
        if (mVar != null) {
            return ((i) mVar).f2163a;
        }
        throw new b("Field has no @Protobuf config");
    }

    public final /* synthetic */ e a(c cVar, long j8) {
        g(cVar, j8, true);
        return this;
    }

    public final /* synthetic */ e b(c cVar, int i10) {
        d(cVar, i10, true);
        return this;
    }

    public final void c(c cVar, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    j((h(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f2167f);
                    j(bytes.length);
                    this.f2171a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object c10 : (Collection) obj) {
                    c(cVar, c10, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry i10 : ((Map) obj).entrySet()) {
                    i(f2170i, cVar, i10, false);
                }
            } else if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (!z || doubleValue != 0.0d) {
                    j((h(cVar) << 3) | 1);
                    this.f2171a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
                }
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z || floatValue != 0.0f) {
                    j((h(cVar) << 3) | 5);
                    this.f2171a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                g(cVar, ((Number) obj).longValue(), z);
            } else if (obj instanceof Boolean) {
                d(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (!z || bArr.length != 0) {
                    j((h(cVar) << 3) | 2);
                    j(bArr.length);
                    this.f2171a.write(bArr);
                }
            } else {
                d dVar = this.f2172b.get(obj.getClass());
                if (dVar != null) {
                    i(dVar, cVar, obj, z);
                    return;
                }
                f fVar = this.f2173c.get(obj.getClass());
                if (fVar != null) {
                    q qVar = this.f2174e;
                    qVar.f2176a = false;
                    qVar.f2178c = cVar;
                    qVar.f2177b = z;
                    fVar.a(obj, qVar);
                } else if (obj instanceof k) {
                    d(cVar, ((k) obj).getNumber(), true);
                } else if (obj instanceof Enum) {
                    d(cVar, ((Enum) obj).ordinal(), true);
                } else {
                    i(this.d, cVar, obj, z);
                }
            }
        }
    }

    public final void d(c cVar, int i10, boolean z) {
        if (!z || i10 != 0) {
            m mVar = (m) ((Annotation) cVar.f7749b.get(m.class));
            if (mVar != null) {
                l lVar = l.DEFAULT;
                i iVar = (i) mVar;
                int ordinal = iVar.f2164b.ordinal();
                int i11 = iVar.f2163a;
                if (ordinal == 0) {
                    j(i11 << 3);
                    j(i10);
                } else if (ordinal == 1) {
                    j(i11 << 3);
                    j((i10 + i10) ^ (i10 >> 31));
                } else if (ordinal == 2) {
                    j((i11 << 3) | 5);
                    this.f2171a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i10).array());
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

    public final /* synthetic */ e f(c cVar, boolean z) {
        d(cVar, z ? 1 : 0, true);
        return this;
    }

    public final void g(c cVar, long j8, boolean z) {
        if (!z || j8 != 0) {
            m mVar = (m) ((Annotation) cVar.f7749b.get(m.class));
            if (mVar != null) {
                l lVar = l.DEFAULT;
                i iVar = (i) mVar;
                int ordinal = iVar.f2164b.ordinal();
                int i10 = iVar.f2163a;
                if (ordinal == 0) {
                    j(i10 << 3);
                    k(j8);
                } else if (ordinal == 1) {
                    j(i10 << 3);
                    k((j8 >> 63) ^ (j8 + j8));
                } else if (ordinal == 2) {
                    j((i10 << 3) | 1);
                    this.f2171a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j8).array());
                }
            } else {
                throw new b("Field has no @Protobuf config");
            }
        }
    }

    public final void i(d dVar, c cVar, Object obj, boolean z) {
        OutputStream outputStream;
        j jVar = new j();
        try {
            outputStream = this.f2171a;
            this.f2171a = jVar;
            dVar.a(obj, this);
            this.f2171a = outputStream;
            long j8 = jVar.f2165o;
            jVar.close();
            if (!z || j8 != 0) {
                j((h(cVar) << 3) | 2);
                k(j8);
                dVar.a(obj, this);
            }
        } catch (Throwable th) {
            try {
                jVar.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void j(int i10) {
        while (((long) (i10 & -128)) != 0) {
            this.f2171a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f2171a.write(i10 & 127);
    }

    public final void k(long j8) {
        while ((-128 & j8) != 0) {
            this.f2171a.write((((int) j8) & 127) | 128);
            j8 >>>= 7;
        }
        this.f2171a.write(((int) j8) & 127);
    }
}
