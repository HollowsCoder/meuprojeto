package d2;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.appfab.facematchlive.data.ApiClient;
import com.appfab.facematchlive.data.ApiService;
import com.appfab.facematchlive.data.model.BaseError;
import com.appfab.facematchlive.data.model.DataModel;
import com.appfab.facematchlive.data.model.ResponseModel;
import com.appfab.facematchlive.ui.flow.main.MainActivity;
import com.google.gson.Gson;
import com.karumi.dexter.R;
import g9.u;
import h2.b;
import i9.b0;
import i9.d0;
import i9.t;
import i9.u;
import i9.y;
import j9.c;
import java.io.File;
import java.nio.charset.Charset;
import n8.e;
import n8.i;
import q8.d;
import r8.a;
import s8.e;
import s8.h;
import y8.p;

@e(c = "com.appfab.facematchlive.ui.flow.main.MainActivity$beginProcess$2", f = "MainActivity.kt", l = {244}, m = "invokeSuspend")
public final class g extends h implements p<u, d<? super i>, Object> {

    /* renamed from: s  reason: collision with root package name */
    public int f4133s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ MainActivity f4134t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(MainActivity mainActivity, d<? super g> dVar) {
        super(dVar);
        this.f4134t = mainActivity;
    }

    public final d<i> a(Object obj, d<?> dVar) {
        return new g(this.f4134t, dVar);
    }

