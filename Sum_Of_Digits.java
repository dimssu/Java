public class Sum_Of_Digits {
    static int digiSum(int n){
        if(n==0){
            return 0;
        }
        return (n % 10) + digiSum(n/10);
    }

    public static void main(String[] args) {
        System.out.println(digiSum(154));
    }
}
