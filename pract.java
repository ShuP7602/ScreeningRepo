import java.util.*;
class Arr{

public static void main(String[] args)
{

ArrayList<String> fruits=new ArrayList<String>();
fruits.add("papaya");
fruits.add("banana");
fruits.add("apple");

System.out.println(fruits);

fruits.set (2,"grapes");

System.out.println(fruits);

System.out.println(fruits.get(0));

System.out.println(fruits.indexOf("apple"));

System.out.println(fruits.get(2));

System.out.println(fruits.isEmpty());

}

}