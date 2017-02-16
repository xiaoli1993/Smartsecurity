package com.nuowei.smartsecurity;


public class Constants {
    /**
     * 成功
     */
    public static final int HTTP_SUCCEED = 1;
    /**
     * 失败
     */
    public static final int HTTP_FAILURE = 2;

    // TODO-----------------------各大数据表-------------------------
    // 用户表
    public static final String TABLE_USER = "user";
    // PL
    public static final String TABLE_PL = "PL";
    // 默认密码
    public static final String passwrod = "8888";
    // 默认密码
//    public static final int passwrods = Json.mgetSN();
    // 透传产品ID
    public static String PIPE_PRODUCTID = "e0da08c9d87148b5a092801bf456b4ed";
    // 智能插座WS1SK
    public static String Socket_PRODUCTID = "934fa144789a4ed4992b08234063f86f";
    // 计量插座
    public static String Metering_Socket_PRODUCTID = "d8a138e506d04b8ba59e2f6511a9070c";
    //  网关id
    public static String Zigbee_PRODUCTID = "58529141178445228e756abd1341ae1c";
    //  空气质量检测
    public static String AIR_PRODUCTID = "160edcafc3a80200160edcafc3a80201";
    //  红外遥控器
    public static String REMOTE_PRODUCTID = "160edcb03fc9ba00160edcb03fc9ba01";

    public static String APP_ID = "2e07d2add1530400";
    public static String WEIXIN_APP_ID = "wx701599ddc5c05fed";

    // ------------启动监听
    public static final String PACKAGE_NAME = MyApp.getApp().getPackageName();
    public static final String BROADCAST_ON_START = PACKAGE_NAME + ".onStart"; //
    public static final String BROADCAST_ON_LOGIN = PACKAGE_NAME + ".xlinkonLogin";

    public static final String BROADCAST_CLOUD_DISCONNECT = PACKAGE_NAME + ".clouddisconnect";
    public static final String BROADCAST_LOCAL_DISCONNECT = PACKAGE_NAME + ".localdisconnect";
    public static final String BROADCAST_RECVPIPE = PACKAGE_NAME + ".recv-pipe";
    public static final String BROADCAST_RECVPIPE_SYNC = PACKAGE_NAME + ".recv-pipe-sync";
    public static final String BROADCAST_DEVICE_CHANGED = PACKAGE_NAME + ".device-changed";

    public static final String BROADCAST_DEVICE_SYNC = PACKAGE_NAME + ".device-sync";
    public static final String BROADCAST_EXIT = PACKAGE_NAME + ".exit";
    public static final String BROADCAST_TIMER_UPDATE = PACKAGE_NAME + "timer-update";
    public static final String BROADCAST_SOCKET_STATUS = PACKAGE_NAME + "socket-status";
    public static final String BROADCAST_CONNENCT_SUCCESS = PACKAGE_NAME + ".connenctsuccess";
    public static final String BROADCAST_CONNENCT_FAIL = PACKAGE_NAME + ".connenctfail";
    public static final String BROADCAST_SEND_OVERTIME = PACKAGE_NAME + ".sendovertime";
    public static final String BROADCAST_SEND_SUCCESS = PACKAGE_NAME + ".sendsuccess";

    public static final String BROADCAST_NUMBER = PACKAGE_NAME + ".number";
    public static final String BROADCAST_UPDEVICE = PACKAGE_NAME + ".updevice";
    // 修改主题
    public static final String BROADCAST_THEME = PACKAGE_NAME + ".theme";

    public static final String BROADCAST_ALARM = PACKAGE_NAME + ".isalarmactivity";

    // 数据包超时时间
    public static final int TIMEOUT = 10;// 设置请求超时时间

    public static final String DATA = "data";
    // public static final String DEVICE = "device";

    public static final String ures_email = "email";
    public static final String ures_phone = "phone";
    public static final String YEJIAN = "yejian";

    public static final String DEVICE_Type = "device-type";
    public static final String DEVICE_MAC = "device-mac";
    public static final String VDEVICE_NANE = "vdevice-name";
    public static final String RC_OBJECTID = "rc-objectid";
    public static final String Air_Type = "air-type";
    public static final String Air_Tempc = "air-tempc";
    public static final String Air_Data = "air-data";
    public static final String Gateway_Mac = "gateway-mac";
    public static final String DEVICE_Name = "device-name";
    public static final String DEVICE_Switch = "device-switch";
    public static final String DEVICE_UsbSwitch = "device-usbswitch";
    public static final String Plug_Power = "plug-power";
    public static final String Plug_Usbpower = "plug-usbpower";
    public static final String STATUS = "status";
    public static final String TYPE = "type";
    public static final String KEY = "key";
    public static final String DEVICE_SOFTWAREVER = "device-softwareVer";
    public static final String CHOICE = "Choice";
    public static final String TCHOICE = "TChoice";
    public static final String IS_LAGUGE = "islaguage";

    public static final String T_CKVALID_UP = "t_ckvalid_up";
    public static final String T_CKVALID_LOW = "t_ckvalid_low";
    public static final String H_CKVALID_UP = "h_ckvalid_up";
    public static final String H_CKVALID_LOW = "h_ckvalid_low";
    public static final String T_CKUP = "t_ckup";
    public static final String T_CKLOW = "t_cklow";
    public static final String H_CKUP = "h_ckup";
    public static final String H_CKLOW = "h_cklow";

    public static final String SAVE_PRODUCTID = "pid";
    public static final String SAVE_ACCESS_ID = "access_id";
    public static final String SAVE_ACCESS_KEY = "access_key";
    public static final String SAVE_appId = "appId";
    public static final String SAVE_authKey = "authKey";
    public static final String IS_INIT = "isinit";
    public static final int TIMER_OFF = 0;
    public static final int TIMER_ON = 1;
    public static final int TIMER_BUFF_SIZE = 6;
    public static final int TIMER_MAX = 19;

    public static final String Scene_sceneID = "scene-sceneID";
    public static final String Scene_Listtext = "scene-Listtext";
    public static final String Scene_Load = "scene-Load";
    public static final String Scene_Hour = "scene-Hour";
    public static final String Scene_Min = "scene-Min";
    public static final String Scene_Wk = "scene-Wk";
    public static final String Scene_countTime = "scene-countTime";
    public static final String Scene_TimeEnable = "scene-TimeEnable";
    public static final String NUMBER = "number";
    // 用户信息数据库 ID
    public static String User_CID = "10241";
    // 获取设备数据库 ID
    public static String GetModule_CID = "20031";
    // 手机出行日记数据库 ID
    public static String WIFI_CID = "40011";
    // 手机出行日记数据库 ID
    public static String SMARTSCENE = "smartscene";
    public static String ACTION_NAME = "isdevicesatr";
    public static String SHARE_MESSAGING = "sharemessaging";
    // 更新名字广播
    public static String CHANGE_NAME = "changgename";
    //
    public static final String USER_NAME = "username";

    // 头像
    public static final String Head_Portrait = "headportrait.jpg";

    // smsSDK
    public static String SMSSDK_Key = "b2541bc58398";
    public static String SMSSDK_Secret = "008d54af8125be3b4b8840ef3f174204";
    public static String Metering_Socket = "MeteringSocket";

    public static final String BROADCAST_DATAPOINT_RECV = PACKAGE_NAME + ".recv_datapoint";


