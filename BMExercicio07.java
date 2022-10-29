public class BMExercicio07 {
    public static void main(String[] args){
        int x = 180;
        int y = x;

        while(y > 1){

            if(x % 2 == 0){
                y = x / 2;
                x = y;
            }else{
                y = 3 * x + 1;
                x = y;
            }
            System.out.print(y + "-> ");
        
        }
        
    }
}
