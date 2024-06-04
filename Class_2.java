public class Class_2{
    static void print(int n){
        if (n==0){
            return;
        }
        System.out.print("Riya ");
        System.out.println("Sharma");
        print(n - 1);
    }
    
    public static void main(String[] args){
        print(5);
    }
}