    // 设备的设备类型TYPE
    public static class DEVICE_TYPE {
        // ZigBee设备
        public static final int DEVICE_ZIGBEE_RGB = 1;                           //ZIGBEE RGB灯
        public static final int DEVICE_ZIGBEE_Doors = 17;                        //ZIGBEE 门磁
        public static final int DEVICE_ZIGBEE_Water = 18;                        //ZIGBEE 水浸
        public static final int DEVICE_ZIGBEE_PIR = 19;                          //ZIGBEE 红外
        public static final int DEVICE_ZIGBEE_Smoke = 20;                        //ZIGBEE 烟感
        public static final int DEVICE_ZIGBEE_Temperature = 21;                  //ZIGBEE 温湿度
        public static final int DEVICE_ZIGBEE_Gas = 22;                          //ZIGBEE 气感
        public static final int DEVICE_ZIGBEE_CO = 24;                           //ZIGBEE 一氧化碳
        public static final int DEVICE_ZIGBEE_Sos = 49;                          //ZIGBEE SOS报警器
        public static final int DEVICE_ZIGBEE_SW = 50;                           //ZIGBEE 遥控器
        public static final int DEVICE_ZIGBEE_Plugin = 67;                       //ZIGBEE 智能插座
        public static final int DEVICE_ZIGBEE_Metering_Plugin = 68;              //ZIGBEE 计量插座
        // WiFi设备
        public static final int DEVICE_WIFI_RC = 100;                            //WIFI   红外遥控转发器
        public static final int DEVICE_WIFI_Gateway = 769;                       //WIFI   智能网关
        public static final int DEVICE_WIFI_Plugin = 1041;                       //WIFI   智能插座
        public static final int DEVICE_WIFI_Metering_Plugin = 1042;              //WIFI   计量插座
        public static final int DEVICE_WIFI_AIR = 1043;                          //WIFI   空气质量检测
        public static final int DEVICE_WIFI_IPC = 2049;                          //WIFI   摄像头
        // 虚拟设备类型
        public static final int VDEVICE_STB = 1;                                 //有线电视机顶盒(IPTV机顶盒,卫星电视)
        public static final int VDEVICE_TV = 2;                                  //电视机
        public static final int VDEVICE_DVD = 3;                                 //DVD播放机
        public static final int VDEVICE_PROJECTOR = 5;                           //投影仪
        public static final int VDEVICE_FAN = 6;                                 //风扇
        public static final int VDEVICE_AIR = 7;                                 //空调
        public static final int VDEVICE_LIGHT = 8;                               //智能灯泡
        public static final int VDEVICE_BOX = 10;                                //互联网机顶盒
        public static final int VDEVICE_SWEEPER = 12;                            //扫地机器人
        public static final int VDEVICE_AUDIO = 13;                              //音响
        public static final int VDEVICE_CAMERA = 14;                             //相机
        public static final int VDEVICE_PURIFIER = 15;                           //空气净化器
        public static final int VDEVICE_CUSTOM = 99;                             //自定义设备

    }

    //Json CID指令集
    public static class JOSN_CID {
        public static final int COMMAND_SEND = 30011;                               //CID   控制指令
        public static final int COMMAND_SEND_BACK = 30012;                          //CID   返回控制指令
        public static final int COMMAND_GET = 30021;                                //CID   获取数据指令
        public static final int COMMAND_GET_BACK = 30022;                           //CID   返回数据指令
    }


    // handle message
    public static final int KEYBOARD_SHOW_FILTER_USER = 0x11;

    public static final String FORGET_PASSWORD_URL = "http://www.cloudlinks.cn/pw/";
    public static final String CACHE_FOLDER_NAME = "yoosee";

    public static class P2P {
        // 设备不支持
        public static final String RET_DEVICE_NOT_SUPPORT = PACKAGE_NAME + "RET_DEVICE_NOT_SUPPORT";

        // 检查密码
        public static final String ACK_RET_CHECK_PASSWORD = PACKAGE_NAME + "ACK_RET_CHECK_PASSWORD";

        // 获取设备各种设置
        public static final String ACK_RET_GET_NPC_SETTINGS = PACKAGE_NAME + "ACK_RET_GET_NPC_SETTINGS";

        // 获取布防状态
        public static final String ACK_RET_GET_DEFENCE_STATES = PACKAGE_NAME + "ACK_RET_GET_DEFENCE_STATES";

        // 设备时间相关
        public static final String ACK_RET_SET_TIME = PACKAGE_NAME + "ACK_RET_SET_TIME";
        public static final String ACK_RET_GET_TIME = PACKAGE_NAME + "ACK_RET_GET_TIME";
        public static final String RET_SET_TIME = PACKAGE_NAME + "RET_SET_TIME";
        public static final String RET_GET_TIME = PACKAGE_NAME + "RET_GET_TIME";

        // 视频格式相关
        public static final String ACK_RET_SET_VIDEO_FORMAT = PACKAGE_NAME
                + "ACK_RET_SET_VIDEO_FORMAT";
        public static final String RET_SET_VIDEO_FORMAT = PACKAGE_NAME
                + "RET_SET_VIDEO_FORMAT";
        public static final String RET_GET_VIDEO_FORMAT = PACKAGE_NAME
                + "RET_GET_VIDEO_FORMAT";

        // 音量大小相关
        public static final String ACK_RET_SET_VIDEO_VOLUME = PACKAGE_NAME
                + "ACK_RET_SET_VIDEO_VOLUME";
        public static final String RET_SET_VIDEO_VOLUME = PACKAGE_NAME
                + "RET_SET_VIDEO_VOLUME";
        public static final String RET_GET_VIDEO_VOLUME = PACKAGE_NAME
                + "RET_GET_VIDEO_VOLUME";

        // 修改设备密码相关
        public static final String ACK_RET_SET_DEVICE_PASSWORD = PACKAGE_NAME
                + "ACK_RET_SET_DEVICE_PASSWORD";
        public static final String RET_SET_DEVICE_PASSWORD = PACKAGE_NAME
                + "RET_SET_DEVICE_PASSWORD";

        // 设置网络类型相关
        public static final String ACK_RET_SET_NET_TYPE = PACKAGE_NAME
                + "ACK_RET_SET_NET_TYPE";
        public static final String RET_SET_NET_TYPE = PACKAGE_NAME
                + "RET_SET_NET_TYPE";
        public static final String RET_GET_NET_TYPE = PACKAGE_NAME
                + "RET_GET_NET_TYPE";

        // 设置WIFI相关
        public static final String ACK_RET_SET_WIFI = PACKAGE_NAME
                + "ACK_RET_SET_WIFI";
        public static final String ACK_RET_GET_WIFI = PACKAGE_NAME
                + "ACK_GET_SET_WIFI";
        public static final String RET_SET_WIFI = PACKAGE_NAME + "RET_SET_WIFI";
        public static final String RET_GET_WIFI = PACKAGE_NAME + "RET_GET_WIFI";

        // 设置绑定报警ID
        public static final String ACK_RET_SET_BIND_ALARM_ID = PACKAGE_NAME
                + "ACK_RET_SET_BIND_ALARM_ID";
        public static final String ACK_RET_GET_BIND_ALARM_ID = PACKAGE_NAME
                + "ACK_RET_GET_BIND_ALARM_ID";
        public static final String RET_SET_BIND_ALARM_ID = PACKAGE_NAME
                + "RET_SET_BIND_ALARM_ID";
        public static final String RET_GET_BIND_ALARM_ID = PACKAGE_NAME
                + "RET_GET_BIND_ALARM_ID";
        public static final String DELETE_BINDALARM_ID = PACKAGE_NAME
                + "DELETE_BINDALARM_ID";

