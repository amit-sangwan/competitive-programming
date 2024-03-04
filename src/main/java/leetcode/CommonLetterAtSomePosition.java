package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CommonLetterAtSomePosition {

    /*
    QUESTION:
    You are given an array S consisting of N strings. Every string is of the same length M.
    Your task is to find a pair of strings in array S, such that there exists a position in
    which both of the strings have the same letter. Both the index in array S and the positions
    in the strings are numbered from zero. For example, given S = ["abc", "bca", "dbe"],
    string 0 ("abc") and string 2 ("dbe") have the same letter 'b' in position 1.

    Explanation:
    To find a pair of strings in the given array S that share a common letter at some position,
    we can use nested loops. The outer loop iterates through each pair of strings in the array,
    and the inner loop iterates through each position in the strings. If we find a position
    where both strings have the same letter, we return the indices of the strings and the position.
    If no such pair is found, we return an empty array.
    * */

    @Test
    public void CommonLetterAtSomePositionTest(){
        String[] s = {"abc" , "bca", "dbe"};
        int[] res1 = {0,2,1};
        Assert.assertEquals(solution(s),res1 );

        String[] s2 = {"zzzz", "ferz", "zdsr", "fgtd"};
        int[] res2 = {0,1,3};
        Assert.assertEquals(solution(s2),res2 );

        String[] s3 = {"bdafg", "ceagi"};
        int[] res3 = {0,1,2};
        Assert.assertEquals(solution(s3),res3 );

    }

    // Function to find a pair of strings that share a common letter at some position
    public int[] solution(String[] s) {



        //amittsangwan: Type You Code Here



        return new int[0];
    }
}
