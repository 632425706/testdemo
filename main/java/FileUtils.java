import java.io.*;

public class FileUtils {
    //按照行读取文件
    public static String readFileByLine(){
        String s="";
        File f=new File("D:\\vs_phone.json");
//        File f=new File("D:\\phoneloc\\phoneloc.json");
        BufferedReader br=null;
        try{
            System.out.println("按照行读取文件内容");
            FileInputStream in = new FileInputStream(f);
            br=new BufferedReader(new InputStreamReader(in,"UTF-8"));
            String temp;
            while((temp=br.readLine())!=null){
                s+=temp;
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("file content:"+s);
        return s;
    }
}
