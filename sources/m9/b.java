package m9;

import i9.h;
import i9.i;
import j9.c;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p8.a;
import z8.g;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f7208a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7209b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7210c;
    public final List<i> d;

    public b(List<i> list) {
        g.f(list, "connectionSpecs");
        this.d = list;
    }

    public final i a(SSLSocket sSLSocket) {
        i iVar;
        boolean z;
        String[] strArr;
        String[] strArr2;
        boolean z10;
        int i10 = this.f7208a;
        List<i> list = this.d;
        int size = list.size();
        while (true) {
            if (i10 >= size) {
                iVar = null;
                break;
            }
            iVar = list.get(i10);
            if (iVar.b(sSLSocket)) {
                this.f7208a = i10 + 1;
                break;
            }
            i10++;
        }
        if (iVar != null) {
            int i11 = this.f7208a;
            int size2 = list.size();
            while (true) {
                if (i11 >= size2) {
                    z = false;
                    break;
                } else if (list.get(i11).b(sSLSocket)) {
                    z = true;
                    break;
                } else {
                    i11++;
                }
            }
            this.f7209b = z;
            boolean z11 = this.f7210c;
            String[] strArr3 = iVar.f6265c;
            if (strArr3 != null) {
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                g.e(enabledCipherSuites, "sslSocket.enabledCipherSuites");
                h.f6259t.getClass();
                strArr = c.o(enabledCipherSuites, strArr3, h.f6243b);
            } else {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            String[] strArr4 = iVar.d;
            if (strArr4 != null) {
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                g.e(enabledProtocols, "sslSocket.enabledProtocols");
                strArr2 = c.o(enabledProtocols, strArr4, a.f7965a);
            } else {
                strArr2 = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            g.e(supportedCipherSuites, "supportedCipherSuites");
            h.f6259t.getClass();
            h.a aVar = h.f6243b;
            byte[] bArr = c.f6602a;
            g.f(aVar, "comparator");
            int length = supportedCipherSuites.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    i12 = -1;
                    break;
                }
                if (aVar.compare(supportedCipherSuites[i12], "TLS_FALLBACK_SCSV") == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                }
                i12++;
            }
            if (z11 && i12 != -1) {
                g.e(strArr, "cipherSuitesIntersection");
                String str = supportedCipherSuites[i12];
                g.e(str, "supportedCipherSuites[indexOfFallbackScsv]");
                Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
                g.e(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                strArr = (String[]) copyOf;
                strArr[strArr.length - 1] = str;
            }
            i.a aVar2 = new i.a(iVar);
            g.e(strArr, "cipherSuitesIntersection");
            aVar2.c((String[]) Arrays.copyOf(strArr, strArr.length));
            g.e(strArr2, "tlsVersionsIntersection");
            aVar2.f((String[]) Arrays.copyOf(strArr2, strArr2.length));
            i a10 = aVar2.a();
            if (a10.c() != null) {
                sSLSocket.setEnabledProtocols(a10.d);
            }
            if (a10.a() != null) {
                sSLSocket.setEnabledCipherSuites(a10.f6265c);
            }
            return iVar;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f7210c);
        sb.append(", modes=");
        sb.append(list);
        sb.append(", supported protocols=");
        String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
        g.c(enabledProtocols2);
        String arrays = Arrays.toString(enabledProtocols2);
        g.e(arrays, "java.util.Arrays.toString(this)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }
}
