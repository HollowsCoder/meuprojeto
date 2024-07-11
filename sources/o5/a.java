package o5;

import com.google.android.gms.internal.vision.t;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;

public final class a implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f7741o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ t f7742p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ DynamiteClearcutLogger f7743q;

    public a(DynamiteClearcutLogger dynamiteClearcutLogger, int i10, t tVar) {
        this.f7743q = dynamiteClearcutLogger;
        this.f7741o = i10;
        this.f7742p = tVar;
    }

    public final void run() {
        this.f7743q.zzc.zza(this.f7741o, this.f7742p);
    }
}
