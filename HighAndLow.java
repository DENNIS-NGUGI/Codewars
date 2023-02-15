package codewars.testing;
public class HighAndLow {
    public static void main(String []args){
        System.out.println("Our Max and Min Checker");
             
        highAndLow("-1 2 3 4 5");
     }
     
    public static String highAndLow(String numbers) {
        // Code here or
        String[] splitStr = numbers.split(" "); // split by " "
        int lNum = Integer.parseInt(splitStr[0]); //lowest number init;
        int hNum = Integer.parseInt(splitStr[0]); // highest number init;
        for(int i=1; i<splitStr.length; i++){//compare
          if(lNum>Integer.parseInt(splitStr[i]))
            lNum = Integer.parseInt(splitStr[i]);
          if(hNum<Integer.parseInt(splitStr[i]))
            hNum = Integer.parseInt(splitStr[i]);
        }
        
        //"hNum lNum";
        System.out.println("Max is:" + String.valueOf(hNum)+" "+ "\nMin is:" + String.valueOf(lNum));
        return  String.valueOf(hNum)+" "+ String.valueOf(lNum);
        
      }
}