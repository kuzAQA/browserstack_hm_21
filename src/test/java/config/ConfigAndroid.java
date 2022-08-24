package config;
import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/config.properties")
public interface ConfigAndroid extends Config {
    @Key("userLogin")
    String userLogin();
    @Key("userPassword")
    String userPassword();
    @Key("appURL")
    String appURL();
    @Key("deviceName")
    String deviceName();
    @Key("osVersion")
    String osVersion();
    @Key("browserURL")
    String browserURL();
}