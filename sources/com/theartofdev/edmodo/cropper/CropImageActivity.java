package com.theartofdev.edmodo.cropper;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.karumi.dexter.R;
import com.theartofdev.edmodo.cropper.CropImageView;
import com.theartofdev.edmodo.cropper.d;
import e.d;
import e.g;
import e.r;
import java.io.File;
import java.io.IOException;
import y.a;

public class CropImageActivity extends d implements CropImageView.i, CropImageView.e {
    public CropImageView E;
    public Uri F;
    public e G;

    public static void C(Menu menu, int i10, int i11) {
        Drawable icon;
        MenuItem findItem = menu.findItem(i10);
        if (findItem != null && (icon = findItem.getIcon()) != null) {
            try {
                icon.mutate();
                icon.setColorFilter(i11, PorterDuff.Mode.SRC_ATOP);
                findItem.setIcon(icon);
            } catch (Exception e10) {
                Log.w("AIC", "Failed to update menu item color", e10);
            }
        }
    }

    public final void A(int i10) {
        this.E.e(i10);
    }

    public final void B(Uri uri, Exception exc, int i10) {
        int i11;
        if (exc == null) {
            i11 = -1;
        } else {
            i11 = 204;
        }
        d.a aVar = new d.a(this.E.getImageUri(), uri, exc, this.E.getCropPoints(), this.E.getCropRect(), this.E.getRotatedDegrees(), this.E.getWholeImageRect(), i10);
        Intent intent = new Intent();
        intent.putExtras(getIntent());
        intent.putExtra("CROP_IMAGE_EXTRA_RESULT", aVar);
        setResult(i11, intent);
        finish();
    }

    @SuppressLint({"NewApi"})
    public final void onActivityResult(int i10, int i11, Intent intent) {
        Uri uri;
        String action;
        if (i10 == 200) {
            boolean z = false;
            if (i11 == 0) {
                setResult(0);
                finish();
            }
            if (i11 == -1) {
                if (intent == null || intent.getData() == null || ((action = intent.getAction()) != null && action.equals("android.media.action.IMAGE_CAPTURE"))) {
                    z = true;
                }
                if (z || intent.getData() == null) {
                    File externalCacheDir = getExternalCacheDir();
                    if (externalCacheDir != null) {
                        uri = Uri.fromFile(new File(externalCacheDir.getPath(), "pickImageResult.jpeg"));
                    } else {
                        uri = null;
                    }
                } else {
                    uri = intent.getData();
                }
                this.F = uri;
                if (d.c(this, uri)) {
                    requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
                } else {
                    this.E.setImageUriAsync(this.F);
                }
            }
        }
    }

    public final void onBackPressed() {
        super.onBackPressed();
        setResult(0);
        finish();
    }

