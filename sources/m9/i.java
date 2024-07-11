package m9;

import j9.c;
import java.net.Socket;
import java.util.Iterator;
import l9.a;
import z8.g;

public final class i extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ j f7267e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(j jVar, String str) {
        super(str, true);
        this.f7267e = jVar;
    }

    public final long a() {
        j jVar = this.f7267e;
        long nanoTime = System.nanoTime();
        Iterator<h> it = jVar.d.iterator();
        int i10 = 0;
        long j8 = Long.MIN_VALUE;
        h hVar = null;
        int i11 = 0;
        while (it.hasNext()) {
            h next = it.next();
            g.e(next, "connection");
            synchronized (next) {
                if (jVar.b(next, nanoTime) > 0) {
                    i11++;
                } else {
                    i10++;
                    long j10 = nanoTime - next.f7265p;
                    if (j10 > j8) {
                        n8.i iVar = n8.i.f7501a;
                        hVar = next;
                        j8 = j10;
                    } else {
                        n8.i iVar2 = n8.i.f7501a;
                    }
                }
            }
        }
        long j11 = jVar.f7268a;
        if (j8 >= j11 || i10 > jVar.f7271e) {
            g.c(hVar);
            synchronized (hVar) {
                if (!(!hVar.f7264o.isEmpty())) {
                    if (hVar.f7265p + j8 == nanoTime) {
                        hVar.f7259i = true;
                        jVar.d.remove(hVar);
                        Socket socket = hVar.f7254c;
                        g.c(socket);
                        byte[] bArr = c.f6602a;
                        try {
                            socket.close();
                        } catch (AssertionError e10) {
                            throw e10;
                        } catch (RuntimeException e11) {
                            throw e11;
                        } catch (Exception unused) {
                        }
                        if (jVar.d.isEmpty()) {
                            jVar.f7269b.a();
                        }
                    }
                }
            }
            return 0;
        } else if (i10 > 0) {
            return j11 - j8;
        } else {
            if (i11 > 0) {
                return j11;
            }
            return -1;
        }
    }
}
