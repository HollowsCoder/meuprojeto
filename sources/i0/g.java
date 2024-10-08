package i0;

import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import com.karumi.dexter.R;
import i0.w;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f5991a = false;

    /* renamed from: b  reason: collision with root package name */
    public static Method f5992b = null;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f5993c = false;
    public static Field d;

    public interface a {
        boolean a(KeyEvent keyEvent);
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        int indexOfKey;
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList<WeakReference<View>> arrayList = w.r.d;
            w.r rVar = (w.r) view.getTag(R.id.tag_unhandled_key_event_manager);
            if (rVar == null) {
                rVar = new w.r();
                view.setTag(R.id.tag_unhandled_key_event_manager, rVar);
            }
            WeakReference<KeyEvent> weakReference2 = rVar.f6019c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                rVar.f6019c = new WeakReference<>(keyEvent);
                if (rVar.f6018b == null) {
                    rVar.f6018b = new SparseArray<>();
                }
                SparseArray<WeakReference<View>> sparseArray = rVar.f6018b;
                if (keyEvent.getAction() != 1 || (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
                    weakReference = null;
                } else {
                    weakReference = sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !w.g.b(view2)) {
                        return true;
                    }
                    w.r.b(view2, keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(i0.g.a r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x000f
            boolean r7 = r7.a(r10)
            return r7
        L_0x000f:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x007e
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L_0x0061
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L_0x0061
            if (r8 == 0) goto L_0x0061
            boolean r1 = f5991a
            if (r1 != 0) goto L_0x004c
            java.lang.Class r1 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x004a }
            f5992b = r1     // Catch:{ NoSuchMethodException -> 0x004a }
        L_0x004a:
            f5991a = r3
        L_0x004c:
            java.lang.reflect.Method r1 = f5992b
            if (r1 == 0) goto L_0x005e
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005e }
            r4[r0] = r10     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005e }
            java.lang.Object r8 = r1.invoke(r8, r4)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005e }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005e }
            boolean r0 = r8.booleanValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005e }
        L_0x005e:
            if (r0 == 0) goto L_0x0061
            goto L_0x007d
        L_0x0061:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L_0x0068
            goto L_0x007d
        L_0x0068:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = i0.w.b(r7, r10)
            if (r8 == 0) goto L_0x0073
            goto L_0x007d
        L_0x0073:
            if (r7 == 0) goto L_0x0079
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L_0x0079:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L_0x007d:
            return r3
        L_0x007e:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto L_0x00d1
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = f5993c
            if (r7 != 0) goto L_0x0097
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x0095 }
            d = r7     // Catch:{ NoSuchFieldException -> 0x0095 }
            r7.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x0095 }
        L_0x0095:
            f5993c = r3
        L_0x0097:
            java.lang.reflect.Field r7 = d
            if (r7 == 0) goto L_0x00a2
            java.lang.Object r7 = r7.get(r9)     // Catch:{ IllegalAccessException -> 0x00a2 }
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch:{ IllegalAccessException -> 0x00a2 }
            goto L_0x00a3
        L_0x00a2:
            r7 = r2
        L_0x00a3:
            if (r7 == 0) goto L_0x00b0
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto L_0x00b0
            goto L_0x00d0
        L_0x00b0:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L_0x00bb
            goto L_0x00d0
        L_0x00bb:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = i0.w.b(r7, r10)
            if (r8 == 0) goto L_0x00c6
            goto L_0x00d0
        L_0x00c6:
            if (r7 == 0) goto L_0x00cc
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L_0x00cc:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L_0x00d0:
            return r3
        L_0x00d1:
            if (r8 == 0) goto L_0x00d9
            boolean r8 = i0.w.b(r8, r10)
            if (r8 != 0) goto L_0x00df
        L_0x00d9:
            boolean r7 = r7.a(r10)
            if (r7 == 0) goto L_0x00e0
        L_0x00df:
            r0 = r3
        L_0x00e0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.g.b(i0.g$a, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }
}
