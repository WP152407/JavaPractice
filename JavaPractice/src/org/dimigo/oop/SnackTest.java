package org.dimigo.oop;

public class SnackTest {

      /**
       * @param args
       */
      public static void main(String[] args) {
         Snack[] snacks={
        		 new Snack("�����","���",1100,2),
        		 new Snack("�ܯ�","ũ���",1200,1),
        		 new Snack("��Ϲ���Ĩ","����",1500,4)};
         for(int i=0;i<3;i++){
            System.out.println(snacks[i].toString());
          
         }
         System.out.println("�� ���� �ݾ� : "+String.format("%,d",(snacks[0].calcPrice()+snacks[1].calcPrice()+snacks[2].calcPrice()))+"��");
      }

   }