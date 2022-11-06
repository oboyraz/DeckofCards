import java.util.ArrayList;
import java.util.List;

public class DeckofCards {
    /*
    You are given an integer array deck where deck[i] represents the number written on the ith card.

Partition the cards into one or more groups such that:

Each group has exactly x cards where x > 1, and
All the cards in one group have the same integer written on them.
Return true if such partition is possible, or false otherwise.

to see question => https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
     */
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,4,3,2,1};
        //int[] arr1 = {1,1,1,2,2,2,3,3};

        int control = 0;
        boolean cardControl=true;
        int var;
        List<Integer> arrControl = new ArrayList<>();
        for (int i = 0; i <arr1.length ; i++) {
            var = 0;
            for (int j = 0; j <arr1.length ; j++) {
                if (arr1[i]==arr1[j]){
                    var++;
                }
            }
            arrControl.add(var);
        }
        control = arrControl.get(0);
        for (int i = 0; i <arrControl.size() ; i++) {
            if (control != arrControl.get(i)){
                cardControl =false;
            }
        }
        if (cardControl){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        System.out.println(arrControl);
    }
}