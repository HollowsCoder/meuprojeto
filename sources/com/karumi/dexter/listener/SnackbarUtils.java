package com.karumi.dexter.listener;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.material.snackbar.j;
import com.google.android.material.snackbar.k;
import com.karumi.dexter.R;
import java.util.ArrayList;

public class SnackbarUtils {
    public static void show(View view, String str, int i10, String str2, View.OnClickListener onClickListener, BaseTransientBottomBar.d<Snackbar> dVar) {
        ViewGroup viewGroup;
        boolean z;
        int i11;
        boolean z10;
        int[] iArr = Snackbar.f3552t;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                break;
            }
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        viewGroup = (ViewGroup) view;
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Snackbar.f3552t);
            boolean z11 = false;
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            if (resourceId == -1 || resourceId2 == -1) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i11 = R.layout.mtrl_layout_snackbar_include;
            } else {
                i11 = R.layout.design_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i11, viewGroup, false);
            Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
            ((SnackbarContentLayout) snackbar.f3531c.getChildAt(0)).getMessageView().setText(str);
            snackbar.f3532e = i10;
            if (!(str2 == null || onClickListener == null)) {
                Button actionView = ((SnackbarContentLayout) snackbar.f3531c.getChildAt(0)).getActionView();
                if (!TextUtils.isEmpty(str2)) {
                    snackbar.f3554s = true;
                    actionView.setVisibility(0);
                    actionView.setText(str2);
                    actionView.setOnClickListener(new j(snackbar, onClickListener));
                } else {
                    actionView.setVisibility(8);
                    actionView.setOnClickListener((View.OnClickListener) null);
                    snackbar.f3554s = false;
                }
            }
            if (dVar != null) {
                if (snackbar.l == null) {
                    snackbar.l = new ArrayList();
                }
                snackbar.l.add(dVar);
            }
            k b10 = k.b();
            int g10 = snackbar.g();
            BaseTransientBottomBar.c cVar = snackbar.f3540n;
            synchronized (b10.f3571a) {
                if (b10.c(cVar)) {
                    k.c cVar2 = b10.f3573c;
                    cVar2.f3576b = g10;
                    b10.f3572b.removeCallbacksAndMessages(cVar2);
                    b10.d(b10.f3573c);
                } else {
                    k.c cVar3 = b10.d;
                    if (cVar3 != null) {
                        if (cVar == null || cVar3.f3575a.get() != cVar) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            z11 = true;
                        }
                    }
                    if (z11) {
                        b10.d.f3576b = g10;
                    } else {
                        b10.d = new k.c(g10, cVar);
                    }
                    k.c cVar4 = b10.f3573c;
                    if (cVar4 == null || !b10.a(cVar4, 4)) {
                        b10.f3573c = null;
                        k.c cVar5 = b10.d;
                        if (cVar5 != null) {
                            b10.f3573c = cVar5;
                            b10.d = null;
                            k.b bVar = cVar5.f3575a.get();
                            if (bVar != null) {
                                bVar.a();
                            } else {
                                b10.f3573c = null;
                            }
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }
}
