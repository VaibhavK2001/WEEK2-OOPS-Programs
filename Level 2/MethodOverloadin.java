public class MethodOverloadin {
    
    public static void sum1(int n1, int n2){
        System.out.println(n1 +"+"+ n2 +" = " +(n1+n2));
    }

    public static void sum2(int n1, int n2, int n3){
        System.out.println(n1 +"+"+ n2 + "+"+n3+ " = " +(n1+n2+n3));
    }

    public static void sum3(int n1, int n2, int n3, int n4){
        System.out.println(n1 +"+"+n2+"+"+n3+ "+"+n4+" = " +(n1+n2+n3+n4));
    }

    public static void main(String[] args) {
        
        int n1=10, n2=23, n3=43, n4=54;

        sum1(n1, n2);
        sum2(n1, n2, n3);
        sum3(n1, n2, n3, n4);
    }
}
