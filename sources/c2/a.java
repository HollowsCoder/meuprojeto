package c2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import com.appfab.facematchlive.data.model.GalleryModel;
import com.github.chrisbanes.photoview.PhotoView;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.R;
import com.squareup.picasso.t;
import com.squareup.picasso.x;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import o3.d;
import o3.f;
import x1.q;
import z8.g;

public final class a extends RecyclerView.f<c> {
    public final List<GalleryModel> d = new ArrayList();

    /* renamed from: c2.a$a  reason: collision with other inner class name */
    public class C0028a implements d {
    }

    public class b implements f {
    }

    public class c extends RecyclerView.c0 {
        public final q u;

        public c(q qVar) {
            super(qVar.B0);
            this.u = qVar;
        }
    }

    public a(List<GalleryModel> list) {
        this.d = list;
    }

    public final int a() {
        return this.d.size();
    }

    public final void d(RecyclerView.c0 c0Var, int i10) {
        Bitmap bitmap;
        q qVar = ((c) c0Var).u;
        List<GalleryModel> list = this.d;
        try {
            GalleryModel galleryModel = list.get(i10);
            if (galleryModel.isBase64()) {
                PhotoView photoView = qVar.L0;
                String image = list.get(i10).getImage();
                if (image != null) {
                    try {
                        if (!g.a(image, "null") && !g.a(image, BuildConfig.FLAVOR)) {
                            byte[] decode = Base64.decode(image, 0);
                            bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                            photoView.setImageBitmap(bitmap);
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                bitmap = null;
                photoView.setImageBitmap(bitmap);
            } else {
                t d10 = t.d();
                File file = new File(galleryModel.getImage());
                d10.getClass();
                x xVar = new x(d10, Uri.fromFile(file));
                xVar.b(com.squareup.picasso.q.OFFLINE, new com.squareup.picasso.q[0]);
                xVar.a(qVar.L0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        qVar.L0.setOnMatrixChangeListener(new C0028a());
        qVar.L0.setOnPhotoTapListener(new b());
    }

    public final RecyclerView.c0 e(RecyclerView recyclerView) {
        return new c((q) androidx.databinding.c.c(LayoutInflater.from(recyclerView.getContext()), R.layout.item_expander, recyclerView));
    }
}
