/**
 * Created by cl on 2015/9/1.
 */
 class OnclickListener1 {
    void onClick() {
        System.out.print("sssss");
    }
}

public class Button {
    OnclickListener1 onclickListener1;
    private OnClickListener mOnClickListener;

    public void setmOnClickListener(OnClickListener l){
        this.mOnClickListener = l;

    }

    //按钮点击时，回调方法
    public void performClick(){

        mOnClickListener.onClick();

    }

    public void onClick(){
       // onclickListener1.onClick();
        System.out.println("sssssssssss");
    }

}
