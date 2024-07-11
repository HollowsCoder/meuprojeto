package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.d1;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class o1<T extends d1> {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f3123a = Logger.getLogger(a1.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final String f3124b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static d1 a() {
        String str;
        Class<o1> cls = o1.class;
        ClassLoader classLoader = cls.getClassLoader();
        Class<d1> cls2 = d1.class;
        if (cls2.equals(cls2)) {
            str = f3124b;
        } else if (cls2.getPackage().equals(cls.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls2.getPackage().getName(), cls2.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls2.getName());
        }
        try {
            return cls2.cast(((o1) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).b());
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException(e10);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        } catch (IllegalAccessException e12) {
            throw new IllegalStateException(e12);
        } catch (InvocationTargetException e13) {
            throw new IllegalStateException(e13);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls2.cast(((o1) it.next()).b()));
                } catch (ServiceConfigurationError e14) {
                    ServiceConfigurationError serviceConfigurationError = e14;
                    Logger logger = f3123a;
                    Level level = Level.SEVERE;
                    String simpleName = cls2.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (d1) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (d1) cls2.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e15) {
                throw new IllegalStateException(e15);
            } catch (IllegalAccessException e16) {
                throw new IllegalStateException(e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(e17);
            }
        }
    }

    public abstract T b();
}
