package com.appfab.facematchlive.ui.flow.custom_ad;

import a2.e;
import a2.f;
import a9.c;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.c;
import androidx.viewpager2.widget.ViewPager2;
import com.appfab.facematchlive.data.model.CustomAdAppDataModel;
import com.bumptech.glide.l;
import com.bumptech.glide.m;
import com.karumi.dexter.R;
import e.d;
import java.util.ArrayList;
import z8.g;

public final class CustomAdActivity extends d {
    public static final /* synthetic */ int I = 0;
    public x1.a E;
    public boolean F;
    public final ArrayList<CustomAdAppDataModel> G = new ArrayList<>(new o8.d(new CustomAdAppDataModel[]{new CustomAdAppDataModel("https://play-lh.googleusercontent.com/rgU5oyAfHPOkeNRlpy1qyVY12EK3kscZtNRhBpdqjl0dGDBa-ZO8LSdmZq8qqlmYmFY", "Gipi: AI English Speaking Pal", "AppFab Application Factory", "10.000+", "https://bit.ly/45JuPy5", "ai.gipi.app.twa", new ArrayList(new o8.d(new String[]{"https://play-lh.googleusercontent.com/N0jOEzvu17f0PBb_datH9gWR-sU8lNJvIapkYD2Vm2c1MlpOuZa-LKZdaBslX8mkqlU", "https://play-lh.googleusercontent.com/HcmJVL5wTaNuqTFSq55DrAIQO-TL47qq8sYyN0RCup7vHc0GM1UkgGdDPPdaG0w_RNXG", "https://play-lh.googleusercontent.com/Cgdfv7RU-3PwEs1p71KP0Yj4WbecFI4xiQAq1UVt6wOg6X6wXP0u5br0hN2uKPkvfb8", "https://play-lh.googleusercontent.com/j9Ve0FEW_vn_F0kILqkegutGAoFTzqsmYC_UPwqFlftGcBDGKw9zrvbpY1LKso7bv78", "https://play-lh.googleusercontent.com/HkHnACWECZTAEr9TazCfUz0iI1kHkwRXJIN9PBZuahbzL8QHaAq81tSnMMhHIXRJMQ"}, true)))}, true));
    public final b H = new b(this);

    public static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CustomAdActivity f2225a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f2226b;

        public a(CustomAdActivity customAdActivity, int i10) {
            this.f2225a = customAdActivity;
            this.f2226b = i10;
        }

        public final void onClick() {
            CustomAdActivity customAdActivity = this.f2225a;
            customAdActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(customAdActivity.G.get(this.f2226b).getAppStoreUrl())));
        }
    }

    public static final class b extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CustomAdActivity f2227a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(CustomAdActivity customAdActivity) {
            super(10000, 1000);
            this.f2227a = customAdActivity;
        }

        public final void onFinish() {
            CustomAdActivity customAdActivity = this.f2227a;
            customAdActivity.runOnUiThread(new a2.d(0, customAdActivity));
        }

        public final void onTick(long j8) {
            CustomAdActivity customAdActivity = this.f2227a;
            customAdActivity.runOnUiThread(new e(customAdActivity, j8));
        }
    }

    public final void onBackPressed() {
        if (this.F) {
            setResult(-1, (Intent) null);
            finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        ImageView imageView;
        ViewPager2 viewPager2;
        ViewPager2 viewPager22;
        Button button;
        CardView cardView;
        ViewPager2 viewPager23;
        ViewPager2 viewPager24;
        super.onCreate(bundle);
        DataBinderMapperImpl dataBinderMapperImpl = c.f1029a;
        setContentView((int) R.layout.activity_custom_ad);
        x1.a aVar = (x1.a) c.b((ViewGroup) getWindow().getDecorView().findViewById(16908290), 0, R.layout.activity_custom_ad);
        this.E = aVar;
        if (aVar != null) {
            aVar.V();
        }
        c.a aVar2 = a9.c.f118o;
        ArrayList<CustomAdAppDataModel> arrayList = this.G;
        int b10 = aVar2.b(arrayList.size());
        x1.a aVar3 = this.E;
        if (aVar3 != null) {
            aVar3.d0(arrayList.get(b10));
        }
        Context applicationContext = getApplicationContext();
        if (applicationContext != null) {
            m f10 = com.bumptech.glide.b.b(applicationContext).f2237t.f(applicationContext);
            String appLogo = arrayList.get(b10).getAppLogo();
            f10.getClass();
            l B = new l(f10.f2291o, f10, Drawable.class, f10.f2292p).B(appLogo);
            x1.a aVar4 = this.E;
            ViewPager2 viewPager25 = null;
            if (aVar4 != null) {
                imageView = aVar4.L0;
            } else {
                imageView = null;
            }
            g.c(imageView);
            B.z(imageView);
            a2.g gVar = new a2.g(arrayList.get(b10).getAppImages(), new a(this, b10));
            x1.a aVar5 = this.E;
            if (aVar5 != null) {
                viewPager2 = aVar5.O0;
            } else {
                viewPager2 = null;
            }
            if (viewPager2 != null) {
                viewPager2.setOffscreenPageLimit(arrayList.get(b10).getAppImages().size());
            }
            a2.a aVar6 = new a2.a(getResources().getDimension(R.dimen.viewpager_current_item_horizontal_margin) + getResources().getDimension(R.dimen.viewpager_next_item_visible));
            x1.a aVar7 = this.E;
            if (!(aVar7 == null || (viewPager24 = aVar7.O0) == null)) {
                viewPager24.setPageTransformer(aVar6);
            }
            x1.a aVar8 = this.E;
            if (aVar8 != null) {
                viewPager22 = aVar8.O0;
            } else {
                viewPager22 = null;
            }
            g.c(viewPager22);
            Context context = viewPager22.getContext();
            g.e(context, "binding?.customAdImagesVP!!.context");
            h2.c cVar = new h2.c(context);
            x1.a aVar9 = this.E;
            if (!(aVar9 == null || (viewPager23 = aVar9.O0) == null)) {
                viewPager23.w.g(cVar);
            }
            x1.a aVar10 = this.E;
            if (aVar10 != null) {
                viewPager25 = aVar10.O0;
            }
            if (viewPager25 != null) {
                viewPager25.setAdapter(gVar);
            }
            x1.a aVar11 = this.E;
            if (!(aVar11 == null || (cardView = aVar11.M0) == null)) {
                cardView.setOnClickListener(new a2.b(this, 0));
            }
            x1.a aVar12 = this.E;
            if (!(aVar12 == null || (button = aVar12.P0) == null)) {
                button.setOnClickListener(new a2.c(this, b10));
            }
            this.H.start();
            return;
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }
}
