package com.example.backend.main.util;

public class ConstantUtil {

    private ConstantUtil() {
    }



    /**
     * resource type：PNG
     */
    public final static String RESOURCE_TYPE_PNG = "png";

    /**
     * resource type：JPG
     */
    public final static String RESOURCE_TYPE_JPG = "jpg";



    /**
     * http require success，200
     */
    public static final int HTTP_SUCCESS_CODE = 200;

    //依次类推

    /**
     * JWT key
     */
    public final static String JWT_SECRET = "A0B1C2D3E4F5G6H7I8J9KALBMCNDOEPFQ0R1S2T3U4V5W6X7Y8Z9";

    /**
     * JWT expires
     */
    public final static int JWT_EXPIRE_SECOND = 7 * 24 * 3600;

    /**
     * log header for ResourceController
     */
    public final static String LOGGER_CONTROLLER_RESOURCE="ResourceController";

    /**
     *log header for LoginController
     */
    public final static String LOGGER_CONTROLLER_LOGIN="LoginController";

    /**
     * log header for HomeController
     */
    public final static String LOGGER_CONTROLLER_HOME="HomeController";

}
