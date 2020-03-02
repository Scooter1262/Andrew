package main.home1;

import main.home1.Instrument;

public class Cello extends Instrument {
    public Cello(String name, String sound, String desc, String history) {
        super(name, sound, desc, history);
    }

    @Override
    public void setName(String name) { setName("Cello"); }

    @Override
    public void setSound(String sound) {
        super.setSound("чтпат");
    }

    @Override
    public void setDesc(String desc) {
        super.setDesc("Хз что это такое");
    }

    @Override
    public void setHistory(String history) {
        super.setHistory("В каком то году была создана");
    }



}
