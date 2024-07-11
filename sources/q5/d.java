package q5;

import android.content.Context;
import android.graphics.PointF;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.vision.p4;
import com.google.android.gms.internal.vision.q4;
import java.nio.ByteBuffer;
import n.e;
import n4.m;
import p5.a;
import u4.b;

public final class d extends q4<i> {

    /* renamed from: i  reason: collision with root package name */
    public final h f8244i;

    public d(Context context, h hVar) {
        super(context);
        this.f8244i = hVar;
        c();
    }

    public static a d(a aVar) {
        e[] eVarArr;
        s6.a[] aVarArr;
        int i10 = aVar.f8230p;
        PointF pointF = new PointF(aVar.f8231q, aVar.f8232r);
        float f10 = aVar.f8233s;
        float f11 = aVar.f8234t;
        b[] bVarArr = aVar.f8236x;
        if (bVarArr == null) {
            eVarArr = new e[0];
        } else {
            e[] eVarArr2 = new e[bVarArr.length];
            for (int i11 = 0; i11 < bVarArr.length; i11++) {
                b bVar = bVarArr[i11];
                new PointF(bVar.f8239p, bVar.f8240q);
                eVarArr2[i11] = new e();
            }
            eVarArr = eVarArr2;
        }
        c[] cVarArr = aVar.B;
        if (cVarArr == null) {
            aVarArr = new s6.a[0];
        } else {
            aVarArr = new s6.a[cVarArr.length];
            for (int i12 = 0; i12 < cVarArr.length; i12++) {
                PointF[] pointFArr = cVarArr[i12].f8242o;
                aVarArr[i12] = new s6.a();
            }
        }
        return new a(i10, pointF, f10, f11, eVarArr, aVarArr);
    }

    public final i a(DynamiteModule dynamiteModule, Context context) {
        String str;
        boolean z = false;
        if (DynamiteModule.a(context, "com.google.android.gms.vision.dynamite.face") > DynamiteModule.d(context, "com.google.android.gms.vision.dynamite", false)) {
            z = true;
        }
        if (z) {
            str = "com.google.android.gms.vision.face.NativeFaceDetectorV2Creator";
        } else {
            str = "com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator";
        }
        j I = m.I(dynamiteModule.b(str));
        if (I == null) {
            return null;
        }
        b bVar = new b(context);
        h hVar = this.f8244i;
        m.h(hVar);
        return I.z(bVar, hVar);
    }

    public final a[] e(ByteBuffer byteBuffer, p4 p4Var) {
        boolean z;
        if (c() != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return new a[0];
        }
        try {
            b bVar = new b(byteBuffer);
            i iVar = (i) c();
            m.h(iVar);
            a[] k10 = iVar.k(bVar, p4Var);
            a[] aVarArr = new a[k10.length];
            for (int i10 = 0; i10 < k10.length; i10++) {
                aVarArr[i10] = d(k10[i10]);
            }
            return aVarArr;
        } catch (RemoteException e10) {
            Log.e("FaceNativeHandle", "Could not call native face detector", e10);
            return new a[0];
        }
    }
}
