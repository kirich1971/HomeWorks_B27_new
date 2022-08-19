public class LoopsExamples {
    public static void main(String[] args) {

        int i = 0;

        // WHILE LOOP

        while ( i <= 5 ) {

            i ++;
            System.out.println("i=" + i);			// itr # 1 --> i = 0;   output: i= 0
                									// itr # 2 --> i = 1;   output: i= 1
        }


        i = 0;

        //   DO - WHILE  LOOP
        do {
            i ++;
            System.out.println("i=" + i);			// itr # 1 --> i = 0;   output: i= 0
        } while( i < 0 );





        // FOR - LOOP

//        for ( initializing variable and assining       ;     condition of existing = true     ;    incrementation / iteration  ) {            }

        for (int number  = 0; number  <=10 ; number ++ ) {              }




        System.out.println("------------------------------------------");

        for ( int kkk = 10, aaa = 0; (aaa < 10 && kkk <=50) ;   kkk += 10, aaa ++ ) {

            System.out.println("kkk =  " + kkk);                    // out - 10
            kkk += 10;                                              // out - 30
                                                                    // out - 50

            System.out.println("aaa= " + aaa );
        }



        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int j = 1; j < 4; j++) {
            System.out.print(array[ j ] + "-");
        }

        System.out.println();
        System.out.println("---");

        for (int k : array) {
            System.out.print(k + " ");
        }

    }
}
