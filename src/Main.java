public class Main {
    public static void main(String[] args) {
        // 1
        int [] inputArray1 = new int[5];
        inputArray1[0] = 134;
        inputArray1[1] = 435;
        inputArray1[2] = 654;
        inputArray1[3] = 767;
        inputArray1[4] = 988;
        float [] outputArray1 = new float[4];
        float summ = 0;
        for (int elem : inputArray1){
            summ += elem;
        }
        outputArray1[0] = summ;
        float maxx = inputArray1[0];
        float minn = inputArray1[0];
        for (int elem : inputArray1){
            if (maxx < elem){
                maxx = elem;
            }
            if (minn > elem) {
                minn = elem;
            }
        }
        outputArray1[1] = maxx;
        outputArray1[2] = minn;
        outputArray1[3] = summ / inputArray1.length;
        for (int i = 0; i < inputArray1.length; i++){
            if (inputArray1.length-1 == i){
                System.out.println(inputArray1[i]);
                break;
            }
            System.out.print(inputArray1[i] + ", ");
        }
        for (int i = 0; i < outputArray1.length; i++){
            if (outputArray1.length-1 == i){
                System.out.println(outputArray1[i]);
                break;
            }
            System.out.print(outputArray1[i] + ", ");
        }
        // 2
        int [] inputArray2 = new int[5];
        inputArray2[0] = 56786;
        inputArray2[1] = 87765;
        inputArray2[2] = 49999;
        inputArray2[3] = 34567;
        inputArray2[4] = 67867;
        float [] outputArray2 = new float[5];
        int ii = 0;
        for (int elem : inputArray2){
            outputArray2[ii] = elem * 13f / 100;
            ii++;
        }
        for (int i = 0; i < inputArray2.length; i++){
            if (inputArray2.length-1 == i){
                System.out.println(inputArray2[i]);
                break;
            }
            System.out.print(inputArray2[i] + ", ");
        }
        for (int i = 0; i < outputArray2.length; i++){
            if (outputArray2.length-1 == i){
                System.out.println(outputArray2[i]);
                break;
            }
            System.out.print(outputArray2[i] + ", ");
        }
        // 3
        int [] inputArray3 = new int[5];
        inputArray3[0] = 3456;
        inputArray3[1] = 4456;
        inputArray3[2] = 5768;
        inputArray3[3] = 6786;
        inputArray3[4] = 1234;
        boolean [] outputArray3 = new boolean[5];
        int iii = 0;
        for (int elem : inputArray3){
            if (elem > 5000){
                outputArray3[iii] = true;
            }
            else{
                outputArray3[iii] = false;
            }
            iii++;
        }
        for (int i = 0; i < inputArray3.length; i++){
            if (inputArray3.length-1 == i){
                System.out.println(inputArray3[i]);
                break;
            }
            System.out.print(inputArray3[i] + ", ");
        }
        for (int i = 0; i < outputArray3.length; i++){
            if (outputArray3.length-1 == i){
                System.out.println(outputArray3[i]);
                break;
            }
            System.out.print(outputArray3[i] + ", ");
        }
        // 4
        int [] inputArray4 = new int[5];
        inputArray4[0] = 4687;
        inputArray4[1] = 7566;
        inputArray4[2] = 8765;
        inputArray4[3] = -1111;
        inputArray4[4] = 3355;
        boolean outputArray4 = true;
        for (int elem : inputArray4){
            if (elem < 0){
                outputArray4 = false;
                break;
            }
        }
        for (int i = 0; i < inputArray4.length; i++){
            if (inputArray4.length-1 == i){
                System.out.println(inputArray4[i]);
                break;
            }
            System.out.print(inputArray4[i] + ", ");
        }
        System.out.print(outputArray4);
        // 5
        int [] inputArray5 = new int[5];
        inputArray5[0] = 32677;
        inputArray5[1] = -457687;
        inputArray5[2] = 678438;
        inputArray5[3] = -6235;
        inputArray5[4] = 2645;
        int outputArray5 = 0;
        for (int elem : inputArray5){
            if (elem > 0){
                outputArray5++;
            }
        }
        for (int i = 0; i < inputArray5.length; i++){
            if (inputArray5.length-1 == i){
                System.out.println(inputArray5[i]);
                break;
            }
            System.out.print(inputArray5[i] + ", ");
        }
        System.out.println(outputArray5);
    }
}