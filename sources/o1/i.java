package o1;

import android.graphics.PointF;
import h1.l;
import j1.c;
import j1.n;
import n1.b;
import n1.h;

public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f7634a;

    /* renamed from: b  reason: collision with root package name */
    public final a f7635b;

    /* renamed from: c  reason: collision with root package name */
    public final b f7636c;
    public final h<PointF, PointF> d;

    /* renamed from: e  reason: collision with root package name */
    public final b f7637e;

    /* renamed from: f  reason: collision with root package name */
    public final b f7638f;

    /* renamed from: g  reason: collision with root package name */
    public final b f7639g;

    /* renamed from: h  reason: collision with root package name */
    public final b f7640h;

    /* renamed from: i  reason: collision with root package name */
    public final b f7641i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f7642j;

    public enum a {
        STAR(1),
        POLYGON(2);
        
        private final int value;

        private a(int i10) {
            this.value = i10;
        }

        public static a forValue(int i10) {
            for (a aVar : values()) {
                if (aVar.value == i10) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public i(String str, a aVar, b bVar, h<PointF, PointF> hVar, b bVar2, b bVar3, b bVar4, b bVar5, b bVar6, boolean z) {
        this.f7634a = str;
        this.f7635b = aVar;
        this.f7636c = bVar;
        this.d = hVar;
        this.f7637e = bVar2;
        this.f7638f = bVar3;
        this.f7639g = bVar4;
        this.f7640h = bVar5;
        this.f7641i = bVar6;
        this.f7642j = z;
    }

    public final c a(l lVar, p1.b bVar) {
        return new n(lVar, bVar, this);
    }
}
