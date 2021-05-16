package datastructure;

import java.util.*;
/**
 * Created by santhosh.saminathan on 03/04/19.
 */
public class Coding4 {
    public static void main(String args[]){
        int[][] input1={{3,5}, {5,1}, {1,3}};
        int[][] input2={{1,2}, {2,3}, {1,3}};
        if(checkTaskCompletion(input1)){
            System.out.println("Possible");
        }else{
            System.out.println("Not Possible");
        }
    }

    private static boolean checkTaskCompletion(int[][] input){

        Map<Integer, Integer> m = new HashMap<>();
        for(int[] i : input){
            m.put(i[0], i[1]);
        }
        Set<Integer> visited = new HashSet<>();
        Boolean isPossible = true;
        for(int[] i : input){
            if(!checkTaskCompletionHelper(visited, m, i)){
                isPossible=false;
                break;
            }
        }
        return isPossible;
    }

    private static boolean checkTaskCompletionHelper(Set<Integer> visited, Map<Integer, Integer> m, int[] curTuple) {
         if(visited.contains(curTuple[1])){
             return false;
         }
         if(!m.containsKey(curTuple[1])){
             return true;
         } else{
             visited.add(curTuple[0]);
             int[] newTuple = {curTuple[1], m.get(curTuple[1])};
             Boolean result = checkTaskCompletionHelper(visited, m, newTuple);
             visited.remove(curTuple[0]);
             return result;
        }
    }
}