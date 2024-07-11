package com.appfab.facematchlive.data;

import aa.l;
import aa.o;
import aa.q;
import com.appfab.facematchlive.data.model.ResponseModel;
import i9.u;
import q8.d;
import y9.b0;

public interface ApiService {

    public static final class DefaultImpls {
        public static /* synthetic */ Object share$default(ApiService apiService, u.c cVar, u.c cVar2, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    cVar = null;
                }
                if ((i10 & 2) != 0) {
                    cVar2 = null;
                }
                return apiService.share(cVar, cVar2, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: share");
        }
    }

    @o("compare")
    @l
    Object share(@q u.c cVar, @q u.c cVar2, d<? super b0<ResponseModel>> dVar);
}
