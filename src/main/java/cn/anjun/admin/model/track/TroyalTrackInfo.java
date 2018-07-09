package cn.anjun.admin.model.track;

public class TroyalTrackInfo {
    /** 标识*/
    private byte[] event;

    /** 标识地址
*/
    private byte[] eventLocation;

    /** 状态*/
    private byte[] status;

    /** 状态详情*/
    private byte[] statusDe;

    public byte[] getEvent() {
        return event;
    }

    public void setEvent(byte[] event) {
        this.event = event;
    }

    public byte[] getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(byte[] eventLocation) {
        this.eventLocation = eventLocation;
    }

    public byte[] getStatus() {
        return status;
    }

    public void setStatus(byte[] status) {
        this.status = status;
    }

    public byte[] getStatusDe() {
        return statusDe;
    }

    public void setStatusDe(byte[] statusDe) {
        this.statusDe = statusDe;
    }
}