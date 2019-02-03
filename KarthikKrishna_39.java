import java.util.Scanner;

public class KarthikKrishna_39 {

    public static void main (String args[]) {

        int i, j, n, sp;
        System.out.print ("Enter no of lines: ");
        Scanner S = new Scanner(System.in);

        n = S.nextInt ();
        sp = n;
        System.out.println (" ");

        for (i = 0; i < n; i++) {

            sp--;
            
            for (j = 0; j < sp; j++) {
                System.out.print (" "); 
            }

            if (i <= n/2) {
                
                for (j = 0; j < (2*i) + 1; j++) {
                    System.out.print ("1");
                }
            }
            
            else {

                for (j = 0; j < (2*i) + 1; j++) {

                    if (j <= (n/2)) {
                        System.out.print ("1");
                    }

                    else if (j > (2 * i-(n/2))-1) {
                        System.out.print ("1");
                    }

                    else {
                        System.out.print (" ");
                    }
                }                
            }
            System.out.println (" ");
        }

        for (i = n-2; i >= 0; i--) {

            sp++;
            
            for (j = 0; j < sp; j++) {
                System.out.print (" "); 
            }

            if (i <= n/2) {
                
                for (j = 0; j < (2*i) + 1; j++) {
                    System.out.print ("1");
                }
            }
            
            else {

                for (j = 0; j < (2*i) + 1; j++) {
                    
                    if (j <= (n/2)) {
                        System.out.print ("1");
                    }

                    else if (j > (2 * i-(n/2))-1) {
                        System.out.print ("1");
                    }

                    else {
                        System.out.print (" ");
                    }
                }                
            }
            System.out.println (" ");
        }
    }
}