        // 设置报警邮箱
        public static final String ACK_RET_SET_ALARM_EMAIL = PACKAGE_NAME
                + "ACK_RET_SET_ALARM_EMAIL";
        public static final String ACK_RET_GET_ALARM_EMAIL = PACKAGE_NAME
                + "ACK_RET_GET_ALARM_EMAIL";
        public static final String RET_SET_ALARM_EMAIL = PACKAGE_NAME
                + "RET_SET_ALARM_EMAIL";
        public static final String RET_GET_ALARM_EMAIL = PACKAGE_NAME
                + "RET_GET_ALARM_EMAIL";
        public static final String RET_GET_ALARM_EMAIL_WITHSMTP = PACKAGE_NAME
                + "RET_GET_ALARM_EMAIL_WITHSMTP";
        public static final String ACK_RET_GET_ALARM_EMAIL_WITHSMTP = PACKAGE_NAME
                + "ACK_RET_GET_ALARM_EMAIL_WITHSMTP";

        // 设置移动侦测
        public static final String ACK_RET_SET_MOTION = PACKAGE_NAME
                + "ACK_RET_SET_MOTION";
        public static final String RET_SET_MOTION = PACKAGE_NAME
                + "RET_SET_MOTION";
        public static final String RET_GET_MOTION = PACKAGE_NAME
                + "RET_GET_MOTION";

        // 设置蜂鸣器
        public static final String ACK_RET_SET_BUZZER = PACKAGE_NAME
                + "RET_SET_BUZZER";
        public static final String RET_SET_BUZZER = PACKAGE_NAME
                + "RET_SET_BUZZER";
        public static final String RET_GET_BUZZER = PACKAGE_NAME
                + "RET_GET_BUZZER";

        // 设置录像模式
        public static final String ACK_RET_SET_RECORD_TYPE = PACKAGE_NAME
                + "ACK_RET_SET_RECORD_TYPE";
        public static final String RET_SET_RECORD_TYPE = PACKAGE_NAME
                + "RET_SET_RECORD_TYPE";
        public static final String RET_GET_RECORD_TYPE = PACKAGE_NAME
                + "RET_GET_RECORD_TYPE";

        // 设置录像时长
        public static final String ACK_RET_SET_RECORD_TIME = PACKAGE_NAME
                + "ACK_RET_SET_RECORD_TIME";
        public static final String RET_SET_RECORD_TIME = PACKAGE_NAME
                + "RET_SET_RECORD_TIME";
        public static final String RET_GET_RECORD_TIME = PACKAGE_NAME
                + "RET_GET_RECORD_TIME";

        // 设置录像计划时间
        public static final String ACK_RET_SET_RECORD_PLAN_TIME = PACKAGE_NAME
                + "ACK_RET_SET_RECORD_PLAN_TIME";
        public static final String RET_SET_RECORD_PLAN_TIME = PACKAGE_NAME
                + "RET_SET_RECORD_PLAN_TIME";
        public static final String RET_GET_RECORD_PLAN_TIME = PACKAGE_NAME
                + "RET_GET_RECORD_PLAN_TIME";

        // 防区设置
        public static final String ACK_RET_SET_DEFENCE_AREA = PACKAGE_NAME
                + "ACK_RET_SET_DEFENCE_AREA";
        public static final String ACK_RET_GET_DEFENCE_AREA = PACKAGE_NAME
                + "ACK_RET_GET_DEFENCE_AREA";
        public static final String ACK_RET_CLEAR_DEFENCE_AREA = PACKAGE_NAME
                + "ACK_RET_CLEAR_DEFENCE_AREA";
        public static final String RET_CLEAR_DEFENCE_AREA = PACKAGE_NAME
                + "RET_CLEAR_DEFENCE_AREA";
        public static final String RET_SET_DEFENCE_AREA = PACKAGE_NAME
                + "RET_SET_DEFENCE_AREA";
        public static final String RET_GET_DEFENCE_AREA = PACKAGE_NAME
                + "RET_GET_DEFENCE_AREA";

        // 远程设置
        public static final String ACK_RET_SET_REMOTE_DEFENCE = PACKAGE_NAME
                + "ACK_RET_SET_REMOTE_DEFENCE";
        public static final String RET_SET_REMOTE_DEFENCE = PACKAGE_NAME
                + "RET_SET_REMOTE_DEFENCE";
        public static final String RET_GET_REMOTE_DEFENCE = PACKAGE_NAME
                + "RET_GET_REMOTE_DEFENCE";

        public static final String ACK_RET_SET_REMOTE_RECORD = PACKAGE_NAME
                + "ACK_RET_SET_REMOTE_RECORD";
        public static final String RET_SET_REMOTE_RECORD = PACKAGE_NAME
                + "RET_SET_REMOTE_RECORD";
        public static final String RET_GET_REMOTE_RECORD = PACKAGE_NAME
                + "RET_GET_REMOTE_RECORD";

        // 设置初始密码
        public static final String ACK_RET_SET_INIT_PASSWORD = PACKAGE_NAME
                + "ACK_RET_SET_INIT_PASSWORD";
        public static final String RET_SET_INIT_PASSWORD = PACKAGE_NAME
                + "RET_SET_INIT_PASSWORD";
        public static final String RET_GET_VISTOR_PASSWORD = PACKAGE_NAME
                + "RET_GET_VISTOR_PASSWORD";

        // 查询录像文件
        public static final String ACK_RET_GET_PLAYBACK_FILES = PACKAGE_NAME
                + "ACK_RET_GET_PLAYBACK_FILES";
        public static final String RET_GET_PLAYBACK_FILES = PACKAGE_NAME
                + "RET_GET_PLAYBACK_FILES";

        // 回放改变进度条
        public static final String PLAYBACK_CHANGE_SEEK = PACKAGE_NAME
                + "PLAYBACK_CHANGE_SEEK";

        // 回放状态改变
        public static final String PLAYBACK_CHANGE_STATE = PACKAGE_NAME
                + "PLAYBACK_CHANGE_STATE";

        // 画布状态切换
        public static final String P2P_CHANGE_IMAGE_TRANSFER = PACKAGE_NAME
                + "P2P_CHANGE_IMAGE_TRANSFER";

        // 设备检查更新
        public static final String ACK_RET_GET_DEVICE_INFO = PACKAGE_NAME
                + "ACK_RET_GET_DEVICE_INFO";
        public static final String RET_GET_DEVICE_INFO = PACKAGE_NAME
                + "RET_GET_DEVICE_INFO";

        public static final String ACK_RET_CHECK_DEVICE_UPDATE = PACKAGE_NAME
                + "ACK_RET_CHECK_DEVICE_UPDATE";
        public static final String RET_CHECK_DEVICE_UPDATE = PACKAGE_NAME
                + "RET_CHECK_DEVICE_UPDATE";

        public static final String ACK_RET_DO_DEVICE_UPDATE = PACKAGE_NAME
                + "ACK_RET_DO_DEVICE_UPDATE";
        public static final String RET_DO_DEVICE_UPDATE = PACKAGE_NAME
                + "RET_DO_DEVICE_UPDATE";

        public static final String ACK_RET_CANCEL_DEVICE_UPDATE = PACKAGE_NAME
                + "ACK_RET_CANCEL_DEVICE_UPDATE";
        public static final String RET_CANCEL_DEVICE_UPDATE = PACKAGE_NAME
                + "RET_CANCEL_DEVICE_UPDATE";
        /*
         * p2p Connect
         */
        public static final String P2P_REJECT = PACKAGE_NAME + "P2P_REJECT";
        public static final String P2P_ACCEPT = PACKAGE_NAME + "P2P_ACCEPT";
        public static final String P2P_READY = PACKAGE_NAME + "P2P_READY";

        // p2p视频分辨率改变
        public static final String P2P_RESOLUTION_CHANGE = PACKAGE_NAME
                + "P2P_RESOLUTION_CHANGE";

