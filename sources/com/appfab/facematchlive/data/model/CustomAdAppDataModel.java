package com.appfab.facematchlive.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import z8.g;

public final class CustomAdAppDataModel {
    @SerializedName("app_download")
    private String appDownloadCount;
    @SerializedName("appImages")
    private ArrayList<String> appImages;
    @SerializedName("app_logo")
    private String appLogo;
    @SerializedName("app_name")
    private String appName;
    @SerializedName("app_package_name")
    private String appPackageName;
    @SerializedName("app_provider")
    private String appProvider;
    @SerializedName("app_store_url")
    private String appStoreUrl;

    public CustomAdAppDataModel(String str, String str2, String str3, String str4, String str5, String str6, ArrayList<String> arrayList) {
        g.f(str, "appLogo");
        g.f(str2, "appName");
        g.f(str3, "appProvider");
        g.f(str4, "appDownloadCount");
        g.f(str5, "appStoreUrl");
        g.f(str6, "appPackageName");
        g.f(arrayList, "appImages");
        this.appLogo = str;
        this.appName = str2;
        this.appProvider = str3;
        this.appDownloadCount = str4;
        this.appStoreUrl = str5;
        this.appPackageName = str6;
        this.appImages = arrayList;
    }

    public static /* synthetic */ CustomAdAppDataModel copy$default(CustomAdAppDataModel customAdAppDataModel, String str, String str2, String str3, String str4, String str5, String str6, ArrayList<String> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = customAdAppDataModel.appLogo;
        }
        if ((i10 & 2) != 0) {
            str2 = customAdAppDataModel.appName;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = customAdAppDataModel.appProvider;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = customAdAppDataModel.appDownloadCount;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = customAdAppDataModel.appStoreUrl;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = customAdAppDataModel.appPackageName;
        }
        String str11 = str6;
        if ((i10 & 64) != 0) {
            arrayList = customAdAppDataModel.appImages;
        }
        return customAdAppDataModel.copy(str, str7, str8, str9, str10, str11, arrayList);
    }

    public final String component1() {
        return this.appLogo;
    }

    public final String component2() {
        return this.appName;
    }

    public final String component3() {
        return this.appProvider;
    }

    public final String component4() {
        return this.appDownloadCount;
    }

    public final String component5() {
        return this.appStoreUrl;
    }

    public final String component6() {
        return this.appPackageName;
    }

    public final ArrayList<String> component7() {
        return this.appImages;
    }

    public final CustomAdAppDataModel copy(String str, String str2, String str3, String str4, String str5, String str6, ArrayList<String> arrayList) {
        g.f(str, "appLogo");
        g.f(str2, "appName");
        g.f(str3, "appProvider");
        g.f(str4, "appDownloadCount");
        g.f(str5, "appStoreUrl");
        g.f(str6, "appPackageName");
        ArrayList<String> arrayList2 = arrayList;
        g.f(arrayList2, "appImages");
        return new CustomAdAppDataModel(str, str2, str3, str4, str5, str6, arrayList2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAdAppDataModel)) {
            return false;
        }
        CustomAdAppDataModel customAdAppDataModel = (CustomAdAppDataModel) obj;
        return g.a(this.appLogo, customAdAppDataModel.appLogo) && g.a(this.appName, customAdAppDataModel.appName) && g.a(this.appProvider, customAdAppDataModel.appProvider) && g.a(this.appDownloadCount, customAdAppDataModel.appDownloadCount) && g.a(this.appStoreUrl, customAdAppDataModel.appStoreUrl) && g.a(this.appPackageName, customAdAppDataModel.appPackageName) && g.a(this.appImages, customAdAppDataModel.appImages);
    }

    public final String getAppDownloadCount() {
        return this.appDownloadCount;
    }

    public final ArrayList<String> getAppImages() {
        return this.appImages;
    }

    public final String getAppLogo() {
        return this.appLogo;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAppPackageName() {
        return this.appPackageName;
    }

    public final String getAppProvider() {
        return this.appProvider;
    }

    public final String getAppStoreUrl() {
        return this.appStoreUrl;
    }

    public int hashCode() {
        int hashCode = this.appName.hashCode();
        int hashCode2 = this.appProvider.hashCode();
        int hashCode3 = this.appDownloadCount.hashCode();
        int hashCode4 = this.appStoreUrl.hashCode();
        int hashCode5 = this.appPackageName.hashCode();
        return this.appImages.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.appLogo.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final void setAppDownloadCount(String str) {
        g.f(str, "<set-?>");
        this.appDownloadCount = str;
    }

    public final void setAppImages(ArrayList<String> arrayList) {
        g.f(arrayList, "<set-?>");
        this.appImages = arrayList;
    }

    public final void setAppLogo(String str) {
        g.f(str, "<set-?>");
        this.appLogo = str;
    }

    public final void setAppName(String str) {
        g.f(str, "<set-?>");
        this.appName = str;
    }

    public final void setAppPackageName(String str) {
        g.f(str, "<set-?>");
        this.appPackageName = str;
    }

    public final void setAppProvider(String str) {
        g.f(str, "<set-?>");
        this.appProvider = str;
    }

    public final void setAppStoreUrl(String str) {
        g.f(str, "<set-?>");
        this.appStoreUrl = str;
    }

    public String toString() {
        return "CustomAdAppDataModel(appLogo=" + this.appLogo + ", appName=" + this.appName + ", appProvider=" + this.appProvider + ", appDownloadCount=" + this.appDownloadCount + ", appStoreUrl=" + this.appStoreUrl + ", appPackageName=" + this.appPackageName + ", appImages=" + this.appImages + ')';
    }
}
