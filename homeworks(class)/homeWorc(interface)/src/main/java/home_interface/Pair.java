package home_interface;

class Pair implements Math {
    private int A;
    private int B;


    public Pair(int A, int B) {
        this.A = A;
        this.B = B;

    }




    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }


    @Override
    public int Max() {// пустой должен быть
        int Res;// инициализировалли рес
        if (A > B) {
            Res = A;
        } else
            Res = B;

        return  Res;
    }

    @Override
    public int Min() {
        int Res;
        if (A < B) {
            Res = A;

        } else
            Res = B;

        return  Res;
    }


    @Override
    public double Avg() {
        int Res;
        Res = (A + B) / 2;
        return  Res;
    }

}
