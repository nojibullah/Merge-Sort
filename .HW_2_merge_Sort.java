//MD Nojibullah
//Hw2
//9/18/22

public class HW_2_merge_Sort {

    public void printArray(int[] a) {
        int n = a.length;
        for(int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }

    public void sort(int[] a, int[] temp, int p, int r){
        if(p < r){ 
            int q = p + (r - p) / 2; 
            sort(a, temp, p, q);
            sort(a, temp, q + 1, r);
            merge(a, temp, p, q, r);
        }
    }

    private void merge(int[] a, int[] temp, int p, int q, int r) {
        for(int i = p; i <= r; i++){
            temp[i] = a[i];
        }
        int i = p; 
        int j = q + 1; 
        int k = p; 

        while(i <= q && j <= r){
            if(temp[i] <= temp[j]){
                a[k] = temp[i];
                i++;
            } else {
                a[k] = temp[j];
                j++;
            }
            k++;
        }

        while(i <= q){
            a[k] = temp[i];
            k++;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] {2, 1, 6, 3, 4};
        HW_2_merge_Sort ms = new HW_2_merge_Sort();
        ms.sort(a, new int[a.length], 0, a.length - 1);
        ms.printArray(a);
    }

}
