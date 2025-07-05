package Day4.Quest3;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[12][8];
        int[] summ = new int[3];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 51);
                summ[0] += arr[i][j];
                System.out.print(arr[i][j] + "\t");
            }

            if (summ[1] < summ[0]) {
                summ[1] = summ[0];
                summ[2] = i;
            }
            
            System.out.print("Сумма - " + summ[0] + "\n");
            summ[0] = 0;
        }
        
        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + summ[2]);
    }
    
}
