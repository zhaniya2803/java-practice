package Yrok_2023_12_11;

public class Test {
    public static void main(String[] args) {
        int count = 0;
        Mix4[] m4a = new Mix4[20];
        int x = 0;
        while (x < 20) {
            m4a[x] = new Mix4();
            m4a[x].counter = m4a[x].counter + 1;
            count = count + 1;
            count = count + m4a[x].maybeNew(x);
            x = x + 1;
        }
        System.out.println(count + " " + m4a[1].counter);
    }
}

class Mix4 {
    int counter = 0;
    public int maybeNew(int index) {
        if (index < 5) {
            return 1;
        }
        return 0;
    }
}

