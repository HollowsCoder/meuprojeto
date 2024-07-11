package f0;

import a0.c;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.appcompat.widget.x0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4558a = new a();

    public class a implements Comparator<byte[]> {
        public final int compare(Object obj, Object obj2) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i10 = 0; i10 < bArr.length; i10++) {
                byte b10 = bArr[i10];
                byte b11 = bArr2[i10];
                if (b10 != b11) {
                    return b10 - b11;
                }
            }
            return 0;
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [f0.l[], android.database.Cursor] */
    public static k a(Context context, e eVar) {
        Cursor cursor;
        int i10;
        int i11;
        Uri uri;
        int i12;
        boolean z;
        boolean z10;
        e eVar2 = eVar;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = eVar2.f4559a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider != null) {
            String str2 = resolveContentProvider.packageName;
            String str3 = eVar2.f4560b;
            if (str2.equals(str3)) {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature byteArray : signatureArr) {
                    arrayList.add(byteArray.toByteArray());
                }
                a aVar = f4558a;
                Collections.sort(arrayList, aVar);
                List<List<byte[]>> list = eVar2.d;
                if (list == null) {
                    list = c.b(resources, 0);
                }
                int i13 = 0;
                while (true) {
                    cursor = 0;
                    if (i13 >= list.size()) {
                        resolveContentProvider = cursor;
                        break;
                    }
                    ArrayList arrayList2 = new ArrayList(list.get(i13));
                    Collections.sort(arrayList2, aVar);
                    if (arrayList.size() == arrayList2.size()) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList.size()) {
                                z10 = true;
                                break;
                            } else if (!Arrays.equals((byte[]) arrayList.get(i14), (byte[]) arrayList2.get(i14))) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                    }
                    z10 = false;
                    if (z10) {
                        break;
                    }
                    i13++;
                }
                if (resolveContentProvider == null) {
                    return new k(1, cursor);
                }
                String str4 = resolveContentProvider.authority;
                ArrayList arrayList3 = new ArrayList();
                Uri build = new Uri.Builder().scheme("content").authority(str4).build();
                Uri build2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
                try {
                    cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{eVar2.f4561c}, (String) null, (CancellationSignal) null);
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            if (columnIndex != -1) {
                                i10 = cursor.getInt(columnIndex);
                            } else {
                                i10 = 0;
                            }
                            if (columnIndex4 != -1) {
                                i11 = cursor.getInt(columnIndex4);
                            } else {
                                i11 = 0;
                            }
                            if (columnIndex3 == -1) {
                                uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                            } else {
                                uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                            }
                            Uri uri2 = uri;
                            if (columnIndex5 != -1) {
                                i12 = cursor.getInt(columnIndex5);
                            } else {
                                i12 = 400;
                            }
                            int i15 = i12;
                            if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                                z = false;
                            } else {
                                z = true;
                            }
                            arrayList3.add(new l(uri2, i11, i15, z, i10));
                        }
                    }
                    return new k(0, (l[]) arrayList3.toArray(new l[0]));
                } finally {
                    if (cursor != 0) {
                        cursor.close();
                    }
                }
            } else {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
            }
        } else {
            throw new PackageManager.NameNotFoundException(x0.e("No package found for authority: ", str));
        }
    }
}
