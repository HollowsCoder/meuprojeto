package y7;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import y7.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final File f9619a;

    /* renamed from: b  reason: collision with root package name */
    public final s6.c f9620b;

    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(s6.c cVar) {
        cVar.a();
        File filesDir = cVar.f8815a.getFilesDir();
        this.f9619a = new File(filesDir, "PersistedInstallation." + cVar.c() + ".json");
        this.f9620b = cVar;
    }

    public final void a(a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f9604b);
            jSONObject.put("Status", aVar.f9605c.ordinal());
            jSONObject.put("AuthToken", aVar.d);
            jSONObject.put("RefreshToken", aVar.f9606e);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f9608g);
            jSONObject.put("ExpiresInSecs", aVar.f9607f);
            jSONObject.put("FisError", aVar.f9609h);
            s6.c cVar = this.f9620b;
            cVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", cVar.f8815a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(this.f9619a)) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final a b() {
        JSONObject jSONObject;
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(this.f9619a);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        String optString = jSONObject.optString("Fid", (String) null);
        a aVar = a.ATTEMPT_MIGRATION;
        int optInt = jSONObject.optInt("Status", aVar.ordinal());
        String optString2 = jSONObject.optString("AuthToken", (String) null);
        String optString3 = jSONObject.optString("RefreshToken", (String) null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0);
        String optString4 = jSONObject.optString("FisError", (String) null);
        int i10 = d.f9621a;
        a.C0166a aVar2 = new a.C0166a();
        aVar2.f9614f = 0L;
        aVar2.b(aVar);
        aVar2.f9613e = 0L;
        aVar2.f9610a = optString;
        aVar2.b(a.values()[optInt]);
        aVar2.f9612c = optString2;
        aVar2.d = optString3;
        aVar2.f9614f = Long.valueOf(optLong);
        aVar2.f9613e = Long.valueOf(optLong2);
        aVar2.f9615g = optString4;
        return aVar2.a();
        throw th;
    }
}
