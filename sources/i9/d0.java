package i9;

import j9.c;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import w9.i;
import z8.g;

public abstract class d0 implements Closeable {

    /* renamed from: p  reason: collision with root package name */
    public static final b f6228p = new b();

    /* renamed from: o  reason: collision with root package name */
    public a f6229o;

    public static final class a extends Reader {

        /* renamed from: o  reason: collision with root package name */
        public boolean f6230o;

        /* renamed from: p  reason: collision with root package name */
        public InputStreamReader f6231p;

        /* renamed from: q  reason: collision with root package name */
        public final i f6232q;

        /* renamed from: r  reason: collision with root package name */
        public final Charset f6233r;

        public a(i iVar, Charset charset) {
            g.f(iVar, "source");
            g.f(charset, "charset");
            this.f6232q = iVar;
            this.f6233r = charset;
        }

        public final void close() {
            this.f6230o = true;
            InputStreamReader inputStreamReader = this.f6231p;
            if (inputStreamReader != null) {
                inputStreamReader.close();
            } else {
                this.f6232q.close();
            }
        }

        public final int read(char[] cArr, int i10, int i11) {
            g.f(cArr, "cbuf");
            if (!this.f6230o) {
                InputStreamReader inputStreamReader = this.f6231p;
                if (inputStreamReader == null) {
                    i iVar = this.f6232q;
                    inputStreamReader = new InputStreamReader(iVar.f0(), c.q(iVar, this.f6233r));
                    this.f6231p = inputStreamReader;
                }
                return inputStreamReader.read(cArr, i10, i11);
            }
            throw new IOException("Stream closed");
        }
    }

    public static final class b {
    }

    public abstract long a();

    public abstract t b();

    public abstract i c();

    public void close() {
        c.c(c());
    }
}
