package androidx.fragment.app;

import androidx.lifecycle.h;
import java.util.ArrayList;

public abstract class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<a> f1158a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public int f1159b;

    /* renamed from: c  reason: collision with root package name */
    public int f1160c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f1161e;

    /* renamed from: f  reason: collision with root package name */
    public int f1162f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1163g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1164h = true;

    /* renamed from: i  reason: collision with root package name */
    public String f1165i;

    /* renamed from: j  reason: collision with root package name */
    public int f1166j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1167k;
    public int l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f1168m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<String> f1169n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<String> f1170o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1171p = false;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1172a;

        /* renamed from: b  reason: collision with root package name */
        public n f1173b;

        /* renamed from: c  reason: collision with root package name */
        public int f1174c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f1175e;

        /* renamed from: f  reason: collision with root package name */
        public int f1176f;

        /* renamed from: g  reason: collision with root package name */
        public h.c f1177g;

        /* renamed from: h  reason: collision with root package name */
        public h.c f1178h;

        public a() {
        }

        public a(int i10, n nVar) {
            this.f1172a = i10;
            this.f1173b = nVar;
            h.c cVar = h.c.RESUMED;
            this.f1177g = cVar;
            this.f1178h = cVar;
        }
    }

    public final void b(a aVar) {
        this.f1158a.add(aVar);
        aVar.f1174c = this.f1159b;
        aVar.d = this.f1160c;
        aVar.f1175e = this.d;
        aVar.f1176f = this.f1161e;
    }
}
