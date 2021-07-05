package com.mashibing.dp;

import java.io.IOException;
import java.util.Properties;

public class PropertyMgr {
    //定义个Propety类
    static Properties props = new Properties();
    static {
        //自动读取config文件放到props里
        try {
            props.load(PropertyMgr.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println(PropertyMgr.get("systemout"));
    }
    //取得property文件中key对应的内容
    //取得值可以是数值，字符串等所以是Object
    public static Object get(String key) {
        if(props == null) return null;
        return props.get(key);
    }
}
