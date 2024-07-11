package w9;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;

public final class a0 extends b {

    /* renamed from: k  reason: collision with root package name */
    public final Socket f9310k;

    public a0(Socket socket) {
        this.f9310k = socket;
    }

    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.AssertionError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Exception} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k() {
        /*
            r6 = this;
            java.lang.String r0 = "Failed to close timed out socket "
            java.net.Socket r1 = r6.f9310k
            r1.close()     // Catch:{ Exception -> 0x001a, AssertionError -> 0x0008 }
            goto L_0x002e
        L_0x0008:
            r2 = move-exception
            boolean r3 = n.e.B(r2)
            if (r3 == 0) goto L_0x0019
            java.util.logging.Logger r3 = w9.q.f9346a
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            goto L_0x0024
        L_0x0019:
            throw r2
        L_0x001a:
            r2 = move-exception
            java.util.logging.Logger r3 = w9.q.f9346a
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
        L_0x0024:
            r5.append(r1)
            java.lang.String r0 = r5.toString()
            r3.log(r4, r0, r2)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.a0.k():void");
    }
}
