package com.google.android.gms.measurement;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.Keep;
import androidx.databinding.a;
import h5.b5;
import h5.c7;
import h5.g3;
import h5.g7;
import h5.h4;
import h5.i4;
import h5.i5;
import h5.j5;
import h5.p5;
import h5.u1;
import h5.u5;
import i4.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import n.b;
import n4.m;
import q0.d;

@Deprecated
public class AppMeasurement {

    /* renamed from: c  reason: collision with root package name */
    public static volatile AppMeasurement f3197c;

    /* renamed from: a  reason: collision with root package name */
    public final i4 f3198a;

    /* renamed from: b  reason: collision with root package name */
    public final j5 f3199b;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(Bundle bundle) {
            m.h(bundle);
            Class<String> cls = String.class;
            this.mAppId = (String) a.F(bundle, "app_id", cls, (Object) null);
            this.mOrigin = (String) a.F(bundle, "origin", cls, (Object) null);
            this.mName = (String) a.F(bundle, "name", cls, (Object) null);
            this.mValue = a.F(bundle, "value", Object.class, (Object) null);
            this.mTriggerEventName = (String) a.F(bundle, "trigger_event_name", cls, (Object) null);
            Class<Long> cls2 = Long.class;
            this.mTriggerTimeout = ((Long) a.F(bundle, "trigger_timeout", cls2, 0L)).longValue();
            this.mTimedOutEventName = (String) a.F(bundle, "timed_out_event_name", cls, (Object) null);
            Class<Bundle> cls3 = Bundle.class;
            this.mTimedOutEventParams = (Bundle) a.F(bundle, "timed_out_event_params", cls3, (Object) null);
            this.mTriggeredEventName = (String) a.F(bundle, "triggered_event_name", cls, (Object) null);
            this.mTriggeredEventParams = (Bundle) a.F(bundle, "triggered_event_params", cls3, (Object) null);
            this.mTimeToLive = ((Long) a.F(bundle, "time_to_live", cls2, 0L)).longValue();
            this.mExpiredEventName = (String) a.F(bundle, "expired_event_name", cls, (Object) null);
            this.mExpiredEventParams = (Bundle) a.F(bundle, "expired_event_params", cls3, (Object) null);
            this.mActive = ((Boolean) a.F(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) a.F(bundle, "creation_timestamp", cls2, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) a.F(bundle, "triggered_timestamp", cls2, 0L)).longValue();
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                a.z(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }
    }

    public AppMeasurement(i4 i4Var) {
        m.h(i4Var);
        this.f3198a = i4Var;
        this.f3199b = null;
    }

