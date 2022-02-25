import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MultiplyException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen işlem yapmak istediğiniz ilk sayıyı giriniz : ");
        double a = scanner.nextInt();
        System.out.println("lütfen işlem yapmak istediğiniz ikinci sayıyı giriniz : ");
        double b = scanner.nextInt();
        System.out.println(" Toplama için 1 , çıkarma için 2, bölme için 3, çarpma için 4 giriniz");
        int secim = scanner.nextInt();
        CalculatorImpl calculator = new CalculatorImpl();
        switch(secim){
            case 1:
                try{
                    System.out.println("sonuc " + calculator.sum(a, b));
                }catch (ArithmeticException e){
                    e.printStackTrace();
                }catch (InputMismatchException e){
                    e.printStackTrace();
                }

                break;
            case 2:
                try {
                    System.out.println("sonuc " + calculator.difference(a, b));
                }catch (ArithmeticException e){
                    e.printStackTrace();
                }catch (InputMismatchException e){
                    e.printStackTrace();
                }

                break;
            case 3:
                try{
                    System.out.println("sonuc " + calculator.divide(a, b));
                } catch (ArithmeticException e){
                    e.printStackTrace();
                }catch (InputMismatchException e){
                    e.printStackTrace();
                }

                break;
            case 4:
                if(a > 10000 || b > 10000){
                    throw new MultiplyException("çarpılacak sayılar 10000 den büyük olamaz");
                }
                try
                {
                    System.out.println("sonuc " + calculator.multiply(a, b));
                }
                catch (ArithmeticException e){
                    e.printStackTrace();
                }catch (InputMismatchException e){
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("Geçersiz  işlem numarası!");
        }

    }
}
