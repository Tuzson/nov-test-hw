package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleAppTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void itShouldBeASportCar(){
        Car sportcar = new SportCar();
        sportcar.maxSpeed = 280;
        VehicleApp test = new VehicleApp();
       String s = test.getTargetCustomer(sportcar);
        if (s.equals("Sportautó")){
            assertTrue(s,true);
        }
        else {
            Assert.fail("Nem jó autót ajánl");
        }
    }
    @Test
    public void itShouldBeAVan(){
        Car van = new Van();
        van.maxSpeed = 130;
        van.bootCapacity = 1500;
        VehicleApp test = new VehicleApp();
        String s = test.getTargetCustomer(van);
        if (s.equals("Cégeknek")){
            assertTrue(s,true);
        }
        else {
            Assert.fail("Nem jó autót ajánl");
        }
    }
    @Test
    public void itShouldBeASuv(){
        Car suv = new SUV();
        suv.maxSpeed = 130;
        suv.bootCapacity = 1500;
        suv.nrOfSeats = 6;
        VehicleApp test = new VehicleApp();
        String s = test.getTargetCustomer(suv);
        if (s.equals("Családos embereknek ajánlott")){
            assertTrue(s,true);
        }
        else {
            Assert.fail("Nem jó autót ajánl");
        }
    }
}