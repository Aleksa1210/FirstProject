package day31_arrays;

public class AWS {
    public static void main(String[] args) {

        String zones = "us-east-1,us-west-1,us-west-2,us-west-3";
        String app = "etsy";
        String [] split = zones.split(",");



        for (String zone :split){
            System.out.println("Deploying etsy to " + zone);
            System.out.println("Deployment completed for " + zone);

            System.out.println();

        }
        for (int i = 0; i < split.length; i++){
            System.out.println(app + "is deploying " + split[i]);
        }















    }
}
