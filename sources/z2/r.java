package z2;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

public final class r {

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f9840g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f9841h;

    /* renamed from: i  reason: collision with root package name */
    public static final File f9842i = new File("/proc/self/fd");

    /* renamed from: j  reason: collision with root package name */
    public static volatile r f9843j;

    /* renamed from: k  reason: collision with root package name */
    public static volatile int f9844k = -1;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9845a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9846b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9847c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9848e = true;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f9849f = new AtomicBoolean(false);

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z = true;
        f9840g = i10 < 29;
        if (i10 < 26) {
            z = false;
        }
        f9841h = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009e, code lost:
        if (r2 == false) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r() {
        /*
            r26 = this;
            r0 = r26
            r26.<init>()
            r1 = 1
            r0.f9848e = r1
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r2.<init>(r3)
            r0.f9849f = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r2 == r4) goto L_0x0017
            goto L_0x005b
        L_0x0017:
            java.lang.String r5 = "SC-04J"
            java.lang.String r6 = "SM-N935"
            java.lang.String r7 = "SM-J720"
            java.lang.String r8 = "SM-G570F"
            java.lang.String r9 = "SM-G570M"
            java.lang.String r10 = "SM-G960"
            java.lang.String r11 = "SM-G965"
            java.lang.String r12 = "SM-G935"
            java.lang.String r13 = "SM-G930"
            java.lang.String r14 = "SM-A520"
            java.lang.String r15 = "SM-A720F"
            java.lang.String r16 = "moto e5"
            java.lang.String r17 = "moto e5 play"
            java.lang.String r18 = "moto e5 plus"
            java.lang.String r19 = "moto e5 cruise"
            java.lang.String r20 = "moto g(6) forge"
            java.lang.String r21 = "moto g(6) play"
            java.lang.String[] r2 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0045:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x005b
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = android.os.Build.MODEL
            boolean r4 = r5.startsWith(r4)
            if (r4 == 0) goto L_0x0045
            r2 = r1
            goto L_0x005c
        L_0x005b:
            r2 = r3
        L_0x005c:
            if (r2 != 0) goto L_0x00a1
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 27
            if (r2 == r4) goto L_0x0066
            r2 = r3
            goto L_0x009e
        L_0x0066:
            java.lang.String r5 = "LG-M250"
            java.lang.String r6 = "LG-M320"
            java.lang.String r7 = "LG-Q710AL"
            java.lang.String r8 = "LG-Q710PL"
            java.lang.String r9 = "LGM-K121K"
            java.lang.String r10 = "LGM-K121L"
            java.lang.String r11 = "LGM-K121S"
            java.lang.String r12 = "LGM-X320K"
            java.lang.String r13 = "LGM-X320L"
            java.lang.String r14 = "LGM-X320S"
            java.lang.String r15 = "LGM-X401L"
            java.lang.String r16 = "LGM-X401S"
            java.lang.String r17 = "LM-Q610.FG"
            java.lang.String r18 = "LM-Q610.FGN"
            java.lang.String r19 = "LM-Q617.FG"
            java.lang.String r20 = "LM-Q617.FGN"
            java.lang.String r21 = "LM-Q710.FG"
            java.lang.String r22 = "LM-Q710.FGN"
            java.lang.String r23 = "LM-X220PM"
            java.lang.String r24 = "LM-X220QMA"
            java.lang.String r25 = "LM-X410PM"
            java.lang.String[] r2 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25}
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.String r4 = android.os.Build.MODEL
            boolean r2 = r2.contains(r4)
        L_0x009e:
            if (r2 != 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r1 = r3
        L_0x00a2:
            r0.f9845a = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x00b1
            r1 = 20000(0x4e20, float:2.8026E-41)
            r0.f9846b = r1
            r0.f9847c = r3
            goto L_0x00b9
        L_0x00b1:
            r1 = 700(0x2bc, float:9.81E-43)
            r0.f9846b = r1
            r1 = 128(0x80, float:1.794E-43)
            r0.f9847c = r1
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.r.<init>():void");
    }

    public final boolean a(int i10, int i11, boolean z, boolean z10) {
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        if (!z) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        } else if (!this.f9845a) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        } else if (!f9841h) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        } else {
            if (!f9840g || this.f9849f.get()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed by app state");
                }
                return false;
            } else if (z10) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                }
                return false;
            } else {
                int i13 = this.f9847c;
                if (i10 < i13) {
                    if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
                    }
                    return false;
                } else if (i11 < i13) {
                    if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
                    }
                    return false;
                } else {
                    synchronized (this) {
                        int i14 = this.d + 1;
                        this.d = i14;
                        if (i14 >= 50) {
                            this.d = 0;
                            int length = f9842i.list().length;
                            if (f9844k != -1) {
                                i12 = f9844k;
                            } else {
                                i12 = this.f9846b;
                            }
                            long j8 = (long) i12;
                            if (((long) length) < j8) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            this.f9848e = z13;
                            if (!z13 && Log.isLoggable("Downsampler", 5)) {
                                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j8);
                            }
                        }
                        z12 = this.f9848e;
                    }
                    if (z12) {
                        return true;
                    }
                    if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                    }
                    return false;
                }
            }
        }
    }
}
