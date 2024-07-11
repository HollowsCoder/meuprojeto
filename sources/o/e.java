package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.SparseArray;
import com.appfab.facematchlive.FaceMatchApp;
import com.appfab.facematchlive.data.model.GalleryModel;
import com.google.android.gms.internal.vision.p4;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import n4.m;
import p5.a;
import p5.b;
import q5.d;
import q5.h;
import z8.g;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public int f7553a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7554b;

    public /* synthetic */ e() {
        this.f7554b = new Object[256];
    }

    public /* synthetic */ e(Context context) {
        this.f7554b = context;
    }

    public static String a(Bitmap bitmap, String str) {
        File file;
        g.f(str, "fileCreatedAt");
        FaceMatchApp a10 = FaceMatchApp.u.a();
        if (a10 != null) {
            file = a10.f2223s;
        } else {
            file = null;
        }
        File file2 = new File(file, str.concat(".jpg"));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2.toString());
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
            return file2.getAbsolutePath();
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final ArrayList b(Bitmap bitmap) {
        boolean z;
        a[] e10;
        int i10;
        ArrayList arrayList;
        int i11;
        Bitmap bitmap2 = bitmap;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.clear();
        this.f7553a = 0;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        h hVar = new h();
        hVar.f8245o = 0;
        hVar.f8246p = 1;
        hVar.f8247q = 1;
        hVar.f8248r = false;
        hVar.f8249s = false;
        hVar.f8250t = -1.0f;
        b bVar = new b(new d((Context) this.f7554b, hVar));
        if (bVar.f7926c.c() != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return new ArrayList();
        }
        n5.b bVar2 = new n5.b();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        bVar2.f7480a = width;
        bVar2.f7481b = height;
        new SparseArray().clear();
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        int i12 = width2 * height2;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((((height2 + 1) / 2) * ((width2 + 1) / 2)) << 1) + i12);
        int i13 = 0;
        int i14 = i12;
        while (i13 < i12) {
            int i15 = i13 % width2;
            int i16 = i13 / width2;
            int pixel = bitmap2.getPixel(i15, i16);
            float red = (float) Color.red(pixel);
            float green = (float) Color.green(pixel);
            float blue = (float) Color.blue(pixel);
            allocateDirect.put(i13, (byte) ((int) ((0.114f * blue) + (0.587f * green) + (0.299f * red))));
            if (i16 % 2 == 0 && i15 % 2 == 0) {
                int i17 = i14 + 1;
                allocateDirect.put(i14, (byte) ((int) ((blue * 0.5f) + (-0.331f * green) + (-0.169f * red) + 128.0f)));
                i14 = i17 + 1;
                allocateDirect.put(i17, (byte) ((int) ((blue * -0.081f) + (green * -0.419f) + (red * 0.5f) + 128.0f)));
            }
            i13++;
            bitmap2 = bitmap;
        }
        synchronized (bVar.d) {
            if (bVar.f7927e) {
                d dVar = bVar.f7926c;
                m.h(allocateDirect);
                p4 p4Var = new p4();
                p4Var.f3135o = bVar2.f7480a;
                p4Var.f3136p = bVar2.f7481b;
                p4Var.f3139s = 0;
                p4Var.f3137q = 0;
                p4Var.f3138r = 0;
                e10 = dVar.e(allocateDirect, p4Var);
            } else {
                throw new IllegalStateException("Cannot use detector after release()");
            }
        }
        HashSet hashSet = new HashSet();
        SparseArray sparseArray = new SparseArray(e10.length);
        int i18 = 0;
        for (a aVar : e10) {
            int i19 = aVar.f7920a;
            i18 = Math.max(i18, i19);
            if (hashSet.contains(Integer.valueOf(i19))) {
                i19 = i18 + 1;
                i18 = i19;
            }
            hashSet.add(Integer.valueOf(i19));
            n5.d dVar2 = bVar.f7925b;
            dVar2.getClass();
            synchronized (n5.d.f7482c) {
                i11 = dVar2.f7483a.get(i19, -1);
                if (i11 == -1) {
                    i11 = n5.d.d;
                    n5.d.d = i11 + 1;
                    dVar2.f7483a.append(i19, i11);
                    dVar2.f7484b.append(i11, i19);
                }
            }
            sparseArray.append(i11, aVar);
        }
        int size = sparseArray.size();
        int i20 = 0;
        while (i20 < size) {
            a aVar2 = (a) sparseArray.valueAt(i20);
            int round = Math.round(aVar2.a().x);
            if (round < 0) {
                round = 0;
            }
            int round2 = (int) Math.round(((double) aVar2.a().y) - (((double) aVar2.d) * 0.2d));
            if (round2 < 0) {
                arrayList = arrayList2;
                i10 = i20;
                round2 = (int) Math.round(((double) aVar2.a().y) - (((double) aVar2.d) * 0.1d));
            } else {
                arrayList = arrayList2;
                i10 = i20;
            }
            if (round2 < 0) {
                round2 = Math.round(aVar2.a().y);
            }
            int round3 = Math.round(aVar2.f7922c);
            if (round3 + round > createBitmap.getWidth()) {
                round3 = createBitmap.getWidth() - round;
            }
            double d = (double) aVar2.d;
            int round4 = (int) Math.round((0.4d * d) + d);
            if (round4 + round2 > createBitmap.getHeight()) {
                double d10 = (double) aVar2.d;
                round4 = (int) Math.round((0.2d * d10) + d10);
            }
            if (round4 + round2 > createBitmap.getHeight()) {
                double d11 = (double) aVar2.d;
                round4 = (int) Math.round((0.1d * d11) + d11);
            }
            if (round4 + round2 > createBitmap.getHeight()) {
                round4 = createBitmap.getHeight();
            }
            if (round4 + round2 > createBitmap.getHeight()) {
                round4 = createBitmap.getHeight() - round2;
            }
            String valueOf = String.valueOf(new Date().getTime());
            Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, round, round2, round3, round4);
            g.e(createBitmap2, "createBitmap(tempBitmap,…ne, Y_One, width, height)");
            String a10 = a(createBitmap2, valueOf + '_' + this.f7553a);
            if (a10 != null) {
                arrayList.add(new GalleryModel(a10, valueOf + '_' + this.f7553a + ".jpg", this.f7553a, false, false));
                this.f7553a = this.f7553a + 1;
            }
            i20 = i10 + 1;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        bVar.a();
        return arrayList3;
    }

    public final void c(Object obj) {
        int i10 = this.f7553a;
        Object[] objArr = (Object[]) this.f7554b;
        if (i10 < objArr.length) {
            objArr[i10] = obj;
            this.f7553a = i10 + 1;
        }
    }
}
