package com.google.android.gms.internal.clearcut;

import java.io.IOException;

public class v0 extends IOException {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f2550o = 0;

    public v0(String str) {
        super(str);
    }

    public static v0 a() {
        return new v0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static v0 b() {
        return new v0("Failed to parse the message.");
    }

    public static v0 c() {
        return new v0("Protocol message had invalid UTF-8.");
    }
}
