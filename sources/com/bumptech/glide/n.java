package com.bumptech.glide;

import com.bumptech.glide.n;
import k3.a;

public abstract class n<CHILD extends n<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: o  reason: collision with root package name */
    public final a.C0092a f2302o = a.f6685a;

    /* renamed from: c */
    public final CHILD clone() {
        try {
            return (n) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }
}
