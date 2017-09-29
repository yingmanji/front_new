package com.front.dto;

import com.front.entity.Order;

/**
 * Created by 鸿鹄 on 2017/9/22.
 */
public class newOrderListByPKID extends Order {
    private String plateNum;
    private String parkingName;

    public String getParkingName() {
        return parkingName;
    }

    public void setParkingName(String parkingName) {
        this.parkingName = parkingName;
    }

    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }
    @Override
    public String toString() {
        return "newOrderListByPKID{" +
                "plateNum='" + plateNum + '\'' +
                '}';
    }
}
