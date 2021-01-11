import java.util.Scanner;
import java.util.Arrays;

public class DeleteElements {

    public static void Delete(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                int indexDel = i;
                for (int j = indexDel; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length-1] = 0;
                i--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 3, 2, 1};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị phần tử cần xóa: ");
        int x = sc.nextInt();
        Delete(arr,x);
        System.out.print(Arrays.toString(arr));
    }
}


