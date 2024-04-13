package H0B;

import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapExercise {

    //ASCII码对应字母的数字顺序
    // 数字对应数字表示：48（小于等于0数字）~57(大于0的数字)
    //小写字母对应数字表示字符：97(代表a)~122（代表z）
    //大写字母对应数字表示字符：65(代表A)~90（代表Z）

    //String.valueOf((char)int i): 将ASCII码对应的字母表示出来——将int i对应的顺序的字母转化出来
    //Integer.valueOf(char c):将字母转换为ASCII码——将字母对应的顺序的数字转化出来

    public TreeMap<String,Integer> letterToNum(){
        TreeMap<String,Integer> letterToNum = new TreeMap<>();
        //小写字母
        for(int i = 97; i<=97+25; i++){
            letterToNum.put(String.valueOf((char)i), i);
        }
        //大写字母
        for(int i = 65; i<=65+25; i++){
            letterToNum.put(String.valueOf((char) i),i);
        }
        return letterToNum;
    }
    public TreeMap<Integer,Integer> squares(List<Integer> nums){
        TreeMap<Integer,Integer> squares = new TreeMap<>();
        if(nums.isEmpty() || nums == null){
            return squares;
        }
        nums.stream().forEach(each->{
            squares.put(each, each*each);
        });
        return squares;

    }
    public TreeMap<Character,Integer> countWords(List<String> words){
        TreeMap<Character,Integer> countWords = new TreeMap<>();
        //将list或者collection中的字符串拼起来，用join（）第一个入参是分隔符，第二个入参是要处理的collection
        String join = String.join(",", words);
        for(int i = 0; i<join.length();i++){
            //String.charAt(int index):获取string对应索引位置i对应的字符
            //String.indexOf(Object o):获取指定元素对应的索引
            if(countWords.containsKey(join.charAt(i)))
                countWords.put(join.charAt(i),(countWords.get(join.charAt(i))+1));
            countWords.put(join.charAt(i),1);
        }
        return countWords;
    }

}
