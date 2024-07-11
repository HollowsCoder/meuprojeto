package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.karumi.dexter.R;
import i0.e;
import i0.q;
import i0.w;
import l0.g;
import l0.h;

public class l extends EditText implements q {

    /* renamed from: o  reason: collision with root package name */
    public final e f634o;

    /* renamed from: p  reason: collision with root package name */
    public final d0 f635p;

    /* renamed from: q  reason: collision with root package name */
    public final m f636q;

    /* renamed from: r  reason: collision with root package name */
    public final h f637r;

    /* renamed from: s  reason: collision with root package name */
    public final m f638s;

    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.editTextStyle);
        b1.a(context);
        z0.a(this, getContext());
        e eVar = new e(this);
        this.f634o = eVar;
        eVar.d(attributeSet, R.attr.editTextStyle);
        d0 d0Var = new d0(this);
        this.f635p = d0Var;
        d0Var.d(attributeSet, R.attr.editTextStyle);
        d0Var.b();
        this.f636q = new m((TextView) this);
        this.f637r = new h();
        m mVar = new m((EditText) this);
        this.f638s = mVar;
        mVar.j(attributeSet, R.attr.editTextStyle);
        mVar.i();
    }

    public final e a(e eVar) {
        return this.f637r.a(this, eVar);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f634o;
        if (eVar != null) {
            eVar.a();
        }
        d0 d0Var = this.f635p;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f634o;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f634o;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f636q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.m r0 = r2.f636q
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.f()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.l.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r1 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r1 != null) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            androidx.appcompat.widget.d0 r1 = r7.f635p
            r1.getClass()
            androidx.appcompat.widget.d0.f(r7, r0, r8)
            s6.a.B(r7, r8, r0)
            if (r0 == 0) goto L_0x0076
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L_0x0076
            java.lang.String[] r2 = i0.w.e(r7)
            if (r2 == 0) goto L_0x0076
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L_0x0029
            r8.contentMimeTypes = r2
            goto L_0x003e
        L_0x0029:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L_0x0034
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L_0x0034:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L_0x003e:
            k0.f r2 = new k0.f
            r2.<init>(r7)
            if (r1 < r5) goto L_0x004c
            k0.d r1 = new k0.d
            r1.<init>(r0, r2)
        L_0x004a:
            r0 = r1
            goto L_0x0076
        L_0x004c:
            java.lang.String[] r6 = k0.c.f6622a
            if (r1 < r5) goto L_0x0058
            java.lang.String[] r1 = r8.contentMimeTypes
            if (r1 == 0) goto L_0x006c
        L_0x0056:
            r6 = r1
            goto L_0x006c
        L_0x0058:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L_0x005d
            goto L_0x006c
        L_0x005d:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L_0x0069
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L_0x0069:
            if (r1 == 0) goto L_0x006c
            goto L_0x0056
        L_0x006c:
            int r1 = r6.length
            if (r1 != 0) goto L_0x0070
            goto L_0x0076
        L_0x0070:
            k0.e r1 = new k0.e
            r1.<init>(r0, r2)
            goto L_0x004a
        L_0x0076:
            androidx.appcompat.widget.m r1 = r7.f638s
            android.view.inputmethod.InputConnection r8 = r1.k(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.l.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && w.e(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = v.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public final boolean onTextContextMenuItem(int i10) {
        ClipData clipData;
        e.b bVar;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 0;
        if (i11 < 31 && w.e(this) != null && (i10 == 16908322 || i10 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                clipData = null;
            } else {
                clipData = clipboardManager.getPrimaryClip();
            }
            if (clipData != null && clipData.getItemCount() > 0) {
                if (i11 >= 31) {
                    bVar = new e.a(clipData, 1);
                } else {
                    bVar = new e.c(clipData, 1);
                }
                if (i10 != 16908322) {
                    i12 = 1;
                }
                bVar.b(i12);
                w.g(this, bVar.build());
            }
            i12 = 1;
        }
        if (i12 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f634o;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f634o;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f638s.m(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f638s.e(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f634o;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f634o;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        d0 d0Var = this.f635p;
        if (d0Var != null) {
            d0Var.e(context, i10);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        m mVar;
        if (Build.VERSION.SDK_INT >= 28 || (mVar = this.f636q) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            mVar.f653q = textClassifier;
        }
    }
}
