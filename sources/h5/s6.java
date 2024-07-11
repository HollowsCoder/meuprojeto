package h5;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.g0;

public final class s6 extends u6 {

    /* renamed from: r  reason: collision with root package name */
    public final AlarmManager f5689r = ((AlarmManager) this.f5649o.f5452o.getSystemService("alarm"));

    /* renamed from: s  reason: collision with root package name */
    public y5 f5690s;

    /* renamed from: t  reason: collision with root package name */
    public Integer f5691t;

    public s6(z6 z6Var) {
        super(z6Var);
    }

    public final void i() {
        AlarmManager alarmManager = this.f5689r;
        if (alarmManager != null) {
            alarmManager.cancel(n());
        }
        JobScheduler jobScheduler = (JobScheduler) this.f5649o.f5452o.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m());
        }
    }

    public final void k() {
        h();
        i4 i4Var = this.f5649o;
        g3 g3Var = i4Var.w;
        i4.n(g3Var);
        g3Var.B.a("Unscheduling upload");
        AlarmManager alarmManager = this.f5689r;
        if (alarmManager != null) {
            alarmManager.cancel(n());
        }
        l().c();
        JobScheduler jobScheduler = (JobScheduler) i4Var.f5452o.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m());
        }
    }

    public final j l() {
        if (this.f5690s == null) {
            this.f5690s = new y5(this, this.f5701p.f5856y, 1);
        }
        return this.f5690s;
    }

    public final int m() {
        String str;
        if (this.f5691t == null) {
            String valueOf = String.valueOf(this.f5649o.f5452o.getPackageName());
            if (valueOf.length() != 0) {
                str = "measurement".concat(valueOf);
            } else {
                str = new String("measurement");
            }
            this.f5691t = Integer.valueOf(str.hashCode());
        }
        return this.f5691t.intValue();
    }

    public final PendingIntent n() {
        Context context = this.f5649o.f5452o;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), g0.f2711a);
    }
}
