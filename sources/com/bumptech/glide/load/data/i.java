package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.x0;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import m3.c;
import q2.e;
import w2.f;

public final class i implements d<InputStream> {

    /* renamed from: o  reason: collision with root package name */
    public final f f2279o;

    /* renamed from: p  reason: collision with root package name */
    public final int f2280p;

    /* renamed from: q  reason: collision with root package name */
    public HttpURLConnection f2281q;

    /* renamed from: r  reason: collision with root package name */
    public InputStream f2282r;

    /* renamed from: s  reason: collision with root package name */
    public volatile boolean f2283s;

    public static class a {
    }

    static {
        new a();
    }

    public i(f fVar, int i10) {
        this.f2279o = fVar;
        this.f2280p = i10;
    }

    public static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
            return -1;
        }
    }

    public final Class<InputStream> a() {
        return InputStream.class;
    }

    public final void b() {
        InputStream inputStream = this.f2282r;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f2281q;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f2281q = null;
    }

    public final void cancel() {
        this.f2283s = true;
    }

    public final InputStream d(URL url, int i10, URL url2, Map<String, String> map) {
        boolean z;
        InputStream inputStream;
        if (i10 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new e(-1, "In re-direct loop", (IOException) null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            boolean z10 = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry next : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                int i11 = this.f2280p;
                httpURLConnection.setConnectTimeout(i11);
                httpURLConnection.setReadTimeout(i11);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f2281q = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.f2282r = this.f2281q.getInputStream();
                    if (this.f2283s) {
                        return null;
                    }
                    int c10 = c(this.f2281q);
                    int i12 = c10 / 100;
                    if (i12 == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        HttpURLConnection httpURLConnection2 = this.f2281q;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                inputStream = new c(httpURLConnection2.getInputStream(), (long) httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                                }
                                inputStream = httpURLConnection2.getInputStream();
                            }
                            this.f2282r = inputStream;
                            return inputStream;
                        } catch (IOException e10) {
                            throw new e(c(httpURLConnection2), "Failed to obtain InputStream", e10);
                        }
                    } else {
                        if (i12 == 3) {
                            z10 = true;
                        }
                        if (z10) {
                            String headerField = this.f2281q.getHeaderField("Location");
                            if (!TextUtils.isEmpty(headerField)) {
                                try {
                                    URL url3 = new URL(url, headerField);
                                    b();
                                    return d(url3, i10 + 1, url, map);
                                } catch (MalformedURLException e11) {
                                    throw new e(c10, x0.e("Bad redirect url: ", headerField), e11);
                                }
                            } else {
                                throw new e(c10, "Received empty or null redirect url", (IOException) null);
                            }
                        } else if (c10 == -1) {
                            throw new e(c10, "Http request failed", (IOException) null);
                        } else {
                            try {
                                throw new e(c10, this.f2281q.getResponseMessage(), (IOException) null);
                            } catch (IOException e12) {
                                throw new e(c10, "Failed to get a response message", e12);
                            }
                        }
                    }
                } catch (IOException e13) {
                    throw new e(c(this.f2281q), "Failed to connect or obtain data", e13);
                }
            } catch (IOException e14) {
                throw new e(0, "URL.openConnection threw", e14);
            }
        } else {
            throw new e(-1, "Too many (> 5) redirects!", (IOException) null);
        }
    }

    public final q2.a e() {
        return q2.a.REMOTE;
    }

    public final void f(j jVar, d.a<? super InputStream> aVar) {
        StringBuilder sb;
        f fVar = this.f2279o;
        int i10 = m3.f.f7074b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            aVar.d(d(fVar.d(), 0, (URL) null, fVar.f9171b.a()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder("Finished http url fetcher fetch in ");
                sb.append(m3.f.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (IOException e10) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
            }
            aVar.c(e10);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder("Finished http url fetcher fetch in ");
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + m3.f.a(elapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
