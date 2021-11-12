package bai4;

public class Sum<N> {
    private N soA;
    private N soB;

    public Sum(N soA, N soB) {
        this.soA = soA;
        this.soB = soB;
    }

    public N getSoA() {
        return soA;
    }

    public N getSoB() {
        return soB;
    }

    public void setSoA(N soA) {
        this.soA = soA;
    }

    public void setSoB(N soB) {
        this.soB = soB;
    }

}
