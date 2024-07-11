package w4;

import android.os.IInterface;
import u4.a;

public interface c extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z, int i10);

    int getIntFlagValue(String str, int i10, int i11);

    long getLongFlagValue(String str, long j8, int i10);

    String getStringFlagValue(String str, String str2, int i10);

    void init(a aVar);
}
