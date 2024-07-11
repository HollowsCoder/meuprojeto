package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import n4.m;
import o4.a;
import o4.c;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInAccount extends a implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new f4.a();
    public final HashSet A = new HashSet();

    /* renamed from: o  reason: collision with root package name */
    public final int f2307o;

    /* renamed from: p  reason: collision with root package name */
    public final String f2308p;

    /* renamed from: q  reason: collision with root package name */
    public final String f2309q;

    /* renamed from: r  reason: collision with root package name */
    public final String f2310r;

    /* renamed from: s  reason: collision with root package name */
    public final String f2311s;

    /* renamed from: t  reason: collision with root package name */
    public final Uri f2312t;
    public String u;

    /* renamed from: v  reason: collision with root package name */
    public final long f2313v;
    public final String w;

    /* renamed from: x  reason: collision with root package name */
    public final List<Scope> f2314x;

    /* renamed from: y  reason: collision with root package name */
    public final String f2315y;
    public final String z;

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j8, String str6, ArrayList arrayList, String str7, String str8) {
        this.f2307o = i10;
        this.f2308p = str;
        this.f2309q = str2;
        this.f2310r = str3;
        this.f2311s = str4;
        this.f2312t = uri;
        this.u = str5;
        this.f2313v = j8;
        this.w = str6;
        this.f2314x = arrayList;
        this.f2315y = str7;
        this.z = str8;
    }

    @RecentlyNullable
    public static GoogleSignInAccount h0(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10), 1));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (valueOf == null) {
            valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        }
        long longValue = valueOf.longValue();
        m.e(string);
        GoogleSignInAccount googleSignInAccount = r3;
        GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, optString2, str2, str3, str4, uri, (String) null, longValue, string, new ArrayList(hashSet), str5, str6);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        } else {
            str7 = null;
        }
        googleSignInAccount.u = str7;
        return googleSignInAccount;
    }

    @RecentlyNonNull
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.w.equals(this.w) && googleSignInAccount.g0().equals(g0());
    }

    public final HashSet g0() {
        HashSet hashSet = new HashSet(this.f2314x);
        hashSet.addAll(this.A);
        return hashSet;
    }

    @RecentlyNonNull
    public final int hashCode() {
        return g0().hashCode() + ((this.w.hashCode() + 527) * 31);
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10) {
        int h10 = c.h(parcel, 20293);
        c.i(parcel, 1, 4);
        parcel.writeInt(this.f2307o);
        c.f(parcel, 2, this.f2308p);
        c.f(parcel, 3, this.f2309q);
        c.f(parcel, 4, this.f2310r);
        c.f(parcel, 5, this.f2311s);
        c.e(parcel, 6, this.f2312t, i10);
        c.f(parcel, 7, this.u);
        c.i(parcel, 8, 8);
        parcel.writeLong(this.f2313v);
        c.f(parcel, 9, this.w);
        List<Scope> list = this.f2314x;
        if (list != null) {
            int h11 = c.h(parcel, 10);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                Parcelable parcelable = list.get(i11);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    c.j(parcel, parcelable, 0);
                }
            }
            c.k(parcel, h11);
        }
        c.f(parcel, 11, this.f2315y);
        c.f(parcel, 12, this.z);
        c.k(parcel, h10);
    }
}
