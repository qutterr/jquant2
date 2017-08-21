package jquant2.util.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

/**
 * Created by zcy on 2017/8/9.20:38:56
 */
public class PropertiesConfig {
    // 配置文件的map key:propertiesName value:PropertiesUtil对象
    private static HashMap propertiesMap = new HashMap();

    // 属性文件
    private Properties properties;

    private PropertiesConfig() {

    }

    public synchronized static PropertiesConfig getInstance(String propertiesName) {

        PropertiesConfig configUtil = (PropertiesConfig) propertiesMap.get(propertiesName);

        if (configUtil == null) {
            configUtil = new PropertiesConfig();
            configUtil.analysisXml(propertiesName);
            propertiesMap.put(propertiesName, configUtil);
        }

        return configUtil;
    }

    private void analysisXml(String propertiesName) {
        InputStream ins = null;
        try {
            ins = new FileInputStream(propertiesName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        properties = new Properties();
        try {
            properties.load(ins);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