        // P2P监控人数改变
        public static final String P2P_MONITOR_NUMBER_CHANGE = PACKAGE_NAME
                + "P2P_MONITOR_NUMBER_CHANGE";
        // 设置图像倒转
        public static final String RET_GET_IMAGE_REVERSE = PACKAGE_NAME
                + "RET_GET_IMAGE_REVERSE";
        public static final String ACK_VRET_SET_IMAGEREVERSE = PACKAGE_NAME
                + "ACK_VRET_SET_IMAGEREVERSE";
        public static final String RET_SET_IMGEREVERSE = PACKAGE_NAME
                + "RET_SET_IMGEREVERSE";
        // 人体红外开关
        public static final String ACK_RET_SET_INFRARED_SWITCH = PACKAGE_NAME
                + "ACK_RET_SET_INFRARED_SWITCH";
        public static final String RET_GET_INFRARED_SWITCH = PACKAGE_NAME
                + "RET_GET_INFRARED_SWITCH";
        // 有线报警输入开关
        public static final String ACK_RET_SET_WIRED_ALARM_INPUT = PACKAGE_NAME
                + "ACK_RET_GET_WIRED_ALARM_INPUT";
        public static final String RET_GET_WIRED_ALARM_INPUT = PACKAGE_NAME
                + "RET_GET_WIRED_ALARM_INPUT";
        // 无线报警输入开关
        public static final String ACK_RET_SET_WIRED_ALARM_OUT = PACKAGE_NAME
                + "ACK_RET_GET_WIRED_ALARM_OUT";
        public static final String RET_GET_WIRED_ALARM_OUT = PACKAGE_NAME
                + "RET_GET_WIRED_ALARM_OUT";
        // 自动升级
        public static final String ACK_RET_SET_AUTOMATIC_UPGRADE = PACKAGE_NAME
                + "ACK_RET_GET_AUTOMATIC_UPGRADE";
        public static final String RET_GET_AUTOMATIC_UPGRAD = PACKAGE_NAME
                + "RET_GET_AUTOMATIC_UPGRAD";
        // 设置访客密码
        public static final String ACK_RET_SET_VISITOR_DEVICE_PASSWORD = PACKAGE_NAME
                + "ACK_RET_SET_VISITOR_DEVICE_PASSWORD";
        public static final String RET_SET_VISITOR_DEVICE_PASSWORD = PACKAGE_NAME
                + "RET_SET_VISITOR_DEVICE_PASSWORD";
        // 设置时区
        public static final String ACK_RET_SET_TIME_ZONE = PACKAGE_NAME
                + "ACK_RET_SET_TIME_ZONE";
        public static final String RET_GET_TIME_ZONE = PACKAGE_NAME
                + "RET_GET_TIME_ZONE";
        // SD卡
        public static final String RET_GET_SD_CARD_CAPACITY = PACKAGE_NAME
                + "RET_GET_SD_CARD_CAPACITY";
        public static final String RET_GET_SD_CARD_FORMAT = PACKAGE_NAME
                + "RET_GET_SD_CARD_FORMAT";
        public static final String ACK_GET_SD_CARD_CAPACITY = PACKAGE_NAME
                + "ACK_GET_SD_CARD_CAPACITY";
        public static final String ACK_GET_SD_CARD_FORMAT = PACKAGE_NAME
                + "ACK_GET_SD_CARD_FORMAT";
        public static final String RET_GET_USB_CAPACITY = PACKAGE_NAME
                + "RET_GET_USB_CAPACITY";
        // 预录像
        public static final String RET_GET_PRE_RECORD = PACKAGE_NAME
                + "RET_GET_PRE_RECORD";
        public static final String ACK_RET_SET_PRE_RECORD = PACKAGE_NAME
                + "ACK_RET_SET_PRE_RECORD";
        public static final String RET_SET_PRE_RECORD = PACKAGE_NAME
                + "RET_SET_PRE_RECORD";
        // 传感器开关
        public static final String ACK_RET_GET_SENSOR_SWITCH = PACKAGE_NAME
                + "ACK_RET_GET_SENSOR_SWITCH";
        public static final String ACK_RET_SET_SENSOR_SWITCH = PACKAGE_NAME
                + "ACK_RET_SET_SENSOR_SWITCH";
        public static final String RET_GET_SENSOR_SWITCH = PACKAGE_NAME
                + "RET_GET_SENSOR_SWITCH";
        public static final String RET_SET_SENSOR_SWITCH = PACKAGE_NAME
                + "RET_SET_SENSOR_SWITCH";
        // 门铃
        public static final String RET_CUSTOM_CMD_DISCONNECT = PACKAGE_NAME
                + "RET_CUSTOM_CMD_DISCONNECT";
        // GPIO
        public static final String ACK_RET_SET_GPIO = PACKAGE_NAME
                + "ACK_RET_SET_GPIO";
        public static final String ACK_RET_SET_GPIO1_0 = PACKAGE_NAME
                + "ACK_RET_SET_GPIO1_0";
        public static final String RET_SET_GPIO = PACKAGE_NAME + "RET_SET_GPIO";
        // 获取音频设备型号
        public static final String RET_GET_AUDIO_DEVICE_TYPE = PACKAGE_NAME
                + "RET_GET_AUDIO_DEVICE_TYPE";
        // SetLamp返回
        public static final String SET_LAMP_STATUS = PACKAGE_NAME
                + "SET_LAMP_STATUS";
        // SetLamp返回
        public static final String ACK_SET_LAMP_STATUS = PACKAGE_NAME
                + "ACK_SET_LAMP_STATUS";
        // GetLamp返回
        public static final String GET_LAMP_STATUS = PACKAGE_NAME
                + "GET_LAMP_STATUS";
        // 获取和设置语言
        public static final String RET_GET_LANGUEGE = PACKAGE_NAME
                + "RET_GET_LANGUEGE";
        public static final String RET_SET_LANGUEGE = PACKAGE_NAME
                + "RET_SET_LANGUEGE";
        //获取nvr的设备列表
        public static final String ACK_GET_NVR_IPC_LIST = PACKAGE_NAME
                + "ACK_GET_NVR_IPC_LIST";
        public static final String RET_GET_NVR_IPC_LIST = PACKAGE_NAME
                + "RET_GET_NVR_IPC_LIST";
        //获取变焦变倍
        public static final String RET_GET_FOCUS_ZOOM = PACKAGE_NAME + "RET_GET_FOCUS_ZOOM";
        //		  鱼眼功能相关
        public static final String ACK_FISHEYE = PACKAGE_NAME + "ACK_FISHEYE";
        public static final String RET_SET_IPC_WORKMODE = PACKAGE_NAME + "RET_SET_IPC_WORKMODE";
        public static final String RET_SET_SENSER_WORKMODE = PACKAGE_NAME + "RET_SET_SENSER_WORKMODE";
        public static final String RET_SET_SCHEDULE_WORKMODE = PACKAGE_NAME + "RET_SET_SCHEDULE_WORKMODE";
        public static final String RET_DELETE_SCHEDULE = PACKAGE_NAME + "RET_DELETE_SCHEDULE";
        public static final String RET_GET_CURRENT_WORKMODE = PACKAGE_NAME + "RET_GET_CURRENT_WORKMODE";
        public static final String RET_GET_SENSOR_WORKMODE = PACKAGE_NAME + "RET_GET_SENSOR_WORKMODE";
        public static final String RET_GET_SCHEDULE_WORKMODE = PACKAGE_NAME + "RET_GET_SCHEDULE_WORKMODE";
        public static final String RET_SET_ALLSENSER_SWITCH = PACKAGE_NAME + "RET_SET_ALLSENSER_SWITCH";
        public static final String RET_GET_ALLSENSER_SWITCH = PACKAGE_NAME + "RET_GET_ALLSENSER_SWITCH";
        public static final String RET_SET_LOWVOL_TIMEINTERVAL = PACKAGE_NAME + "RET_SET_LOWVOL_TIMEINTERVAL";
        public static final String RET_GET_LOWVOL_TIMEINTERVAL = PACKAGE_NAME + "RET_GET_LOWVOL_TIMEINTERVAL";
        //第二次添加
        public static final String RET_DELETE_ONE_CONTROLER = PACKAGE_NAME + "RET_DELETE_ONE_CONTROLER";
        public static final String RET_DELETE_ONE_SENSOR = PACKAGE_NAME + "RET_DELETE_ONE_SENSOR";
        public static final String RET_CHANGE_CONTROLER_NAME = PACKAGE_NAME + "RET_CHANGE_CONTROLER_NAME";
        public static final String RET_CHANGE_SENSOR_NAME = PACKAGE_NAME + "RET_CHANGE_SENSOR_NAME";
        public static final String RET_INTO_LEARN_STATE = PACKAGE_NAME + "RET_INTO_LEARN_STATE";
        public static final String RET_TURN_SENSOR = PACKAGE_NAME + "RET_TURN_SENSOR";
        public static final String RET_SHARE_TO_MEMBER = PACKAGE_NAME + "RET_SHARE_TO_MEMBER";
        public static final String RET_GOT_SHARE = PACKAGE_NAME + "RET_GOT_SHARE";
        public static final String RET_DEV_RECV_MEMBER_FEEDBACK = PACKAGE_NAME + "RET_DEV_RECV_MEMBER_FEEDBACK";
        public static final String RET_ADMIN_DELETE_ONE_MEMBER = PACKAGE_NAME + "RET_ADMIN_DELETE_ONE_MEMBER";
        public static final String RET_DELETE_DEV = PACKAGE_NAME + "RET_DELETE_DEV";
        public static final String RET_GET_MEMBER_LIST = PACKAGE_NAME + "RET_GET_MEMBER_LIST";
        public static final String RET_SET_ONE_SPECIAL_ALARM = PACKAGE_NAME + "RET_SET_ONE_SPECIAL_ALARM";
        public static final String RET_GET_ALL_SPECIAL_ALARM = PACKAGE_NAME + "RET_GET_ALL_SPECIAL_ALARM";
        public static final String RET_GET_LAMPSTATE = PACKAGE_NAME + "RET_GET_LAMPSTATE";
        public static final String RET_KEEP_CLIENT = PACKAGE_NAME + "RET_KEEP_CLIENT";
        //获取报警图像
        public static final String RET_GET_ALLARMIMAGE = PACKAGE_NAME + "RET_GET_ALLARMIMAGE";
        public static final String RET_GET_ALLARMIMAGE_PROGRESS = PACKAGE_NAME + "RET_GET_ALLARMIMAGE_PROGRESS";
        //切换AP模式
        public static final String RET_SET_AP_MODE = PACKAGE_NAME + "RET_SET_AP_MODE";
        //是否支持AP模式
        public static final String RET_AP_MODESURPPORT = PACKAGE_NAME + "RET_AP_MODESURPPORT";
        //P2P图像开始显示
        public static final String RET_P2PDISPLAY = PACKAGE_NAME + "RET_P2PDISPLAY";

