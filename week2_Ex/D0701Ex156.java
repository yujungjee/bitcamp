package week2_Ex;

import java.util.*; 

class D0701Ex156 { 
      public static void main(String[] args) { 
            //if(args.length !=2) { 
            //      System.out.println("Usage : java CalendarEx6 2015 9"); 
            //      return; 
            //} 
            int year = 2020;//Integer.parseInt(args[0]); 
            int month = 7;//Integer.parseInt(args[1]); 

            int START_DAY_OF_WEEK = 0; 
            int END_DAY = 0; 

            Calendar sDay = Calendar.getInstance();       // 시작일 
            Calendar eDay = Calendar.getInstance();       // 끝일 

            // 월의 경우 0 부터 11까지의 값을 가지므로 1을 빼주어야 한다. 
            // 예를 들어, 2004년 11월 1일은 sDay.set(2004, 10, 1);과 같이 해줘야 한다. 
            sDay.set(year, month-1, 1);  // 2015.09.01          
            eDay.set(year, month, 1);    // 2015.10.01

            // 다음달의 첫날에서 하루를 빼면 현재달의 마지막 날이 된다. 
            // 12월 1일에서 하루를 빼면 11월 30일이 된다. 
            eDay.add(Calendar.DATE, -1); // 2015.09.30               
            
            // 첫 번째 요일이 무슨 요일인지 알아낸다. 
            START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK); // 4, 수요일
            // eDay에 지정된 날짜를 얻어온다. 
            END_DAY = eDay.get(Calendar.DATE); // 30
            
            System.out.println("      " + year +"년 " + month +"월"); 
            System.out.println(" SU MO TU WE TH FR SA"); // 요일표시 

            // 해당 월의 1일이 어느 요일인지에 따라서 공백을 출력한다. 
            // 만일 1일이 수요일이라면 공백을 세 번 찍는다.(일요일부터 시작) 
            for(int i=1; i < START_DAY_OF_WEEK; i++) { 
                  System.out.print("   "); 
            } 

            for(int i=1, n=START_DAY_OF_WEEK ; i <= END_DAY; i++, n++) { 
               // 10보다 작으면 공백2개, 10이상이면 공백1개
                  System.out.print((i < 10)? "  "+i : " "+i ); 
                  if( n%7==0) System.out.println(); 
            } 
      } 
      
//   public static String toString(Calendar date) {
//  return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1) +"월 " + date.get(Calendar.DATE) + "일";
// }      
} 