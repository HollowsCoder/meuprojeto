package s9;

import android.util.Log;
import androidx.appcompat.widget.x0;
import f9.l;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import z8.g;

public final class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static final d f8847a = new d();

    public final void close() {
    }

    public final void flush() {
    }

    public final void publish(LogRecord logRecord) {
        int i10;
        int min;
        g.f(logRecord, "record");
        CopyOnWriteArraySet<Logger> copyOnWriteArraySet = c.f8845a;
        String loggerName = logRecord.getLoggerName();
        g.e(loggerName, "record.loggerName");
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            i10 = 5;
        } else if (logRecord.getLevel().intValue() == Level.INFO.intValue()) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        String message = logRecord.getMessage();
        g.e(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = c.f8846b.get(loggerName);
        if (str == null) {
            int length = loggerName.length();
            if (23 <= length) {
                length = 23;
            }
            str = loggerName.substring(0, length);
            g.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        if (Log.isLoggable(str, i10)) {
            if (thrown != null) {
                StringBuilder h10 = x0.h(message, "\n");
                h10.append(Log.getStackTraceString(thrown));
                message = h10.toString();
            }
            int length2 = message.length();
            int i11 = 0;
            while (i11 < length2) {
                int g02 = l.g0(message, 10, i11, false, 4);
                if (g02 == -1) {
                    g02 = length2;
                }
                while (true) {
                    min = Math.min(g02, i11 + 4000);
                    String substring = message.substring(i11, min);
                    g.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i10, str, substring);
                    if (min >= g02) {
                        break;
                    }
                    i11 = min;
                }
                i11 = min + 1;
            }
        }
    }
}
