package main.home1;


public class Instrument {
    private String name;
    private String sound;
    private String desc;
    private String history;

    public Instrument(String name, String sound, String desc, String history) {
        this.name = name;
        this.sound = sound;
        this.desc = desc;
        this.history = history;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getHistory() {
        return history;
    }

    public String InstrumentInfo() {
        return "это инструмент " + getName() + "его звук " + getSound() + " он выглядит " + getDesc() + " был изобретён " + getHistory();

    }

}




