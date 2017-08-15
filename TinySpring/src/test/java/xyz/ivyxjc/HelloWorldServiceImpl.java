package xyz.ivyxjc;

/**
 * Created by ivxyjc on 2017/1/12.
 */
public class HelloWorldServiceImpl implements HelloWorldService {
    private String text;

    private OutputService outputService;

    @Override
    public void helloWorld(){
//        outputService.output(text);
        System.out.println("hello world");
    }

    @Override
    public void hello() {
        System.out.println("hello");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }
}
