public class OperatorEx {
    public static void main(String[] args){
        double num1=20;
        double num2=80;
        double sum= (num1+num2)*25;
        System.out.println("sum of two double number =" +sum);
        double remainder= sum%40;
        System.out.println("remainder is "+remainder);
        if(remainder<=20){
            System.out.println("total was over the limit");
        }



    }
}
