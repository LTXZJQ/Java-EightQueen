package com.tx.demo;

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

