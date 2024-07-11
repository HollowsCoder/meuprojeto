package com.google.android.gms.internal.measurement;

import java.io.IOException;

public class p6 extends IOException {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f2880o = 0;

    public p6(String str) {
        super(str);
    }

    public static p6 a() {
        return new p6("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static p6 b() {
        return new p6("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static p6 c() {
        return new p6("Failed to parse the message.");
    }

    public static p6 d() {
        return new p6("Protocol message had invalid UTF-8.");
    }
}
