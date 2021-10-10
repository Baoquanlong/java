package com.baoquanlong.java.IO;


import java.io.*;

/*
    将D:\java\java目录下的所有文件拷贝到
    C:\Users\17502\Desktop中
 */
public class HomeworkTest01 {
    //思路：
    /*
        先获取 D:\java\java 下的目录结构
     */
    static String rootPath = "D:\\java\\java";
    static String aimPath = "C:\\Users\\17502\\Desktop";
    public static void main(String[] args) {

        HomeworkTest01.copy(rootPath);


    }

    //File 对象，不初始化的标识符。
    static File f;

    static public void copy(String sourceRootPath){
        f =  new File(sourceRootPath);
        iteration(f);
    }

    static  public void iteration(File f){
        if (f.listFiles() == null){ //当f为最后一个file时
          if (f.isDirectory()){
                String aimPath = HomeworkTest01.aimAbsolutePath(f);
                File ff;
              if (!(ff = (new File(aimPath))).exists()) {
                  ff.mkdirs();
              }
              return ;
          }else if(f.isFile()){
              File parentFile = f.getParentFile();
              String aimParentPath = aimAbsolutePath(parentFile);
              File ff = new File(aimParentPath);
              if (!ff.exists()) {
                  ff.mkdirs();
              }
                HomeworkTest01.copys(f.getAbsolutePath(),aimAbsolutePath(f));
                return;
            }
        }

        if (f.listFiles() != null){

            for (File ff : f.listFiles()){
                HomeworkTest01.iteration(ff);
            }
        }

    }

    public static void copys(String absolutePath, String aimAbsolutePath) {
        FileOutputStream fos = null;
        FileInputStream fis  = null;

        try {
            fis = new FileInputStream(absolutePath);
            fos = new FileOutputStream(aimAbsolutePath);
            byte[] b = new byte[1024*1024];
            int readSize ;
            while ((readSize = fis.read(b)) != -1){
                fos.write(b,0,readSize);
            }
            fos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 获取当前File 文件在目标处的绝对路径
     * @param f 当前文件File对象
     * @return 返回目标绝对路径
     */
    public static String aimAbsolutePath(File f) {
        return f.getAbsolutePath().replace(rootPath,aimPath);
    }
}
