package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.karumi.dexter.R;
import e.l;
import java.lang.ref.WeakReference;

public final class AlertController {
    public TextView A;
    public TextView B;
    public View C;
    public ListAdapter D;
    public int E = -1;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public final c K;
    public final a L = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Context f214a;

    /* renamed from: b  reason: collision with root package name */
    public final l f215b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f216c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f217e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f218f;

    /* renamed from: g  reason: collision with root package name */
    public RecycleListView f219g;

    /* renamed from: h  reason: collision with root package name */
    public View f220h;

    /* renamed from: i  reason: collision with root package name */
    public int f221i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f222j = false;

    /* renamed from: k  reason: collision with root package name */
    public Button f223k;
    public CharSequence l;

    /* renamed from: m  reason: collision with root package name */
    public Message f224m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f225n;

    /* renamed from: o  reason: collision with root package name */
    public Button f226o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f227p;

    /* renamed from: q  reason: collision with root package name */
    public Message f228q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f229r;

    /* renamed from: s  reason: collision with root package name */
    public Button f230s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f231t;
    public Message u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f232v;
    public NestedScrollView w;

    /* renamed from: x  reason: collision with root package name */
    public int f233x = 0;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f234y;
    public ImageView z;

    public static class RecycleListView extends ListView {

        /* renamed from: o  reason: collision with root package name */
        public final int f235o;

        /* renamed from: p  reason: collision with root package name */
        public final int f236p;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.databinding.a.S);
            this.f236p = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f235o = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            r3 = r0.u;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f223k
                if (r3 != r1) goto L_0x000b
                android.os.Message r1 = r0.f224m
                if (r1 == 0) goto L_0x000b
                goto L_0x0013
            L_0x000b:
                android.widget.Button r1 = r0.f226o
                if (r3 != r1) goto L_0x0018
                android.os.Message r1 = r0.f228q
                if (r1 == 0) goto L_0x0018
            L_0x0013:
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x0026
            L_0x0018:
                android.widget.Button r1 = r0.f230s
                if (r3 != r1) goto L_0x0025
                android.os.Message r3 = r0.u
                if (r3 == 0) goto L_0x0025
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x0026
            L_0x0025:
                r3 = 0
            L_0x0026:
                if (r3 == 0) goto L_0x002b
                r3.sendToTarget()
            L_0x002b:
                r3 = 1
                e.l r1 = r0.f215b
                androidx.appcompat.app.AlertController$c r0 = r0.K
                android.os.Message r3 = r0.obtainMessage(r3, r1)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.a.onClick(android.view.View):void");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f238a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f239b;

        /* renamed from: c  reason: collision with root package name */
        public Drawable f240c;
        public CharSequence d;

        /* renamed from: e  reason: collision with root package name */
        public View f241e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f242f;

        /* renamed from: g  reason: collision with root package name */
        public CharSequence f243g;

        /* renamed from: h  reason: collision with root package name */
        public DialogInterface.OnClickListener f244h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f245i;

        /* renamed from: j  reason: collision with root package name */
        public DialogInterface.OnClickListener f246j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f247k;
        public DialogInterface.OnKeyListener l;

        /* renamed from: m  reason: collision with root package name */
        public ListAdapter f248m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnClickListener f249n;

        /* renamed from: o  reason: collision with root package name */
        public int f250o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f251p;

        /* renamed from: q  reason: collision with root package name */
        public int f252q = -1;

        public b(ContextThemeWrapper contextThemeWrapper) {
            this.f238a = contextThemeWrapper;
            this.f247k = true;
            this.f239b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    public static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<DialogInterface> f253a;

        public c(DialogInterface dialogInterface) {
            this.f253a = new WeakReference<>(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f253a.get(), message.what);
            } else if (i10 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i10) {
            super(context, i10, 16908308, (Object[]) null);
        }

        public final long getItemId(int i10) {
            return (long) i10;
        }

        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, l lVar, Window window) {
        this.f214a = context;
        this.f215b = lVar;
        this.f216c = window;
        this.K = new c(lVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, androidx.databinding.a.D, R.attr.alertDialogStyle, 0);
        this.F = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.G = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.H = obtainStyledAttributes.getResourceId(7, 0);
        this.I = obtainStyledAttributes.getResourceId(3, 0);
        this.J = obtainStyledAttributes.getBoolean(6, true);
        this.d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        lVar.a().q(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.K.obtainMessage(i10, onClickListener) : null;
        if (i10 == -3) {
            this.f231t = charSequence;
            this.u = obtainMessage;
            this.f232v = null;
        } else if (i10 == -2) {
            this.f227p = charSequence;
            this.f228q = obtainMessage;
            this.f229r = null;
        } else if (i10 == -1) {
            this.l = charSequence;
            this.f224m = obtainMessage;
            this.f225n = null;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }
}
