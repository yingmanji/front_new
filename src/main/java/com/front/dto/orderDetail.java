package com.front.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Lin on 2017/9/23.
 */
public class orderDetail {

    // 订单号
    private long orderId;

    // 停车者用户信息
        // 停车者姓名
        private String parkerName;
        // 停车者手机--
        private String parkerPhoneNum;
        // 停车者车牌号
        private String parkerPlateNum;

    // 停车位
        // 停车场名称
        private String parkingName;
        // 停车场地址--
        private String parkingLocation;

    // 车位主人信息
        // 车位主人姓名
        private String userName;
        // 车位主人手机--
        private String phoneNum;

    // 车位号
    private String plateNum;

    // 停车开始时间--
    private String parkingBegin;

    // 停车结束时间--
    private String parkingEnd;

    // 停车总时间
    private String parkingTotalTime;

    // 价格
    private BigDecimal price;

    // 开始预约时间
    private Date createTime;

    private String status;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getParkerName() {
        return parkerName;
    }

    public void setParkerName(String parkerName) {
        this.parkerName = parkerName;
    }

    public String getParkerPhoneNum() {
        return parkerPhoneNum;
    }

    public void setParkerPhoneNum(String parkerPhoneNum) {
        this.parkerPhoneNum = parkerPhoneNum;
    }

    public String getParkerPlateNum() {
        return parkerPlateNum;
    }

    public void setParkerPlateNum(String parkerPlateNum) {
        this.parkerPlateNum = parkerPlateNum;
    }

    public String getParkingName() {
        return parkingName;
    }

    public void setParkingName(String parkingName) {
        this.parkingName = parkingName;
    }

    public String getParkingLocation() {
        return parkingLocation;
    }

    public void setParkingLocation(String parkingLocation) {
        this.parkingLocation = parkingLocation;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    public String getParkingBegin() {
        return parkingBegin;
    }

    public void setParkingBegin(String parkingBegin) {
        this.parkingBegin = parkingBegin;
    }

    public String getParkingEnd() {
        return parkingEnd;
    }

    public void setParkingEnd(String parkingEnd) {
        this.parkingEnd = parkingEnd;
    }

    public String getParkingTotalTime() {
        return parkingTotalTime;
    }

    public void setParkingTotalTime(String parkingTotalTime) {
        this.parkingTotalTime = parkingTotalTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
