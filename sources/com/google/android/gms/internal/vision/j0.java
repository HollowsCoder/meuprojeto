package com.google.android.gms.internal.vision;

import s6.a;

public enum j0 implements t1 {
    UNKNOWN_FORMAT(0),
    CONTACT_INFO(1),
    EMAIL(2),
    ISBN(3),
    PHONE(4),
    PRODUCT(5),
    SMS(6),
    TEXT(7),
    URL(8),
    WIFI(9),
    GEO(10),
    CALENDAR_EVENT(11),
    DRIVER_LICENSE(12),
    BOARDING_PASS(13);
    
    private static final w1<j0> zzo = null;
    private final int zzp;

    /* access modifiers changed from: public */
    static {
        zzo = new a();
    }

    private j0(int i10) {
        this.zzp = i10;
    }

    public static j0 zza(int i10) {
        switch (i10) {
            case 0:
                return UNKNOWN_FORMAT;
            case 1:
                return CONTACT_INFO;
            case 2:
                return EMAIL;
            case 3:
                return ISBN;
            case 4:
                return PHONE;
            case 5:
                return PRODUCT;
            case 6:
                return SMS;
            case 7:
                return TEXT;
            case 8:
                return URL;
            case 9:
                return WIFI;
            case 10:
                return GEO;
            case 11:
                return CALENDAR_EVENT;
            case 12:
                return DRIVER_LICENSE;
            case 13:
                return BOARDING_PASS;
            default:
                return null;
        }
    }

    public static v1 zzb() {
        return l0.f3112a;
    }

    public final String toString() {
        return "<" + j0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzp + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzp;
    }
}
