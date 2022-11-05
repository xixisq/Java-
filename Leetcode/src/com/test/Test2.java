package com.test;

/**
 * @author ganccl
 * @create 2022-09-22 19:29
 */
public class Test2 {
    public static String ConvertCharA(String str)
    {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            if(chars[i] == 'z'){
                chars[i] = 'a';
                continue;
            }
            else if(chars[i] >= 97 && chars[i] <122){
                chars[i] = (char) (chars[i] + 1);

            }else if(chars[i] == '\n'){
                System.out.println('\n');
            }

        }
        return new String(chars);
    }

    public static void main(String[] args)
    {
        String str = "Adb.Bcdza\nabck.LLhj";
//        System.out.println(str);
        System.out.println(ConvertCharA(str));
    }
}
