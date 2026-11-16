
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a, b, c;
        int countA, countB;
        
        System.out.print("length of array a: ");
        countA = sc.nextInt();
        a = new int[countA];
        System.out.println("input items:");
        //enters the numbers into array a
        for (int i=0; i<a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("length of array b: ");
        countB = sc.nextInt();

        b = new int[countB];
        System.out.println("input items:");
        //enters the numbers into array b
        for (int i=0; i<b.length; i++) {
            b[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("array a:");
        //outputs the array a
        for (int x: a) System.out.print(x + " ");
        System.out.println();
        outputs the array b
        System.out.println("array b:");
        for (int x: b) System.out.print(x + " ");
        System.out.println();

        c = new int[a.length + b.length];

        // TODO
        //if the number i in array a or array b is smaller than the previous number i, then the following is printed: "invalid input data"
        for (int i=1, j=1; i<a.length && j<b.length; i++, j++) {
            if (a[i]>a[i-1]  & b[j]>b[j-1]) {
                continue;
            } else {
                System.out.print("invalid input data");
                return;
            }
        }

        for (int i=0,j=0,k=0; i<a.length | j<b.length;k++) {
            //checks which number in array a or b is smaller and adds the smaller number to array c until the end
            if (i!= countA && j!= countB) {
                if (a[i]<b[j]) {
                    c[k] = a[i];
                    i++;
                }
                else {
                    c[k] = b[j];
                    j++;
                }
            }
            else if (i==countA) {
                c[k] = b[j];
                j++;
            }
            else if (j==countB) {
                c[k] = a[i];
                i++;
            }




        }


        System.out.println("result:");
        for (int x: c) System.out.print(x + " ");
    }
}
