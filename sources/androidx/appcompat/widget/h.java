package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import l0.g;
import s6.a;

public final class h extends CheckedTextView {

    /* renamed from: o  reason: collision with root package name */
    public final i f575o = new i(this);

    /* renamed from: p  reason: collision with root package name */
    public final e f576p;

    /* renamed from: q  reason: collision with root package name */
    public final d0 f577q;

    /* renamed from: r  reason: collision with root package name */
    public n f578r;

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0063 A[SYNTHETIC, Splitter:B:11:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0081 A[Catch:{ all -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008f A[Catch:{ all -> 0x00a7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            androidx.appcompat.widget.b1.a(r8)
            r0 = 2130968742(0x7f0400a6, float:1.7546146E38)
            r7.<init>(r8, r9, r0)
            android.content.Context r8 = r7.getContext()
            androidx.appcompat.widget.z0.a(r7, r8)
            androidx.appcompat.widget.d0 r8 = new androidx.appcompat.widget.d0
            r8.<init>(r7)
            r7.f577q = r8
            r8.d(r9, r0)
            r8.b()
            androidx.appcompat.widget.e r8 = new androidx.appcompat.widget.e
            r8.<init>(r7)
            r7.f576p = r8
            r8.d(r9, r0)
            androidx.appcompat.widget.i r8 = new androidx.appcompat.widget.i
            r8.<init>(r7)
            r7.f575o = r8
            android.content.Context r8 = r7.getContext()
            int[] r3 = androidx.databinding.a.K
            androidx.appcompat.widget.e1 r8 = androidx.appcompat.widget.e1.m(r8, r9, r3, r0)
            android.content.Context r2 = r7.getContext()
            android.content.res.TypedArray r5 = r8.f551b
            r6 = 2130968742(0x7f0400a6, float:1.7546146E38)
            r1 = r7
            r4 = r9
            i0.w.j(r1, r2, r3, r4, r5, r6)
            r1 = 1
            boolean r2 = r8.l(r1)     // Catch:{ all -> 0x00a7 }
            r3 = 0
            if (r2 == 0) goto L_0x0060
            int r2 = r8.i(r1, r3)     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x0060
            android.content.Context r4 = r7.getContext()     // Catch:{ NotFoundException -> 0x0060 }
            android.graphics.drawable.Drawable r2 = f.a.b(r4, r2)     // Catch:{ NotFoundException -> 0x0060 }
            r7.setCheckMarkDrawable((android.graphics.drawable.Drawable) r2)     // Catch:{ NotFoundException -> 0x0060 }
            goto L_0x0061
        L_0x0060:
            r1 = r3
        L_0x0061:
            if (r1 != 0) goto L_0x007a
            boolean r1 = r8.l(r3)     // Catch:{ all -> 0x00a7 }
            if (r1 == 0) goto L_0x007a
            int r1 = r8.i(r3, r3)     // Catch:{ all -> 0x00a7 }
            if (r1 == 0) goto L_0x007a
            android.content.Context r2 = r7.getContext()     // Catch:{ all -> 0x00a7 }
            android.graphics.drawable.Drawable r1 = f.a.b(r2, r1)     // Catch:{ all -> 0x00a7 }
            r7.setCheckMarkDrawable((android.graphics.drawable.Drawable) r1)     // Catch:{ all -> 0x00a7 }
        L_0x007a:
            r1 = 2
            boolean r2 = r8.l(r1)     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x0088
            android.content.res.ColorStateList r1 = r8.b(r1)     // Catch:{ all -> 0x00a7 }
            r7.setCheckMarkTintList(r1)     // Catch:{ all -> 0x00a7 }
        L_0x0088:
            r1 = 3
            boolean r2 = r8.l(r1)     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x009c
            r2 = -1
            int r1 = r8.h(r1, r2)     // Catch:{ all -> 0x00a7 }
            r2 = 0
            android.graphics.PorterDuff$Mode r1 = androidx.appcompat.widget.k0.c(r1, r2)     // Catch:{ all -> 0x00a7 }
            r7.setCheckMarkTintMode(r1)     // Catch:{ all -> 0x00a7 }
        L_0x009c:
            r8.n()
            androidx.appcompat.widget.n r8 = r7.getEmojiTextViewHelper()
            r8.a(r9, r0)
            return
        L_0x00a7:
            r9 = move-exception
            r8.n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private n getEmojiTextViewHelper() {
        if (this.f578r == null) {
            this.f578r = new n(this);
        }
        return this.f578r;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d0 d0Var = this.f577q;
        if (d0Var != null) {
            d0Var.b();
        }
        e eVar = this.f576p;
        if (eVar != null) {
            eVar.a();
        }
        i iVar = this.f575o;
        if (iVar != null) {
            iVar.a();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f576p;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f576p;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        i iVar = this.f575o;
        if (iVar != null) {
            return iVar.f598b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        i iVar = this.f575o;
        if (iVar != null) {
            return iVar.f599c;
        }
        return null;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.B(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f576p;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f576p;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(f.a.b(getContext(), i10));
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        i iVar = this.f575o;
        if (iVar == null) {
            return;
        }
        if (iVar.f601f) {
            iVar.f601f = false;
            return;
        }
        iVar.f601f = true;
        iVar.a();
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f576p;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f576p;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        i iVar = this.f575o;
        if (iVar != null) {
            iVar.f598b = colorStateList;
            iVar.d = true;
            iVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        i iVar = this.f575o;
        if (iVar != null) {
            iVar.f599c = mode;
            iVar.f600e = true;
            iVar.a();
        }
    }

    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        d0 d0Var = this.f577q;
        if (d0Var != null) {
            d0Var.e(context, i10);
        }
    }
}
