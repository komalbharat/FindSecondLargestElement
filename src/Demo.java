class Demo1{
    int add(int a,int b){
        return a-b;
    }

}
class Demo2 extends Demo1{
    int add(int a,int b){
    return a+b;
    }
}

public class Demo {
    public static void main(String[] args) {
   // FindLargestNumner c1 =new FindLargestNumner();
        //System.out.printf(c1.add(1,5)+"Method overiding");
        Demo1 c2 = new Demo1();
        System.out.printf(c2.add(2,5)+"method");
    }
}