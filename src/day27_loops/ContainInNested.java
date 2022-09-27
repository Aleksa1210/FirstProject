package day27_loops;

public class ContainInNested {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            System.out.println("i" + i);
            if (i == 1 || i == 2){
                continue;
            } // continue; here is skipping i1 and i2 full part



            for (int j = 0; j < 3; j++) {

                if (j == 1){
                    continue;
                } // continue; here is skipping iteration when j is 1, so it does not get

                System.out.println("\tj" + j);
            }
        }













    }
}
