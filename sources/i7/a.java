package i7;

import java.io.File;
import java.io.FilenameFilter;

public final /* synthetic */ class a implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6122a;

    public /* synthetic */ a(int i10) {
        this.f6122a = i10;
    }

    public final boolean accept(File file, String str) {
        switch (this.f6122a) {
            case 0:
                if (!str.startsWith("event") || str.endsWith("_")) {
                    return false;
                }
                return true;
            default:
                return str.startsWith("event");
        }
    }
}
