package exceptionhandling;

public class e1 {
    static void main(String[] args) {
        int i=10,j=2,k=0;
        try {
            k=i/j;
            int[] arr ={1,2,3,4,5};
            System.out.println(arr[20]);
        }

        catch(ArithmeticException e){
                System.out.println("you cant divide by zero");
            }
        catch(ArrayIndexOutOfBoundsException e){
                System.out.println("invalid index");
            }
        catch(Exception e){
                System.out.println("unkown Expection");
            }

finally {
            System.out.println("this block will get executed");
        }
        System.out.println("hello");
    }
}
