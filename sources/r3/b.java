package r3;

import a4.q;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.util.Base64;
import android.util.JsonReader;
import com.karumi.dexter.BuildConfig;
import d8.f;
import f7.a0;
import f7.n;
import g7.a;
import java.util.ArrayList;
import q7.d;
import t3.j;
import t3.s;

public final /* synthetic */ class b implements q.a, f.a, a.C0071a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f8415o;

    public /* synthetic */ b(int i10) {
        this.f8415o = i10;
    }

    public final Object apply(Object obj) {
        byte[] bArr;
        boolean z = false;
        switch (this.f8415o) {
            case 1:
                q3.b bVar = q.f88t;
                throw new b4.a("Timed out while trying to open db.", (Throwable) obj);
            case 2:
                q3.b bVar2 = q.f88t;
                throw new b4.a("Timed out while trying to acquire the lock.", (Throwable) obj);
            case 3:
                Cursor cursor = (Cursor) obj;
                q3.b bVar3 = q.f88t;
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    j.a a10 = s.a();
                    a10.b(cursor.getString(1));
                    a10.c(d4.a.b(cursor.getInt(2)));
                    String string = cursor.getString(3);
                    if (string == null) {
                        bArr = null;
                    } else {
                        bArr = Base64.decode(string, 0);
                    }
                    a10.f8962b = bArr;
                    arrayList.add(a10.a());
                }
                return arrayList;
            case 4:
                q3.b bVar4 = q.f88t;
                if (((Cursor) obj).getCount() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                Cursor cursor2 = (Cursor) obj;
                q3.b bVar5 = q.f88t;
                ArrayList arrayList2 = new ArrayList();
                int i10 = 0;
                while (cursor2.moveToNext()) {
                    byte[] blob = cursor2.getBlob(0);
                    arrayList2.add(blob);
                    i10 += blob.length;
                }
                byte[] bArr2 = new byte[i10];
                int i11 = 0;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    byte[] bArr3 = (byte[]) arrayList2.get(i12);
                    System.arraycopy(bArr3, 0, bArr2, i11, bArr3.length);
                    i11 += bArr3.length;
                }
                return bArr2;
        }
    }

    public final Object b(JsonReader jsonReader) {
        switch (this.f8415o) {
            case 7:
                return a.b(jsonReader);
            default:
                d dVar = a.f4992a;
                n.a aVar = new n.a();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    char c10 = 65535;
                    switch (nextName.hashCode()) {
                        case 3373707:
                            if (nextName.equals("name")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 3530753:
                            if (nextName.equals("size")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 3601339:
                            if (nextName.equals("uuid")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 1153765347:
                            if (nextName.equals("baseAddress")) {
                                c10 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                aVar.f4840c = nextString;
                                break;
                            } else {
                                throw new NullPointerException("Null name");
                            }
                        case 1:
                            aVar.f4839b = Long.valueOf(jsonReader.nextLong());
                            break;
                        case 2:
                            aVar.d = new String(Base64.decode(jsonReader.nextString(), 2), a0.f4737a);
                            break;
                        case 3:
                            aVar.f4838a = Long.valueOf(jsonReader.nextLong());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return aVar.a();
        }
    }

    public final String c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : BuildConfig.FLAVOR;
    }
}
