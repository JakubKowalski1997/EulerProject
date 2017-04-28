/**
 * Created by Jakub Kowalski on 28.04.2017.
 */
public class Zad3{
    public static void main(String[] args) {
        int number = 1;
        int numberOfDiv=1;
        int i;
        while (numberOfDiv!=20)
        {
            if(number%numberOfDiv==0)
            {
                numberOfDiv++;
            }else
            {
                number++;
                numberOfDiv=1;
            }
        }
        System.out.println(number);
    }

}

