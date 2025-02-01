package abhi.practice.arrays;


import java.util.*;
import java.util.stream.Collectors;

public class GroupStringsBasedOnLength {

    public static void main(String[] args) {
        String[] input = new String[] {"dog", "cat", "elephant", "rabbit", "fox", "giraffe", "ant", "zebra", "owl"};
        groupItems(input);
        System.out.println("Result from Raw");
        groupItemsRaw(input);
    }

    private static void groupItems(String[] input) {
      List<String> strList = Arrays.asList(input);

        Map<Integer, List<String>> groupedWords = strList.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupedWords);
        for(Map.Entry<Integer, List<String>> e : groupedWords.entrySet()){
            System.out.println("String of length " + e.getKey() + " " +e.getValue().size() + " Strings that are " + e.getValue());
        }
       List<String>  vals = strList.stream().flatMap(a -> Arrays.stream(a.split(""))).toList();
        System.out.println(vals);

    }

    private static void groupItemsRaw(String[] input) {
        Map<Integer, List<String>> groupedWords = new HashMap<>();
        for (String str : input){
            int strLen = str.length();
            List<String> strList = groupedWords.getOrDefault(strLen, new ArrayList<>());
            strList.add(str);
            groupedWords.put(strLen, strList);
        }
        for(Map.Entry<Integer, List<String>> e : groupedWords.entrySet()){
            System.out.println("String of length " + e.getKey() + "  " +e.getValue().size() + " Strings that are " + e.getValue() );
        }
    }
}
