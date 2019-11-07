package Day20191105.tryClassLoader;

import java.io.*;

/**
 * @Auth:yqy
 * @Date 2019/11/5 12:51
 */
public class MyClassLoader extends ClassLoader{

    private String name;


    public MyClassLoader(String name) {
        this.name = name;
    }

    @Override
    protected Class<?> findClass(String path)   {
        byte[] bytes= new byte[0];
        try {
            bytes = myLoadingClass(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Class c=defineClass(name,bytes,0,bytes.length);
        return c;
    }

    private byte[] myLoadingClass(String path) throws Exception{
        path=path+this.name+".class";
        InputStream in=null;
        ByteArrayOutputStream out=null;

        try{
            in=new FileInputStream(new File(path));
            out=new ByteArrayOutputStream();
            int i=0;
            while((i=in.read()) != -1){
                out.write(i);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            out.close();
            in.close();
        }
        return out.toByteArray();

    }




}
