package com.google.android.gms.internal.vision;

import java.io.IOException;

public class z1 extends IOException {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f3195o = 0;

    public z1(String str) {
        super(str);
    }

    public static z1 a() {
        return new z1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static z1 b() {
        return new z1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static z1 c() {
        return new z1("Failed to parse the message.");
    }

    public static z1 d() {
        return new z1("Protocol message had invalid UTF-8.");
    }
}
