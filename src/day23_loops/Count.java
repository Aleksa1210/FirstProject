package day23_loops;

public class Count {
    public static void main(String[] args) {


        String str = "aaaahiaahimmhilhihih";
        int count = 0;

        for(int index = 0; index < str.length() - 1; index++){ // -1 didn't check last after h, - 2 will stop before last h
            if(str.charAt(index) == 'h' && str.charAt(index + 1) == 'i'){
                count++;

            }
        }
        System.out.println(count + " hi");















    }
}
