package x4;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

public final class a implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9483a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f9484b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f9485c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(SharedPreferences sharedPreferences, String str, Object obj, int i10) {
        this.f9483a = i10;
        this.f9484b = sharedPreferences;
        this.f9485c = str;
        this.d = obj;
    }

    public final /* synthetic */ Object call() {
        int i10 = this.f9483a;
        String str = this.f9485c;
        SharedPreferences sharedPreferences = this.f9484b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
            default:
                return sharedPreferences.getString(str, (String) obj);
        }
    }
}
