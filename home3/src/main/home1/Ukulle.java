package main.home1;

import main.home1.Instrument;

public class Ukulle extends Instrument {
   public Ukulle(String name, String sound, String desc, String history) {
      super(name, sound, desc, history);
   }
   @Override
   public void setName(String name) { setName("Ukylle"); }

   @Override
   public void setSound(String sound) {
      super.setSound("ыптыапты");
   }

   @Override
   public void setDesc(String desc) {
      super.setDesc("Фигня похожая на фигню");
   }

   @Override
   public void setHistory(String history) {
      super.setHistory("В каком то году была создана");
   }



}
