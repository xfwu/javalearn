import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;

import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.lang.StringBuilder;

class myLM{
 public static void main(String[] args)
 {
   int a[];
   String s[];

   s = new String[10];
   a = new int[10];
   s[0] = "This is the 1 line";
   s[1] = "This is the 1 line";
   s[2] = "This is the 1 line";
   s[3] = "This is the 1 line";
   s[4] = "This is the 1 line";
   s[5] = "This is the 1 line";
   s[6] = "This is the 1 line";
   s[7] = "This is the 1 line";
   s[8] = "This is the 1 line";
   s[9] = "This is the 1 line";

   int counter = 0;
   for( int i = 0; i <10; i = i+1)
   {
     for (String w : s[i].split(" ")){
       if(w.equals("This")){
        counter += 1;
       }
     }
   }

     System.out.println(counter);
 }
}

