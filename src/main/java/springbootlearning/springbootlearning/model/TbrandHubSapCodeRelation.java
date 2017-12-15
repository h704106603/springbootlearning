package springbootlearning.springbootlearning.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

public class TbrandHubSapCodeRelation implements Serializable{

    private int id ;
    private java.lang.String hubCode;
    private java.lang.String sapCode;
    private java.lang.String contactCode;
    private java.util.Date createTime;

    public TbrandHubSapCodeRelation() {
    }

    public TbrandHubSapCodeRelation(String hubCode, String sapCode, String contactCode, Date createTime) {
        this.hubCode = hubCode;
        this.sapCode = sapCode;
        this.contactCode = contactCode;
        this.createTime = createTime;
    }

    public String getHubCode() {
        return hubCode;
    }

    public void setHubCode(String hubCode) {
        this.hubCode = hubCode;
    }

    public String getSapCode() {
        return sapCode;
    }

    public void setSapCode(String sapCode) {
        this.sapCode = sapCode;
    }

    public String getContactCode() {
        return contactCode;
    }

    public void setContactCode(String contactCode) {
        this.contactCode = contactCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "TbrandHubSapCodeRelation{" +
                "hubCode='" + hubCode + '\'' +
                ", sapCode='" + sapCode + '\'' +
                ", contactCode='" + contactCode + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
