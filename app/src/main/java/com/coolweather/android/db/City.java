package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Yagami on 2018/5/27.
 */

public class City extends DataSupport{
    private int id;

    private String cityName;

    private int cityCode;

    private int provinceId; //当前市所属省的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
