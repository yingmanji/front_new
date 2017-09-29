package com.front.dao;

import com.front.entity.ParkingLot;

public interface ParkingLotMapper {
    int deleteByPrimaryKey(Long parkinglotId);

    int insert(ParkingLot record);

    int insertSelective(ParkingLot record);

    ParkingLot selectByPrimaryKey(Long parkinglotId);

    int updateByPrimaryKeySelective(ParkingLot record);

    int updateByPrimaryKey(ParkingLot record);
}