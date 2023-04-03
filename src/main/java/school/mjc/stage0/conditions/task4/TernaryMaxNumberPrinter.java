package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int b=first>second?first:second;
        b=b>third?b:third;
        System.out.println(b);
    
    }

}

