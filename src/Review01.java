
public class Review01 {
    public static void main(String[] args) {
        int num1= 1500; //商品価格
        double num2= 0.1;  //消費税
      int num = tax(num1, num2);
        System.out.println(num1 + "円の商品の税込価格は" + (num1 + num) +  "円で消費税は" +num + "円です");
    }
    private static int tax(int num1, double num2) {
        int num = 0;
        num = (int) (num1 * num2);
        return num;
        }
        }