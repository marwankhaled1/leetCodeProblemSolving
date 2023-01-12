
public class Main {
    public static void main(String[] args) {






    }

    public static String timeConversion(String s) {

        // 12AM-->00
        //1am-12pm-->nothing
        //1pm-11pm-->+12
      char AmPM=s.charAt(8);
      String militaryHour=s.substring(0,2);

      if(AmPM=='A'){

          if(s.substring(0, 2).equals("12")){
              militaryHour="00";
          }

      }
      else {
          if(s.substring(0, 2).equals("12")){
              militaryHour=s.substring(0,2);
          }
           else {
              militaryHour = String.valueOf(Integer.parseInt(s.substring(0, 2), 10) + 12);

           }

      }



          return militaryHour+":"+s.substring(3,5)+":"+s.substring(6,8);


    }
}
