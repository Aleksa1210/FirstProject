package day51_inhertitance.app;

public class AppStore {
    public static void main(String[] args) {


        Instagram inst = new Instagram(4.1);
        inst.download();
        inst.postPicture();
        System.out.println(inst);


        Youtube yout = new Youtube(5.1);
        yout.download();
        yout.watchVideo();
        System.out.println(yout);







    }
}
