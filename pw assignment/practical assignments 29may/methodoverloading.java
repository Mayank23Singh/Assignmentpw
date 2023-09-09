public class methodoverloading {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public static void main(String[] args) {
        methodoverloading demo=new methodoverloading();
        int result1 = demo.add(1, 2);
        int result2 = demo.add(1, 2, 3);
        int result3 = demo.add(1, 2, 3, 4);

        System.out.println("Result 1:"+result1);
        System.out.println("Result 2:"+result2);
        System.out.println("Result 2:"+result2);
    }
}
