
public class min_max {

    public static void main(String[] args) 
    {
        int min= Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int array[]={40,50,60,45,25,8,3};
        for(int number:array){
          if(number<min){
            min=number;
          }
        }
        System.out.println(min);
        for(int number:array){
          if(number>max){
            max=number;
          }
        }
        System.out.println(max);
        
      }
}