package Singleton;

public class ProgramLogger {
    private static ProgramLogger instance;
    private static String logFile="This is log file.\n";

    public static ProgramLogger getInstance(){
        if(instance == null){
            instance = new ProgramLogger();
        }
        return instance;
    }
    private ProgramLogger(){
    }
    public void addLoggerInfo(String info){
        logFile+=info;
    }
    public void showLog(){
        System.out.println(logFile);
    }
}
