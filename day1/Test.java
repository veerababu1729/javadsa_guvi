package day1;

class Test {
    //int x; // instance variable

    public void show() {
         int x = 10;
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.show();  // initializes x
        System.out.println(obj.x);  // ✅ Works: prints 10
    }
}

