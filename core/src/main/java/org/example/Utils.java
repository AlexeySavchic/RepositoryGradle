package org.example;
import org.example.StringUtils;
public class Utils
{
    public static boolean isAllPositiveNumber (String ... str)
    {
        boolean isAll=true;
        for(String s:str)
        {
            isAll=StringUtils.isPositiveNumber(s);
            if (isAll == false)
            {
                break;
            }
        }
        return isAll;
    }
}
