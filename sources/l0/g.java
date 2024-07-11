package l0;

import android.graphics.Paint;
import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Method;

public final class g {

    public static class a implements ActionMode.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f6858a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f6859b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f6860c;
        public Method d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f6861e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f6862f = false;

        public a(ActionMode.Callback callback, TextView textView) {
            this.f6858a = callback;
            this.f6859b = textView;
        }

        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f6858a.onActionItemClicked(actionMode, menuItem);
        }

        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f6858a.onCreateActionMode(actionMode, menu);
        }

        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f6858a.onDestroyActionMode(actionMode);
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x009f A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onPrepareActionMode(android.view.ActionMode r14, android.view.Menu r15) {
            /*
                r13 = this;
                android.widget.TextView r0 = r13.f6859b
                android.content.Context r1 = r0.getContext()
                android.content.pm.PackageManager r2 = r1.getPackageManager()
                boolean r3 = r13.f6862f
                r4 = 1
                java.lang.String r5 = "removeItemAt"
                r6 = 0
                if (r3 != 0) goto L_0x0032
                r13.f6862f = r4
                java.lang.String r3 = "com.android.internal.view.menu.MenuBuilder"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r13.f6860c = r3     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r7[r6] = r8     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r13.d = r3     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r13.f6861e = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                goto L_0x0032
            L_0x002b:
                r3 = 0
                r13.f6860c = r3
                r13.d = r3
                r13.f6861e = r6
            L_0x0032:
                boolean r3 = r13.f6861e     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                if (r3 == 0) goto L_0x0041
                java.lang.Class<?> r3 = r13.f6860c     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                boolean r3 = r3.isInstance(r15)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                if (r3 == 0) goto L_0x0041
                java.lang.reflect.Method r3 = r13.d     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                goto L_0x004f
            L_0x0041:
                java.lang.Class r3 = r15.getClass()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                r7[r6] = r8     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r7)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
            L_0x004f:
                int r5 = r15.size()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                int r5 = r5 - r4
            L_0x0054:
                java.lang.String r7 = "android.intent.action.PROCESS_TEXT"
                if (r5 < 0) goto L_0x007e
                android.view.MenuItem r8 = r15.getItem(r5)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                android.content.Intent r9 = r8.getIntent()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                if (r9 == 0) goto L_0x007b
                android.content.Intent r8 = r8.getIntent()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                java.lang.String r8 = r8.getAction()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                boolean r7 = r7.equals(r8)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                if (r7 == 0) goto L_0x007b
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                r7[r6] = r8     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                r3.invoke(r15, r7)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
            L_0x007b:
                int r5 = r5 + -1
                goto L_0x0054
            L_0x007e:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                boolean r5 = r1 instanceof android.app.Activity
                java.lang.String r8 = "text/plain"
                if (r5 != 0) goto L_0x008a
                goto L_0x00d5
            L_0x008a:
                android.content.Intent r5 = new android.content.Intent
                r5.<init>()
                android.content.Intent r5 = r5.setAction(r7)
                android.content.Intent r5 = r5.setType(r8)
                java.util.List r5 = r2.queryIntentActivities(r5, r6)
                java.util.Iterator r5 = r5.iterator()
            L_0x009f:
                boolean r9 = r5.hasNext()
                if (r9 == 0) goto L_0x00d5
                java.lang.Object r9 = r5.next()
                android.content.pm.ResolveInfo r9 = (android.content.pm.ResolveInfo) r9
                java.lang.String r10 = r1.getPackageName()
                android.content.pm.ActivityInfo r11 = r9.activityInfo
                java.lang.String r11 = r11.packageName
                boolean r10 = r10.equals(r11)
                if (r10 == 0) goto L_0x00ba
                goto L_0x00ce
            L_0x00ba:
                android.content.pm.ActivityInfo r10 = r9.activityInfo
                boolean r11 = r10.exported
                if (r11 != 0) goto L_0x00c1
                goto L_0x00cc
            L_0x00c1:
                java.lang.String r10 = r10.permission
                if (r10 == 0) goto L_0x00ce
                int r10 = r1.checkSelfPermission(r10)
                if (r10 != 0) goto L_0x00cc
                goto L_0x00ce
            L_0x00cc:
                r10 = r6
                goto L_0x00cf
            L_0x00ce:
                r10 = r4
            L_0x00cf:
                if (r10 == 0) goto L_0x009f
                r3.add(r9)
                goto L_0x009f
            L_0x00d5:
                r1 = r6
            L_0x00d6:
                int r5 = r3.size()
                if (r1 >= r5) goto L_0x0127
                java.lang.Object r5 = r3.get(r1)
                android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
                int r9 = r1 + 100
                java.lang.CharSequence r10 = r5.loadLabel(r2)
                android.view.MenuItem r9 = r15.add(r6, r6, r9, r10)
                android.content.Intent r10 = new android.content.Intent
                r10.<init>()
                android.content.Intent r10 = r10.setAction(r7)
                android.content.Intent r10 = r10.setType(r8)
                boolean r11 = r0 instanceof android.text.Editable
                if (r11 == 0) goto L_0x010b
                boolean r11 = r0.onCheckIsTextEditor()
                if (r11 == 0) goto L_0x010b
                boolean r11 = r0.isEnabled()
                if (r11 == 0) goto L_0x010b
                r11 = r4
                goto L_0x010c
            L_0x010b:
                r11 = r6
            L_0x010c:
                r11 = r11 ^ r4
                java.lang.String r12 = "android.intent.extra.PROCESS_TEXT_READONLY"
                android.content.Intent r10 = r10.putExtra(r12, r11)
                android.content.pm.ActivityInfo r5 = r5.activityInfo
                java.lang.String r11 = r5.packageName
                java.lang.String r5 = r5.name
                android.content.Intent r5 = r10.setClassName(r11, r5)
                android.view.MenuItem r5 = r9.setIntent(r5)
                r5.setShowAsAction(r4)
                int r1 = r1 + 1
                goto L_0x00d6
            L_0x0127:
                android.view.ActionMode$Callback r0 = r13.f6858a
                boolean r14 = r0.onPrepareActionMode(r14, r15)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: l0.g.a.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r7 != 2) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        if (r5 != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g0.b.a a(android.widget.TextView r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0010
            g0.b$a r0 = new g0.b$a
            android.text.PrecomputedText$Params r7 = r7.getTextMetricsParams()
            r0.<init>(r7)
            return r0
        L_0x0010:
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r7.getPaint()
            r2.<init>(r3)
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            int r3 = r7.getBreakStrategy()
            int r4 = r7.getHyphenationFrequency()
            android.text.method.TransformationMethod r5 = r7.getTransformationMethod()
            boolean r5 = r5 instanceof android.text.method.PasswordTransformationMethod
            if (r5 == 0) goto L_0x002e
        L_0x002b:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LTR
            goto L_0x0076
        L_0x002e:
            r5 = 1
            r6 = 0
            if (r0 < r1) goto L_0x0057
            int r0 = r7.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L_0x0057
            java.util.Locale r7 = r7.getTextLocale()
            android.icu.text.DecimalFormatSymbols r7 = android.icu.text.DecimalFormatSymbols.getInstance(r7)
            java.lang.String[] r7 = r7.getDigitStrings()
            r7 = r7[r6]
            int r7 = r7.codePointAt(r6)
            byte r7 = java.lang.Character.getDirectionality(r7)
            if (r7 == r5) goto L_0x006e
            r0 = 2
            if (r7 != r0) goto L_0x002b
            goto L_0x006e
        L_0x0057:
            int r0 = r7.getLayoutDirection()
            if (r0 != r5) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r5 = r6
        L_0x005f:
            int r7 = r7.getTextDirection()
            switch(r7) {
                case 2: goto L_0x0071;
                case 3: goto L_0x002b;
                case 4: goto L_0x006e;
                case 5: goto L_0x006b;
                case 6: goto L_0x0074;
                case 7: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            if (r5 == 0) goto L_0x0074
        L_0x0068:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L_0x0076
        L_0x006b:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LOCALE
            goto L_0x0076
        L_0x006e:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.RTL
            goto L_0x0076
        L_0x0071:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            goto L_0x0076
        L_0x0074:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
        L_0x0076:
            g0.b$a r0 = new g0.b$a
            r0.<init>(r2, r7, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.g.a(android.widget.TextView):g0.b$a");
    }

    public static void b(TextView textView, int i10) {
        s6.a.m(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void c(TextView textView, int i10) {
        s6.a.m(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static ActionMode.Callback d(ActionMode.Callback callback) {
        if (!(callback instanceof a) || Build.VERSION.SDK_INT < 26) {
            return callback;
        }
        return ((a) callback).f6858a;
    }

    public static ActionMode.Callback e(ActionMode.Callback callback, TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof a) || callback == null) ? callback : new a(callback, textView);
    }
}
