import java.util.Scanner;

/**
 * Created by cl on 2015/9/1.
 */
public class CallbackDemo {

    public static void main(String [] ags){
        Button btnLogin = new Button();
        Button btnRegister = new Button();
        Button btnTest ;
        btnTest = new Button();
        Button btn4 = new Button();

        setListener(btnLogin, btnRegister,btnTest,btn4);

        System.out.println("1-点击登陆按钮");
        System.out.println("2-点击注册按钮");
        System.out.println("3-点击测试按钮");
        System.out.println("4-点击4按钮");

        int select = new Scanner(System.in).nextInt();

        switch (select){
            case 1:
                btnLogin.performClick();
                break;
            case 2:
                btnRegister.performClick();
                break;
            case 3:
              //  btnTest.performClick();
                break;
            case 4:
                btn4.onClick();
                break;

        }
    }

    //预存按钮点击事件的响应代码
    private static void setListener(Button btnLogin, Button btnRegister ,Button btnTest,Button btn4) {
       OnClickListener Listener = new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("执行登陆操作");
            }
        };

        OnClickListener Listener1;
          Listener1 = new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("执行测试操作");
            }
        };

        btnLogin.setmOnClickListener(Listener);

        btnRegister.setmOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.print("执行注册操作");
            }
        });

        btnTest.setmOnClickListener(Listener1);

    }
}