        public static final String ACK_GET_REMOTE_DEFENCE = PACKAGE_NAME + "ACK_GET_REMOTE_DEFENCE";
    }

    public static class P2P_TYPE {
        public static final int P2P_TYPE_CALL = 0;
        public static final int P2P_TYPE_MONITOR = 1;
        public static final int P2P_TYPE_PLAYBACK = 2;
    }

    public static class P2P_CALL {
        public static class CALL_RESULT {
            public static final int CALL_SUCCESS = 0;
            public static final int CALL_PHONE_FORMAT_ERROR = 1;
        }
    }

    public static class P2P_SET {

        public static class ACK_RESULT {
            public static final int ACK_PWD_ERROR = 9999;
            public static final int ACK_NET_ERROR = 9998;
            public static final int ACK_SUCCESS = 9997;
            public static final int ACK_INSUFFICIENT_PERMISSIONS = 9996;
        }

        public static class DEVICE_TIME_SET {
            public static final int SETTING_SUCCESS = 0;
        }

        public static class VIDEO_FORMAT_SET {
            public static final int SETTING_SUCCESS = 0;
            public static final int VIDEO_FORMAT_NTSC = 0;
            public static final int VIDEO_FORMAT_PAL = 1;
        }

        public static class VIDEO_VOLUME_SET {
            public static final int SETTING_SUCCESS = 0;
        }

        public static class DEVICE_PASSWORD_SET {
            public static final int SETTING_SUCCESS = 0;
        }

        public static class NET_TYPE_SET {
            public static final int SETTING_SUCCESS = 0;
            public static final int NET_TYPE_WIRED = 0;
            public static final int NET_TYPE_WIFI = 1;
        }

        public static class WIFI_SET {
            public static final int SETTING_SUCCESS = 0;
        }

        public static class BIND_ALARM_ID_SET {
            public static final int SETTING_SUCCESS = 0;
        }

        public static class ALARM_EMAIL_SET {
            public static final int SETTING_SUCCESS = 0;
        }

        public static class MOTION_SET {
            public static final int SETTING_SUCCESS = 0;
            public static final int MOTION_DECT_ON = 1;
            public static final int MOTION_DECT_OFF = 0;
        }

        public static class BUZZER_SET {
            public static final int SETTING_SUCCESS = 0;
            public static final int BUZZER_SWITCH_ON_ONE_MINUTE = 1;
            public static final int BUZZER_SWITCH_ON_TWO_MINUTE = 2;
            public static final int BUZZER_SWITCH_ON_THREE_MINUTE = 3;
            public static final int BUZZER_SWITCH_OFF = 0;
        }

        public static class RECORD_TYPE_SET {
            public static final int SETTING_SUCCESS = 0;
            public static final int RECORD_TYPE_MANUAL = 0;
            public static final int RECORD_TYPE_ALARM = 1;
            public static final int RECORD_TYPE_TIMER = 2;
        }

        public static class RECORD_TIME_SET {
            public static final int SETTING_SUCCESS = 0;
            public static final int RECORD_TIME_ONE_MINUTE = 0;
            public static final int RECORD_TIME_TWO_MINUTE = 1;
            public static final int RECORD_TIME_THREE_MINUTE = 2;
        }

        public static class RECORD_PLAN_TIME_SET {
            public static final int SETTING_SUCCESS = 0;

        }

        public static class DEFENCE_AREA_SET {
            public static final int SETTING_SUCCESS = 0;
            public static final int DEFENCE_AREA_TYPE_LEARN = 0;
            public static final int DEFENCE_AREA_TYPE_CLEAR = 1;
            public static final int DEFENCE_AREA_TYPE_CLEAR_GROUP = 2;

        }

        public static class REMOTE_DEFENCE_SET {
            public static final int SETTING_SUCCESS = 0;
            public static final int ALARM_SWITCH_ON = 1;
            public static final int ALARM_SWITCH_OFF = 0;
        }

        public static class REMOTE_RECORD_SET {
            public static final int SETTING_SUCCESS = 0;
            public static final int RECORD_SWITCH_ON = 1;
            public static final int RECORD_SWITCH_OFF = 0;
        }

