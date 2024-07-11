package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class q3 implements Iterator<Object> {
    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
