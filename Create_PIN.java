import java.io.*;
import java.util.*;


public class Create_PIN {

    public static void main(String[] args) {
int rem1=0,rem2=0,rem3=0;
        if(100<=input1 && input1<=999 && 100<=input2 && input2<=999 && 100<=input3 && input3<=999)
        {
            
            if(input1%10<input2%10)
            rem1= input1%10;
            else if(input2%10<input3%10)
            rem1= input2%10;
            else
            rem1=input3%10;
            
            if((input1%100)/10<(input2%100)/10)
            rem2= (input1%100)/10;
            else if((input2%100)/10<(input3%100)/10)
            rem2= (input2%100)/10;
            else
            rem2= (input3%100)/10;
            
            if((input1%1000)/100<(input2%1000)/100)
            rem3= (input1%1000)/100;
            else if((input2%1000)/100<(input3%1000)/100)
            rem3= (input2%1000)/100;
            else
            rem3= (input3%1000)/100;
            int arr[]=new int[10];
            arr[]={input1,input2,input3};
            for(int i=0;i<10;i++)
            { int x;
                x=arr[i]%10
            }

            String str = Integer.toString(rem3)+Integer.toString(rem2)+Integer.toString(rem1);
            int c= Integer.parseInt(str);
            return c;
        }
        return 0;
}
}