package x4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import b8.n;
import c5.f;
import c5.g;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;

public final class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9493a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9494b;

    public /* synthetic */ e(int i10, Object obj) {
        this.f9493a = i10;
        this.f9494b = obj;
    }

    public final Object call() {
        byte[] bArr;
        switch (this.f9493a) {
            case 0:
                return ((Context) this.f9494b).getSharedPreferences("google_sdk_flags", 0);
            default:
                n nVar = (n) this.f9494b;
                Log.i("FirebaseMessaging", "Starting download of: ".concat(String.valueOf(nVar.f2034o)));
                URLConnection openConnection = nVar.f2034o.openConnection();
                if (openConnection.getContentLength() <= 1048576) {
                    InputStream inputStream = openConnection.getInputStream();
                    try {
                        nVar.f2036q = inputStream;
                        int i10 = g.f2161a;
                        f fVar = new f(inputStream);
                        ArrayDeque arrayDeque = new ArrayDeque(20);
                        int i11 = 8192;
                        int i12 = 0;
                        while (true) {
                            if (i12 < 2147483639) {
                                int min = Math.min(i11, 2147483639 - i12);
                                byte[] bArr2 = new byte[min];
                                arrayDeque.add(bArr2);
                                int i13 = 0;
                                while (i13 < min) {
                                    int read = fVar.read(bArr2, i13, min - i13);
                                    if (read == -1) {
                                        bArr = new byte[i12];
                                        int i14 = i12;
                                        while (i14 > 0) {
                                            byte[] bArr3 = (byte[]) arrayDeque.remove();
                                            int min2 = Math.min(i14, bArr3.length);
                                            System.arraycopy(bArr3, 0, bArr, i12 - i14, min2);
                                            i14 -= min2;
                                        }
                                    } else {
                                        i13 += read;
                                        i12 += read;
                                    }
                                }
                                long j8 = (long) i11;
                                long j10 = j8 + j8;
                                if (j10 > 2147483647L) {
                                    i11 = Integer.MAX_VALUE;
                                } else if (j10 < -2147483648L) {
                                    i11 = Integer.MIN_VALUE;
                                } else {
                                    i11 = (int) j10;
                                }
                            } else if (fVar.read() == -1) {
                                bArr = new byte[2147483639];
                                int i15 = 2147483639;
                                while (i15 > 0) {
                                    byte[] bArr4 = (byte[]) arrayDeque.remove();
                                    int min3 = Math.min(i15, bArr4.length);
                                    System.arraycopy(bArr4, 0, bArr, 2147483639 - i15, min3);
                                    i15 -= min3;
                                }
                            } else {
                                throw new OutOfMemoryError("input is too large to fit in a byte array");
                            }
                        }
                        inputStream.close();
                        if (Log.isLoggable("FirebaseMessaging", 2)) {
                            String valueOf = String.valueOf(nVar.f2034o);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 34);
                            sb.append("Downloaded ");
                            sb.append(bArr.length);
                            sb.append(" bytes from ");
                            sb.append(valueOf);
                            Log.v("FirebaseMessaging", sb.toString());
                        }
                        if (bArr.length <= 1048576) {
                            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                            if (decodeByteArray != null) {
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    Log.d("FirebaseMessaging", "Successfully downloaded image: ".concat(String.valueOf(nVar.f2034o)));
                                }
                                return decodeByteArray;
                            }
                            throw new IOException("Failed to decode image: ".concat(String.valueOf(nVar.f2034o)));
                        }
                        throw new IOException("Image exceeds max size of 1048576");
                    } catch (Throwable unused) {
                        break;
                    }
                } else {
                    throw new IOException("Content-Length exceeds max size of 1048576");
                }
                break;
        }
        throw th;
    }
}
