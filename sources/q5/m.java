package q5;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.vision.a;

public abstract class m extends a implements j {
    public static j I(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
        return queryLocalInterface instanceof j ? (j) queryLocalInterface : new l(iBinder);
    }
}
