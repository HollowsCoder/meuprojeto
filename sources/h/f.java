package h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.e1;
import androidx.appcompat.widget.k0;
import i.c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

public final class f extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class<?>[] f5073e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f5074f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f5075a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f5076b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f5077c;
    public Object d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?>[] f5078c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public final Object f5079a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f5080b;

        public a(Object obj, String str) {
            this.f5079a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f5080b = cls.getMethod(str, f5078c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.f5080b;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.f5079a;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, new Object[]{menuItem})).booleanValue();
                }
                method.invoke(obj, new Object[]{menuItem});
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public class b {
        public CharSequence A;
        public CharSequence B;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* renamed from: a  reason: collision with root package name */
        public final Menu f5081a;

        /* renamed from: b  reason: collision with root package name */
        public int f5082b;

        /* renamed from: c  reason: collision with root package name */
        public int f5083c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f5084e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f5085f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5086g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5087h;

        /* renamed from: i  reason: collision with root package name */
        public int f5088i;

        /* renamed from: j  reason: collision with root package name */
        public int f5089j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f5090k;
        public CharSequence l;

        /* renamed from: m  reason: collision with root package name */
        public int f5091m;

        /* renamed from: n  reason: collision with root package name */
        public char f5092n;

        /* renamed from: o  reason: collision with root package name */
        public int f5093o;

        /* renamed from: p  reason: collision with root package name */
        public char f5094p;

        /* renamed from: q  reason: collision with root package name */
        public int f5095q;

        /* renamed from: r  reason: collision with root package name */
        public int f5096r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f5097s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f5098t;
        public boolean u;

        /* renamed from: v  reason: collision with root package name */
        public int f5099v;
        public int w;

        /* renamed from: x  reason: collision with root package name */
        public String f5100x;

        /* renamed from: y  reason: collision with root package name */
        public String f5101y;
        public i0.b z;

        public b(Menu menu) {
            this.f5081a = menu;
            this.f5082b = 0;
            this.f5083c = 0;
            this.d = 0;
            this.f5084e = 0;
            this.f5085f = true;
            this.f5086g = true;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.f5077c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            boolean z10;
            MenuItem enabled = menuItem.setChecked(this.f5097s).setVisible(this.f5098t).setEnabled(this.u);
            boolean z11 = false;
            if (this.f5096r >= 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            enabled.setCheckable(z10).setTitleCondensed(this.l).setIcon(this.f5091m);
            int i10 = this.f5099v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            String str = this.f5101y;
            f fVar = f.this;
            if (str != null) {
                if (!fVar.f5077c.isRestricted()) {
                    if (fVar.d == null) {
                        fVar.d = f.a(fVar.f5077c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(fVar.d, this.f5101y));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f5096r >= 2) {
                if (menuItem instanceof h) {
                    h hVar = (h) menuItem;
                    hVar.f356x = (hVar.f356x & -5) | 4;
                } else if (menuItem instanceof c) {
                    c cVar = (c) menuItem;
                    try {
                        Method method = cVar.f5940e;
                        d0.b bVar = cVar.d;
                        if (method == null) {
                            cVar.f5940e = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        cVar.f5940e.invoke(bVar, new Object[]{Boolean.TRUE});
                    } catch (Exception e10) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                    }
                }
            }
            String str2 = this.f5100x;
            if (str2 != null) {
                menuItem.setActionView((View) a(str2, f.f5073e, fVar.f5075a));
                z11 = true;
            }
            int i11 = this.w;
            if (i11 > 0) {
                if (!z11) {
                    menuItem.setActionView(i11);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            i0.b bVar2 = this.z;
            if (bVar2 != null) {
                if (menuItem instanceof d0.b) {
                    ((d0.b) menuItem).b(bVar2);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.A;
            boolean z12 = menuItem instanceof d0.b;
            if (z12) {
                ((d0.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z12) {
                ((d0.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c10 = this.f5092n;
            int i12 = this.f5093o;
            if (z12) {
                ((d0.b) menuItem).setAlphabeticShortcut(c10, i12);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c10, i12);
            }
            char c11 = this.f5094p;
            int i13 = this.f5095q;
            if (z12) {
                ((d0.b) menuItem).setNumericShortcut(c11, i13);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c11, i13);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z12) {
                    ((d0.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList == null) {
                return;
            }
            if (z12) {
                ((d0.b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f5073e = r0
            f5074f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.f.<clinit>():void");
    }

    public f(Context context) {
        super(context);
        this.f5077c = context;
        Object[] objArr = {context};
        this.f5075a = objArr;
        this.f5076b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i10;
        char c10;
        char c11;
        int i11;
        boolean z;
        i0.b bVar;
        ColorStateList colorStateList;
        AttributeSet attributeSet2 = attributeSet;
        b bVar2 = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i10 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlResourceParser xmlResourceParser2 = xmlResourceParser;
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType != 1) {
                Menu menu2 = bVar2.f5081a;
                if (eventType != i10) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z11 && name2.equals(str)) {
                            XmlResourceParser xmlResourceParser3 = xmlResourceParser;
                            z11 = false;
                            str = null;
                            eventType = xmlResourceParser.next();
                            i10 = 2;
                        } else if (name2.equals("group")) {
                            bVar2.f5082b = 0;
                            bVar2.f5083c = 0;
                            bVar2.d = 0;
                            bVar2.f5084e = 0;
                            bVar2.f5085f = true;
                            bVar2.f5086g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar2.f5087h) {
                                i0.b bVar3 = bVar2.z;
                                if (bVar3 == null || !bVar3.a()) {
                                    bVar2.f5087h = true;
                                    bVar2.b(menu2.add(bVar2.f5082b, bVar2.f5088i, bVar2.f5089j, bVar2.f5090k));
                                } else {
                                    bVar2.f5087h = true;
                                    bVar2.b(menu2.addSubMenu(bVar2.f5082b, bVar2.f5088i, bVar2.f5089j, bVar2.f5090k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z10 = true;
                        }
                    }
                } else if (!z11) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    f fVar = f.this;
                    if (equals) {
                        TypedArray obtainStyledAttributes = fVar.f5077c.obtainStyledAttributes(attributeSet2, androidx.databinding.a.O);
                        bVar2.f5082b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar2.f5083c = obtainStyledAttributes.getInt(3, 0);
                        bVar2.d = obtainStyledAttributes.getInt(4, 0);
                        bVar2.f5084e = obtainStyledAttributes.getInt(5, 0);
                        bVar2.f5085f = obtainStyledAttributes.getBoolean(2, true);
                        bVar2.f5086g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = fVar.f5077c;
                            e1 e1Var = new e1(context, context.obtainStyledAttributes(attributeSet2, androidx.databinding.a.P));
                            bVar2.f5088i = e1Var.i(2, 0);
                            bVar2.f5089j = (e1Var.h(5, bVar2.f5083c) & -65536) | (e1Var.h(6, bVar2.d) & 65535);
                            bVar2.f5090k = e1Var.k(7);
                            bVar2.l = e1Var.k(8);
                            bVar2.f5091m = e1Var.i(0, 0);
                            String j8 = e1Var.j(9);
                            if (j8 == null) {
                                c10 = 0;
                            } else {
                                c10 = j8.charAt(0);
                            }
                            bVar2.f5092n = c10;
                            bVar2.f5093o = e1Var.h(16, 4096);
                            String j10 = e1Var.j(10);
                            if (j10 == null) {
                                c11 = 0;
                            } else {
                                c11 = j10.charAt(0);
                            }
                            bVar2.f5094p = c11;
                            bVar2.f5095q = e1Var.h(20, 4096);
                            if (e1Var.l(11)) {
                                i11 = e1Var.a(11, false);
                            } else {
                                i11 = bVar2.f5084e;
                            }
                            bVar2.f5096r = i11;
                            bVar2.f5097s = e1Var.a(3, false);
                            bVar2.f5098t = e1Var.a(4, bVar2.f5085f);
                            bVar2.u = e1Var.a(1, bVar2.f5086g);
                            bVar2.f5099v = e1Var.h(21, -1);
                            bVar2.f5101y = e1Var.j(12);
                            bVar2.w = e1Var.i(13, 0);
                            bVar2.f5100x = e1Var.j(15);
                            String j11 = e1Var.j(14);
                            if (j11 != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z && bVar2.w == 0 && bVar2.f5100x == null) {
                                bVar = (i0.b) bVar2.a(j11, f5074f, fVar.f5076b);
                            } else {
                                if (z) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                bVar = null;
                            }
                            bVar2.z = bVar;
                            bVar2.A = e1Var.k(17);
                            bVar2.B = e1Var.k(22);
                            if (e1Var.l(19)) {
                                bVar2.D = k0.c(e1Var.h(19, -1), bVar2.D);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                bVar2.D = null;
                            }
                            if (e1Var.l(18)) {
                                bVar2.C = e1Var.b(18);
                            } else {
                                bVar2.C = colorStateList;
                            }
                            e1Var.n();
                            bVar2.f5087h = false;
                            XmlResourceParser xmlResourceParser4 = xmlResourceParser;
                        } else if (name3.equals("menu")) {
                            bVar2.f5087h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(bVar2.f5082b, bVar2.f5088i, bVar2.f5089j, bVar2.f5090k);
                            bVar2.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet2, addSubMenu);
                        } else {
                            XmlResourceParser xmlResourceParser5 = xmlResourceParser;
                            str = name3;
                            z11 = true;
                        }
                        eventType = xmlResourceParser.next();
                        i10 = 2;
                    }
                }
                XmlResourceParser xmlResourceParser6 = xmlResourceParser;
                eventType = xmlResourceParser.next();
                i10 = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof d0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f5077c.getResources().getLayout(i10);
            b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e10) {
            throw new InflateException("Error inflating menu XML", e10);
        } catch (IOException e11) {
            throw new InflateException("Error inflating menu XML", e11);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
