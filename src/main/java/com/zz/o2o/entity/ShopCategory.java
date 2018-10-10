package com.zz.o2o.entity;

import java.util.Date;

public class ShopCategory {
    private Long shopCategoryId;
    private String shopCategotyName;
    private String shopCategotyDesc;
    private String shopCategotyImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    private ShopCategory parent;

    public Long getShopCategoryId() {
        return shopCategoryId;
    }

    public void setShopCategoryId(Long shopCategoryId) {
        this.shopCategoryId = shopCategoryId;
    }

    public String getShopCategotyName() {
        return shopCategotyName;
    }

    public void setShopCategotyName(String shopCategotyName) {
        this.shopCategotyName = shopCategotyName;
    }

    public String getShopCategotyDesc() {
        return shopCategotyDesc;
    }

    public void setShopCategotyDesc(String shopCategotyDesc) {
        this.shopCategotyDesc = shopCategotyDesc;
    }

    public String getShopCategotyImg() {
        return shopCategotyImg;
    }

    public void setShopCategotyImg(String shopCategotyImg) {
        this.shopCategotyImg = shopCategotyImg;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public ShopCategory getParent() {
        return parent;
    }

    public void setParent(ShopCategory parent) {
        this.parent = parent;
    }
}
