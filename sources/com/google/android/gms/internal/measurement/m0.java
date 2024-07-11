package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

public abstract class m0 extends b0 implements n0 {
    public m0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static n0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof n0 ? (n0) queryLocalInterface : new l0(iBinder);
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v5, types: [com.google.android.gms.internal.measurement.q0] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v11, types: [com.google.android.gms.internal.measurement.q0] */
    /* JADX WARNING: type inference failed for: r4v16, types: [com.google.android.gms.internal.measurement.q0] */
    /* JADX WARNING: type inference failed for: r4v20, types: [com.google.android.gms.internal.measurement.q0] */
    /* JADX WARNING: type inference failed for: r4v26, types: [com.google.android.gms.internal.measurement.q0] */
    /* JADX WARNING: type inference failed for: r4v30, types: [com.google.android.gms.internal.measurement.q0] */
    /* JADX WARNING: type inference failed for: r4v34, types: [com.google.android.gms.internal.measurement.v0] */
    /* JADX WARNING: type inference failed for: r4v38, types: [com.google.android.gms.internal.measurement.q0] */
    /* JADX WARNING: type inference failed for: r4v42, types: [com.google.android.gms.internal.measurement.q0] */
    /* JADX WARNING: type inference failed for: r4v46, types: [com.google.android.gms.internal.measurement.q0] */
    /* JADX WARNING: type inference failed for: r4v50, types: [com.google.android.gms.internal.measurement.q0] */
    /* JADX WARNING: type inference failed for: r4v54, types: [com.google.android.gms.internal.measurement.q0] */
    /* JADX WARNING: type inference failed for: r4v59, types: [com.google.android.gms.internal.measurement.q0] */
    /* JADX WARNING: type inference failed for: r4v66, types: [com.google.android.gms.internal.measurement.t0] */
    /* JADX WARNING: type inference failed for: r4v70, types: [com.google.android.gms.internal.measurement.t0] */
    /* JADX WARNING: type inference failed for: r4v74, types: [com.google.android.gms.internal.measurement.t0] */
    /* JADX WARNING: type inference failed for: r4v78, types: [com.google.android.gms.internal.measurement.q0] */
    /* JADX WARNING: type inference failed for: r4v82, types: [com.google.android.gms.internal.measurement.q0] */
    /* JADX WARNING: type inference failed for: r4v86 */
    /* JADX WARNING: type inference failed for: r4v87 */
    /* JADX WARNING: type inference failed for: r4v88 */
    /* JADX WARNING: type inference failed for: r4v89 */
    /* JADX WARNING: type inference failed for: r4v90 */
    /* JADX WARNING: type inference failed for: r4v91 */
    /* JADX WARNING: type inference failed for: r4v92 */
    /* JADX WARNING: type inference failed for: r4v93 */
    /* JADX WARNING: type inference failed for: r4v94 */
    /* JADX WARNING: type inference failed for: r4v95 */
    /* JADX WARNING: type inference failed for: r4v96 */
    /* JADX WARNING: type inference failed for: r4v97 */
    /* JADX WARNING: type inference failed for: r4v98 */
    /* JADX WARNING: type inference failed for: r4v99 */
    /* JADX WARNING: type inference failed for: r4v100 */
    /* JADX WARNING: type inference failed for: r4v101 */
    /* JADX WARNING: type inference failed for: r4v102 */
    /* JADX WARNING: type inference failed for: r4v103 */
    /* JADX WARNING: type inference failed for: r4v104 */
    /* JADX WARNING: type inference failed for: r4v105 */
    /* JADX WARNING: type inference failed for: r4v106 */
    /* JADX WARNING: type inference failed for: r4v107 */
    /* JADX WARNING: type inference failed for: r4v108 */
    /* JADX WARNING: type inference failed for: r4v109 */
    /* JADX WARNING: type inference failed for: r4v110 */
    /* JADX WARNING: type inference failed for: r4v111 */
    /* JADX WARNING: type inference failed for: r4v112 */
    /* JADX WARNING: type inference failed for: r4v113 */
    /* JADX WARNING: type inference failed for: r4v114 */
    /* JADX WARNING: type inference failed for: r4v115 */
    /* JADX WARNING: type inference failed for: r4v116 */
    /* JADX WARNING: type inference failed for: r4v117 */
    /* JADX WARNING: type inference failed for: r4v118 */
    /* JADX WARNING: type inference failed for: r4v119 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean I(int r12, android.os.Parcel r13, android.os.Parcel r14) {
        /*
            r11 = this;
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IEventHandlerProxy"
            r8 = 1
            r2 = 0
            java.lang.String r3 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            r4 = 0
            switch(r12) {
                case 1: goto L_0x0438;
                case 2: goto L_0x0408;
                case 3: goto L_0x03d5;
                case 4: goto L_0x03ac;
                case 5: goto L_0x037e;
                case 6: goto L_0x035d;
                case 7: goto L_0x0350;
                case 8: goto L_0x033f;
                case 9: goto L_0x032a;
                case 10: goto L_0x0305;
                case 11: goto L_0x02f3;
                case 12: goto L_0x02ea;
                case 13: goto L_0x02e1;
                case 14: goto L_0x02d8;
                case 15: goto L_0x02be;
                case 16: goto L_0x02a1;
                case 17: goto L_0x0284;
                case 18: goto L_0x0265;
                case 19: goto L_0x0248;
                case 20: goto L_0x022b;
                case 21: goto L_0x020e;
                case 22: goto L_0x01f1;
                case 23: goto L_0x01e4;
                case 24: goto L_0x01d7;
                case 25: goto L_0x01c6;
                case 26: goto L_0x01b5;
                case 27: goto L_0x019c;
                case 28: goto L_0x018b;
                case 29: goto L_0x017a;
                case 30: goto L_0x0169;
                case 31: goto L_0x0140;
                case 32: goto L_0x0117;
                case 33: goto L_0x00f1;
                case 34: goto L_0x00d4;
                case 35: goto L_0x00b7;
                case 36: goto L_0x009a;
                case 37: goto L_0x008f;
                case 38: goto L_0x006e;
                case 39: goto L_0x0060;
                case 40: goto L_0x0043;
                case 41: goto L_0x000a;
                case 42: goto L_0x0036;
                case 43: goto L_0x002d;
                case 44: goto L_0x001c;
                case 45: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            return r2
        L_0x000b:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.c0.a(r13, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r13.readLong()
            r11.setConsentThirdParty(r1, r2)
            goto L_0x044f
        L_0x001c:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.c0.a(r13, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r13.readLong()
            r11.setConsent(r1, r2)
            goto L_0x044f
        L_0x002d:
            long r0 = r13.readLong()
            r11.clearMeasurementEnabled(r0)
            goto L_0x044f
        L_0x0036:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.measurement.c0.a(r13, r1)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r11.setDefaultEventParameters(r0)
            goto L_0x044f
        L_0x0043:
            android.os.IBinder r0 = r13.readStrongBinder()
            if (r0 != 0) goto L_0x004a
            goto L_0x005b
        L_0x004a:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.q0
            if (r2 == 0) goto L_0x0056
            r4 = r1
            com.google.android.gms.internal.measurement.q0 r4 = (com.google.android.gms.internal.measurement.q0) r4
            goto L_0x005b
        L_0x0056:
            com.google.android.gms.internal.measurement.o0 r4 = new com.google.android.gms.internal.measurement.o0
            r4.<init>(r0)
        L_0x005b:
            r11.isDataCollectionEnabled(r4)
            goto L_0x044f
        L_0x0060:
            java.lang.ClassLoader r1 = com.google.android.gms.internal.measurement.c0.f2650a
            int r0 = r13.readInt()
            if (r0 == 0) goto L_0x0069
            r2 = r8
        L_0x0069:
            r11.setDataCollectionEnabled(r2)
            goto L_0x044f
        L_0x006e:
            android.os.IBinder r1 = r13.readStrongBinder()
            if (r1 != 0) goto L_0x0075
            goto L_0x0086
        L_0x0075:
            android.os.IInterface r2 = r1.queryLocalInterface(r3)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.q0
            if (r3 == 0) goto L_0x0081
            r4 = r2
            com.google.android.gms.internal.measurement.q0 r4 = (com.google.android.gms.internal.measurement.q0) r4
            goto L_0x0086
        L_0x0081:
            com.google.android.gms.internal.measurement.o0 r4 = new com.google.android.gms.internal.measurement.o0
            r4.<init>(r1)
        L_0x0086:
            int r0 = r13.readInt()
            r11.getTestFlag(r4, r0)
            goto L_0x044f
        L_0x008f:
            java.lang.ClassLoader r1 = com.google.android.gms.internal.measurement.c0.f2650a
            java.util.HashMap r0 = r13.readHashMap(r1)
            r11.initForTests(r0)
            goto L_0x044f
        L_0x009a:
            android.os.IBinder r0 = r13.readStrongBinder()
            if (r0 != 0) goto L_0x00a1
            goto L_0x00b2
        L_0x00a1:
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.t0
            if (r2 == 0) goto L_0x00ad
            r4 = r1
            com.google.android.gms.internal.measurement.t0 r4 = (com.google.android.gms.internal.measurement.t0) r4
            goto L_0x00b2
        L_0x00ad:
            com.google.android.gms.internal.measurement.r0 r4 = new com.google.android.gms.internal.measurement.r0
            r4.<init>(r0)
        L_0x00b2:
            r11.unregisterOnMeasurementEventListener(r4)
            goto L_0x044f
        L_0x00b7:
            android.os.IBinder r0 = r13.readStrongBinder()
            if (r0 != 0) goto L_0x00be
            goto L_0x00cf
        L_0x00be:
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.t0
            if (r2 == 0) goto L_0x00ca
            r4 = r1
            com.google.android.gms.internal.measurement.t0 r4 = (com.google.android.gms.internal.measurement.t0) r4
            goto L_0x00cf
        L_0x00ca:
            com.google.android.gms.internal.measurement.r0 r4 = new com.google.android.gms.internal.measurement.r0
            r4.<init>(r0)
        L_0x00cf:
            r11.registerOnMeasurementEventListener(r4)
            goto L_0x044f
        L_0x00d4:
            android.os.IBinder r0 = r13.readStrongBinder()
            if (r0 != 0) goto L_0x00db
            goto L_0x00ec
        L_0x00db:
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.t0
            if (r2 == 0) goto L_0x00e7
            r4 = r1
            com.google.android.gms.internal.measurement.t0 r4 = (com.google.android.gms.internal.measurement.t0) r4
            goto L_0x00ec
        L_0x00e7:
            com.google.android.gms.internal.measurement.r0 r4 = new com.google.android.gms.internal.measurement.r0
            r4.<init>(r0)
        L_0x00ec:
            r11.setEventInterceptor(r4)
            goto L_0x044f
        L_0x00f1:
            int r1 = r13.readInt()
            java.lang.String r2 = r13.readString()
            android.os.IBinder r3 = r13.readStrongBinder()
            u4.a r3 = u4.a.C0136a.J(r3)
            android.os.IBinder r4 = r13.readStrongBinder()
            u4.a r4 = u4.a.C0136a.J(r4)
            android.os.IBinder r0 = r13.readStrongBinder()
            u4.a r5 = u4.a.C0136a.J(r0)
            r0 = r11
            r0.logHealthData(r1, r2, r3, r4, r5)
            goto L_0x044f
        L_0x0117:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.c0.a(r13, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            android.os.IBinder r2 = r13.readStrongBinder()
            if (r2 != 0) goto L_0x0126
            goto L_0x0137
        L_0x0126:
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.q0
            if (r4 == 0) goto L_0x0132
            r4 = r3
            com.google.android.gms.internal.measurement.q0 r4 = (com.google.android.gms.internal.measurement.q0) r4
            goto L_0x0137
        L_0x0132:
            com.google.android.gms.internal.measurement.o0 r4 = new com.google.android.gms.internal.measurement.o0
            r4.<init>(r2)
        L_0x0137:
            long r2 = r13.readLong()
            r11.performAction(r1, r4, r2)
            goto L_0x044f
        L_0x0140:
            android.os.IBinder r1 = r13.readStrongBinder()
            u4.a r1 = u4.a.C0136a.J(r1)
            android.os.IBinder r2 = r13.readStrongBinder()
            if (r2 != 0) goto L_0x014f
            goto L_0x0160
        L_0x014f:
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.q0
            if (r4 == 0) goto L_0x015b
            r4 = r3
            com.google.android.gms.internal.measurement.q0 r4 = (com.google.android.gms.internal.measurement.q0) r4
            goto L_0x0160
        L_0x015b:
            com.google.android.gms.internal.measurement.o0 r4 = new com.google.android.gms.internal.measurement.o0
            r4.<init>(r2)
        L_0x0160:
            long r2 = r13.readLong()
            r11.onActivitySaveInstanceState(r1, r4, r2)
            goto L_0x044f
        L_0x0169:
            android.os.IBinder r1 = r13.readStrongBinder()
            u4.a r1 = u4.a.C0136a.J(r1)
            long r2 = r13.readLong()
            r11.onActivityResumed(r1, r2)
            goto L_0x044f
        L_0x017a:
            android.os.IBinder r1 = r13.readStrongBinder()
            u4.a r1 = u4.a.C0136a.J(r1)
            long r2 = r13.readLong()
            r11.onActivityPaused(r1, r2)
            goto L_0x044f
        L_0x018b:
            android.os.IBinder r1 = r13.readStrongBinder()
            u4.a r1 = u4.a.C0136a.J(r1)
            long r2 = r13.readLong()
            r11.onActivityDestroyed(r1, r2)
            goto L_0x044f
        L_0x019c:
            android.os.IBinder r1 = r13.readStrongBinder()
            u4.a r1 = u4.a.C0136a.J(r1)
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.measurement.c0.a(r13, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            long r3 = r13.readLong()
            r11.onActivityCreated(r1, r2, r3)
            goto L_0x044f
        L_0x01b5:
            android.os.IBinder r1 = r13.readStrongBinder()
            u4.a r1 = u4.a.C0136a.J(r1)
            long r2 = r13.readLong()
            r11.onActivityStopped(r1, r2)
            goto L_0x044f
        L_0x01c6:
            android.os.IBinder r1 = r13.readStrongBinder()
            u4.a r1 = u4.a.C0136a.J(r1)
            long r2 = r13.readLong()
            r11.onActivityStarted(r1, r2)
            goto L_0x044f
        L_0x01d7:
            java.lang.String r1 = r13.readString()
            long r2 = r13.readLong()
            r11.endAdUnitExposure(r1, r2)
            goto L_0x044f
        L_0x01e4:
            java.lang.String r1 = r13.readString()
            long r2 = r13.readLong()
            r11.beginAdUnitExposure(r1, r2)
            goto L_0x044f
        L_0x01f1:
            android.os.IBinder r0 = r13.readStrongBinder()
            if (r0 != 0) goto L_0x01f8
            goto L_0x0209
        L_0x01f8:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.q0
            if (r2 == 0) goto L_0x0204
            r4 = r1
            com.google.android.gms.internal.measurement.q0 r4 = (com.google.android.gms.internal.measurement.q0) r4
            goto L_0x0209
        L_0x0204:
            com.google.android.gms.internal.measurement.o0 r4 = new com.google.android.gms.internal.measurement.o0
            r4.<init>(r0)
        L_0x0209:
            r11.generateEventId(r4)
            goto L_0x044f
        L_0x020e:
            android.os.IBinder r0 = r13.readStrongBinder()
            if (r0 != 0) goto L_0x0215
            goto L_0x0226
        L_0x0215:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.q0
            if (r2 == 0) goto L_0x0221
            r4 = r1
            com.google.android.gms.internal.measurement.q0 r4 = (com.google.android.gms.internal.measurement.q0) r4
            goto L_0x0226
        L_0x0221:
            com.google.android.gms.internal.measurement.o0 r4 = new com.google.android.gms.internal.measurement.o0
            r4.<init>(r0)
        L_0x0226:
            r11.getGmpAppId(r4)
            goto L_0x044f
        L_0x022b:
            android.os.IBinder r0 = r13.readStrongBinder()
            if (r0 != 0) goto L_0x0232
            goto L_0x0243
        L_0x0232:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.q0
            if (r2 == 0) goto L_0x023e
            r4 = r1
            com.google.android.gms.internal.measurement.q0 r4 = (com.google.android.gms.internal.measurement.q0) r4
            goto L_0x0243
        L_0x023e:
            com.google.android.gms.internal.measurement.o0 r4 = new com.google.android.gms.internal.measurement.o0
            r4.<init>(r0)
        L_0x0243:
            r11.getAppInstanceId(r4)
            goto L_0x044f
        L_0x0248:
            android.os.IBinder r0 = r13.readStrongBinder()
            if (r0 != 0) goto L_0x024f
            goto L_0x0260
        L_0x024f:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.q0
            if (r2 == 0) goto L_0x025b
            r4 = r1
            com.google.android.gms.internal.measurement.q0 r4 = (com.google.android.gms.internal.measurement.q0) r4
            goto L_0x0260
        L_0x025b:
            com.google.android.gms.internal.measurement.o0 r4 = new com.google.android.gms.internal.measurement.o0
            r4.<init>(r0)
        L_0x0260:
            r11.getCachedAppInstanceId(r4)
            goto L_0x044f
        L_0x0265:
            android.os.IBinder r0 = r13.readStrongBinder()
            if (r0 != 0) goto L_0x026c
            goto L_0x027f
        L_0x026c:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IStringProvider"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.v0
            if (r2 == 0) goto L_0x027a
            r4 = r1
            com.google.android.gms.internal.measurement.v0 r4 = (com.google.android.gms.internal.measurement.v0) r4
            goto L_0x027f
        L_0x027a:
            com.google.android.gms.internal.measurement.u0 r4 = new com.google.android.gms.internal.measurement.u0
            r4.<init>(r0)
        L_0x027f:
            r11.setInstanceIdProvider(r4)
            goto L_0x044f
        L_0x0284:
            android.os.IBinder r0 = r13.readStrongBinder()
            if (r0 != 0) goto L_0x028b
            goto L_0x029c
        L_0x028b:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.q0
            if (r2 == 0) goto L_0x0297
            r4 = r1
            com.google.android.gms.internal.measurement.q0 r4 = (com.google.android.gms.internal.measurement.q0) r4
            goto L_0x029c
        L_0x0297:
            com.google.android.gms.internal.measurement.o0 r4 = new com.google.android.gms.internal.measurement.o0
            r4.<init>(r0)
        L_0x029c:
            r11.getCurrentScreenClass(r4)
            goto L_0x044f
        L_0x02a1:
            android.os.IBinder r0 = r13.readStrongBinder()
            if (r0 != 0) goto L_0x02a8
            goto L_0x02b9
        L_0x02a8:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.q0
            if (r2 == 0) goto L_0x02b4
            r4 = r1
            com.google.android.gms.internal.measurement.q0 r4 = (com.google.android.gms.internal.measurement.q0) r4
            goto L_0x02b9
        L_0x02b4:
            com.google.android.gms.internal.measurement.o0 r4 = new com.google.android.gms.internal.measurement.o0
            r4.<init>(r0)
        L_0x02b9:
            r11.getCurrentScreenName(r4)
            goto L_0x044f
        L_0x02be:
            android.os.IBinder r1 = r13.readStrongBinder()
            u4.a r1 = u4.a.C0136a.J(r1)
            java.lang.String r2 = r13.readString()
            java.lang.String r3 = r13.readString()
            long r4 = r13.readLong()
            r0 = r11
            r0.setCurrentScreen(r1, r2, r3, r4)
            goto L_0x044f
        L_0x02d8:
            long r0 = r13.readLong()
            r11.setSessionTimeoutDuration(r0)
            goto L_0x044f
        L_0x02e1:
            long r0 = r13.readLong()
            r11.setMinimumSessionDuration(r0)
            goto L_0x044f
        L_0x02ea:
            long r0 = r13.readLong()
            r11.resetAnalyticsData(r0)
            goto L_0x044f
        L_0x02f3:
            java.lang.ClassLoader r1 = com.google.android.gms.internal.measurement.c0.f2650a
            int r1 = r13.readInt()
            if (r1 == 0) goto L_0x02fc
            r2 = r8
        L_0x02fc:
            long r0 = r13.readLong()
            r11.setMeasurementEnabled(r2, r0)
            goto L_0x044f
        L_0x0305:
            java.lang.String r1 = r13.readString()
            java.lang.String r2 = r13.readString()
            android.os.IBinder r0 = r13.readStrongBinder()
            if (r0 != 0) goto L_0x0314
            goto L_0x0325
        L_0x0314:
            android.os.IInterface r3 = r0.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.q0
            if (r4 == 0) goto L_0x0320
            r4 = r3
            com.google.android.gms.internal.measurement.q0 r4 = (com.google.android.gms.internal.measurement.q0) r4
            goto L_0x0325
        L_0x0320:
            com.google.android.gms.internal.measurement.o0 r4 = new com.google.android.gms.internal.measurement.o0
            r4.<init>(r0)
        L_0x0325:
            r11.getConditionalUserProperties(r1, r2, r4)
            goto L_0x044f
        L_0x032a:
            java.lang.String r1 = r13.readString()
            java.lang.String r2 = r13.readString()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.measurement.c0.a(r13, r3)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r11.clearConditionalUserProperty(r1, r2, r0)
            goto L_0x044f
        L_0x033f:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.c0.a(r13, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r13.readLong()
            r11.setConditionalUserProperty(r1, r2)
            goto L_0x044f
        L_0x0350:
            java.lang.String r1 = r13.readString()
            long r2 = r13.readLong()
            r11.setUserId(r1, r2)
            goto L_0x044f
        L_0x035d:
            java.lang.String r1 = r13.readString()
            android.os.IBinder r0 = r13.readStrongBinder()
            if (r0 != 0) goto L_0x0368
            goto L_0x0379
        L_0x0368:
            android.os.IInterface r2 = r0.queryLocalInterface(r3)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.q0
            if (r3 == 0) goto L_0x0374
            r4 = r2
            com.google.android.gms.internal.measurement.q0 r4 = (com.google.android.gms.internal.measurement.q0) r4
            goto L_0x0379
        L_0x0374:
            com.google.android.gms.internal.measurement.o0 r4 = new com.google.android.gms.internal.measurement.o0
            r4.<init>(r0)
        L_0x0379:
            r11.getMaxUserProperties(r1, r4)
            goto L_0x044f
        L_0x037e:
            java.lang.String r1 = r13.readString()
            java.lang.String r5 = r13.readString()
            java.lang.ClassLoader r6 = com.google.android.gms.internal.measurement.c0.f2650a
            int r6 = r13.readInt()
            if (r6 == 0) goto L_0x038f
            r2 = r8
        L_0x038f:
            android.os.IBinder r0 = r13.readStrongBinder()
            if (r0 != 0) goto L_0x0396
            goto L_0x03a7
        L_0x0396:
            android.os.IInterface r3 = r0.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.q0
            if (r4 == 0) goto L_0x03a2
            r4 = r3
            com.google.android.gms.internal.measurement.q0 r4 = (com.google.android.gms.internal.measurement.q0) r4
            goto L_0x03a7
        L_0x03a2:
            com.google.android.gms.internal.measurement.o0 r4 = new com.google.android.gms.internal.measurement.o0
            r4.<init>(r0)
        L_0x03a7:
            r11.getUserProperties(r1, r5, r2, r4)
            goto L_0x044f
        L_0x03ac:
            java.lang.String r1 = r13.readString()
            java.lang.String r3 = r13.readString()
            android.os.IBinder r4 = r13.readStrongBinder()
            u4.a r4 = u4.a.C0136a.J(r4)
            java.lang.ClassLoader r5 = com.google.android.gms.internal.measurement.c0.f2650a
            int r5 = r13.readInt()
            if (r5 == 0) goto L_0x03c6
            r5 = r8
            goto L_0x03c7
        L_0x03c6:
            r5 = r2
        L_0x03c7:
            long r6 = r13.readLong()
            r0 = r11
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r0.setUserProperty(r1, r2, r3, r4, r5)
            goto L_0x044f
        L_0x03d5:
            java.lang.String r1 = r13.readString()
            java.lang.String r2 = r13.readString()
            android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = com.google.android.gms.internal.measurement.c0.a(r13, r5)
            android.os.Bundle r5 = (android.os.Bundle) r5
            android.os.IBinder r6 = r13.readStrongBinder()
            if (r6 != 0) goto L_0x03ec
            goto L_0x03fd
        L_0x03ec:
            android.os.IInterface r3 = r6.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.q0
            if (r4 == 0) goto L_0x03f7
            com.google.android.gms.internal.measurement.q0 r3 = (com.google.android.gms.internal.measurement.q0) r3
            goto L_0x03fc
        L_0x03f7:
            com.google.android.gms.internal.measurement.o0 r3 = new com.google.android.gms.internal.measurement.o0
            r3.<init>(r6)
        L_0x03fc:
            r4 = r3
        L_0x03fd:
            long r6 = r13.readLong()
            r0 = r11
            r3 = r5
            r5 = r6
            r0.logEventAndBundle(r1, r2, r3, r4, r5)
            goto L_0x044f
        L_0x0408:
            java.lang.String r1 = r13.readString()
            java.lang.String r3 = r13.readString()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.measurement.c0.a(r13, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            int r5 = r13.readInt()
            if (r5 == 0) goto L_0x0420
            r5 = r8
            goto L_0x0421
        L_0x0420:
            r5 = r2
        L_0x0421:
            int r6 = r13.readInt()
            if (r6 == 0) goto L_0x0429
            r6 = r8
            goto L_0x042a
        L_0x0429:
            r6 = r2
        L_0x042a:
            long r9 = r13.readLong()
            r0 = r11
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r9
            r0.logEvent(r1, r2, r3, r4, r5, r6)
            goto L_0x044f
        L_0x0438:
            android.os.IBinder r1 = r13.readStrongBinder()
            u4.a r1 = u4.a.C0136a.J(r1)
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.w0> r2 = com.google.android.gms.internal.measurement.w0.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.measurement.c0.a(r13, r2)
            com.google.android.gms.internal.measurement.w0 r2 = (com.google.android.gms.internal.measurement.w0) r2
            long r3 = r13.readLong()
            r11.initialize(r1, r2, r3)
        L_0x044f:
            r14.writeNoException()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.m0.I(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
