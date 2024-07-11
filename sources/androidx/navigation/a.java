package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.navigation.p;
import com.karumi.dexter.BuildConfig;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@p.a("activity")
public final class a extends p<C0016a> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1449a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f1450b;

    /* renamed from: androidx.navigation.a$a  reason: collision with other inner class name */
    public static class C0016a extends h {
        public Intent w;

        /* renamed from: x  reason: collision with root package name */
        public String f1451x;

        public C0016a(p<? extends C0016a> pVar) {
            super(pVar);
        }

        public final void k(Context context, AttributeSet attributeSet) {
            super.k(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, androidx.databinding.a.f1012o);
            String string = obtainAttributes.getString(4);
            if (string != null) {
                string = string.replace("${applicationId}", context.getPackageName());
            }
            if (this.w == null) {
                this.w = new Intent();
            }
            this.w.setPackage(string);
            String string2 = obtainAttributes.getString(0);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                ComponentName componentName = new ComponentName(context, string2);
                if (this.w == null) {
                    this.w = new Intent();
                }
                this.w.setComponent(componentName);
            }
            String string3 = obtainAttributes.getString(1);
            if (this.w == null) {
                this.w = new Intent();
            }
            this.w.setAction(string3);
            String string4 = obtainAttributes.getString(2);
            if (string4 != null) {
                Uri parse = Uri.parse(string4);
                if (this.w == null) {
                    this.w = new Intent();
                }
                this.w.setData(parse);
            }
            this.f1451x = obtainAttributes.getString(3);
            obtainAttributes.recycle();
        }

        public final String toString() {
            ComponentName componentName;
            Intent intent = this.w;
            String str = null;
            if (intent == null) {
                componentName = null;
            } else {
                componentName = intent.getComponent();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (componentName != null) {
                sb.append(" class=");
                sb.append(componentName.getClassName());
            } else {
                Intent intent2 = this.w;
                if (intent2 != null) {
                    str = intent2.getAction();
                }
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
            }
            return sb.toString();
        }
    }

    public a(Context context) {
        this.f1449a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.f1450b = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    public final h a() {
        return new C0016a(this);
    }

    public final h b(h hVar, Bundle bundle, m mVar) {
        Intent intent;
        int intExtra;
        C0016a aVar = (C0016a) hVar;
        if (aVar.w != null) {
            Intent intent2 = new Intent(aVar.w);
            if (bundle != null) {
                intent2.putExtras(bundle);
                String str = aVar.f1451x;
                if (!TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, BuildConfig.FLAVOR);
                            stringBuffer.append(Uri.encode(bundle.get(group).toString()));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + str);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            Context context = this.f1449a;
            if (!(context instanceof Activity)) {
                intent2.addFlags(268435456);
            }
            if (mVar != null && mVar.f1513a) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.f1450b;
            if (!(activity == null || (intent = activity.getIntent()) == null || (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) == 0)) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", aVar.f1494q);
            Resources resources = context.getResources();
            if (mVar != null) {
                int i10 = mVar.f1517f;
                int i11 = mVar.f1518g;
                if ((i10 <= 0 || !resources.getResourceTypeName(i10).equals("animator")) && (i11 <= 0 || !resources.getResourceTypeName(i11).equals("animator"))) {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i10);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i11);
                } else {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i10) + " and popExit resource " + resources.getResourceName(i11) + "when launching " + aVar);
                }
            }
            context.startActivity(intent2);
            if (mVar == null || activity == null) {
                return null;
            }
            int i12 = mVar.d;
            int i13 = mVar.f1516e;
            if ((i12 > 0 && resources.getResourceTypeName(i12).equals("animator")) || (i13 > 0 && resources.getResourceTypeName(i13).equals("animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i12) + " and exit resource " + resources.getResourceName(i13) + "when launching " + aVar);
                return null;
            } else if (i12 < 0 && i13 < 0) {
                return null;
            } else {
                activity.overridePendingTransition(Math.max(i12, 0), Math.max(i13, 0));
                return null;
            }
        } else {
            throw new IllegalStateException("Destination " + aVar.f1494q + " does not have an Intent set.");
        }
    }

    public final boolean e() {
        Activity activity = this.f1450b;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
