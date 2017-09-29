package com.front.dto;

import com.front.entity.Parking;

/**
 * Created by 鸿鹄 on 2017/9/23.
 * 停车场的共享标识包装类
 */

public class parkingStatus extends Parking {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "parkingStatus{" +
                "status='" + status + '\'' +
                '}';
    }
}
