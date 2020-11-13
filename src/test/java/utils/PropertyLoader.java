package test.java.utils;

import javax.xml.namespace.QName;
import java.util.ResourceBundle;

public class PropertyLoader {
    private static ResourceBundle RES = ResourceBundle.getBundle("config");
    private static ResourceBundle RESSECURED = ResourceBundle.getBundle("config");

    public static String loadProperty(String name) {
        return RES.getString(name);
    }

    public static String loadSecuredProp(String name) {
        return RESSECURED.getString(name);
    }
}
