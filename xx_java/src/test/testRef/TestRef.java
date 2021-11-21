package test.testRef;

public class TestRef {
    public static void main(String[] args) {
        String data = "vero";
        Wrapper w1 = new Wrapper(data);
        System.out.println("data1===" + w1.data);
        Wrapper w2 = new Wrapper(data);
        data = null;
        System.out.println("data2===" + w2.data);

    }


    static class Wrapper {
        String data;

        public Wrapper(String data) {
            this.data = data;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
    }
}
