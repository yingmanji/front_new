package com.front.web;

import com.front.Service.AdminService;
import com.front.Service.ParkingService;
import com.front.entity.Admin;
import com.front.entity.Parking;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@Api(value = "parking", description = "停车场")
@RequestMapping(value = "/parking")
@RestController
public class parkingController {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ParkingService parkingService;

    @Autowired
    private AdminService adminService;

    //todo 添加停车场和停车场管理员
    @RequestMapping(value = "/setParkingAndAdmin",method = RequestMethod.POST)
    public String setParkingAndAdmin(/*@RequestParam("longitude") String longitude,
                                     @RequestParam("latitude") String latitude,
                                     @RequestParam("parkingName") String parkingName,
                                     @RequestParam("parkingAddress") String parkingAddress,
                                     @RequestParam("parkingMark") String parkingMark,
                                     @RequestParam("adminName") String adminName,
                                     @RequestParam("adminPassword1") String adminPassword1,
                                     @RequestParam("adminPassword2") String adminPassword2*/
                                     Parking parking,Admin admin

    ) throws Exception {

        System.out.println("setParkingAndAdmin----------");
        //System.out.println(longitude+"\n"+latitude+"\n"+parkingName+"\n"+parkingAddress+"\n"+parkingMark+"\n"+adminName+"\n"+adminPassword1+"\n"+adminPassword2);
        admin.setParkingId(parkingService.insertParking(parking));
        adminService.createAdmin(admin.getAdminName(),admin.getAdminPassword(),admin.getParkingId());
        return "false";
    }

}