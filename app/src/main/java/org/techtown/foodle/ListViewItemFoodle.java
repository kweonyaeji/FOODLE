package org.techtown.foodle;

import android.graphics.drawable.Drawable;

public class ListViewItemFoodle {
    private String nameStr;
    private String posStr;
    private Drawable iconDrawable ;
    private String titleStr ;
    private String descStr1;
    private String descStr2;

    public void setDesc1(String name) { nameStr = name; }
    public void setDesc2(String pos) { posStr = pos;}
    public void setIcon(Drawable icon) {
        iconDrawable = icon ;
    }
    public void setTitle(String title) {
        titleStr = title ;
    }
    public void setDesc3(String desc1) {
        descStr1 = desc1 ;
    }
    public void setDesc4(String desc2) { descStr2 = desc2; }



    public String getDesc1(){ return this.nameStr; }
    public String getDesc2() {return this.posStr; }
    public Drawable getIcon() {
        return this.iconDrawable ;
    }
    public String getTitle() {
        return this.titleStr ;
    }
    public String getDesc3() {
        return this.descStr1 ;
    }
    public String getDesc4() {
        return this.descStr2 ;
    }


}
