package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 1;
        while (count != 6){
            System.out.println("count value is " + count);
            count++;
        }
        for (count = 1; count< 7; count++){
            System.out.println("count value is " + count);
        }
        count = 1;
        while (true){
            if(count == 6){
                break;
            }
            System.out.println("count value is " + count);
            count++;
        }
        count = 1;
        do {
            System.out.println("count value was " + count);
            count++;
        } while (count != 6);

        System.out.println(isEvenNumber(4));
        System.out.println(isEvenNumber(5));
        System.out.println(isEvenNumber(6));
        System.out.println(isEvenNumber(7));
        System.out.println(isEvenNumber(8));
        System.out.println(isEvenNumber(9));
        System.out.println(isEvenNumber(10));
        
    }
    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        }
        return false;
    }
}
