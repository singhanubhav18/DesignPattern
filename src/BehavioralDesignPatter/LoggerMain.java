package BehavioralDesignPatter;

public class LoggerMain {
    public static void main(String[] args) {
        LogProcessor logProcessor=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR,"Exception Happen");
        logProcessor.log(LogProcessor.DEBUG,"Debug Happen");
        logProcessor.log(LogProcessor.INFO,"Info Happen");
    }
}
