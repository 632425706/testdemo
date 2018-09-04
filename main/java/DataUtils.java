import java.text.SimpleDateFormat;

/**
 * @Author: xiangyu215965
 * @Date: 2018/9/4 16:00
 */
public class DataUtils {
    public static void main(String args[]){
        //SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        //System.currentTimeMillis();
        String dateStr1p = dateformat.format(Long.parseLong("1532503732079"));
        String dateStr2c = dateformat.format(Long.parseLong("1532503733570"));
        String dateStr1c = dateformat.format(Long.parseLong("1532503747539"));
        String dateStr = dateformat.format(Long.parseLong("1490936400000"));
        System.out.println(dateStr1p);
        System.out.println(dateStr1c);
        System.out.println(dateStr2c);
        System.out.println(dateStr);
    }
}
