package springbootlearning.springbootlearning.model;

import java.util.Date;

public class TommyBurgeonErrorRecord {

    private int id;
    private java.lang.String orderCode;
    private java.lang.String returnReason;
    private java.lang.String returnCode;
    private java.util.Date createTime;
    private java.lang.String salesType;

    public TommyBurgeonErrorRecord(String orderCode, String returnReason, String returnCode, Date createTime, String salesType) {
        this.orderCode = orderCode;
        this.returnReason = returnReason;
        this.returnCode = returnCode;
        this.createTime = createTime;
        this.salesType = salesType;
    }

    public TommyBurgeonErrorRecord() {
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSalesType() {
        return salesType;
    }

    public void setSalesType(String salesType) {
        this.salesType = salesType;
    }

    @Override
    public String toString() {
        return "TommyBurgeonErrorRecord{" +
                "orderCode='" + orderCode + '\'' +
                ", returnReason='" + returnReason + '\'' +
                ", returnCode='" + returnCode + '\'' +
                ", createTime=" + createTime +
                ", salesType='" + salesType + '\'' +
                '}';
    }
}
