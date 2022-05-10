package by.intexsoft.study.task3;

public class Euclid {
    public long nod(long a, long b){
        System.out.println(a + " " + b);
        if(a == 0) return b;
        if (b == 0) return a;
        if(a>= b)
            return nod(a%b, b);
        else {
            return nod(a, b%a);
        }
    }

    public static void main (String [] args){

        //new Euclid().nod(1141*2231, 5412*1141);
        new Euclid().nod(16, 4*345);
    }
}