    public final Object f(Object obj) {
        Object obj2;
        String str;
        Charset charset;
        DataModel data;
        boolean z;
        String str2;
        x1.e eVar;
        boolean z10;
        String str3;
        String str4;
        String str5;
        boolean z11;
        boolean z12;
        boolean z13;
        t tVar;
        t tVar2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f4133s;
        MainActivity mainActivity = this.f4134t;
        if (i10 == 0) {
            n.e.I(obj);
            File file = new File(String.valueOf(mainActivity.I));
            File file2 = new File(String.valueOf(mainActivity.J));
            b0.a aVar2 = b0.f6166a;
            t.f6320f.getClass();
            try {
                tVar = t.a.a("image/*");
            } catch (IllegalArgumentException unused) {
                tVar = null;
            }
            try {
                aVar2.getClass();
                y yVar = new y(file, tVar);
                try {
                    tVar2 = t.a.a("image/*");
                } catch (IllegalArgumentException unused2) {
                    tVar2 = null;
                }
                y yVar2 = new y(file2, tVar2);
                u.c.a aVar3 = u.c.f6335c;
                String name = file.getName();
                aVar3.getClass();
                u.c b10 = u.c.a.b("image_a", name, yVar);
                u.c b11 = u.c.a.b("image_b", file2.getName(), yVar2);
                ApiService service = ApiClient.Companion.instance().getService();
                this.f4133s = 1;
                obj = service.share(b10, b11, this);
                if (obj == aVar) {
                    return aVar;
                }
            } catch (Throwable th) {
                obj2 = n.e.s(th);
            }
        } else if (i10 == 1) {
            n.e.I(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = (y9.b0) obj;
        if (!(obj2 instanceof e.a)) {
            y9.b0 b0Var = (y9.b0) obj2;
            if (b0Var.f9660a.c()) {
                ResponseModel responseModel = (ResponseModel) b0Var.f9661b;
                if (!(responseModel == null || (data = responseModel.getData()) == null)) {
                    double similarity = data.getSimilarity();
                    int i11 = MainActivity.P;
                    mainActivity.I();
                    T t10 = mainActivity.E;
                    z8.g.c(t10);
                    ((x1.e) t10).X0.setVisibility(0);
                    T t11 = mainActivity.E;
                    z8.g.c(t11);
                    ((x1.e) t11).L0.setVisibility(8);
                    int i12 = (int) similarity;
                    if (i12 < 0 || i12 >= 70) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        T t12 = mainActivity.E;
                        z8.g.c(t12);
                        eVar = (x1.e) t12;
                        str2 = mainActivity.getString(R.string.similarity_out);
                    } else {
                        if (70 > i12 || i12 >= 80) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            T t13 = mainActivity.E;
                            z8.g.c(t13);
                            eVar = (x1.e) t13;
                            str5 = mainActivity.getString(R.string.similarity);
                            z8.g.e(str5, "getString(R.string.similarity)");
                            str4 = mainActivity.getString(R.string.similarity_low);
                            str3 = "getString(R.string.similarity_low)";
                        } else {
                            if (80 > i12 || i12 >= 88) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (z11) {
                                T t14 = mainActivity.E;
                                z8.g.c(t14);
                                eVar = (x1.e) t14;
                                str5 = mainActivity.getString(R.string.similarity);
                                z8.g.e(str5, "getString(R.string.similarity)");
                                str4 = mainActivity.getString(R.string.similarity_middle);
                                str3 = "getString(R.string.similarity_middle)";
                            } else {
                                if (88 > i12 || i12 >= 91) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                                if (z12) {
                                    T t15 = mainActivity.E;
                                    z8.g.c(t15);
                                    eVar = (x1.e) t15;
                                    str5 = mainActivity.getString(R.string.similarity);
                                    z8.g.e(str5, "getString(R.string.similarity)");
                                    str4 = mainActivity.getString(R.string.similarity_high);
                                    str3 = "getString(R.string.similarity_high)";
                                } else {
                                    if (91 > i12 || i12 >= 101) {
                                        z13 = false;
                                    } else {
                                        z13 = true;
                                    }
                                    if (z13) {
                                        T t16 = mainActivity.E;
                                        z8.g.c(t16);
                                        eVar = (x1.e) t16;
                                        str5 = mainActivity.getString(R.string.similarity);
                                        z8.g.e(str5, "getString(R.string.similarity)");
                                        str4 = mainActivity.getString(R.string.similarity_so_high);
                                        str3 = "getString(R.string.similarity_so_high)";
                                    }
                                    T t17 = mainActivity.E;
                                    z8.g.c(t17);
                                    TextView textView = ((x1.e) t17).V0;
                                    z8.g.e(textView, "binding().similarityScoreTV");
                                    ValueAnimator valueAnimator = new ValueAnimator();
                                    valueAnimator.setObjectValues(new Object[]{Double.valueOf(0.0d), Double.valueOf(similarity)});
                                    valueAnimator.setEvaluator(new h());
                                    valueAnimator.setDuration(1500);
                                    valueAnimator.addUpdateListener(new f(textView));
                                    valueAnimator.start();
                                    valueAnimator.addListener(new i(mainActivity));
                                }
                            }
                        }
                        z8.g.e(str4, str3);
                        str2 = f9.h.Y(str5, "%s", str4);
                    }
                    eVar.W0.setText(str2);
                    T t172 = mainActivity.E;
                    z8.g.c(t172);
                    TextView textView2 = ((x1.e) t172).V0;
                    z8.g.e(textView2, "binding().similarityScoreTV");
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    valueAnimator2.setObjectValues(new Object[]{Double.valueOf(0.0d), Double.valueOf(similarity)});
                    valueAnimator2.setEvaluator(new h());
                    valueAnimator2.setDuration(1500);
                    valueAnimator2.addUpdateListener(new f(textView2));
                    valueAnimator2.start();
                    valueAnimator2.addListener(new i(mainActivity));
                }
            } else {
                d0 d0Var = b0Var.f9662c;
                if (d0Var != null) {
                    Gson gson = b.f5218a;
                    w9.i c10 = d0Var.c();
                    try {
                        t b12 = d0Var.b();
                        if (b12 == null || (charset = b12.a(f9.a.f4927b)) == null) {
                            charset = f9.a.f4927b;
                        }
                        str = c10.d0(c.q(c10, charset));
                        s6.a.r(c10, (Throwable) null);
                    } catch (Throwable th2) {
                        s6.a.r(c10, th);
                        throw th2;
                    }
                } else {
                    str = null;
                }
                Object fromJson = b.f5218a.fromJson(str, BaseError.class);
                if (fromJson != null) {
                    BaseError baseError = (BaseError) fromJson;
                    if (baseError.getMessage() == null) {
                        baseError = new BaseError((String) null, (Integer) null, (String) null, 7, (z8.e) null);
                    }
                    String valueOf = String.valueOf(baseError.getMessage());
                    mainActivity.getClass();
                    mainActivity.F(mainActivity.getString(R.string.alert_title_error), valueOf, j2.b.ERROR);
                    mainActivity.H((Boolean) null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type T of com.appfab.facematchlive.util.ExtensionKt.toModel");
                }
            }
        }
        Throwable a10 = n8.e.a(obj2);
        if (a10 != null) {
            int i13 = MainActivity.P;
            mainActivity.I();
            mainActivity.F(mainActivity.getString(R.string.alert_title_error), a10.getLocalizedMessage(), j2.b.ERROR);
            a10.printStackTrace();
            mainActivity.H((Boolean) null);
        }
        Throwable a11 = n8.e.a(obj2);
        if (a11 != null) {
            int i14 = MainActivity.P;
            mainActivity.I();
            mainActivity.F(mainActivity.getString(R.string.alert_title_error), a11.getLocalizedMessage(), j2.b.ERROR);
            a11.printStackTrace();
            mainActivity.H((Boolean) null);
        }
        return i.f7501a;
    }

    public final Object i(Object obj, Object obj2) {
        return ((g) a((g9.u) obj, (d) obj2)).f(i.f7501a);
    }
}
