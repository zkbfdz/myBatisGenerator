package cn.anjun.admin.model.track;

public class TroyalTrackOrder {
    /** 序号*/
    private Integer id;

    /** 单号*/
    private byte[] oddNumbers;

    /** 地点*/
    private byte[] address;

    /** 状态信息
*/
    private byte[] statusInformation;

    /** 日期*/
    private byte[] datas;

    /** 时间*/
    private byte[] times;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getOddNumbers() {
        return oddNumbers;
    }

    public void setOddNumbers(byte[] oddNumbers) {
        this.oddNumbers = oddNumbers;
    }

    public byte[] getAddress() {
        return address;
    }

    public void setAddress(byte[] address) {
        this.address = address;
    }

    public byte[] getStatusInformation() {
        return statusInformation;
    }

    public void setStatusInformation(byte[] statusInformation) {
        this.statusInformation = statusInformation;
    }

    public byte[] getDatas() {
        return datas;
    }

    public void setDatas(byte[] datas) {
        this.datas = datas;
    }

    public byte[] getTimes() {
        return times;
    }

    public void setTimes(byte[] times) {
        this.times = times;
    }
}