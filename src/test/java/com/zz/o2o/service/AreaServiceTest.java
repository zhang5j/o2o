package com.zz.o2o.service;

import com.zz.o2o.BaseTest;
import com.zz.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.*;

import java.util.List;

public class AreaServiceTest extends BaseTest {
    @Autowired
    private AreaService areaService;
    @Test
    public void testGetAreaList() {
        List<Area>areaList = areaService.getAreaList();
        assertEquals("西苑",areaList.get(0).getAreaName());

    };


}
