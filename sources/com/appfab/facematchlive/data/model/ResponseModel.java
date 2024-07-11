package com.appfab.facematchlive.data.model;

import com.google.gson.annotations.SerializedName;
import z8.g;

public final class ResponseModel {
    @SerializedName("data")
    private final DataModel data;

    public ResponseModel(DataModel dataModel) {
        g.f(dataModel, "data");
        this.data = dataModel;
    }

    public static /* synthetic */ ResponseModel copy$default(ResponseModel responseModel, DataModel dataModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dataModel = responseModel.data;
        }
        return responseModel.copy(dataModel);
    }

    public final DataModel component1() {
        return this.data;
    }

    public final ResponseModel copy(DataModel dataModel) {
        g.f(dataModel, "data");
        return new ResponseModel(dataModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResponseModel) && g.a(this.data, ((ResponseModel) obj).data);
    }

    public final DataModel getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "ResponseModel(data=" + this.data + ')';
    }
}
