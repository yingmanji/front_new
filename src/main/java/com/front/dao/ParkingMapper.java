package com.front.dao;

import com.front.entity.Parking;
import org.apache.ibatis.annotations.Param;

public interface ParkingMapper {
    int deleteByPrimaryKey(Long parkingId);

    int insert(Parking record);

    int insertSelective(Parking record);

    Parking selectByPrimaryKey(Long parkingId);

    int updateByPrimaryKeySelective(Parking record);

    int updateByPrimaryKey(Parking record);

    void insertParking(@Param("parking") Parking parking);
}