public class InsertionSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
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

    public static void main(String[] args) {
        insertSortByStep(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
