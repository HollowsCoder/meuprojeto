package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.appcompat.widget.x0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import p9.u;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f825a = false;

    /* renamed from: b  reason: collision with root package name */
    public final String f826b;

    /* renamed from: c  reason: collision with root package name */
    public final b f827c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public float f828e;

    /* renamed from: f  reason: collision with root package name */
    public String f829f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f830g;

    /* renamed from: h  reason: collision with root package name */
    public int f831h;

    /* renamed from: androidx.constraintlayout.widget.a$a  reason: collision with other inner class name */
    public static /* synthetic */ class C0009a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f832a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.widget.a$b[] r0 = androidx.constraintlayout.widget.a.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f832a = r0
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.a.b.REFERENCE_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f832a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.a.b.BOOLEAN_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f832a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.a.b.STRING_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f832a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.a.b.COLOR_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f832a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.a.b.COLOR_DRAWABLE_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f832a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.a.b.INT_TYPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f832a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.a.b.FLOAT_TYPE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f832a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.a.b.DIMENSION_TYPE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.C0009a.<clinit>():void");
        }
    }

    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(a aVar, Object obj) {
        this.f826b = aVar.f826b;
        this.f827c = aVar.f827c;
        c(obj);
    }

    public a(String str, b bVar, Object obj, boolean z) {
        this.f826b = str;
        this.f827c = bVar;
        this.f825a = z;
        c(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        Object obj;
        b bVar;
        int i10;
        float f10;
        b bVar2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), u.Z);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj2 = null;
        b bVar3 = null;
        boolean z = false;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    char upperCase = Character.toUpperCase(str.charAt(0));
                    String substring = str.substring(1);
                    StringBuilder sb = new StringBuilder(x0.a(substring, 1));
                    sb.append(upperCase);
                    sb.append(substring);
                    str = sb.toString();
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                obj2 = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar3 = b.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    bVar = b.COLOR_TYPE;
                } else if (index == 2) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == 7) {
                        bVar2 = b.DIMENSION_TYPE;
                        f10 = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == 4) {
                        bVar2 = b.DIMENSION_TYPE;
                        f10 = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == 5) {
                        bVar2 = b.FLOAT_TYPE;
                        f10 = obtainStyledAttributes.getFloat(index, Float.NaN);
                    } else {
                        if (index == 6) {
                            bVar = b.INT_TYPE;
                            i10 = obtainStyledAttributes.getInteger(index, -1);
                        } else if (index == 9) {
                            bVar = b.STRING_TYPE;
                            obj = obtainStyledAttributes.getString(index);
                            Object obj3 = obj;
                            bVar3 = bVar;
                            obj2 = obj3;
                        } else if (index == 8) {
                            bVar = b.REFERENCE_TYPE;
                            i10 = obtainStyledAttributes.getResourceId(index, -1);
                            if (i10 == -1) {
                                i10 = obtainStyledAttributes.getInt(index, -1);
                            }
                        }
                        obj = Integer.valueOf(i10);
                        Object obj32 = obj;
                        bVar3 = bVar;
                        obj2 = obj32;
                    }
                    obj = Float.valueOf(f10);
                    Object obj322 = obj;
                    bVar3 = bVar;
                    obj2 = obj322;
                }
                i10 = obtainStyledAttributes.getColor(index, 0);
                obj = Integer.valueOf(i10);
                Object obj3222 = obj;
                bVar3 = bVar;
                obj2 = obj3222;
            }
        }
        if (!(str == null || obj2 == null)) {
            hashMap.put(str, new a(str, bVar3, obj2, z));
        }
        obtainStyledAttributes.recycle();
    }

    public static void b(View view, HashMap<String, a> hashMap) {
        String str;
        StringBuilder sb;
        String str2;
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            a aVar = hashMap.get(next);
            if (!aVar.f825a) {
                String valueOf = String.valueOf(next);
                if (valueOf.length() != 0) {
                    str = "set".concat(valueOf);
                } else {
                    str = new String("set");
                }
            } else {
                str = next;
            }
            try {
                switch (C0009a.f832a[aVar.f827c.ordinal()]) {
                    case 1:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.d)});
                        break;
                    case 2:
                        cls.getMethod(str, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(aVar.f830g)});
                        break;
                    case 3:
                        cls.getMethod(str, new Class[]{CharSequence.class}).invoke(view, new Object[]{aVar.f829f});
                        break;
                    case 4:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f831h)});
                        break;
                    case 5:
                        Method method = cls.getMethod(str, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f831h);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 6:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.d)});
                        break;
                    case 7:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f828e)});
                        break;
                    case 8:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f828e)});
                        break;
                }
            } catch (NoSuchMethodException e10) {
                Log.e("TransitionLayout", e10.getMessage());
                String name = cls.getName();
                StringBuilder sb2 = new StringBuilder(name.length() + x0.a(next, 34));
                sb2.append(" Custom Attribute \"");
                sb2.append(next);
                sb2.append("\" not found on ");
                sb2.append(name);
                Log.e("TransitionLayout", sb2.toString());
                String name2 = cls.getName();
                StringBuilder sb3 = new StringBuilder(x0.a(str, name2.length() + 20));
                sb3.append(name2);
                sb3.append(" must have a method ");
                sb3.append(str);
                Log.e("TransitionLayout", sb3.toString());
            } catch (IllegalAccessException e11) {
                e = e11;
                str2 = cls.getName();
                sb = new StringBuilder(str2.length() + x0.a(next, 34));
                sb.append(" Custom Attribute \"");
                sb.append(next);
                sb.append("\" not found on ");
                sb.append(str2);
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            } catch (InvocationTargetException e12) {
                e = e12;
                str2 = cls.getName();
                sb = new StringBuilder(str2.length() + x0.a(next, 34));
                sb.append(" Custom Attribute \"");
                sb.append(next);
                sb.append("\" not found on ");
                sb.append(str2);
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            }
        }
    }

    public final void c(Object obj) {
        switch (C0009a.f832a[this.f827c.ordinal()]) {
            case 1:
            case 6:
                this.d = ((Integer) obj).intValue();
                return;
            case 2:
                this.f830g = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.f829f = (String) obj;
                return;
            case 4:
            case 5:
                this.f831h = ((Integer) obj).intValue();
                return;
            case 7:
                this.f828e = ((Float) obj).floatValue();
                return;
            case 8:
                this.f828e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
