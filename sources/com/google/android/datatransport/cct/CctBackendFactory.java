package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import r3.c;
import u3.d;
import u3.h;
import u3.m;

@Keep
public class CctBackendFactory implements d {
    public m create(h hVar) {
        return new c(hVar.a(), hVar.d(), hVar.c());
    }
}
