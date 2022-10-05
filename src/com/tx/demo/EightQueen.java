package com.tx.demo;//public class com.tx.demo.EightQueen{
//
//    public static void main(String[] args){
//        int[] queen = new int[8];
//        for(int i = 0; i < 8; i++){
//            queen[i] = -1;
//        }
//        int index = 0;
//        startQueen(queen, index);
//    }
//
//    public static void startQueen(int[] queen, int index){
//        if(index == 8){
//            for(int i = 0; i < 8; i++){
//                System.out.print(queen[i]+" ");
//            }
//            System.out.println();
//            return;
//        }
//        for(int i = 0; i<8; i++){
//            queen[index] = i;
//            if(judge(queen, index)){
//                startQueen(queen, index+1);
//            }
//        }
//    }
//
//    public static boolean judge(int[] queen, int index){
//        for(int i = 0; i < index; i++){
//            if(queen[i] == queen[index]){
//                return false;
//            }
//        }
//        int remind = index - 1;
//        int revalue = queen[index] - 1;
//
//        while(remind >= 0 && revalue >= 0){
//            if(queen[remind] == revalue){
//                return false;
//            }else{
//                remind--;
//                revalue--;
//            }
//        }
//        remind = index - 1;
//        int revalueLater = queen[index] + 1;
//        while(remind >= 0 && revalueLater <= 7){
//            if(queen[remind] == revalueLater){
//                return false;
//            }else{
//                remind--;
//                revalueLater++;
//            }
//        }
//        return true;
//
//    }
//}

public class EightQueen{

    int max = 8;
    int[] queen = new int[max];


    public static void main(String[] args){


        EightQueen queen = new EightQueen();
        queen.startQueen(0);


    }
    private void print(){
        for(int i = 0; i < 8; i++){
            System.out.print(queen[i]+" ");
        }
        System.out.println();
    }

    public void startQueen(int index){
        if(index == max){
            print();
            return;
        }

        for(int i = 0; i < max; i++){

            queen[index] = i;
            if(judge(index)){
                startQueen(index+1);
            }
        }

    }

    public boolean judge(int index){
        for(int i = 0; i < index; i++){
            if(queen[i] == queen[index] || Math.abs(index-i) == Math.abs(queen[index] - queen[i])){
                return false;
            }


        }

        return true;
    }
}

