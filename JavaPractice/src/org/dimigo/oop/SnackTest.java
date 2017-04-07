package org.dimigo.oop;

public class SnackTest {

      /**
       * @param args
       */
      public static void main(String[] args) {
         Snack[] snacks={
        		 new Snack("»õ¿ì±ø","³ó½É",1100,2),
        		 new Snack("ÄÜ¯…","Å©¶ó¿î",1200,1),
        		 new Snack("Çã´Ï¹öÅÍÄ¨","ÇØÅÂ",1500,4)};
         for(int i=0;i<3;i++){
            System.out.println(snacks[i].toString());
          
         }
         System.out.println("ÃÑ ±¸¸Å ±İ¾× : "+String.format("%,d",(snacks[0].calcPrice()+snacks[1].calcPrice()+snacks[2].calcPrice()))+"¿ø");
      }

   }