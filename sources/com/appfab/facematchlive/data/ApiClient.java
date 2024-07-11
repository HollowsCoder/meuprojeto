package com.appfab.facematchlive.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import i9.b0;
import i9.q;
import i9.r;
import i9.s;
import i9.v;
import i9.x;
import j9.c;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import o8.l;
import v9.a;
import w1.a;
import y9.c0;
import y9.d0;
import y9.y;
import z8.e;
import z8.g;

public final class ApiClient {
    public static final Companion Companion = new Companion((e) null);
    /* access modifiers changed from: private */
    public static ApiClient instance;
    private String baseUrl = "https://api.facerecognition.io/api/v1/";
    private ApiService mInstance;
    private v okHttpClient;
    private d0 retrofit;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final ApiClient instance() {
            if (ApiClient.instance == null) {
                return new ApiClient();
            }
            ApiClient access$getInstance$cp = ApiClient.instance;
            if (access$getInstance$cp != null) {
                return access$getInstance$cp;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.appfab.facematchlive.data.ApiClient");
        }
    }

    private final ApiService createRetrofitService() {
        boolean z;
        if (this.retrofit == null) {
            try {
                a aVar = new a();
                Gson create = new GsonBuilder().setLenient().create();
                this.okHttpClient = new v();
                v.a aVar2 = new v.a();
                aVar2.f6349c.add(aVar);
                v9.a aVar3 = new v9.a(0);
                a.C0143a aVar4 = a.C0143a.BODY;
                g.g(aVar4, "level");
                aVar3.f9147b = aVar4;
                aVar2.f6349c.add(aVar3);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                g.f(timeUnit, "unit");
                aVar2.f6363s = c.b(timeUnit);
                aVar2.f6364t = c.b(timeUnit);
                this.okHttpClient = new v(aVar2);
                d0.a aVar5 = new d0.a();
                aVar5.a(String.valueOf(this.baseUrl));
                if (create != null) {
                    aVar5.d.add(new z9.a(create));
                    v vVar = this.okHttpClient;
                    Objects.requireNonNull(vVar, "client == null");
                    aVar5.f9672b = vVar;
                    this.retrofit = aVar5.b();
                } else {
                    throw new NullPointerException("gson == null");
                }
            } catch (Exception e10) {
                System.out.println(e10);
            }
        }
        d0 d0Var = this.retrofit;
        g.c(d0Var);
        Class<ApiService> cls = ApiService.class;
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<ApiService> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (d0Var.f9670f) {
                y yVar = y.f9770c;
                for (Method method : cls.getDeclaredMethods()) {
                    if (!yVar.f9771a || !method.isDefault()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z && !Modifier.isStatic(method.getModifiers())) {
                        d0Var.b(method);
                    }
                }
            }
            ApiService apiService = (ApiService) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new c0(d0Var));
            this.mInstance = apiService;
            return apiService;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    /* access modifiers changed from: private */
    /* renamed from: createRetrofitService$lambda-0  reason: not valid java name */
    public static final i9.c0 m9createRetrofitService$lambda0(s.a aVar) {
        LinkedHashMap linkedHashMap;
        Map map;
        g.f(aVar, "chain");
        x a10 = aVar.a();
        a10.getClass();
        new LinkedHashMap();
        String str = a10.f6367c;
        b0 b0Var = a10.f6368e;
        Map<Class<?>, Object> map2 = a10.f6369f;
        if (map2.isEmpty()) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = new LinkedHashMap(map2);
        }
        q.a i10 = a10.d.i();
        i10.a("Content-Type", "application/json");
        i10.a("Accept", "application/json");
        i10.a("Expect", "application/json");
        i10.a("X-Requested-With", "XMLHttpRequest");
        String str2 = j2.a.f6519a;
        g.e(str2, "USER_AGENT");
        i10.a("User-agent", str2);
        r rVar = a10.f6366b;
        if (rVar != null) {
            q d = i10.d();
            byte[] bArr = c.f6602a;
            if (linkedHashMap.isEmpty()) {
                map = l.f7765o;
            } else {
                map = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                g.e(map, "Collections.unmodifiableMap(LinkedHashMap(this))");
            }
            return aVar.b(new x(rVar, str, d, b0Var, map));
        }
        throw new IllegalStateException("url == null".toString());
    }

    private final ApiService setInstance() {
        this.mInstance = null;
        ApiService createRetrofitService = createRetrofitService();
        this.mInstance = createRetrofitService;
        return createRetrofitService;
    }

    public final ApiService getService() {
        if (this.mInstance == null) {
            this.mInstance = setInstance();
        }
        ApiService apiService = this.mInstance;
        g.c(apiService);
        return apiService;
    }
}
