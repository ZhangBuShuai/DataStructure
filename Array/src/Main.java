
/**
 * Project：DataStructure
 * ClassName：  main
 * Description：
 * @Author: Zhang
 * CreateDate：  2018/11/26 20:15
 */
public class Main {
    public static void main(String[] args) {
        Array<Float> arr = new Array(20);
        for (int i = 0; i < 10; i++) {
            arr.addLast((float)i);
        }

        arr.add(1, 100f);
        System.out.println(arr);

        arr.addFirst(-1f);
        System.out.println(arr);

        arr.addLast(9999f);
        System.out.println(arr);

    }

}
