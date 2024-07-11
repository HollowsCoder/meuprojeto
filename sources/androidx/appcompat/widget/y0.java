package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import m0.c;

public final class y0 extends c implements View.OnClickListener {
    public static final /* synthetic */ int L = 0;
    public final Context A;
    public final WeakHashMap<String, Drawable.ConstantState> B;
    public final int C;
    public int D = 1;
    public ColorStateList E;
    public int F = -1;
    public int G = -1;
    public int H = -1;
    public int I = -1;
    public int J = -1;
    public int K = -1;

    /* renamed from: y  reason: collision with root package name */
    public final SearchView f730y;
    public final SearchableInfo z;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f731a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f732b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f733c;
        public final ImageView d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f734e;

        public a(View view) {
            this.f731a = (TextView) view.findViewById(16908308);
            this.f732b = (TextView) view.findViewById(16908309);
            this.f733c = (ImageView) view.findViewById(16908295);
            this.d = (ImageView) view.findViewById(16908296);
            this.f734e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public y0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.f730y = searchView;
        this.z = searchableInfo;
        this.C = searchView.getSuggestionCommitIconResId();
        this.A = context;
        this.B = weakHashMap;
    }

    public static String i(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.view.View r22, android.database.Cursor r23) {
        /*
            r21 = this;
            r1 = r21
            r2 = r23
            java.lang.Object r0 = r22.getTag()
            r3 = r0
            androidx.appcompat.widget.y0$a r3 = (androidx.appcompat.widget.y0.a) r3
            int r0 = r1.K
            r4 = 0
            r5 = -1
            if (r0 == r5) goto L_0x0017
            int r0 = r2.getInt(r0)
            r6 = r0
            goto L_0x0018
        L_0x0017:
            r6 = r4
        L_0x0018:
            android.widget.TextView r7 = r3.f731a
            if (r7 == 0) goto L_0x0032
            int r0 = r1.F
            java.lang.String r0 = i(r2, r0)
            r7.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x002e
            r0 = 8
            goto L_0x002f
        L_0x002e:
            r0 = r4
        L_0x002f:
            r7.setVisibility(r0)
        L_0x0032:
            r9 = 1
            r10 = 2
            android.content.Context r11 = r1.A
            android.widget.TextView r0 = r3.f732b
            if (r0 == 0) goto L_0x00b8
            int r12 = r1.H
            java.lang.String r12 = i(r2, r12)
            if (r12 == 0) goto L_0x008b
            android.content.res.ColorStateList r13 = r1.E
            if (r13 != 0) goto L_0x0061
            android.util.TypedValue r13 = new android.util.TypedValue
            r13.<init>()
            android.content.res.Resources$Theme r14 = r11.getTheme()
            r15 = 2130969551(0x7f0403cf, float:1.7547787E38)
            r14.resolveAttribute(r15, r13, r9)
            android.content.res.Resources r14 = r11.getResources()
            int r13 = r13.resourceId
            android.content.res.ColorStateList r13 = r14.getColorStateList(r13)
            r1.E = r13
        L_0x0061:
            android.text.SpannableString r13 = new android.text.SpannableString
            r13.<init>(r12)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r16 = 0
            r17 = 0
            r18 = 0
            android.content.res.ColorStateList r14 = r1.E
            r19 = 0
            r20 = r14
            r14 = r15
            r8 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r20
            r14.<init>(r15, r16, r17, r18, r19)
            int r12 = r12.length()
            r14 = 33
            r13.setSpan(r8, r4, r12, r14)
            goto L_0x0091
        L_0x008b:
            int r8 = r1.G
            java.lang.String r13 = i(r2, r8)
        L_0x0091:
            boolean r8 = android.text.TextUtils.isEmpty(r13)
            if (r8 == 0) goto L_0x00a0
            if (r7 == 0) goto L_0x00a8
            r7.setSingleLine(r4)
            r7.setMaxLines(r10)
            goto L_0x00a8
        L_0x00a0:
            if (r7 == 0) goto L_0x00a8
            r7.setSingleLine(r9)
            r7.setMaxLines(r9)
        L_0x00a8:
            r0.setText(r13)
            boolean r8 = android.text.TextUtils.isEmpty(r13)
            if (r8 == 0) goto L_0x00b4
            r8 = 8
            goto L_0x00b5
        L_0x00b4:
            r8 = r4
        L_0x00b5:
            r0.setVisibility(r8)
        L_0x00b8:
            android.widget.ImageView r12 = r3.f733c
            if (r12 == 0) goto L_0x0162
            int r0 = r1.I
            if (r0 != r5) goto L_0x00c3
            r0 = 0
            goto L_0x014f
        L_0x00c3:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.g(r0)
            if (r0 == 0) goto L_0x00cf
            goto L_0x014f
        L_0x00cf:
            android.app.SearchableInfo r0 = r1.z
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r13 = r0.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r14 = r1.B
            boolean r15 = r14.containsKey(r13)
            if (r15 == 0) goto L_0x00f4
            java.lang.Object r0 = r14.get(r13)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L_0x00eb
            r0 = 0
            goto L_0x0144
        L_0x00eb:
            android.content.res.Resources r13 = r11.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r13)
            goto L_0x0144
        L_0x00f4:
            android.content.pm.PackageManager r15 = r11.getPackageManager()
            r8 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r8 = r15.getActivityInfo(r0, r8)     // Catch:{ NameNotFoundException -> 0x012c }
            int r10 = r8.getIconResource()
            if (r10 != 0) goto L_0x0105
            goto L_0x0137
        L_0x0105:
            java.lang.String r5 = r0.getPackageName()
            android.content.pm.ApplicationInfo r8 = r8.applicationInfo
            android.graphics.drawable.Drawable r5 = r15.getDrawable(r5, r10, r8)
            if (r5 != 0) goto L_0x0138
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "Invalid icon resource "
            r5.<init>(r8)
            r5.append(r10)
            java.lang.String r8 = " for "
            r5.append(r8)
            java.lang.String r0 = r0.flattenToShortString()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            goto L_0x0132
        L_0x012c:
            r0 = move-exception
            r5 = r0
            java.lang.String r0 = r5.toString()
        L_0x0132:
            java.lang.String r5 = "SuggestionsAdapter"
            android.util.Log.w(r5, r0)
        L_0x0137:
            r5 = 0
        L_0x0138:
            if (r5 != 0) goto L_0x013c
            r0 = 0
            goto L_0x0140
        L_0x013c:
            android.graphics.drawable.Drawable$ConstantState r0 = r5.getConstantState()
        L_0x0140:
            r14.put(r13, r0)
            r0 = r5
        L_0x0144:
            if (r0 == 0) goto L_0x0147
            goto L_0x014f
        L_0x0147:
            android.content.pm.PackageManager r0 = r11.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L_0x014f:
            r12.setImageDrawable(r0)
            if (r0 != 0) goto L_0x0159
            r0 = 4
            r12.setVisibility(r0)
            goto L_0x0162
        L_0x0159:
            r12.setVisibility(r4)
            r0.setVisible(r4, r4)
            r0.setVisible(r9, r4)
        L_0x0162:
            android.widget.ImageView r0 = r3.d
            if (r0 == 0) goto L_0x0189
            int r5 = r1.J
            r8 = -1
            if (r5 != r8) goto L_0x016d
            r8 = 0
            goto L_0x0175
        L_0x016d:
            java.lang.String r2 = r2.getString(r5)
            android.graphics.drawable.Drawable r8 = r1.g(r2)
        L_0x0175:
            r0.setImageDrawable(r8)
            if (r8 != 0) goto L_0x0180
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x0189
        L_0x0180:
            r0.setVisibility(r4)
            r8.setVisible(r4, r4)
            r8.setVisible(r9, r4)
        L_0x0189:
            int r0 = r1.D
            android.widget.ImageView r2 = r3.f734e
            r3 = 2
            if (r0 == r3) goto L_0x019d
            if (r0 != r9) goto L_0x0197
            r0 = r6 & 1
            if (r0 == 0) goto L_0x0197
            goto L_0x019d
        L_0x0197:
            r3 = 8
            r2.setVisibility(r3)
            goto L_0x01aa
        L_0x019d:
            r2.setVisibility(r4)
            java.lang.CharSequence r0 = r7.getText()
            r2.setTag(r0)
            r2.setOnClickListener(r1)
        L_0x01aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y0.b(android.view.View, android.database.Cursor):void");
    }

    public final void c(Cursor cursor) {
        try {
            super.c(cursor);
            if (cursor != null) {
                this.F = cursor.getColumnIndex("suggest_text_1");
                this.G = cursor.getColumnIndex("suggest_text_2");
                this.H = cursor.getColumnIndex("suggest_text_2_url");
                this.I = cursor.getColumnIndex("suggest_icon_1");
                this.J = cursor.getColumnIndex("suggest_icon_2");
                this.K = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    public final String d(Cursor cursor) {
        String i10;
        String i11;
        if (cursor == null) {
            return null;
        }
        String i12 = i(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (i12 != null) {
            return i12;
        }
        SearchableInfo searchableInfo = this.z;
        if (searchableInfo.shouldRewriteQueryFromData() && (i11 = i(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return i11;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (i10 = i(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return i10;
    }

    public final View e(ViewGroup viewGroup) {
        View inflate = this.f7027x.inflate(this.f7026v, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.C);
        return inflate;
    }

    public final Drawable f(Uri uri) {
        int i10;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.A.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i10 = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException(x0.d("Single path segment is not a resource ID: ", uri));
                        }
                    } else if (size == 2) {
                        i10 = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException(x0.d("More than two path segments: ", uri));
                    }
                    if (i10 != 0) {
                        return resourcesForApplication.getDrawable(i10);
                    }
                    throw new FileNotFoundException(x0.d("No resource found for: ", uri));
                }
                throw new FileNotFoundException(x0.d("No path: ", uri));
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException(x0.d("No package found for authority: ", uri));
            }
        } else {
            throw new FileNotFoundException(x0.d("No authority: ", uri));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a1, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r3);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0090 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable g(java.lang.String r11) {
        /*
            r10 = this;
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r10.B
            java.lang.String r1 = "SuggestionsAdapter"
            android.content.Context r2 = r10.A
            java.lang.String r3 = "android.resource://"
            r4 = 0
            if (r11 == 0) goto L_0x0115
            boolean r5 = r11.isEmpty()
            if (r5 != 0) goto L_0x0115
            java.lang.String r5 = "0"
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L_0x001b
            goto L_0x0115
        L_0x001b:
            int r5 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            r6.<init>(r3)     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            java.lang.String r3 = r2.getPackageName()     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            r6.append(r3)     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            java.lang.String r3 = "/"
            r6.append(r3)     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            r6.append(r5)     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            java.lang.String r3 = r6.toString()     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            java.lang.Object r6 = r0.get(r3)     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            android.graphics.drawable.Drawable$ConstantState r6 = (android.graphics.drawable.Drawable.ConstantState) r6     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            if (r6 != 0) goto L_0x0041
            r6 = r4
            goto L_0x0045
        L_0x0041:
            android.graphics.drawable.Drawable r6 = r6.newDrawable()     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
        L_0x0045:
            if (r6 == 0) goto L_0x0048
            return r6
        L_0x0048:
            java.lang.Object r6 = y.a.f9523a     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            android.graphics.drawable.Drawable r5 = y.a.c.b(r2, r5)     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            if (r5 == 0) goto L_0x0057
            android.graphics.drawable.Drawable$ConstantState r6 = r5.getConstantState()     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            r0.put(r3, r6)     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
        L_0x0057:
            return r5
        L_0x0058:
            java.lang.String r0 = "Icon resource not found: "
            java.lang.String r11 = r0.concat(r11)
            android.util.Log.w(r1, r11)
            return r4
        L_0x0062:
            java.lang.Object r3 = r0.get(r11)
            android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3
            if (r3 != 0) goto L_0x006c
            r3 = r4
            goto L_0x0070
        L_0x006c:
            android.graphics.drawable.Drawable r3 = r3.newDrawable()
        L_0x0070:
            if (r3 == 0) goto L_0x0073
            return r3
        L_0x0073:
            android.net.Uri r3 = android.net.Uri.parse(r11)
            java.lang.String r5 = "Error closing icon stream for "
            java.lang.String r6 = "Failed to open "
            java.lang.String r7 = "Resource does not exist: "
            java.lang.String r8 = r3.getScheme()     // Catch:{ FileNotFoundException -> 0x00ee }
            java.lang.String r9 = "android.resource"
            boolean r8 = r9.equals(r8)     // Catch:{ FileNotFoundException -> 0x00ee }
            if (r8 == 0) goto L_0x00a2
            android.graphics.drawable.Drawable r1 = r10.f(r3)     // Catch:{ NotFoundException -> 0x0090 }
            r4 = r1
            goto L_0x010c
        L_0x0090:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x00ee }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00ee }
            r5.<init>(r7)     // Catch:{ FileNotFoundException -> 0x00ee }
            r5.append(r3)     // Catch:{ FileNotFoundException -> 0x00ee }
            java.lang.String r5 = r5.toString()     // Catch:{ FileNotFoundException -> 0x00ee }
            r2.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00ee }
            throw r2     // Catch:{ FileNotFoundException -> 0x00ee }
        L_0x00a2:
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ FileNotFoundException -> 0x00ee }
            java.io.InputStream r2 = r2.openInputStream(r3)     // Catch:{ FileNotFoundException -> 0x00ee }
            if (r2 == 0) goto L_0x00dc
            android.graphics.drawable.Drawable r6 = android.graphics.drawable.Drawable.createFromStream(r2, r4)     // Catch:{ all -> 0x00c6 }
            r2.close()     // Catch:{ IOException -> 0x00b4 }
            goto L_0x00c4
        L_0x00b4:
            r2 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00ee }
            r7.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00ee }
            r7.append(r3)     // Catch:{ FileNotFoundException -> 0x00ee }
            java.lang.String r5 = r7.toString()     // Catch:{ FileNotFoundException -> 0x00ee }
            android.util.Log.e(r1, r5, r2)     // Catch:{ FileNotFoundException -> 0x00ee }
        L_0x00c4:
            r4 = r6
            goto L_0x010c
        L_0x00c6:
            r6 = move-exception
            r2.close()     // Catch:{ IOException -> 0x00cb }
            goto L_0x00db
        L_0x00cb:
            r2 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00ee }
            r7.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00ee }
            r7.append(r3)     // Catch:{ FileNotFoundException -> 0x00ee }
            java.lang.String r5 = r7.toString()     // Catch:{ FileNotFoundException -> 0x00ee }
            android.util.Log.e(r1, r5, r2)     // Catch:{ FileNotFoundException -> 0x00ee }
        L_0x00db:
            throw r6     // Catch:{ FileNotFoundException -> 0x00ee }
        L_0x00dc:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x00ee }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00ee }
            r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x00ee }
            r5.append(r3)     // Catch:{ FileNotFoundException -> 0x00ee }
            java.lang.String r5 = r5.toString()     // Catch:{ FileNotFoundException -> 0x00ee }
            r2.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00ee }
            throw r2     // Catch:{ FileNotFoundException -> 0x00ee }
        L_0x00ee:
            r2 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Icon not found: "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = ", "
            r5.append(r3)
            java.lang.String r2 = r2.getMessage()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            android.util.Log.w(r1, r2)
        L_0x010c:
            if (r4 == 0) goto L_0x0115
            android.graphics.drawable.Drawable$ConstantState r1 = r4.getConstantState()
            r0.put(r11, r1)
        L_0x0115:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y0.g(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View inflate = this.f7027x.inflate(this.w, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).f731a.setText(e10.toString());
            }
            return inflate;
        }
    }

    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View e11 = e(viewGroup);
            ((a) e11.getTag()).f731a.setText(e10.toString());
            return e11;
        }
    }

    public final Cursor h(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(BuildConfig.FLAVOR).fragment(BuildConfig.FLAVOR);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        Uri build = fragment.build();
        return this.A.getContentResolver().query(build, (String[]) null, suggestSelection, strArr, (String) null);
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f7019q;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f7019q;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f730y.p((CharSequence) tag);
        }
    }
}
