package com.squareup.picasso;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class d0 extends Handler {
    public d0(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        sendMessageDelayed(obtainMessage(), 1000);
    }
}
