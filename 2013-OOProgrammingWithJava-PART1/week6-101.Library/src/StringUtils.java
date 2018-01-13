/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryanw
 **/
public class StringUtils {

    public static boolean included(String word, String searched) {
        String wordAlt = word.toUpperCase();
        String searchedAlt = searched.toUpperCase().trim();
        return !(wordAlt.isEmpty() || searchedAlt.isEmpty() || !wordAlt.contains(searchedAlt));
    }
}
