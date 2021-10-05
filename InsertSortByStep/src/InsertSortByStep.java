import java.util.Scanner;

public class InsertSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            System.out.println("Value in " + i + " : ");
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println();
        insertSortByStep(list);
    }
    public static void insertSortByStep(int[] list) {
        int i, j, key;
        int n = list.length;
        for ( i = 1; i < n; i++) {
            key= list[i];
            j=i-1;

            while (j>=0 && list[j]>key){
                list[j+1]= list[j];
                j--;
            }
            list[j+1]= key;
        }
        System.out.println("List after the sort: ");

        for (int x : list) {
            System.out.print(x + "\t");
        }
        System.out.println();
    }
}
