package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.r5;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class z5<T extends r5> {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f3022a = Logger.getLogger(n5.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final String f3023b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static r5 b() {
        String str;
        Class<z5> cls = z5.class;
        ClassLoader classLoader = cls.getClassLoader();
        Class<r5> cls2 = r5.class;
        if (cls2.equals(cls2)) {
            str = f3023b;
        } else if (cls2.getPackage().equals(cls.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls2.getPackage().getName(), cls2.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls2.getName());
        }
        try {
            return cls2.cast(((z5) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
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
                    arrayList.add(cls2.cast(((z5) it.next()).a()));
                } catch (ServiceConfigurationError e14) {
                    ServiceConfigurationError serviceConfigurationError = e14;
                    Logger logger = f3022a;
                    Level level = Level.SEVERE;
                    String simpleName = cls2.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (r5) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (r5) cls2.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e15) {
                throw new IllegalStateException(e15);
            } catch (IllegalAccessException e16) {
                throw new IllegalStateException(e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(e17);
            }
        }
    }

    public abstract T a();
}
