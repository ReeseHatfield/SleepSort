import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));

        ArrayList<Sleeper> sleepers = new ArrayList<>(); 
        for(int i = 0; i < list.size(); i++){
            sleepers.add(new Sleeper(list.get(i)));
            sleepers.get(i).start();
        }

        ArrayList<Integer> sortedList = new ArrayList<>();
        while(sortedList.size() != list.size()){

            for(Sleeper t : sleepers){

                if(t.getNum() != -1){
                    sortedList.add(t.getNum());
                    sleepers.remove(t);
                    break;

                }
            }
        }


        System.out.println("Sorted list: " + sortedList);

        

    }
}
