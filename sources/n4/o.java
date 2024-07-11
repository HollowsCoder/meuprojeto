package n4;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.karumi.dexter.R;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f7456a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7457b;

    public o(@RecentlyNonNull Context context) {
        m.h(context);
        Resources resources = context.getResources();
        this.f7456a = resources;
        this.f7457b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    @RecentlyNullable
    public final String a(@RecentlyNonNull String str) {
        Resources resources = this.f7456a;
        int identifier = resources.getIdentifier(str, "string", this.f7457b);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
