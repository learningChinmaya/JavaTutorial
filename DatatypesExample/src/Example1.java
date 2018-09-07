public class Example1{
    public static void main(String[] args){
        int num1=10;
        byte num2=5;
        short num3=6;
        long num4=100L;
        float num5=5.5f;
        byte numbyte= (byte) (num2/2);
        short numshort= (short) (num3*2);
        long numlong= num1*200;
        int numint= (int) (num4+2);
        float pound= 5f;
        float kilogram= pound*0.45359237f;
        char mychar ='\u00A9';
        char mychar2= '\u00AE';
        System.out.println("finalbyte " +numbyte);
        System.out.println("finalshort " +numshort);
        System.out.println("finalLong " +numlong);
        System.out.println("finalint " +numint);
        System.out.println("finalfloat " +num5);
        System.out.println("5 pound = " +kilogram + "kg");
        System.out.println("copyright symbol " +mychar);
        System.out.println("registered symbol " +mychar2);


    }
}