    public AppMeasurement(j5 j5Var) {
        this.f3199b = j5Var;
        this.f3198a = null;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @java.lang.Deprecated
    @androidx.annotation.Keep
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = f3197c
            if (r0 != 0) goto L_0x0059
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = f3197c     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x0054
            r1 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r2 = com.google.firebase.analytics.FirebaseAnalytics.class
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{  }
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch:{  }
            java.lang.String r5 = "getScionFrontendApiImplementation"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r4)     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{  }
            r3[r6] = r14     // Catch:{  }
            r3[r7] = r1     // Catch:{  }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{  }
            h5.j5 r2 = (h5.j5) r2     // Catch:{  }
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            if (r2 == 0) goto L_0x0039
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r14.<init>((h5.j5) r2)     // Catch:{ all -> 0x0056 }
            f3197c = r14     // Catch:{ all -> 0x0056 }
            goto L_0x0054
        L_0x0039:
            com.google.android.gms.internal.measurement.w0 r13 = new com.google.android.gms.internal.measurement.w0     // Catch:{ all -> 0x0056 }
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0056 }
            h5.i4 r14 = h5.i4.h(r14, r13, r1)     // Catch:{ all -> 0x0056 }
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r1.<init>((h5.i4) r14)     // Catch:{ all -> 0x0056 }
            f3197c = r1     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x0059
        L_0x0056:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r14
        L_0x0059:
            com.google.android.gms.measurement.AppMeasurement r14 = f3197c
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        j5 j5Var = this.f3199b;
        if (j5Var != null) {
            j5Var.a(str);
            return;
        }
        i4 i4Var = this.f3198a;
        m.h(i4Var);
        u1 g10 = i4Var.g();
        i4Var.B.getClass();
        g10.h(str, SystemClock.elapsedRealtime());
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        j5 j5Var = this.f3199b;
        if (j5Var != null) {
            j5Var.b(str, str2, bundle);
            return;
        }
        i4 i4Var = this.f3198a;
        m.h(i4Var);
        i5 i5Var = i4Var.D;
        i4.m(i5Var);
        i5Var.o(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        j5 j5Var = this.f3199b;
        if (j5Var != null) {
            j5Var.l(str);
            return;
        }
        i4 i4Var = this.f3198a;
        m.h(i4Var);
        u1 g10 = i4Var.g();
        i4Var.B.getClass();
        g10.i(str, SystemClock.elapsedRealtime());
    }

    @Keep
    public long generateEventId() {
        j5 j5Var = this.f3199b;
        if (j5Var != null) {
            return j5Var.d();
        }
        i4 i4Var = this.f3198a;
        m.h(i4Var);
        g7 g7Var = i4Var.z;
        i4.l(g7Var);
        return g7Var.W();
    }

    @Keep
    public String getAppInstanceId() {
        j5 j5Var = this.f3199b;
        if (j5Var != null) {
            return j5Var.g();
        }
        i4 i4Var = this.f3198a;
        m.h(i4Var);
        i5 i5Var = i4Var.D;
        i4.m(i5Var);
        return i5Var.u.get();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> list;
        int i10 = 0;
        j5 j5Var = this.f3199b;
        if (j5Var != null) {
            list = j5Var.c(str, str2);
        } else {
            i4 i4Var = this.f3198a;
            m.h(i4Var);
            i5 i5Var = i4Var.D;
            i4.m(i5Var);
            i4 i4Var2 = i5Var.f5649o;
            h4 h4Var = i4Var2.f5459x;
            i4.n(h4Var);
            boolean l = h4Var.l();
            g3 g3Var = i4Var2.w;
            if (l) {
                i4.n(g3Var);
                g3Var.f5397t.a("Cannot get conditional user properties from analytics worker thread");
                list = new ArrayList<>(0);
            } else if (d.b()) {
                i4.n(g3Var);
                g3Var.f5397t.a("Cannot get conditional user properties from main thread");
                list = new ArrayList<>(0);
            } else {
                AtomicReference atomicReference = new AtomicReference();
                h4 h4Var2 = i4Var2.f5459x;
                i4.n(h4Var2);
                h4Var2.o(atomicReference, 5000, "get conditional user properties", new b5(i5Var, atomicReference, str, str2));
                List list2 = (List) atomicReference.get();
                if (list2 == null) {
                    i4.n(g3Var);
                    g3Var.f5397t.b((Object) null, "Timed out waiting for get conditional user properties");
                    list = new ArrayList<>();
                } else {
                    list = g7.P(list2);
                }
            }
        }
        if (list != null) {
            i10 = list.size();
        }
        ArrayList arrayList = new ArrayList(i10);
        for (Bundle conditionalUserProperty : list) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        j5 j5Var = this.f3199b;
        if (j5Var != null) {
            return j5Var.f();
        }
        i4 i4Var = this.f3198a;
        m.h(i4Var);
        i5 i5Var = i4Var.D;
        i4.m(i5Var);
        u5 u5Var = i5Var.f5649o.C;
        i4.m(u5Var);
        p5 p5Var = u5Var.f5767q;
        if (p5Var != null) {
            return p5Var.f5635b;
        }
        return null;
    }

    @Keep
    public String getCurrentScreenName() {
        j5 j5Var = this.f3199b;
        if (j5Var != null) {
            return j5Var.j();
        }
        i4 i4Var = this.f3198a;
        m.h(i4Var);
        i5 i5Var = i4Var.D;
        i4.m(i5Var);
        u5 u5Var = i5Var.f5649o.C;
        i4.m(u5Var);
        p5 p5Var = u5Var.f5767q;
        if (p5Var != null) {
            return p5Var.f5634a;
        }
        return null;
    }

    @Keep
    public String getGmpAppId() {
        j5 j5Var = this.f3199b;
        if (j5Var != null) {
            return j5Var.p();
        }
        i4 i4Var = this.f3198a;
        m.h(i4Var);
        i5 i5Var = i4Var.D;
        i4.m(i5Var);
        return i5Var.p();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        j5 j5Var = this.f3199b;
        if (j5Var != null) {
            return j5Var.h(str);
        }
        i4 i4Var = this.f3198a;
        m.h(i4Var);
        i5 i5Var = i4Var.D;
        i4.m(i5Var);
        m.e(str);
        i5Var.f5649o.getClass();
        return 25;
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        String str3;
        j5 j5Var = this.f3199b;
        if (j5Var != null) {
            return j5Var.i(str, str2, z);
        }
        i4 i4Var = this.f3198a;
        m.h(i4Var);
        i5 i5Var = i4Var.D;
        i4.m(i5Var);
        i4 i4Var2 = i5Var.f5649o;
        h4 h4Var = i4Var2.f5459x;
        i4.n(h4Var);
        boolean l = h4Var.l();
        g3 g3Var = i4Var2.w;
        if (l) {
            i4.n(g3Var);
            str3 = "Cannot get user properties from analytics worker thread";
        } else if (d.b()) {
            i4.n(g3Var);
            str3 = "Cannot get user properties from main thread";
        } else {
            AtomicReference atomicReference = new AtomicReference();
            h4 h4Var2 = i4Var2.f5459x;
            i4.n(h4Var2);
            h4Var2.o(atomicReference, 5000, "get user properties", new i(i5Var, atomicReference, str, str2, z));
            List<c7> list = (List) atomicReference.get();
            if (list == null) {
                i4.n(g3Var);
                g3Var.f5397t.b(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
                return Collections.emptyMap();
            }
            b bVar = new b(list.size());
            for (c7 c7Var : list) {
                Object g02 = c7Var.g0();
                if (g02 != null) {
                    bVar.put(c7Var.f5318p, g02);
                }
            }
            return bVar;
        }
        g3Var.f5397t.a(str3);
        return Collections.emptyMap();
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        j5 j5Var = this.f3199b;
        if (j5Var != null) {
            j5Var.k(str, str2, bundle);
            return;
        }
        i4 i4Var = this.f3198a;
        m.h(i4Var);
        i5 i5Var = i4Var.D;
        i4.m(i5Var);
        i5Var.x(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        m.h(conditionalUserProperty);
        j5 j5Var = this.f3199b;
        if (j5Var != null) {
            j5Var.e(conditionalUserProperty.a());
            return;
        }
        i4 i4Var = this.f3198a;
        m.h(i4Var);
        i5 i5Var = i4Var.D;
        i4.m(i5Var);
        Bundle a10 = conditionalUserProperty.a();
        i5Var.f5649o.B.getClass();
        i5Var.n(a10, System.currentTimeMillis());
    }
}
