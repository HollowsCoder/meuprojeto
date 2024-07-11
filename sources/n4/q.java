package n4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.karumi.dexter.R;
import j4.g;
import java.util.Locale;
import n.i;
import r4.e;
import t4.c;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final i<String, String> f7461a = new i<>();

    /* renamed from: b  reason: collision with root package name */
    public static Locale f7462b;

    public static String a(Context context, int i10) {
        String str;
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return b(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return b(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return b(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return b(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i10);
                str = sb.toString();
                break;
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    public static String b(Context context, String str) {
        Resources resources;
        String str2;
        String str3;
        i<String, String> iVar = f7461a;
        synchronized (iVar) {
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            if (!locale.equals(f7462b)) {
                iVar.clear();
                f7462b = locale;
            }
            String orDefault = iVar.getOrDefault(str, null);
            if (orDefault != null) {
                return orDefault;
            }
            int i10 = g.f6548e;
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                if (str.length() != 0) {
                    str3 = "Missing resource: ".concat(str);
                } else {
                    str3 = new String("Missing resource: ");
                }
                Log.w("GoogleApiAvailability", str3);
                return null;
            }
            String string = resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                if (str.length() != 0) {
                    str2 = "Got empty resource: ".concat(str);
                } else {
                    str2 = new String("Got empty resource: ");
                }
                Log.w("GoogleApiAvailability", str2);
                return null;
            }
            f7461a.put(str, string);
            return string;
        }
    }

    public static String c(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String b10 = b(context, str);
        if (b10 == null) {
            b10 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, b10, new Object[]{str2});
    }

    public static String d(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = c.a(context).f8994a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String e(Context context, int i10) {
        Resources resources = context.getResources();
        String d = d(context);
        if (i10 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, new Object[]{d});
        } else if (i10 != 2) {
            if (i10 == 3) {
                return resources.getString(R.string.common_google_play_services_enable_text, new Object[]{d});
            } else if (i10 == 5) {
                return c(context, "common_google_play_services_invalid_account_text", d);
            } else {
                if (i10 == 7) {
                    return c(context, "common_google_play_services_network_error_text", d);
                }
                if (i10 == 9) {
                    return resources.getString(R.string.common_google_play_services_unsupported_text, new Object[]{d});
                } else if (i10 == 20) {
                    return c(context, "common_google_play_services_restricted_profile_text", d);
                } else {
                    switch (i10) {
                        case 16:
                            return c(context, "common_google_play_services_api_unavailable_text", d);
                        case 17:
                            return c(context, "common_google_play_services_sign_in_failed_text", d);
                        case 18:
                            return resources.getString(R.string.common_google_play_services_updating_text, new Object[]{d});
                        default:
                            return resources.getString(R.string.common_google_play_services_unknown_issue, new Object[]{d});
                    }
                }
            }
        } else if (e.a(context)) {
            return resources.getString(R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(R.string.common_google_play_services_update_text, new Object[]{d});
        }
    }
}
