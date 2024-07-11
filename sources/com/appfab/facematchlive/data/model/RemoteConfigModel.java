package com.appfab.facematchlive.data.model;

import com.google.gson.annotations.SerializedName;
import z8.e;
import z8.g;

public final class RemoteConfigModel {
    @SerializedName("isFreeLock")
    private Boolean isFreeLock;
    @SerializedName("isPremiumLock")
    private Boolean isPremiumLock;
    @SerializedName("maxFreeSearchLimit")
    private Long maxFreeSearchLimit;
    @SerializedName("maxPremiumSearchLimit")
    private Long maxPremiumSearchLimit;

    public RemoteConfigModel() {
        this((Long) null, (Long) null, (Boolean) null, (Boolean) null, 15, (e) null);
    }

    public RemoteConfigModel(Long l, Long l8, Boolean bool, Boolean bool2) {
        this.maxPremiumSearchLimit = l;
        this.maxFreeSearchLimit = l8;
        this.isPremiumLock = bool;
        this.isFreeLock = bool2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RemoteConfigModel(Long l, Long l8, Boolean bool, Boolean bool2, int i10, e eVar) {
        this((i10 & 1) != 0 ? 0L : l, (i10 & 2) != 0 ? 3L : l8, (i10 & 4) != 0 ? Boolean.FALSE : bool, (i10 & 8) != 0 ? Boolean.FALSE : bool2);
    }

    public static /* synthetic */ RemoteConfigModel copy$default(RemoteConfigModel remoteConfigModel, Long l, Long l8, Boolean bool, Boolean bool2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l = remoteConfigModel.maxPremiumSearchLimit;
        }
        if ((i10 & 2) != 0) {
            l8 = remoteConfigModel.maxFreeSearchLimit;
        }
        if ((i10 & 4) != 0) {
            bool = remoteConfigModel.isPremiumLock;
        }
        if ((i10 & 8) != 0) {
            bool2 = remoteConfigModel.isFreeLock;
        }
        return remoteConfigModel.copy(l, l8, bool, bool2);
    }

    public final Long component1() {
        return this.maxPremiumSearchLimit;
    }

    public final Long component2() {
        return this.maxFreeSearchLimit;
    }

    public final Boolean component3() {
        return this.isPremiumLock;
    }

    public final Boolean component4() {
        return this.isFreeLock;
    }

    public final RemoteConfigModel copy(Long l, Long l8, Boolean bool, Boolean bool2) {
        return new RemoteConfigModel(l, l8, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteConfigModel)) {
            return false;
        }
        RemoteConfigModel remoteConfigModel = (RemoteConfigModel) obj;
        return g.a(this.maxPremiumSearchLimit, remoteConfigModel.maxPremiumSearchLimit) && g.a(this.maxFreeSearchLimit, remoteConfigModel.maxFreeSearchLimit) && g.a(this.isPremiumLock, remoteConfigModel.isPremiumLock) && g.a(this.isFreeLock, remoteConfigModel.isFreeLock);
    }

    public final Long getMaxFreeSearchLimit() {
        return this.maxFreeSearchLimit;
    }

    public final Long getMaxPremiumSearchLimit() {
        return this.maxPremiumSearchLimit;
    }

    public int hashCode() {
        Long l = this.maxPremiumSearchLimit;
        int i10 = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l8 = this.maxFreeSearchLimit;
        int hashCode2 = (hashCode + (l8 == null ? 0 : l8.hashCode())) * 31;
        Boolean bool = this.isPremiumLock;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isFreeLock;
        if (bool2 != null) {
            i10 = bool2.hashCode();
        }
        return hashCode3 + i10;
    }

    public final Boolean isFreeLock() {
        return this.isFreeLock;
    }

    public final Boolean isPremiumLock() {
        return this.isPremiumLock;
    }

    public final void setFreeLock(Boolean bool) {
        this.isFreeLock = bool;
    }

    public final void setMaxFreeSearchLimit(Long l) {
        this.maxFreeSearchLimit = l;
    }

    public final void setMaxPremiumSearchLimit(Long l) {
        this.maxPremiumSearchLimit = l;
    }

    public final void setPremiumLock(Boolean bool) {
        this.isPremiumLock = bool;
    }

    public String toString() {
        return "RemoteConfigModel(maxPremiumSearchLimit=" + this.maxPremiumSearchLimit + ", maxFreeSearchLimit=" + this.maxFreeSearchLimit + ", isPremiumLock=" + this.isPremiumLock + ", isFreeLock=" + this.isFreeLock + ')';
    }
}
