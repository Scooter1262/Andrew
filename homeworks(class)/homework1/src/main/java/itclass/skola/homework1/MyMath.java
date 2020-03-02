package itclass.skola.homework1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyMath {
    private int a;
    private int b;

    public MyMath(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getMin() {
        return Math.min(a, b);
    }

    public int getMax() {
        return Math.max(a, b);
    }
}