        public static class PRE_RECORD_SET {
            public static final int SETTING_SUCCESS = 0;
            public static final int PRE_RECORD_SWITCH_ON = 1;
            public static final int PRE_RECORD_SWITCH_OFF = 0;
        }

        public static class INIT_PASSWORD_SET {
            public static final int SETTING_SUCCESS = 0;
            public static final int ALREADY_EXIST_PASSWORD = 43;
        }

        public static class DEVICE_UPDATE {

            public static final int HAVE_NEW_VERSION = 1;
            public static final int IS_LATEST_VERSION = 54;
            public static final int OTHER_WAS_CHECKING = 58;
            public static final int HAVE_NEW_IN_SD = 72;
            public static final int DO_UPDATE_SUCCESS = 0;
            public static final int UNKNOWN = -1;
        }

        public static class INFRARED_SWITCH {
            public static final int INFRARED_SWITCH_ON = 1;
            public static final int INFRARED_SWITCH_OFF = 0;
        }

        public static class WIRED_ALARM_INPUT {
            public static final int ALARM_INPUT_ON = 1;
            public static final int ALARM_INPUT_OFF = 0;
        }

        public static class WIRED_ALARM_OUT {
            public static final int ALARM_OUT_ON = 1;
            public static final int ALARM_OUT_OFF = 0;
        }

        public static class AUTOMATIC_UPGRADE {
            public static final int AUTOMATIC_UPGRADE_ON = 1;
            public static final int AUTOMATIC_UPGRADE_OFF = 0;
        }

        public static class DEVICE_VISITOR_PASSWORD_SET {
            public static final int SETTING_SUCCESS = 0;
        }

        public static class SD_FORMAT {
            public static final int SD_CARD_SUCCESS = 80;
            public static final int SD_CARD_FAIL = 81;
            public static final int SD_NO_EXIST = 82;
        }
    }

    public static class Action {
        /*
         * globel
         */
        public final static String ACTION_NETWORK_CHANGE = "android.net.conn.CONNECTIVITY_CHANGE";
        public static final String CLOSE_INPUT_DIALOG = PACKAGE_NAME
                + "CLOSE_INPUT_DIALOG";
        public static final String NET_WORK_TYPE_CHANGE = PACKAGE_NAME
                + "NET_WORK_TYPE_CHANGE";

        /*
         * mainactivity
         */
        public final static String ACTION_SWITCH_USER = PACKAGE_NAME
                + "ACTION_SWITCH_USER";
        public final static String ACTION_EXIT = PACKAGE_NAME + "ACTION_EXIT";
        public static final String RECEIVE_MSG = PACKAGE_NAME + "RECEIVE_MSG";
        public final static String ACTION_UPDATE = PACKAGE_NAME
                + "ACTION_UPDATE";
        public static final String RECEIVE_SYS_MSG = PACKAGE_NAME
                + "RECEIVE_SYS_MSG";
        public static final String SESSION_ID_ERROR = PACKAGE_NAME
                + "SESSION_ID_ERROR";

        /*
         * contact
         */
        public final static String REFRESH_CONTANTS = PACKAGE_NAME
                + "refresh.contants";
        public final static String ACTION_REFRESH_NEARLY_TELL = PACKAGE_NAME
                + "ACTION_REFRESH_NEARLY_TELL";
        public final static String GET_FRIENDS_STATE = PACKAGE_NAME
                + "GET_FRIENDS_STATE";
        public final static String ACTION_COUNTRY_CHOOSE = PACKAGE_NAME
                + "ACTION_COUNTRY_CHOOSE";
        public final static String ADD_CONTACT_SUCCESS = PACKAGE_NAME
                + "ADD_CONTACT_SUCCESS";
        public final static String LOCAL_DEVICE_SEARCH_END = PACKAGE_NAME
                + "LOCAL_DEVICE_SEARCH_END";
        public final static String IS_OPEN_THREAD_CONTACTFRAG = PACKAGE_NAME
                + "IS_OPEN_THREAD_CONTACTFRAG";
        /*
         * MainControl
         */
        public static final String CHECK_DEVICE_PWD = PACKAGE_NAME
                + "CHECK_DEVICE_PWD";

        /*
         * sysset
         */
        public static final String ADD_ALARM_MASK_ID_SUCCESS = PACKAGE_NAME
                + "ADD_ALARM_MASK_ID_SUCCESS";
        public static final String REFRESH_ALARM_RECORD = PACKAGE_NAME
                + "REFRESH_ALARM_RECORD";
        public static final String CHANGE_ALARM_MESSAGE = PACKAGE_NAME
                + "CHANGE_ALARM_MESSAGE";

        /*
         * shake
         */
        public static final String UPDATE_DEVICE_FALG = PACKAGE_NAME
                + "UPDATE_DEVICE_FALG";

        /*
         * MainLogin
         */
        public static final String REPLACE_EMAIL_LOGIN = PACKAGE_NAME
                + "REPLACE_EMAIL_LOGIN";
        public static final String REPLACE_PHONE_LOGIN = PACKAGE_NAME
                + "REPLACE_PHONE_LOGIN";
        public static final String EMAIL_LOGIN = PACKAGE_NAME + "EMAIL_LOGIN";
        public static final String PHONE_LOGIN = PACKAGE_NAME + "PHONE_LOGIN";

        /*
         * Control
         */
        public static final String CONTROL_SETTING_PWD_ERROR = PACKAGE_NAME
                + "CONTROL_SETTING_PWD_ERROR";

        public static final String REPLACE_REMOTE_CONTROL = PACKAGE_NAME
                + "REPLACE_REMOTE_CONTROL";
        public static final String REPLACE_MAIN_CONTROL = PACKAGE_NAME
                + "REPLACE_MAIN_CONTROL";
        public static final String REPLACE_SETTING_TIME = PACKAGE_NAME
                + "REPLACE_SETTING_TIME";
        public static final String REPLACE_ALARM_CONTROL = PACKAGE_NAME
                + "REPLACE_ALARM_CONTROL";
        public static final String REPLACE_VIDEO_CONTROL = PACKAGE_NAME
                + "REPLACE_VIDEO_CONTROL";
        public static final String REPLACE_RECORD_CONTROL = PACKAGE_NAME
                + "REPLACE_RECORD_CONTROL";
        public static final String REPLACE_SECURITY_CONTROL = PACKAGE_NAME
                + "REPLACE_SECURITY_CONTROL";
        public static final String REPLACE_NET_CONTROL = PACKAGE_NAME
                + "REPLACE_NET_CONTROL";
        public static final String REPLACE_DEFENCE_AREA_CONTROL = PACKAGE_NAME
                + "REPLACE_DEFENCE_AREA_CONTROL";
        public static final String REPLACE_SD_CARD_CONTROL = PACKAGE_NAME
                + "REPLACE_SD_CARD_CONTROL";
        public static final String REPLACE_LANGUAGE_CONTROL = PACKAGE_NAME
                + "REPLACE_LANGUAGE_CONTROL";
        public static final String REPLACE_MODIFY_WIFI_PWD_CONTROL = PACKAGE_NAME
                + "REPLACE_MODIFY_WIFI_PWD_CONTROL";
        public static final String CONTROL_BACK = PACKAGE_NAME + "CONTROL_BACK";

