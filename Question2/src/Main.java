import myexception2.UncheckedException;

public class Main {
    public static void main(String[] args) throws UncheckedException {
        int [] array = new int[]{1,2,3};
        for (int i = 0; i < 5; i++) {
            if(array.length >= i){
                System.out.println(array[i]);
            }else{
               throw new  UncheckedException(i);
            }
        }

    }
}
