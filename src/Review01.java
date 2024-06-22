
public class Review01 {




    public static void main(String[] args) {
        int num1= 1500; //商品価格
        double num2= 0.1;  //消費税
      int num = tax(num1, num2);
        System.out.println(num);
    }

    private static int tax(int num1, double num2) {
        System.out.println("1500円の税込価格は：" + (num1 *num2));
        int num = 0;
        //税込価格＝商品価格＋消費税
        
        num = (int) (num1 * num2);
        return num;





      







        }




    }


