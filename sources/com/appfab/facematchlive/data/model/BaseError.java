package com.appfab.facematchlive.data.model;

import com.google.gson.annotations.SerializedName;
import z8.e;
import z8.g;

public final class BaseError {
    @SerializedName("code")
    private final Integer code;
    @SerializedName("message")
    private final String message;
    @SerializedName("status")
    private final String status;

    public BaseError() {
        this((String) null, (Integer) null, (String) null, 7, (e) null);
    }

    public BaseError(String str, Integer num, String str2) {
        this.status = str;
        this.code = num;
        this.message = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseError(String str, Integer num, String str2, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : str2);
    }

    public static /* synthetic */ BaseError copy$default(BaseError baseError, String str, Integer num, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = baseError.status;
        }
        if ((i10 & 2) != 0) {
            num = baseError.code;
        }
        if ((i10 & 4) != 0) {
            str2 = baseError.message;
        }
        return baseError.copy(str, num, str2);
    }

    public final String component1() {
        return this.status;
    }

    public final Integer component2() {
        return this.code;
    }

    public final String component3() {
        return this.message;
    }

    public final BaseError copy(String str, Integer num, String str2) {
        return new BaseError(str, num, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseError)) {
            return false;
        }
        BaseError baseError = (BaseError) obj;
        return g.a(this.status, baseError.status) && g.a(this.code, baseError.code) && g.a(this.message, baseError.message);
    }

    public final Integer getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.status;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.code;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.message;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "BaseError(status=" + this.status + ", code=" + this.code + ", message=" + this.message + ')';
    }
}