        // 智能钥匙连接
        public static final String CURRENT_WIFI_NAME = PACKAGE_NAME
                + "CURRENT_WIFI_NAME";
        public static final String HEARED = PACKAGE_NAME + "HEARED";
        public static final String DELETE_DEVICE_ALL = PACKAGE_NAME
                + "DELETE_DEVICE_ALL";
        public static final String INSERT_INFRARED_BACK = PACKAGE_NAME
                + "INSERT_INFRARED_BACK";
        public static final String ADD_SUCESS = PACKAGE_NAME + "ADD_SUCESS";
        public static final String SETTING_WIFI_SUCCESS = PACKAGE_NAME
                + "SETTING_WIFI_SUCCESS";
        public static final String ACTIVITY_FINISH = PACKAGE_NAME
                + "ACTIVITY_FINISH";
        public static final String REPEAT_LOADING_DATA = PACKAGE_NAME
                + "REPEAT_LOADING_DATA";
        // add
        public static final String DIAPPEAR_ADD = PACKAGE_NAME + "DIAPPEAR_ADD";
        public static final String RADAR_SET_WIFI_SUCCESS = PACKAGE_NAME
                + "RADAR_SET_WIFI_SUCCESS";
        public static final String RADAR_SET_WIFI_FAILED = PACKAGE_NAME
                + "RADAR_SET_WIFI_FAILED";
        public static final String MONITOR_NEWDEVICEALARMING = PACKAGE_NAME
                + "MONITOR_NEWDEVICEALARMING";
        public static final String SEARCH_AP_DEVICE = PACKAGE_NAME
                + "SEARCH_AP_DEVICE";
        public static final String SET_AP_DEVICE_WIFI_PWD = PACKAGE_NAME
                + "SET_AP_DEVICE_WIFI_PWD";
        public static final String SEARCH_AP_APMODE = PACKAGE_NAME
                + "SEARCH_AP_APMODE";
        public static final String SEARCH_AP_ADDAPDEVICE = PACKAGE_NAME
                + "SEARCH_AP_ADDAPDEVICE";
        public static final String SEARCH_AP = PACKAGE_NAME + "SEARCH_AP";
        public static final String SEARCH_AP_QUITEAPDEVICE = PACKAGE_NAME
                + "SEARCH_AP_QUITEAPDEVICE";
        public static final String EXITE_AP_MODE = PACKAGE_NAME
                + "EXITE_AP_MODE";

        public static final String ENTER_DEVICE_SETTING = PACKAGE_NAME + "ENTER_DEVICE_SETTING";
        public static final String CALL_DEVICE = PACKAGE_NAME + "CALL_DEVICE";

        public static final String GET_DEVICE_TYPE = PACKAGE_NAME + "GET_DEVICE_TYPE";
        //		刷新报警信息
        public static final String REFRESH_ALARM_MESSAGE = PACKAGE_NAME + "REFRESH_ALARM_MESSAGE";
    }

    public static class DeviceState {
        public static final int ONLINE = 1;
        public static final int OFFLINE = 0;
    }

    public static class DefenceState {
        public static final int DEFENCE_STATE_OFF = 0;
        public static final int DEFENCE_STATE_ON = 1;
        public static final int DEFENCE_STATE_LOADING = 2;
        public static final int DEFENCE_STATE_WARNING_PWD = 3;
        public static final int DEFENCE_STATE_WARNING_NET = 4;
        public static final int DEFENCE_NO_PERMISSION = 5;
    }

    public static class APmodeState {
        public static final int LINK = 0;
        public static final int UNLINK = 1;
        public static final int NO_SEARCH = 2;
    }

    public static class DeviceFlag {
        public static final int UNSET_PASSWORD = 0;
        public static final int ALREADY_SET_PASSWORD = 1;
        public static final int AP_MODE = 2;
        public static final int UNKNOW = 3;
    }

    public static class ReplaceStyle {
        public static final int SLIDE = 0;
        public static final int FADE = 1;
    }

    public static class LoginType {
        public static final int PHONE = 0;
        public static final int EMAIL = 1;
    }

    public static class RegisterType {
        public static final int PHONE = 0;
        public static final int EMALL = 1;
    }

    public static class ModifyAccountType {
        public static final int MODIFY_EMAIL = 0;
    }

    public static class SettingConfig {

        public static final int SETTING_CLICK_TIME_DELAY = 0;

    }

    public static class MessageType {
        public static final int SEND_SUCCESS = 0;
        public static final int SENDING = 1;
        public static final int SEND_FAULT = 2;
        public static final int UNREAD = 3;
        public static final int READED = 4;
    }

    public static class ActivityInfo {
        public static final int ACTIVITY_LOGOACTIVITY = 0;
        public static final int ACTIVITY_MAINACTIVITY = 1;
        public static final int ACTIVITY_LOGINACTIVITY = 2;
        public static final int ACTIVITY_IMAGEBROWSER = 3;
        public static final int ACTIVITY_ABOUTACTIVITY = 4;
        public static final int ACTIVITY_ACCOUNTINFOACTIVITY = 5;
        public static final int ACTIVITY_ADDALARMMASKIDACTIVITY = 6;
        public static final int ACTIVITY_ADDCONTACTACTIVITY = 7;
        public static final int ACTIVITY_ADDCONTACTNEXTACTIVITY = 8;
        public static final int ACTIVITY_ALARMRECORDACTIVITY = 9;
        public static final int ACTIVITY_ALARMSETACTIVITY = 10;
        public static final int ACTIVITY_FORWARDACTIVITY = 11;
        public static final int ACTIVITY_MAINCONTROLACTIVITY = 12;
        public static final int ACTIVITY_MESSAGEACTIVITY = 13;
        public static final int ACTIVITY_MODIFYACCOUNTEMAILACTIVITY = 14;
        public static final int ACTIVITY_MODIFYACCOUNTPHONEACTIVITY = 15;
        public static final int ACTIVITY_MODIFYACCOUNTPHONEACTIVITY2 = 16;
        public static final int ACTIVITY_MODIFYALARMIDACTIVITY = 17;
        public static final int ACTIVITY_MODIFYBOUNDEMAILACTIVITY = 18;
        public static final int ACTIVITY_MODIFYCONTACTACTIVITY = 19;
        public static final int ACTIVITY_MODIFNPCPASSWORDACTIVITY = 20;
        public static final int ACTIVITY_REGISTERACTIVITY = 21;
        public static final int ACTIVITY_REGISTERACTIVITY2 = 22;
        public static final int ACTIVITY_SEARCHLISTACTIVITY = 23;
        public static final int ACTIVITY_SETTINGBELLRINGACTIVITY = 24;
        public static final int ACTIVITY_SETTINGSDBELLACTIVITY = 25;
        public static final int ACTIVITY_SETTINGSYSTEMACTIVITY = 26;
        public static final int ACTIVITY_SYSMSGACTIVITY = 27;
        public static final int ACTIVITY_SYSNOTIFYACTIVITY = 28;
        public static final int ACTIVITY_TELLDETAILACTIVITY = 29;
        public static final int ACTIVITY_UNBINDPHONEACTIVITY = 30;
        public static final int ACTIVITY_VERIFYPHONEACTIVITY = 31;
        public static final int ACTIVITY_PLAYBACKLISTACTIVITY = 32;
        public static final int ACTIVITY_PLAYBACKACTIVITY = 33;
        public static final int ACTIVITY_VIDEOACTIVITY = 34;
        public static final int ACTIVITY_MONITORACTIVITY = 35;
        public static final int ACTIVITY_CALLACTIVITY = 36;
        public static final int ACTIVITY_MODIFYLOGINPASSWORDACTIVITY = 37;
        public static final int ACTIVITY_CUTIMAGEACTIVITY = 38;
        public static final int ACTIVITY_FORWARDDOWNACTIVITY = 39;
        public static final int ACTIVITY_DEVICE_UPDATE = 40;
        public static final int ACTIVITY_SHAKE = 41;
        public static final int ACTIVITY_INFRARED_REMOTE = 42;
        public static final int ACTIVITY_INFRARED_SET_WIFI = 43;
        public static final int ACTIVITY_LOCAL_DEVICE_LIST = 44;
        public static final int ACTIVITY_ALTOGETHERREGISTERACTIVITY = 45;
        public static final int ACTIVITY_QRCODE = 46;
        public static final int ACTIVITY_MODIFY_NPC_VISITOR_PASSWORD_ACTIVITY = 47;
        public static final int ACTIVITY_THREEADDCONTACTACTIVITY = 48;
        public static final int SMARTKEYSETWIFIACTIVITY = 49;
        public static final int WIFILISTACTIVITY = 50;
        public static final int ACTIVITY_QRCODEACTIVITY = 51;
        public static final int ACTIVITY_CREATEQRCODEACTIVITY = 52;
        public static final int ACTIVITY_ALARMPUSHACCOUNTACTIVITY = 53;
        public static final int ACTIVITY_IMAGESEE = 54;
        public static final int ACTIVITY_RADARADDFIRSTACTIVITY = 55;
        public static final int ACTIVITY_RARDARADDACTIVITY = 56;
        public static final int ACTIVITY_WAITDEVICENETWORKACTIVITY = 57;
        public static final int ACTIVITY_ADDWAITACTIVITY = 58;
        public static final int ACTIVITY_ADDAPDEVICEACTIVITY = 59;
        public static final int ACTIVITY_APDEVICEMONITORACTIVITY = 60;
        public static final int ACTIVITY_WAITTING = 61;
        public static final int ACTIVITY_MODIFYAPWIFIPWD = 62;
        public static final int ACTIVITY_ALRAM_WITH_PICTRUE = 63;
        public static final int ACTIVITY_APMONITORACTIVITY = 64;
        public static final int ACTIVITY_ALRAM_PICTRUE = 65;
    }

