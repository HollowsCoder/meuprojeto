package com.appfab.facematchlive.data.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import z8.e;
import z8.g;

@Keep
public final class CurrentConfigModel implements Serializable {
    @SerializedName("currentFreeSearchLimit")
    private Integer currentFreeSearchLimit;
    @SerializedName("currentPremiumSearchLimit")
    private Integer currentPremiumSearchLimit;

    public CurrentConfigModel() {
        this((Integer) null, (Integer) null, 3, (e) null);
    }

    public CurrentConfigModel(Integer num, Integer num2) {
        this.currentPremiumSearchLimit = num;
        this.currentFreeSearchLimit = num2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CurrentConfigModel(Integer num, Integer num2, int i10, e eVar) {
        this((i10 & 1) != 0 ? 0 : num, (i10 & 2) != 0 ? 0 : num2);
    }

    public static /* synthetic */ CurrentConfigModel copy$default(CurrentConfigModel currentConfigModel, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = currentConfigModel.currentPremiumSearchLimit;
        }
        if ((i10 & 2) != 0) {
            num2 = currentConfigModel.currentFreeSearchLimit;
        }
        return currentConfigModel.copy(num, num2);
    }

    public final Integer component1() {
        return this.currentPremiumSearchLimit;
    }

    public final Integer component2() {
        return this.currentFreeSearchLimit;
    }

    public final CurrentConfigModel copy(Integer num, Integer num2) {
        return new CurrentConfigModel(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentConfigModel)) {
            return false;
        }
        CurrentConfigModel currentConfigModel = (CurrentConfigModel) obj;
        return g.a(this.currentPremiumSearchLimit, currentConfigModel.currentPremiumSearchLimit) && g.a(this.currentFreeSearchLimit, currentConfigModel.currentFreeSearchLimit);
    }

    public final Integer getCurrentFreeSearchLimit() {
        return this.currentFreeSearchLimit;
    }

    public final Integer getCurrentPremiumSearchLimit() {
        return this.currentPremiumSearchLimit;
    }

    public int hashCode() {
        Integer num = this.currentPremiumSearchLimit;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.currentFreeSearchLimit;
        if (num2 != null) {
            i10 = num2.hashCode();
        }
        return hashCode + i10;
    }

    public final void setCurrentFreeSearchLimit(Integer num) {
        this.currentFreeSearchLimit = num;
    }

    public final void setCurrentPremiumSearchLimit(Integer num) {
        this.currentPremiumSearchLimit = num;
    }

    public String toString() {
        return "CurrentConfigModel(currentPremiumSearchLimit=" + this.currentPremiumSearchLimit + ", currentFreeSearchLimit=" + this.currentFreeSearchLimit + ')';
    }
}
