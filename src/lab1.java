public class lab1 {

    public static void main(String[] args){
        String jdkVersion = System.getProperty("java.version");
        String jreVersion = System.getProperty("java.runtime.version");
        System.out.println("JDK version: " + jdkVersion);
        System.out.println("JRE version: " + jreVersion);