class typecasting{
    public static void main(String []args){
        //widening
        int a=10;
        double b=a;
        System.out.println("widening: "+b);
        //narrowing
        double c=10.5;
        int d=(int)c;
        System.out.println("narrowing: "+d);
    }
}