package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import u4.a;

public final class l0 extends a0 implements n0 {
    public l0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 0);
    }

    public final void beginAdUnitExposure(String str, long j8) {
        Parcel J = J();
        J.writeString(str);
        J.writeLong(j8);
        L(J, 23);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        c0.b(J, bundle);
        L(J, 9);
    }

    public final void endAdUnitExposure(String str, long j8) {
        Parcel J = J();
        J.writeString(str);
        J.writeLong(j8);
        L(J, 24);
    }

    public final void generateEventId(q0 q0Var) {
        Parcel J = J();
        c0.c(J, q0Var);
        L(J, 22);
    }

    public final void getCachedAppInstanceId(q0 q0Var) {
        Parcel J = J();
        c0.c(J, q0Var);
        L(J, 19);
    }

    public final void getConditionalUserProperties(String str, String str2, q0 q0Var) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        c0.c(J, q0Var);
        L(J, 10);
    }

    public final void getCurrentScreenClass(q0 q0Var) {
        Parcel J = J();
        c0.c(J, q0Var);
        L(J, 17);
    }

    public final void getCurrentScreenName(q0 q0Var) {
        Parcel J = J();
        c0.c(J, q0Var);
        L(J, 16);
    }

    public final void getGmpAppId(q0 q0Var) {
        Parcel J = J();
        c0.c(J, q0Var);
        L(J, 21);
    }

    public final void getMaxUserProperties(String str, q0 q0Var) {
        Parcel J = J();
        J.writeString(str);
        c0.c(J, q0Var);
        L(J, 6);
    }

    public final void getUserProperties(String str, String str2, boolean z, q0 q0Var) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        ClassLoader classLoader = c0.f2650a;
        J.writeInt(z ? 1 : 0);
        c0.c(J, q0Var);
        L(J, 5);
    }

    public final void initialize(a aVar, w0 w0Var, long j8) {
        Parcel J = J();
        c0.c(J, aVar);
        c0.b(J, w0Var);
        J.writeLong(j8);
        L(J, 1);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z10, long j8) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        c0.b(J, bundle);
        J.writeInt(z ? 1 : 0);
        J.writeInt(z10 ? 1 : 0);
        J.writeLong(j8);
        L(J, 2);
    }

    public final void logHealthData(int i10, String str, a aVar, a aVar2, a aVar3) {
        Parcel J = J();
        J.writeInt(5);
        J.writeString(str);
        c0.c(J, aVar);
        c0.c(J, aVar2);
        c0.c(J, aVar3);
        L(J, 33);
    }

    public final void onActivityCreated(a aVar, Bundle bundle, long j8) {
        Parcel J = J();
        c0.c(J, aVar);
        c0.b(J, bundle);
        J.writeLong(j8);
        L(J, 27);
    }

    public final void onActivityDestroyed(a aVar, long j8) {
        Parcel J = J();
        c0.c(J, aVar);
        J.writeLong(j8);
        L(J, 28);
    }

    public final void onActivityPaused(a aVar, long j8) {
        Parcel J = J();
        c0.c(J, aVar);
        J.writeLong(j8);
        L(J, 29);
    }

    public final void onActivityResumed(a aVar, long j8) {
        Parcel J = J();
        c0.c(J, aVar);
        J.writeLong(j8);
        L(J, 30);
    }

    public final void onActivitySaveInstanceState(a aVar, q0 q0Var, long j8) {
        Parcel J = J();
        c0.c(J, aVar);
        c0.c(J, q0Var);
        J.writeLong(j8);
        L(J, 31);
    }

    public final void onActivityStarted(a aVar, long j8) {
        Parcel J = J();
        c0.c(J, aVar);
        J.writeLong(j8);
        L(J, 25);
    }

    public final void onActivityStopped(a aVar, long j8) {
        Parcel J = J();
        c0.c(J, aVar);
        J.writeLong(j8);
        L(J, 26);
    }

    public final void registerOnMeasurementEventListener(t0 t0Var) {
        Parcel J = J();
        c0.c(J, t0Var);
        L(J, 35);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j8) {
        Parcel J = J();
        c0.b(J, bundle);
        J.writeLong(j8);
        L(J, 8);
    }

    public final void setCurrentScreen(a aVar, String str, String str2, long j8) {
        Parcel J = J();
        c0.c(J, aVar);
        J.writeString(str);
        J.writeString(str2);
        J.writeLong(j8);
        L(J, 15);
    }

    public final void setDataCollectionEnabled(boolean z) {
        Parcel J = J();
        ClassLoader classLoader = c0.f2650a;
        J.writeInt(z ? 1 : 0);
        L(J, 39);
    }

    public final void setUserProperty(String str, String str2, a aVar, boolean z, long j8) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        c0.c(J, aVar);
        J.writeInt(z ? 1 : 0);
        J.writeLong(j8);
        L(J, 4);
    }
}