    @SuppressLint({"NewApi"})
    public final void onCreate(Bundle bundle) {
        CharSequence charSequence;
        CharSequence charSequence2;
        super.onCreate(bundle);
        setContentView((int) R.layout.crop_image_activity);
        this.E = (CropImageView) findViewById(R.id.cropImageView);
        Bundle bundleExtra = getIntent().getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE");
        this.F = (Uri) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_SOURCE");
        this.G = (e) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
        if (bundle == null) {
            Uri uri = this.F;
            if (uri == null || uri.equals(Uri.EMPTY)) {
                if (d.b(this)) {
                    requestPermissions(new String[]{"android.permission.CAMERA"}, 2011);
                } else {
                    d.d(this);
                }
            } else if (d.c(this, this.F)) {
                requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
            } else {
                this.E.setImageUriAsync(this.F);
            }
        }
        g gVar = (g) z();
        gVar.J();
        r rVar = gVar.f4352v;
        if (rVar != null) {
            e eVar = this.G;
            if (eVar == null || (charSequence2 = eVar.R) == null || charSequence2.length() <= 0) {
                charSequence = getResources().getString(R.string.crop_image_activity_title);
            } else {
                charSequence = this.G.R;
            }
            rVar.f4418e.setTitle(charSequence);
            int o10 = rVar.f4418e.o();
            rVar.f4421h = true;
            rVar.f4418e.m((o10 & -5) | 4);
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.crop_image_menu, menu);
        e eVar = this.G;
        if (!eVar.f4091c0) {
            menu.removeItem(R.id.crop_image_menu_rotate_left);
            menu.removeItem(R.id.crop_image_menu_rotate_right);
        } else if (eVar.f4093e0) {
            menu.findItem(R.id.crop_image_menu_rotate_left).setVisible(true);
        }
        if (!this.G.f4092d0) {
            menu.removeItem(R.id.crop_image_menu_flip);
        }
        if (this.G.f4097i0 != null) {
            menu.findItem(R.id.crop_image_menu_crop).setTitle(this.G.f4097i0);
        }
        Drawable drawable = null;
        try {
            int i10 = this.G.f4098j0;
            if (i10 != 0) {
                Object obj = a.f9523a;
                drawable = a.c.b(this, i10);
                menu.findItem(R.id.crop_image_menu_crop).setIcon(drawable);
            }
        } catch (Exception e10) {
            Log.w("AIC", "Failed to read menu crop drawable", e10);
        }
        int i11 = this.G.S;
        if (i11 != 0) {
            C(menu, R.id.crop_image_menu_rotate_left, i11);
            C(menu, R.id.crop_image_menu_rotate_right, this.G.S);
            C(menu, R.id.crop_image_menu_flip, this.G.S);
            if (drawable != null) {
                C(menu, R.id.crop_image_menu_crop, this.G.S);
            }
        }
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int i10;
        String str;
        if (menuItem.getItemId() == R.id.crop_image_menu_crop) {
            e eVar = this.G;
            if (eVar.Z) {
                B((Uri) null, (Exception) null, 1);
            } else {
                Uri uri = eVar.T;
                if (uri == null || uri.equals(Uri.EMPTY)) {
                    try {
                        Bitmap.CompressFormat compressFormat = this.G.U;
                        if (compressFormat == Bitmap.CompressFormat.JPEG) {
                            str = ".jpg";
                        } else if (compressFormat == Bitmap.CompressFormat.PNG) {
                            str = ".png";
                        } else {
                            str = ".webp";
                        }
                        uri = Uri.fromFile(File.createTempFile("cropped", str, getCacheDir()));
                    } catch (IOException e10) {
                        throw new RuntimeException("Failed to create temp file for output image", e10);
                    }
                }
                Uri uri2 = uri;
                CropImageView cropImageView = this.E;
                e eVar2 = this.G;
                Bitmap.CompressFormat compressFormat2 = eVar2.U;
                int i11 = eVar2.V;
                int i12 = eVar2.W;
                int i13 = eVar2.X;
                CropImageView.j jVar = eVar2.Y;
                if (cropImageView.L != null) {
                    cropImageView.i(i12, i13, i11, compressFormat2, uri2, jVar);
                } else {
                    throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
                }
            }
            return true;
        }
        if (menuItem.getItemId() == R.id.crop_image_menu_rotate_left) {
            i10 = -this.G.f4094f0;
        } else if (menuItem.getItemId() == R.id.crop_image_menu_rotate_right) {
            i10 = this.G.f4094f0;
        } else if (menuItem.getItemId() == R.id.crop_image_menu_flip_horizontally) {
            CropImageView cropImageView2 = this.E;
            cropImageView2.z = !cropImageView2.z;
            cropImageView2.a((float) cropImageView2.getWidth(), (float) cropImageView2.getHeight(), true, false);
            return true;
        } else if (menuItem.getItemId() == R.id.crop_image_menu_flip_vertically) {
            CropImageView cropImageView3 = this.E;
            cropImageView3.A = !cropImageView3.A;
            cropImageView3.a((float) cropImageView3.getWidth(), (float) cropImageView3.getHeight(), true, false);
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            setResult(0);
            finish();
            return true;
        }
        A(i10);
        return true;
    }

    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 == 201) {
            Uri uri = this.F;
            if (uri == null || iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(this, R.string.crop_image_activity_no_permissions, 1).show();
                setResult(0);
                finish();
            } else {
                this.E.setImageUriAsync(uri);
            }
        }
        if (i10 == 2011) {
            d.d(this);
        }
    }

    public final void onStart() {
        super.onStart();
        this.E.setOnSetImageUriCompleteListener(this);
        this.E.setOnCropImageCompleteListener(this);
    }

    public final void onStop() {
        super.onStop();
        this.E.setOnSetImageUriCompleteListener((CropImageView.i) null);
        this.E.setOnCropImageCompleteListener((CropImageView.e) null);
    }
}
