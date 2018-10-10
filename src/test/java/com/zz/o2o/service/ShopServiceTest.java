package com.zz.o2o.service;

import com.zz.o2o.BaseTest;
import com.zz.o2o.dto.ShopExecution;
import com.zz.o2o.entity.Area;
import com.zz.o2o.entity.PersonInfo;
import com.zz.o2o.entity.Shop;
import com.zz.o2o.entity.ShopCategory;
import com.zz.o2o.enums.ShopStateEnum;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import static org.junit.Assert.assertEquals;

public class ShopServiceTest extends BaseTest {
    @Autowired
    private ShopService shopService;

    @Test
    public void testAddShop(){
        Shop shop = new Shop();
        PersonInfo owner = new PersonInfo();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();

        owner.setUserId((1L));
        area.setAreaId(2);
        shopCategory.setShopCategoryId(1L);
        shop.setOwner(owner);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setShopName("测试的店铺1");
        shop.setShopDesc("test1");
        shop.setShopAddr("test1");
        shop.setPhone("test1");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(ShopStateEnum.CHECK.getState());
        shop.setAdvice("审核中");

        File file = new File("/Users/zhangzt/Desktop/sousuo.jpg");
        DiskFileItem fileItem = new DiskFileItem("file","image/jpg",true,file.getName(),(int)file.length(),file.getParentFile());
        try {
            fileItem.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        CommonsMultipartFile shopImg = new CommonsMultipartFile(fileItem);


        ShopExecution se = shopService.addShop(shop,shopImg);
        assertEquals(ShopStateEnum.CHECK.getState(),se.getState());
    }
}
