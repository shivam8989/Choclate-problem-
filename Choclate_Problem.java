package Greedy_Algorithim;
import java.util.*;
public class Choclate_Problem {
    public static void main(String args[]){
        int rows = 4, colum = 6;
        Integer verticalCost [] = {2,1,3,1,4};
        Integer horizentalCost [] = {4,1,2};
        Arrays.sort(verticalCost, Collections.reverseOrder());
        Arrays.sort(horizentalCost, Collections.reverseOrder());

        int h = 0, v = 0; // POINTERS
        int hp = 1, vp = 1;
        int cost = 0;
         while(h<horizentalCost.length && v<verticalCost.length){
             if(verticalCost[v] <= horizentalCost[h]){ // HORIZENTAL CUT
                 cost += (horizentalCost[h] * vp);
                 hp++;
                 h++;
             }else{// VERTICAL CUT
                 cost += (verticalCost[v] * hp);
                 vp++;
                 v++;
             }
         }
         while(h<horizentalCost.length){
             cost += (horizentalCost[h] * vp);
             hp++;
             h++;
         }
         while(v<verticalCost.length){
             cost += (verticalCost[v] * hp);
             vp++;
             v++;
         }
         System.out.println("Minimum cost of cuts = "+cost);

    }
}
