package Day4.Quest4;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int[] summ = new int[2];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10001);
            System.out.print(arr[i]+"\t");
        }
        
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] + arr[i+1] + arr[i+2] > summ[0]) {
                summ[0] = arr[i] + arr[i+1] + arr[i+2];
                summ[1] = i;
            }
        }
        System.out.println("Максимальная сумма среди трех соседниъ элементов: " + summ[0]);
        System.out.println("Индекс первого элемента тройки: " + summ[1]);
    }
    
}
