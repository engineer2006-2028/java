import java.util.Scanner;

public class mars{
    static float  earthgravityAbdurasulov;
    static float  marsgravityAbdurasulov=0.38f;
    static double marsgravitydoubleAbdurasulov;
    static int    marsgravityintAbdurasulov;
    static char   marsgravitycharAbdurasulov;
    static float  marsgravity2floatAbdurasulov;
    static int    marsgravity2intAbdurasulov;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight ");
        earthgravityAbdurasulov = sc.nextFloat();
        System.out.println("converting input to float "+earthgravityAbdurasulov);
        marsgravityAbdurasulov = earthgravityAbdurasulov*marsgravityAbdurasulov;
        marsgravitydoubleAbdurasulov = marsgravityAbdurasulov;
        System.out.println("converting value to double ");
        System.out.printf("Your weight on Mars: %.4f\n",marsgravitydoubleAbdurasulov);
        marsgravityintAbdurasulov=(int) marsgravitydoubleAbdurasulov;
        System.out.println("converting value to int "+  marsgravityintAbdurasulov);
        marsgravitycharAbdurasulov=(char) marsgravitydoubleAbdurasulov;
        System.out.println("converting value to char but output as in integer "+  (int)marsgravitycharAbdurasulov);
        System.out.println("your weight on mars as in integer "+  (int)marsgravitycharAbdurasulov);
        marsgravity2floatAbdurasulov= earthgravityAbdurasulov / marsgravitycharAbdurasulov*marsgravityAbdurasulov;
        marsgravity2intAbdurasulov =  (int)marsgravity2floatAbdurasulov ;
        System.out.println("final value your input "+  marsgravity2intAbdurasulov );


    }
}