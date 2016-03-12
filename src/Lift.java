import java.util.ArrayList;

/**
 * Created by Ivan Shulga on 12.03.2016.
 */
public class Lift {
    private int maxPeople = 0;
    private ArrayList<Integer> in = new ArrayList<Integer>();       //Список вошедших на каждом этаже(индекс соответствует номеру этажа)
    private ArrayList<Integer> out = new ArrayList<Integer>();      //Список вышедших на каждом этаже(индекс соответствует номеру этажа)
    private ArrayList<Integer> result = new ArrayList<Integer>();   //Список всех верных вариантов.

    public void setPeopleComeIn(int ...args) {
        for(int i: args)
            in.add(i);
    }

    public void setPeopleComeOut(int ...args) {
        for(int i: args)
            out.add(i);
    }

    public void setMaxPeople(int max) {
        this.maxPeople = max;
    }

    public void calcPeople() {
        int buff = 0;
        for (int i = 0; i <= maxPeople; i++) {
            result.add(i);
        }
        for (int i = maxPeople; i >= 0; i--) {
            buff = result.get(i);
            for (int j = 0; j < in.size(); j++) {
                buff += in.get(j);
                buff -= out.get(j);
                if (buff < 0 || buff > maxPeople)
                {
                    result.remove(i);
                    break;
                }
            }
        }
        printResult();
    }

        //Выводим минимальное и максимальное количество людей.
    private void printResult() {
        if(result.size() > 0){
            System.out.print(result.get(0) + " ");
            System.out.print(result.get(result.size()-1));
        }
    }

}
