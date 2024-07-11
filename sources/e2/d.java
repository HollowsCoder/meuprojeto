package e2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.appcompat.widget.f1;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.appfab.facematchlive.data.model.GalleryModel;
import com.appfab.facematchlive.ui.flow.imagezoom.ImageZoomActivity;
import com.appfab.facematchlive.ui.flow.selector.ActivitySelector;
import com.google.gson.Gson;
import com.karumi.dexter.R;
import f2.c;
import java.util.ArrayList;
import java.util.List;
import v1.e;
import x1.g;

public final class d extends e<e> {
    public ActivitySelector d;

    /* renamed from: e  reason: collision with root package name */
    public g f4465e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f4466f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public GalleryModel f4467g;

    /* renamed from: h  reason: collision with root package name */
    public c f4468h;

    public static final class a implements l2.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f4469a;

        public a(d dVar) {
            this.f4469a = dVar;
        }

        public final void a(int i10) {
            d dVar = this.f4469a;
            dVar.getClass();
            Intent intent = new Intent(dVar.d, ImageZoomActivity.class);
            j2.a.f6520b = new Gson().toJson((Object) dVar.f4466f);
            intent.putExtra("position", i10);
            ActivitySelector activitySelector = dVar.d;
            if (activitySelector != null) {
                activitySelector.startActivity(intent);
            }
        }

        public final void b(int i10) {
            this.f4469a.f(i10);
        }
    }

    public d() {
        new Handler(Looper.getMainLooper()).postDelayed(new f1(2, this), 150);
    }

    public final void d(Bitmap bitmap) {
        try {
            ActivitySelector activitySelector = this.d;
            z8.g.c(activitySelector);
            Context applicationContext = activitySelector.getApplicationContext();
            z8.g.e(applicationContext, "activity!!.applicationContext");
            ArrayList b10 = new o.e(applicationContext).b(bitmap);
            this.f4466f = b10;
            if (b10.size() < 1) {
                ActivitySelector activitySelector2 = this.d;
                if (activitySelector2 != null) {
                    Toast.makeText(activitySelector2, String.valueOf(activitySelector2.getString(R.string.no_faces_detected)), 0).show();
                }
                ActivitySelector activitySelector3 = this.d;
                if (activitySelector3 != null) {
                    activitySelector3.finish();
                    return;
                }
                return;
            }
            e(this.f4466f);
        } catch (Exception e10) {
            e10.printStackTrace();
            ActivitySelector activitySelector4 = this.d;
            if (activitySelector4 != null) {
                Toast.makeText(activitySelector4, String.valueOf(activitySelector4.getString(R.string.error_occurred)), 0).show();
            }
            ActivitySelector activitySelector5 = this.d;
            if (activitySelector5 != null) {
                activitySelector5.finish();
            }
        }
    }

    public final void e(List<GalleryModel> list) {
        int i10;
        z8.g.f(list, "data");
        try {
            this.f4468h = new c(list, new a(this));
            boolean z = true;
            if (this.f4466f.size() == 1) {
                i10 = 1;
            } else {
                if (this.f4466f.size() > 6) {
                    if (this.f4466f.size() < 13) {
                        i10 = 3;
                    } else if (this.f4466f.size() < 25) {
                        i10 = 4;
                    } else if (this.f4466f.size() > 25) {
                        i10 = 5;
                    }
                }
                i10 = 2;
            }
            g gVar = this.f4465e;
            ConstraintLayout constraintLayout = null;
            RecyclerView recyclerView = gVar != null ? gVar.L0 : null;
            if (recyclerView != null) {
                ActivitySelector activitySelector = this.d;
                if (activitySelector != null) {
                    activitySelector.getApplicationContext();
                }
                recyclerView.setLayoutManager(new GridLayoutManager(i10));
            }
            g gVar2 = this.f4465e;
            RecyclerView recyclerView2 = gVar2 != null ? gVar2.L0 : null;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.f4468h);
            }
            g gVar3 = this.f4465e;
            if (gVar3 != null) {
                constraintLayout = gVar3.N0;
            }
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
            try {
                c cVar = this.f4468h;
                if (cVar == null || cVar.a() != 1) {
                    z = false;
                }
                if (z) {
                    f(0);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final void f(int i10) {
        c cVar;
        int i11 = 0;
        for (Object next : this.f4466f) {
            int i12 = i11 + 1;
            if (i11 >= 0) {
                GalleryModel galleryModel = (GalleryModel) next;
                if (i10 == i11) {
                    galleryModel.setSelected(true);
                    this.f4467g = galleryModel;
                    cVar = this.f4468h;
                    if (cVar == null) {
                        i11 = i12;
                    }
                } else {
                    galleryModel.setSelected(false);
                    cVar = this.f4468h;
                    if (cVar == null) {
                        i11 = i12;
                    }
                }
                cVar.c(i11);
                i11 = i12;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
    }
}
