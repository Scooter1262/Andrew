package main.home1;

import main.home1.Instrument;

public class Trombone extends Instrument {
    public Trombone(String name, String sound, String desc, String history) {
        super(name, sound, desc, history);
    }
    @Override
    public void setName(String name) { setName("Trombone"); }
    @Override
    public void setSound(String sound) {
        super.setSound("Сырыарпы");
    }

    @Override
    public void setDesc(String desc) {
        super.setDesc("Фигня похожая на большую гитару");
    }

    @Override
    public void setHistory(String history) {
        super.setHistory("В каком то году была создана");
    }



}
