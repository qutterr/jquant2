package jquant2.util.config;

/**
 * Created by zcy on 2017/8/9.20:39:27
 */
public class PropertiesService {
    /**
     * application配置文件
     *
     * @return
     */
    public static PropertiesConfig getApplicationConfig() {
        return PropertiesConfig.getInstance("C:\\2016\\jquant2\\src\\application.properties");
    }
}
