package com.appfab.facematchlive.data.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import z8.e;
import z8.g;

public final class GalleryModel implements Serializable {
    @SerializedName("fileName")
    private final String fileName;
    @SerializedName("image")
    private String image;
    @SerializedName("isBase64")
    private boolean isBase64;
    @SerializedName("position")
    private int position;
    @SerializedName("selected")
    private boolean selected;

    public GalleryModel(String str, String str2, int i10, boolean z, boolean z10) {
        g.f(str, "image");
        g.f(str2, "fileName");
        this.image = str;
        this.fileName = str2;
        this.position = i10;
        this.selected = z;
        this.isBase64 = z10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GalleryModel(String str, String str2, int i10, boolean z, boolean z10, int i11, e eVar) {
        this(str, str2, i10, z, (i11 & 16) != 0 ? false : z10);
    }

    public static /* synthetic */ GalleryModel copy$default(GalleryModel galleryModel, String str, String str2, int i10, boolean z, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = galleryModel.image;
        }
        if ((i11 & 2) != 0) {
            str2 = galleryModel.fileName;
        }
        String str3 = str2;
        if ((i11 & 4) != 0) {
            i10 = galleryModel.position;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            z = galleryModel.selected;
        }
        boolean z11 = z;
        if ((i11 & 16) != 0) {
            z10 = galleryModel.isBase64;
        }
        return galleryModel.copy(str, str3, i12, z11, z10);
    }

    public final String component1() {
        return this.image;
    }

    public final String component2() {
        return this.fileName;
    }

    public final int component3() {
        return this.position;
    }

    public final boolean component4() {
        return this.selected;
    }

    public final boolean component5() {
        return this.isBase64;
    }

    public final GalleryModel copy(String str, String str2, int i10, boolean z, boolean z10) {
        g.f(str, "image");
        g.f(str2, "fileName");
        return new GalleryModel(str, str2, i10, z, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryModel)) {
            return false;
        }
        GalleryModel galleryModel = (GalleryModel) obj;
        return g.a(this.image, galleryModel.image) && g.a(this.fileName, galleryModel.fileName) && this.position == galleryModel.position && this.selected == galleryModel.selected && this.isBase64 == galleryModel.isBase64;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getImage() {
        return this.image;
    }

    public final int getPosition() {
        return this.position;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public int hashCode() {
        int hashCode = (Integer.hashCode(this.position) + ((this.fileName.hashCode() + (this.image.hashCode() * 31)) * 31)) * 31;
        boolean z = this.selected;
        boolean z10 = true;
        if (z) {
            z = true;
        }
        int i10 = (hashCode + (z ? 1 : 0)) * 31;
        boolean z11 = this.isBase64;
        if (!z11) {
            z10 = z11;
        }
        return i10 + (z10 ? 1 : 0);
    }

    public final boolean isBase64() {
        return this.isBase64;
    }

    public final void setBase64(boolean z) {
        this.isBase64 = z;
    }

    public final void setImage(String str) {
        g.f(str, "<set-?>");
        this.image = str;
    }

    public final void setPosition(int i10) {
        this.position = i10;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public String toString() {
        return "GalleryModel(image=" + this.image + ", fileName=" + this.fileName + ", position=" + this.position + ", selected=" + this.selected + ", isBase64=" + this.isBase64 + ')';
    }
}
