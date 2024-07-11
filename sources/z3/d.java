package z3;

import android.content.Context;
import t3.s;

public final class d implements q {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9882a;

    /* renamed from: b  reason: collision with root package name */
    public final a4.d f9883b;

    /* renamed from: c  reason: collision with root package name */
    public final e f9884c;

    public d(Context context, a4.d dVar, e eVar) {
        this.f9882a = context;
        this.f9883b = dVar;
        this.f9884c = eVar;
    }

    public final void a(s sVar, int i10) {
        b(sVar, i10, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0094, code lost:
        r11 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(t3.s r17, int r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            android.content.ComponentName r3 = new android.content.ComponentName
            android.content.Context r4 = r0.f9882a
            java.lang.Class<com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService> r5 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.class
            r3.<init>(r4, r5)
            java.lang.String r5 = "jobscheduler"
            java.lang.Object r5 = r4.getSystemService(r5)
            android.app.job.JobScheduler r5 = (android.app.job.JobScheduler) r5
            java.util.zip.Adler32 r6 = new java.util.zip.Adler32
            r6.<init>()
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r7 = "UTF-8"
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r7)
            byte[] r4 = r4.getBytes(r8)
            r6.update(r4)
            java.lang.String r4 = r17.b()
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)
            byte[] r4 = r4.getBytes(r7)
            r6.update(r4)
            r4 = 4
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r4)
            q3.d r8 = r17.d()
            int r8 = d4.a.a(r8)
            java.nio.ByteBuffer r7 = r7.putInt(r8)
            byte[] r7 = r7.array()
            r6.update(r7)
            byte[] r7 = r17.c()
            if (r7 == 0) goto L_0x0061
            byte[] r7 = r17.c()
            r6.update(r7)
        L_0x0061:
            long r6 = r6.getValue()
            int r6 = (int) r6
            java.lang.String r7 = "JobInfoScheduler"
            java.lang.String r8 = "attemptNumber"
            r9 = 0
            r10 = 1
            if (r19 != 0) goto L_0x009d
            java.util.List r11 = r5.getAllPendingJobs()
            java.util.Iterator r11 = r11.iterator()
        L_0x0076:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0094
            java.lang.Object r12 = r11.next()
            android.app.job.JobInfo r12 = (android.app.job.JobInfo) r12
            android.os.PersistableBundle r13 = r12.getExtras()
            int r13 = r13.getInt(r8)
            int r12 = r12.getId()
            if (r12 != r6) goto L_0x0076
            if (r13 < r2) goto L_0x0094
            r11 = r10
            goto L_0x0095
        L_0x0094:
            r11 = r9
        L_0x0095:
            if (r11 == 0) goto L_0x009d
            java.lang.String r2 = "Upload for context %s is already scheduled. Returning..."
            androidx.databinding.a.m(r1, r7, r2)
            return
        L_0x009d:
            a4.d r11 = r0.f9883b
            long r11 = r11.b0(r1)
            android.app.job.JobInfo$Builder r13 = new android.app.job.JobInfo$Builder
            r13.<init>(r6, r3)
            q3.d r3 = r17.d()
            z3.e r14 = r0.f9884c
            r15 = r5
            long r4 = r14.b(r3, r11, r2)
            r13.setMinimumLatency(r4)
            java.util.Map r4 = r14.c()
            java.lang.Object r3 = r4.get(r3)
            z3.e$a r3 = (z3.e.a) r3
            java.util.Set r3 = r3.b()
            z3.e$b r4 = z3.e.b.NETWORK_UNMETERED
            boolean r4 = r3.contains(r4)
            r5 = 2
            if (r4 == 0) goto L_0x00d1
            r13.setRequiredNetworkType(r5)
            goto L_0x00d4
        L_0x00d1:
            r13.setRequiredNetworkType(r10)
        L_0x00d4:
            z3.e$b r4 = z3.e.b.DEVICE_CHARGING
            boolean r4 = r3.contains(r4)
            if (r4 == 0) goto L_0x00df
            r13.setRequiresCharging(r10)
        L_0x00df:
            z3.e$b r4 = z3.e.b.DEVICE_IDLE
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x00ea
            r13.setRequiresDeviceIdle(r10)
        L_0x00ea:
            android.os.PersistableBundle r3 = new android.os.PersistableBundle
            r3.<init>()
            r3.putInt(r8, r2)
            java.lang.String r4 = "backendName"
            java.lang.String r8 = r17.b()
            r3.putString(r4, r8)
            q3.d r4 = r17.d()
            int r4 = d4.a.a(r4)
            java.lang.String r8 = "priority"
            r3.putInt(r8, r4)
            byte[] r4 = r17.c()
            if (r4 == 0) goto L_0x011b
            byte[] r4 = r17.c()
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r9)
            java.lang.String r8 = "extras"
            r3.putString(r8, r4)
        L_0x011b:
            r13.setExtras(r3)
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r9] = r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r3[r10] = r4
            q3.d r1 = r17.d()
            long r8 = r14.b(r1, r11, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r3[r5] = r1
            r1 = 3
            java.lang.Long r4 = java.lang.Long.valueOf(r11)
            r3[r1] = r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r2 = 4
            r3[r2] = r1
            java.lang.String r1 = androidx.databinding.a.o(r7)
            java.lang.String r2 = "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            android.util.Log.d(r1, r2)
            android.app.job.JobInfo r1 = r13.build()
            r5 = r15
            r5.schedule(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.d.b(t3.s, int, boolean):void");
    }
}
