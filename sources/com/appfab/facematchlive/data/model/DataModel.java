package com.appfab.facematchlive.data.model;

import com.google.gson.annotations.SerializedName;
import z8.g;

public final class DataModel {
    @SerializedName("distance")
    private final double distance;
    @SerializedName("similarity")
    private final double similarity;

    public DataModel(double d, double d10) {
        this.distance = d;
        this.similarity = d10;
    }

    public static /* synthetic */ DataModel copy$default(DataModel dataModel, double d, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d = dataModel.distance;
        }
        if ((i10 & 2) != 0) {
            d10 = dataModel.similarity;
        }
        return dataModel.copy(d, d10);
    }

    public final double component1() {
        return this.distance;
    }

    public final double component2() {
        return this.similarity;
    }

    public final DataModel copy(double d, double d10) {
        return new DataModel(d, d10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataModel)) {
            return false;
        }
        DataModel dataModel = (DataModel) obj;
        return g.a(Double.valueOf(this.distance), Double.valueOf(dataModel.distance)) && g.a(Double.valueOf(this.similarity), Double.valueOf(dataModel.similarity));
    }

    public final double getDistance() {
        return this.distance;
    }

    public final double getSimilarity() {
        return this.similarity;
    }

    public int hashCode() {
        return Double.hashCode(this.similarity) + (Double.hashCode(this.distance) * 31);
    }

    public String toString() {
        return "DataModel(distance=" + this.distance + ", similarity=" + this.similarity + ')';
    }
}
