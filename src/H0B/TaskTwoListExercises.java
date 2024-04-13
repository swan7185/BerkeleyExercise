package H0B;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskTwoListExercises {
    public int sum(List<Integer> L){
        int sum = 0;
        if(L == null || L.isEmpty()){
            //因为不确定元素总和为0，还是入参为空，因此加了判空条件的日志打印
            System.out.println("入参列表元素为空");
            return  sum;
        }
        for(Integer i: L){
            sum = sum + i;
        }
        return sum;
    }

    public List<Integer> evens(List<Integer> L){
        if(L == null || L.isEmpty()){
            //因为不确定是纯奇数数组，还是入参为空，因此加了判空条件的日志打印
            System.out.println("入参列表元素为空");
            return  new ArrayList<>();
        }
//        for(Integer each: L){
//            if(each % 2 != 0)
//                L.remove(each);
//        }
        L.stream().filter(each-> each%2 ==0).collect(Collectors.toList());
        return L;
    }

    public List<Integer> common(List<Integer> L1, List<Integer> L2){
        List<Integer> common = new ArrayList<>();
        if(L1 == null || L1.isEmpty() || L2 == null || L2.isEmpty()){
            System.out.println("入参列表元素为空");
            return common;
        }
        //重复的元素不用输出，因此不做重复元素的遍历
        L1.stream().distinct().collect(Collectors.toList());
        for(Integer i: L1){
            for(Integer j: L2){
                if(j == i){
                    common.add(i);
                    //break只会跳出第一层循环，不会跳出外层循环
                    break;
                }
            }
        }
        return common;
    }
    public int countOccurrenceOfChar(List<String> words, char c){
        int countOccurrenceOfChar = 0;
        if(words == null || words.isEmpty()){
            System.out.println("入参列表元素为空");
            return countOccurrenceOfChar;
        }
        String indexSubString = "";
        for(int i = 0; i<words.size(); i++){
            indexSubString = words.get(i);
            for(int j = 0; j<indexSubString.length(); j++){
                if(indexSubString.charAt(j) == c){
                    countOccurrenceOfChar = countOccurrenceOfChar+1;
                }
            }
        }
        return countOccurrenceOfChar;
    }
}
