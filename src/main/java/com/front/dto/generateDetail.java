package com.front.dto;

import com.front.entity.Order;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by Lin on 2017/9/23.
 */
public class generateDetail {

    // 共享车位号
    private long generateId;

    // 通过车位id 获取停车位信息和车位主人信息
    // 车位信息
        // 停车场名字
        private String parkingName;
        // 停车场地址
        private String parkingLocation;

    //todo 新增：车位号
    private String parkingSpace;

    //todo 新增：plId
    private long parkinglotId;

    //车位主人信息
        // 用户名
        private String userName;
        // 用户手机号码
        private String phoneNum;
        // 车牌号
        private String plateNum;

    // 创建时间信息
    private Date  shareBegin;
    private Date shareEnd;

    // 订单价格/时
    private BigDecimal price;

    // 车位当前状态
    private String status;

    private List<Order> orderList;

    public long getGenerateId() {
        return generateId;
    }

    public void setGenerateId(long generateId) {
        this.generateId = generateId;
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

  /*  public String getParkerUserName() {
        return parkerUserName;
    }

    public void setParkerUserName(String parkerUserName) {
        this.parkerUserName = parkerUserName;
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
*/
    public String getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(String parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public Date getShareBegin() {
        return shareBegin;
    }

    public void setShareBegin(Date shareBegin) {
        this.shareBegin = shareBegin;
    }

    public Date getShareEnd() {
        return shareEnd;
    }

    public void setShareEnd(Date shareEnd) {
        this.shareEnd = shareEnd;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public long getParkinglotId() {
        return parkinglotId;
    }

    public void setParkinglotId(long parkinglotId) {
        this.parkinglotId = parkinglotId;
    }

}
