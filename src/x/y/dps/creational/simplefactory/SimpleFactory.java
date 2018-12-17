package x.y.dps.creational.simplefactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SimpleFactory {
    public static Api createApi(){
        Properties p=new Properties();
        InputStream is=null;
        try {
            is=SimpleFactory.class.getResourceAsStream("simplefactory.properties");
            p.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (is!=null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Api api=null;
        try {
            api= (Api) Class.forName(p.getProperty("implClass")).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return api;
    }
}
