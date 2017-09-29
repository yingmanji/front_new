package com.front.Service.ServiceImpl;

import com.front.Service.ParkingService;
import com.front.dao.ParkingMapper;
import com.front.entity.Parking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class parkingServiceImpl implements ParkingService {

    @Autowired
    private ParkingMapper parkingMapper;

    public long insertParking(Parking parking) {

        parkingMapper.insertParking(parking);
        long admin_parking_id=parking.getParkingId();
        System.out.println("#"+admin_parking_id);
        return admin_parking_id;
    }

}