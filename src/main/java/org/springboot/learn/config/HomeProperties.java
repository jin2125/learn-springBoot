package org.springboot.learn.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 家乡属性
 */
@Component
public class HomeProperties {
    /**
     * 省份
     */
    @Value("${home.province}")
    private String province;
    /**
     * 城市
     */
    @Value("${home.city}")
    private String city;
    /**
     */
    @Value("${home.desc}")
    private String desc;

    @Override
    public String toString() {
        return "HomeProperties (" + province + '\'' +
                "province=" + city + '\'' +
                ", desc='" + desc + '\'' +
                ')';
    }
}
