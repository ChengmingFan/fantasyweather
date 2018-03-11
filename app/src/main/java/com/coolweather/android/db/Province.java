package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Fan on 2018/3/11.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private  int povinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getPovinceCode() {
        return povinceCode;
    }

    public void setPovinceCode(int povinceCode) {
        this.povinceCode = povinceCode;
    }
}
