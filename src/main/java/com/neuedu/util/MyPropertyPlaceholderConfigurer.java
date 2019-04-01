package com.neuedu.util;

/**
 * Created by guojiacheng on 2019/4/1.
 */
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class MyPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
    @Override
    protected String convertProperty(String propertyName, String propertyValue) {
        if(propertyName.equals("username")||propertyName.equals("password")){
            return DESUTIL.decode(propertyValue);
        }
        return propertyValue;
    }
}
