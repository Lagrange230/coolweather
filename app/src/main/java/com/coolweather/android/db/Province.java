package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ALOIS on 2017/11/16.
 */

public class Province extends DataSupport {
    private int id;//每个实体类中应该有的字段
    private String provinceName;//记录省份的名字
    private int provinceCode;//记录省份的代号

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
