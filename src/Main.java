import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> int1 = new ArrayList<>();
        ArrayList<Integer> int2 = new ArrayList<>();
        ArrayList<Double> dob1 = new ArrayList<>();
        ArrayList<Double> dob2 = new ArrayList<>();

        try (Scanner in = new Scanner(new FileReader("input.txt"))) {
            for (int i = 0; i < 24; ++i) {
                int1.add(in.nextInt());
            }

            for (int i = 0; i < 24; ++i) {
                int2.add(in.nextInt());
            }

            for (int i = 0; i < 24; ++i) {
                dob1.add(in.nextDouble());
            }

            for (int i = 0; i < 24; ++i) {
                dob2.add(in.nextDouble());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        CircleInt[] ar1 = {new CircleInt(int1.get(0), int1.get(1), int1.get(2))
                , new CircleInt(int1.get(4), int1.get(5), int1.get(6))
                , new CircleInt(int1.get(8), int1.get(9), int1.get(10))
                , new CircleInt(int1.get(12), int1.get(13), int1.get(14))
                , new CircleInt(int1.get(16), int1.get(17), int1.get(18))
                , new CircleInt(int1.get(20), int1.get(21), int1.get(22))};

        CircleInt[] ar2 = {new CircleInt(int2.get(0), int2.get(1), int2.get(2))
                , new CircleInt(int2.get(4), int2.get(5), int2.get(6))
                , new CircleInt(int2.get(8), int2.get(9), int2.get(10))
                , new CircleInt(int2.get(12), int2.get(13), int2.get(14))
                , new CircleInt(int2.get(16), int2.get(17), int2.get(18))
                , new CircleInt(int2.get(20), int2.get(21), int2.get(22))};

        CircleDouble[] ar3 = {new CircleDouble(dob1.get(0), dob1.get(1), dob1.get(2))
                , new CircleDouble(dob1.get(4), dob1.get(5), dob1.get(6))
                , new CircleDouble(dob1.get(8), dob1.get(9), dob1.get(10))
                , new CircleDouble(dob1.get(12), dob1.get(13), dob1.get(14))
                , new CircleDouble(dob1.get(16), dob1.get(17), dob1.get(18))
                , new CircleDouble(dob1.get(20), dob1.get(21), dob1.get(22))};

        CircleDouble[] ar4 = {new CircleDouble(dob2.get(0), dob2.get(1), dob2.get(2))
                , new CircleDouble(dob2.get(4), dob2.get(5), dob2.get(6))
                , new CircleDouble(dob2.get(8), dob2.get(9), dob2.get(10))
                , new CircleDouble(dob2.get(12), dob2.get(13), dob2.get(14))
                , new CircleDouble(dob2.get(16), dob2.get(17), dob2.get(18))
                , new CircleDouble(dob2.get(20), dob2.get(21), dob2.get(22))};

        Cjv<CircleInt> m1 = new Cjv<>(ar1);
        Cjv<CircleInt> m2 = new Cjv<>(ar2);
        Cjv<CircleDouble> m3 = new Cjv<>(ar3);
        Cjv<CircleDouble> m4 = new Cjv<>(ar4);

        //System.out.println(m1.at(5).getR());
    }
}