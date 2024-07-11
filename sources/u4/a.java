package u4;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;
import b5.b;

public interface a extends IInterface {

    /* renamed from: u4.a$a  reason: collision with other inner class name */
    public static abstract class C0136a extends b5.a implements a {

        /* renamed from: u4.a$a$a  reason: collision with other inner class name */
        public static class C0137a extends b implements a {
            public C0137a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public C0136a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @RecentlyNonNull
        public static a J(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new C0137a(iBinder);
        }
    }
}
