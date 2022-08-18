package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {

        int res = (first > second) ? first : second;
        res = (res > third) ? res : third;

        System.out.println(res);

    }
}
