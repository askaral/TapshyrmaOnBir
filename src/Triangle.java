public class Triangle {

    int a;
    int b;
    int c;

     public void area(){
         int s = 0;
         int k = a+b+c;
         k/=2;
         s= k*(k-a)*(k-b)*(k-c);
         System.out.println("Triangle area: "+Math.sqrt(s)+" m2");




}
}
