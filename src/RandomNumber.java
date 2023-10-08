public class RandomNumber {
    private static double number;

    public static double getRandomNumber() {
        return Math.random();
    }
    public static double getRandomDoubleNumberByRange(double start, double finish) {
        number = getRandomNumber();
        if (!(number >= start && number <= finish)){
            return getRandomDoubleNumberByRange(start, finish);
        }
        return number;
    }

}