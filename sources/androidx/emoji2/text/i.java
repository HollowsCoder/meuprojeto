package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.emoji2.text.e;
import androidx.emoji2.text.m;
import b0.c;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final e.i f1064a;

    /* renamed from: b  reason: collision with root package name */
    public final m f1065b;

    /* renamed from: c  reason: collision with root package name */
    public final e.d f1066c;

    public static class a implements e.d {

        /* renamed from: b  reason: collision with root package name */
        public static final ThreadLocal<StringBuilder> f1067b = new ThreadLocal<>();

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f1068a;

        public a() {
            TextPaint textPaint = new TextPaint();
            this.f1068a = textPaint;
            textPaint.setTextSize(10.0f);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1069a = 1;

        /* renamed from: b  reason: collision with root package name */
        public final m.a f1070b;

        /* renamed from: c  reason: collision with root package name */
        public m.a f1071c;
        public m.a d;

        /* renamed from: e  reason: collision with root package name */
        public int f1072e;

        /* renamed from: f  reason: collision with root package name */
        public int f1073f;

        public b(m.a aVar) {
            this.f1070b = aVar;
            this.f1071c = aVar;
        }

        public final int a(int i10) {
            m.a aVar;
            boolean z;
            SparseArray<m.a> sparseArray = this.f1071c.f1088a;
            if (sparseArray == null) {
                aVar = null;
            } else {
                aVar = sparseArray.get(i10);
            }
            int i11 = 1;
            if (this.f1069a != 2) {
                if (aVar != null) {
                    this.f1069a = 2;
                    this.f1071c = aVar;
                    this.f1073f = 1;
                }
                b();
                this.f1072e = i10;
                return i11;
            } else if (aVar != null) {
                this.f1071c = aVar;
                this.f1073f++;
            } else {
                boolean z10 = false;
                if (i10 == 65038) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (i10 == 65039) {
                        z10 = true;
                    }
                    if (!z10) {
                        m.a aVar2 = this.f1071c;
                        if (aVar2.f1089b != null) {
                            if (this.f1073f == 1) {
                                if (c()) {
                                    aVar2 = this.f1071c;
                                }
                            }
                            this.d = aVar2;
                            b();
                            i11 = 3;
                            this.f1072e = i10;
                            return i11;
                        }
                    }
                }
                b();
                this.f1072e = i10;
                return i11;
            }
            i11 = 2;
            this.f1072e = i10;
            return i11;
        }

        public final void b() {
            this.f1069a = 1;
            this.f1071c = this.f1070b;
            this.f1073f = 0;
        }

        public final boolean c() {
            boolean z;
            boolean z10;
            q0.a c10 = this.f1071c.f1089b.c();
            int a10 = c10.a(6);
            if (a10 == 0 || c10.f8207b.get(a10 + c10.f8206a) == 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
            if (this.f1072e == 65039) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
            return false;
        }
    }

    public i(m mVar, e.i iVar, a aVar) {
        this.f1064a = iVar;
        this.f1065b = mVar;
        this.f1066c = aVar;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        boolean z10;
        j[] jVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && (jVarArr = (j[]) editable.getSpans(selectionStart, selectionEnd, j.class)) != null && jVarArr.length > 0) {
            int length = jVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                j jVar = jVarArr[i10];
                int spanStart = editable.getSpanStart(jVar);
                int spanEnd = editable.getSpanEnd(jVar);
                if ((!z || spanStart != selectionStart) && ((z || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i10++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i10, int i11, h hVar) {
        int i12;
        if (hVar.f1063c == 0) {
            e.d dVar = this.f1066c;
            q0.a c10 = hVar.c();
            int a10 = c10.a(8);
            if (a10 != 0) {
                c10.f8207b.getShort(a10 + c10.f8206a);
            }
            a aVar = (a) dVar;
            aVar.getClass();
            ThreadLocal<StringBuilder> threadLocal = a.f1067b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = threadLocal.get();
            sb.setLength(0);
            while (i10 < i11) {
                sb.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = aVar.f1068a;
            String sb2 = sb.toString();
            int i13 = c.f1934a;
            if (textPaint.hasGlyph(sb2)) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            hVar.f1063c = i12;
        }
        if (hVar.f1063c == 2) {
            return true;
        }
        return false;
    }
}
