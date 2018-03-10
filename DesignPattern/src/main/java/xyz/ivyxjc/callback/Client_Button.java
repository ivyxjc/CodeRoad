package xyz.ivyxjc.callback;


interface IListener {
    void onClick();
}

/**
 * Created by jc on 11/18/2016.
 */
public class Client_Button {
    public static void main(String[] args) {
//        Button button=new Button();
//        button.setOnClickListener(new IListener() {
//            @Override
//            public void onClick() {
//                StdOut.println("onClick");
//            }
//        });
//
//        button.doClick();

        Activity activity = new Activity();
        activity.onCreate();
    }
}

class Activity implements IListener {

    private Button mButton;

    public void onCreate() {
        mButton = new Button();
        mButton.setOnClickListener(this);
        mButton.doClick();
    }

    @Override
    public void onClick() {
        System.out.println("onClick");
    }
}

class Button {

    IListener mListener;

    public void setOnClickListener(IListener listener) {
        mListener = listener;
    }

    public void doClick() {
        mListener.onClick();
    }

}



