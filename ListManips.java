import java.util.List;

public class ListManips {
    
    // Write a method that takes a list of numbers as input and returns the sum of all the even numbers in the list.
    public static int ListSum(List<Integer> ints){
        if (ints.isEmpty()){
            System.out.println("Sum:");
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < ints.size(); i++){
            int num = ints.get(i);
            if (num % 2 == 0){
                sum = sum + num;
            }
        }
        System.out.println("Sum:");
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = new List<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(7);
        System.out.println("List: " + list);
        ListSum(list);
       }
}
