package c50_Callback;


/**
 * 接口回调
 * Created by Administrator on 2016/4/5.
 */


public class Button extends View{

    @Override
    public void onTouchEvent(String action) {
        super.onTouchEvent(action);
        if (action.equals(ACTION_UP)){
           listener.onClick(this);
        }
    }

    /**
     * 接口回调
     * @param listener
     */

    private OnClickListener listener;
    public void setOnClickListener(OnClickListener listener){
        this.listener=listener;
    }


    public interface OnClickListener{
        /**
         * 点击回调
         */
        void onClick(View view);
    }

}


class View {
    public static final String ACTION_DOWN="down";
    public static final String ACTION_UP="up";

    public void onTouchEvent(String action){
        if (!action.equals(ACTION_DOWN) && !action.equals(ACTION_UP)){
            throw new IllegalArgumentException("事件错误");
        }else if (action.equals(ACTION_DOWN)){
            System.out.println("鼠标被按下了");
        }else if (action.equals(ACTION_UP)){
            System.out.println("鼠标被抬起了");
        }
    }
}

class Test{
    public static void main(String[] args) {
        Button button1=new Button();

//        button1.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        for (int i=0;i<=10;i++){
//                            System.out.println(i);
//                        }
//                    }
//                }).start();
//            }
//        });

//        button1.onTouchEvent(View.ACTION_UP);

        //JDK8新特性：Lambda表达式代替匿名累不累
        button1.setOnClickListener(view -> System.out.println(0));

        //Runnable runnable = ()->func();
        button1.setOnClickListener(view ->
                new Thread(()->{
                    for (int i=0;i<=10;i++){
                        System.out.println(i);
                    }
                }).start()
        );

        button1.onTouchEvent(View.ACTION_UP);
    }
}