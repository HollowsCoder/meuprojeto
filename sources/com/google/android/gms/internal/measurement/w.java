package com.google.android.gms.internal.measurement;

import androidx.databinding.a;
import java.util.Arrays;
import java.util.Comparator;

public final class w implements Comparator<o> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f2967a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i3 f2968b;

    public w(i iVar, i3 i3Var) {
        this.f2967a = iVar;
        this.f2968b = i3Var;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        o oVar = (o) obj;
        o oVar2 = (o) obj2;
        if (oVar instanceof s) {
            return !(oVar2 instanceof s) ? 1 : 0;
        }
        if (oVar2 instanceof s) {
            return -1;
        }
        i iVar = this.f2967a;
        if (iVar == null) {
            return oVar.zzc().compareTo(oVar2.zzc());
        }
        return (int) a.P(iVar.a(this.f2968b, Arrays.asList(new o[]{oVar, oVar2})).b().doubleValue());
    }
}
