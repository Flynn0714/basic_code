package doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
    1.准备牌
    2.洗牌
    3.发牌
    4.看牌
*/
public class DouDiZhu {
    //存放底牌
    public static ArrayList<String> palyer01 = new ArrayList<>();
    public static ArrayList<String> palyer02 = new ArrayList<>();
    public static ArrayList<String> palyer03 = new ArrayList<>();
    public static ArrayList<String> dipai = new ArrayList<>();

    public static void printpoker(ArrayList<String> arrayList){
        /*打印poker*/
        //取迭代器
        Iterator it = arrayList.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    public static ArrayList<String> poker(){
        /*1、准备牌*/
        //定义一个数组来存放54张牌
        System.out.println("===================准备牌==================");
        ArrayList<String> poker = new ArrayList<>();

        //定义两个数组，一个存储花色，另一个定义数值
        String[] colors = {"♠","♣","♥","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        //先把大小王添加到poker中
        poker.add("大王");
        poker.add("小王");

        //循环遍历整个数组
        for(String number : numbers){
            for (String color : colors) {
                // System.out.println(color+number );
                //组装花色牌值，并放入poker
                poker.add(color+number);
            }
        }
        return poker;
    }

    public static ArrayList<String> xi_poker(ArrayList<String> arrayList){
        /*2.洗牌*/
        System.out.println();
        System.out.println("===================洗  牌==================");
        Collections.shuffle(arrayList);
        return arrayList;
    }

    public static void Fa_poker(ArrayList<String> arrayList){
        /*3.发牌 定义四个数组储存玩家牌和底牌*/
        Object[] Poker = arrayList.toArray();
        for (int i = 0; i < arrayList.toArray().length; i++) {
            if (i<51) {
                if (i % 3 == 0) {
                    palyer01.add((String) Poker[i]);
                }
                if (i % 3 == 1) {
                    palyer02.add((String) Poker[i]);
                }
                if (i % 3 == 2) {
                    palyer03.add((String) Poker[i]);
                }
            }
            else {
                dipai.add((String)Poker[i]);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList poker = poker();  //准备牌
        printpoker(poker);

        poker = xi_poker(poker);   //洗牌
        printpoker(poker);

        Fa_poker(poker); //发牌
        //4.看牌
        System.out.println("=================player-1===================");
        printpoker(palyer01);

        System.out.println("=================player-2===================");
        printpoker(palyer02);

        System.out.println("=================player-3===================");
        printpoker(palyer03);

        System.out.println("=================dipai===================");
        printpoker(dipai);
    }
}
