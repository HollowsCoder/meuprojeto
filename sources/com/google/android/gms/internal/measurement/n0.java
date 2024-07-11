package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import u4.a;

public interface n0 extends IInterface {
    void beginAdUnitExposure(String str, long j8);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j8);

    void endAdUnitExposure(String str, long j8);

    void generateEventId(q0 q0Var);

    void getAppInstanceId(q0 q0Var);

    void getCachedAppInstanceId(q0 q0Var);

    void getConditionalUserProperties(String str, String str2, q0 q0Var);

    void getCurrentScreenClass(q0 q0Var);

    void getCurrentScreenName(q0 q0Var);

    void getGmpAppId(q0 q0Var);

    void getMaxUserProperties(String str, q0 q0Var);

    void getTestFlag(q0 q0Var, int i10);

    void getUserProperties(String str, String str2, boolean z, q0 q0Var);

    void initForTests(Map map);

    void initialize(a aVar, w0 w0Var, long j8);

    void isDataCollectionEnabled(q0 q0Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z10, long j8);

    void logEventAndBundle(String str, String str2, Bundle bundle, q0 q0Var, long j8);

    void logHealthData(int i10, String str, a aVar, a aVar2, a aVar3);

    void onActivityCreated(a aVar, Bundle bundle, long j8);

    void onActivityDestroyed(a aVar, long j8);

    void onActivityPaused(a aVar, long j8);

    void onActivityResumed(a aVar, long j8);

    void onActivitySaveInstanceState(a aVar, q0 q0Var, long j8);

    void onActivityStarted(a aVar, long j8);

    void onActivityStopped(a aVar, long j8);

    void performAction(Bundle bundle, q0 q0Var, long j8);

    void registerOnMeasurementEventListener(t0 t0Var);

    void resetAnalyticsData(long j8);

    void setConditionalUserProperty(Bundle bundle, long j8);

    void setConsent(Bundle bundle, long j8);

    void setConsentThirdParty(Bundle bundle, long j8);

    void setCurrentScreen(a aVar, String str, String str2, long j8);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(t0 t0Var);

    void setInstanceIdProvider(v0 v0Var);

    void setMeasurementEnabled(boolean z, long j8);

    void setMinimumSessionDuration(long j8);

    void setSessionTimeoutDuration(long j8);

    void setUserId(String str, long j8);

    void setUserProperty(String str, String str2, a aVar, boolean z, long j8);

    void unregisterOnMeasurementEventListener(t0 t0Var);
}
