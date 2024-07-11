package t3;

import a4.q;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.util.Base64;
import android.util.JsonReader;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.remoteconfig.internal.a;
import com.karumi.dexter.BuildConfig;
import d8.f;
import f7.b0;
import g7.a;
import java.util.ArrayList;
import m5.i;
import m5.l;
import q3.b;
import q3.h;
import q7.d;
import t7.c;
import y6.e;
import y6.s;

public final /* synthetic */ class u implements h, q.a, f.a, a.C0071a, m5.h, e {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f8978o;

    public /* synthetic */ u(int i10) {
        this.f8978o = i10;
    }

    public void a(Exception exc) {
    }

    public Object apply(Object obj) {
        switch (this.f8978o) {
            case 1:
                Cursor cursor = (Cursor) obj;
                b bVar = q.f88t;
                if (!cursor.moveToNext()) {
                    return null;
                }
                return Long.valueOf(cursor.getLong(0));
            default:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
        }
    }

    public Object b(JsonReader jsonReader) {
        String str = BuildConfig.FLAVOR;
        String str2 = null;
        switch (this.f8978o) {
            case 5:
                d dVar = a.f4992a;
                jsonReader.beginObject();
                byte[] bArr = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    if (nextName.equals("filename")) {
                        str2 = jsonReader.nextString();
                        if (str2 == null) {
                            throw new NullPointerException("Null filename");
                        }
                    } else if (!nextName.equals("contents")) {
                        jsonReader.skipValue();
                    } else {
                        bArr = Base64.decode(jsonReader.nextString(), 2);
                        if (bArr == null) {
                            throw new NullPointerException("Null contents");
                        }
                    }
                }
                jsonReader.endObject();
                if (str2 == null) {
                    str = " filename";
                }
                if (bArr == null) {
                    str = str.concat(" contents");
                }
                if (str.isEmpty()) {
                    return new f7.f(str2, bArr);
                }
                throw new IllegalStateException("Missing required properties:".concat(str));
            case 6:
                d dVar2 = a.f4992a;
                jsonReader.beginObject();
                Integer num = null;
                b0 b0Var = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    nextName2.hashCode();
                    char c10 = 65535;
                    switch (nextName2.hashCode()) {
                        case -1266514778:
                            if (nextName2.equals("frames")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 3373707:
                            if (nextName2.equals("name")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 2125650548:
                            if (nextName2.equals("importance")) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList.add(a.a(jsonReader));
                            }
                            jsonReader.endArray();
                            b0Var = new b0(arrayList);
                            break;
                        case 1:
                            str2 = jsonReader.nextString();
                            if (str2 != null) {
                                break;
                            } else {
                                throw new NullPointerException("Null name");
                            }
                        case 2:
                            num = Integer.valueOf(jsonReader.nextInt());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (str2 == null) {
                    str = " name";
                }
                if (num == null) {
                    str = str.concat(" importance");
                }
                if (b0Var == null) {
                    str = b0.d.e(str, " frames");
                }
                if (str.isEmpty()) {
                    return new f7.q(str2, num.intValue(), b0Var);
                }
                throw new IllegalStateException("Missing required properties:".concat(str));
            default:
                return a.a(jsonReader);
        }
    }

    public String c(Context context) {
        switch (this.f8978o) {
            case 3:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    return String.valueOf(applicationInfo.targetSdkVersion);
                }
                return BuildConfig.FLAVOR;
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    return FirebaseCommonRegistrar.a(installerPackageName);
                }
                return BuildConfig.FLAVOR;
        }
    }

    public i i(Object obj) {
        switch (this.f8978o) {
            case 8:
                f8.e eVar = (f8.e) obj;
                return l.e((Object) null);
            default:
                a.C0043a aVar = (a.C0043a) obj;
                return l.e((Object) null);
        }
    }

    public Object j(s sVar) {
        switch (this.f8978o) {
            case 0:
                return AbtRegistrar.lambda$getComponents$0(sVar);
            case 1:
                return x.b((Context) sVar.a(Context.class));
            case 2:
                sVar.e(c.class);
                return new t7.b((Context) sVar.a(Context.class));
            default:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(sVar);
        }
    }
}