    public static class ActivityStatus {
        public static final int STATUS_START = 0;
        public static final int STATUS_STOP = 1;
    }

    public static class Image {
        public static final String USER_HEADER_PATH = "/sdcard/"
                + CACHE_FOLDER_NAME + "/";
        public static final String USER_HEADER_TEMP_FILE_NAME = "temp";
        public static final float USER_HEADER_ROUND_SCALE = 1f / 32f;
        public static final int USER_HEADER_MIN_SIZE = 32;
        public static final String USER_HEADER_FILE_NAME = "header";
        public static final String USER_GRAY_HEADER_FILE_NAME = "header_gray";
    }

    public static class Update {
        public static final String SAVE_PATH = Constants.CACHE_FOLDER_NAME
                + "/apk";
        public static final String FILE_NAME = Constants.CACHE_FOLDER_NAME
                + ".apk";
        public static final String INSTALL_APK = "application/vnd.android.package-archive";
        public static final int CHECK_UPDATE_HANDLE_FALSE = 0x11;
        public static final int CHECK_UPDATE_HANDLE_TRUE = 0x12;
    }


    public static class Languege {
        public static final int LANG_EN = 0; // 0 默认 英文
        public static final int LANG_CHS = 1; // 1 中文简体
        public static final int LANG_JP = 2; // 2 日语
        public static final int LANG_PT = 3; // 3 葡萄牙
        public static final int LANG_SP = 4; // 4西班牙
        public static final int LANG_CF = 5; // 5 中文繁体
        public static final int LANG_FR = 6; // 6 法语
        public static final int LANG_RU = 7; // 7 俄语
    }

    public static class FOCUS {
        public static final byte FOCUS_BIG = 0x1;
        public static final byte FOCUS_SMALL = 0x11;
    }

    public static class CHANGE_FOCUS_ZOOM {
        public static final int CHANGE_NO = 0;
        public static final int CHANGE_ZOOM = 1;
        public static final int CHANGE_FOCUS = 2;
        public static final int CHANGE_FOCUS_ZOOM = 3;
    }

    public static class SensorType {
        public static final int TYPE_REMOTE_CONTROLLER = 0; // 0 遥控器
        public static final int TYPE_DOOR_STAUS_SWITCH = 1; // 1 门磁
        public static final int TYPE_SMOKE_TRANSDUCER = 2; // 2 烟雾传感器
        public static final int TYPE_GAS_SENSOR = 3; // 3 瓦斯探测传感器
        public static final int TYPE_LIGHT = 4; // 4 电灯
        public static final int TYPE_CURTAIN = 5; // 5 窗帘
        public static final int TYPE_JACK = 6;// 6 插座
        public static final int TYPE_PIR = 7; // 7 人体红外
        public static final int TYPE_WATER_INVADE = 8;//8 水浸
        public static final int TYPE_URGENCY = 9; //9  急救
        public static final int TYPE_WARNING_SPEAKER = 10; //10 警号
    }

    public static class FishBoption {
        public static final int MESG_SET_OK = 0;
        public static final int MESG_GET_OK = 1;
        public static final int MESG_SET_WORK_MODE_ERROR = 10;
        public static final int MESG_SET_SCHEDULE_WORK_MODE_ARG_ERROR = 11;
        public static final int MESG_DELETE_SCHEDULE_WORK_MODE_ARG_ERROR = 12;
        public static final int MESG_SET_SENSOR_WORK_MODE_ERROR = 13;
        public static final int MESG_SET_DELETE_ONE_CONTROLER_ERROR = 14;
        public static final int MESG_SET_DELETE_ONE_SENSOR_ERROR = 15;
        public static final int MESG_CHANGE_CONTROLER_NAME_ERROR = 16;
        public static final int MESG_CHANGE_SENSOR_NAME_ERROR = 17;
        public static final int MESG_LEARN_SENSOR_ERROR = 18;
        public static final int MESG_SET_SCHEDULE_HAVE_SAME_SCHEDULE = 19;
        public static final int MESG_SENSOR_NOT_LEARN_YET = 20;
        public static final int MESG_CANNOT_SHARE_TO_ITSELF = 21;
        public static final int MESG_DONOT_HAVE_PERMISSION_TO_SHARE = 22;
        public static final int MESG_DONOT_HAVE_PERMISSION_TO_DELETE = 23;
        public static final int MESG_ADMIN_CANNOT_DELETE_ITSELF_BEFORE_MEMBER_BEREMOVE = 24;
        public static final int MESG_MEMBERLIST_IS_EMPTY = 25;
        public static final int MESG_DONOT_HAVE_SUCH_MEMBER = 26;
        public static final int MESG_MEMBER_LIST_FULL = 27;
    }

    public static class LenStateCode {
        public static final int LEARN_STATE_IDLE = 0;
        public static final int LEARN_STATE_START = 1;
        public static final int LEARN_STATE_BUSY = 2;
        public static final int LEARN_STATE_TIMEOUT = 3;
        public static final int LEARN_STATE_SUCCESS = 4;
        public static final int LEARN_STATE_CONTROLER_FULL = 5;
        public static final int LEARN_STATE_SENSOR_FULL = 6;
        public static final int LEARN_STATE_ALREADY_LEARN = 7;
    }

    public static class SpecialSensorType {
        public static final int INDEX_ALARM_TYPE_MD = 0; // 0 移动侦测
        public static final int INDEX_ALARM_TYPE_ATTACH = 1; // 1 防攻击

    }

    public static class sensorSwitch {
        public final static int State_on = 1;
        public final static int State_off = 2;
        public final static int State_progress = 0;

    }

    public static class ConnectType {
        public final static int P2PCONNECT = 0;
        public final static int RTSPCONNECT = 1;
    }

    public static final int USER_HEADER_WIDTH_HEIGHT = 500;
    public static final String HEIMANEmail = "@bm.com";
    public static final String HEIMANPASS = "8888";

}
