package main.home1;
import main.home1.Instrument;
public class Violin extends Instrument {
    public Violin(String name, String sound, String desc, String history) {
        super(name, sound, desc, history);
    }

    @Override
    public void setName(String name) {
      super.setName("Violin");
    }

    @Override
    public void setSound(String sound) {
        super.setSound("Сырыарпы");
    }

    @Override
    public void setDesc(String desc) {
        super.setDesc("Фигня похожая на маленькую гитару");
    }

    @Override
    public void setHistory(String history) {
        super.setHistory("В каком то году была создана");
    }

}
