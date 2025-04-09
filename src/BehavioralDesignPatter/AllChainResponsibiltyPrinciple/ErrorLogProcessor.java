package BehavioralDesignPatter.AllChainResponsibiltyPrinciple;

public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        try {
            if (logLevel == ERROR) {
                throw new Exception("message not found");
                //System.out.println("ERROR"+ message);
            }
        }catch (Exception e){
        }
        super.log(logLevel, message);
    }
}
