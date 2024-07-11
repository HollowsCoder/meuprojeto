package androidx.media;

import b0.d;
import java.util.Arrays;

class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public int f1431a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1432b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f1433c = 0;
    public int d = -1;

    public final boolean equals(Object obj) {
        int i10;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f1432b != audioAttributesImplBase.f1432b) {
            return false;
        }
        int i11 = this.f1433c;
        int i12 = audioAttributesImplBase.f1433c;
        int i13 = audioAttributesImplBase.d;
        if (i13 == -1) {
            int i14 = audioAttributesImplBase.f1431a;
            int i15 = AudioAttributesCompat.f1427b;
            if ((i12 & 1) != 1) {
                i10 = 4;
                if ((i12 & 4) != 4) {
                    switch (i14) {
                        case 2:
                            i10 = 0;
                            break;
                        case 3:
                            i10 = 8;
                            break;
                        case 4:
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i10 = 5;
                            break;
                        case 6:
                            i10 = 2;
                            break;
                        case 11:
                            i10 = 10;
                            break;
                        case 13:
                            i10 = 1;
                            break;
                        default:
                            i10 = 3;
                            break;
                    }
                } else {
                    i10 = 6;
                }
            } else {
                i10 = 7;
            }
        } else {
            i10 = i13;
        }
        if (i10 == 6) {
            i12 |= 4;
        } else if (i10 == 7) {
            i12 |= 1;
        }
        if (i11 == (i12 & 273) && this.f1431a == audioAttributesImplBase.f1431a && this.d == i13) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1432b), Integer.valueOf(this.f1433c), Integer.valueOf(this.f1431a), Integer.valueOf(this.d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            sb.append(" stream=");
            sb.append(this.d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i10 = this.f1431a;
        int i11 = AudioAttributesCompat.f1427b;
        switch (i10) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
            default:
                str = d.c("unknown usage ", i10);
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f1432b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f1433c).toUpperCase());
        return sb.toString();
    }
}
