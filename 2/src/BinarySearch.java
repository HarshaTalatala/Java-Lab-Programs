import java.util.*;
class Binary{
    int Search(int[] a,int n,int ele){
        int low=0,high=n-1,mid;
        while(low <= high){
            mid = (low+high)/2;
            if(a[mid] == ele){
                return mid;
            }
            else if (ele < a[mid]) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return -1;
    }
}
class BinarySearch {
    public static void main(String[] args) {
        int n,i,se,pos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of list : ");
        n = sc.nextInt();
        System.out.println("Enter elements into array : ");
        int[] a = new int[n];
        for (i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Enter searching element : ");
        se = sc.nextInt();
        Binary bs = new Binary();
        pos = bs.Search(a,n,se);
        if (pos != -1)
            System.out.println("Element "+se+" found at index : "+pos);
        else
            System.out.println("Element not found");
    }
}
