package Day4.Quest2;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[100];
        int[] outarr = new int[4];
        outarr[1] = 999999;
        for (int i : arr) {
            arr[i] = (int) (Math.random() * 10001);
            System.out.println(arr[i]);
            
            if (outarr[0] < arr[i])
                outarr[0] = arr[i];

            if (outarr[1] > arr[i])
                outarr[1] = arr[i];

            if (arr[i] % 10 == 0) {
                outarr[2] ++;
                outarr[3] += arr[i];
            }
        }
        System.out.println("Наибольший элемент массива: " + outarr[0]);
        System.out.println("Наименьший элемент массива: " + outarr[1]);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + outarr[2]);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + outarr[3]);
    }
}
