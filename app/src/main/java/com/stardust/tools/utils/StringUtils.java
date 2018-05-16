package com.stardust.tools.utils;

import java.util.regex.Pattern;

/**
 * Created on 2018/5/16.
 *
 * @author wangchongyang
 */
public class StringUtils {


    /**
     * 判断字符串是否为 URL : http://xxx 或者 https://xxx 或者 xxx;
     *                      http://www.baidu.com 或者 https://www.baidu.com 或者 www.baidu.com;
     */
    public static boolean isURL(String string) {
        Pattern exp0 = Pattern.compile("^([hH][tT]{2}[pP]://|[hH][tT]{2}[pP][sS]://)(([A-Za-z0-9-~]+).)+([A-Za-z0-9-~/])+$");
        Pattern exp1 = Pattern.compile("^(([A-Za-z0-9-~]+).)+([A-Za-z0-9-~/])+$");
        return  exp0.matcher(string).matches()||exp1.matcher(string).matches();
    }

    /**
     * 字符串长度大于 length 时,多余的用省略号代替
     * */
    public static String subStringByLength(String text,int length){
        return text.length() > length ? text.substring(0,length -1) + "…" : text;
    }

    /**
     * 判断字符串是否为手机号码
     */
    public static boolean isMobileNO(String mobiles) {
        String telRegex = "[1][3578]\\d{9}";//"[1]"代表第1位为数字1，"[358]"代表第二位可以为3、5、8中的一个，"\\d{9}"代表后面是可以是0～9的数字，有9位。
        return !(mobiles == null || mobiles.length() == 0 || mobiles.length() != 11) && mobiles.matches(telRegex);
    }

    /**
     * 隐藏电话号的中间四位
     */
    public static String getSecretStr(String object) {
        if(object != null){
            return object.replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
        }else {
            return "";
        }
    }

    /**
     *使用1字节就可以表示b 例： b = 8 ,结果为：08 ；b = 1024, 结果：400；
     *
     */
    public static String numToHex8(int b) {
        return String.format("%02x", b);//2表示需要两个16进制数（不足则用0 补齐）
    }
    /**
     *使用2字节就可以表示b  例：b = 8 ,结果为：0008 ； b = 1024, 结果：0400；
     */
    public static String numToHex16(int b) {
        return String.format("%04x", b);
    }
    /**
     *使用4字节就可以表示b  例：b = 8 ,结果为：00000008 ； b = 1024, 结果：00000400；
     */
    public static String numToHex32(int b) {
        return String.format("%08x", b);
    }



}
