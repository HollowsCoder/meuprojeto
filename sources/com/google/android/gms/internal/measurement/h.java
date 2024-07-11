package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

public final class h implements o {

    /* renamed from: o  reason: collision with root package name */
    public final Double f2726o;

    public h(Double d) {
        if (d == null) {
            this.f2726o = Double.valueOf(Double.NaN);
        } else {
            this.f2726o = d;
        }
    }

    public final Double b() {
        return this.f2726o;
    }

    public final Boolean c() {
        Double d = this.f2726o;
        boolean z = false;
        if (!Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f2726o.equals(((h) obj).f2726o);
    }

    public final int hashCode() {
        return this.f2726o.hashCode();
    }

    public final Iterator<o> i() {
        return null;
    }

    public final o q() {
        return new h(this.f2726o);
    }

    public final o t(String str, i3 i3Var, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new r(zzc());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{zzc(), str}));
    }

    public final String toString() {
        return zzc();
    }

    public final String zzc() {
        Double d = this.f2726o;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d.doubleValue())) {
            return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(d.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((stripTrailingZeros.scale() > 0 ? stripTrailingZeros.precision() : stripTrailingZeros.scale()) - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : stripTrailingZeros.toPlainString();
    }
}
