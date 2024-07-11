package s9;

import i9.v;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import l9.d;
import o8.l;
import p9.e;
import p9.u;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArraySet<Logger> f8845a = new CopyOnWriteArraySet<>();

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, String> f8846b;

    static {
        String str;
        Map<String, String> map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<v> cls = v.class;
        Package packageR = cls.getPackage();
        if (packageR != null) {
            str = packageR.getName();
        } else {
            str = null;
        }
        if (str != null) {
            linkedHashMap.put(str, "OkHttp");
        }
        linkedHashMap.put(cls.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(e.class.getName(), "okhttp.Http2");
        linkedHashMap.put(d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        int size = linkedHashMap.size();
        if (size == 0) {
            map = l.f7765o;
        } else if (size != 1) {
            map = new LinkedHashMap<>(linkedHashMap);
        } else {
            map = u.t(linkedHashMap);
        }
        f8846b = map;
    }
}
