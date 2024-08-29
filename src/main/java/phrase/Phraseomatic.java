package phrase;

public class Phraseomatic {
    public static void main(String[] args) {
        String[] wordListOne = {"cat" , "dog" , "mouse" , "tiger" , "lion" , "bird" };
        String[] wordListTwo = {"fat" , "skinny" , "large" , "small" , "big" , "ugly"};
        String[] wordListThree = {"chair" , "table" , "couch" , "mom" , "dad" , "door"};

        int oneLength = wordListOne.length;
        int twolength = wordListTwo.length;
        int threelength = wordListThree.length;

        int rand1 = (int)  (Math.random() * oneLength);
        int rand2 = (int)  (Math.random() * twolength);
        int rand3 = (int)  (Math.random() * threelength);

        String phrase = wordListTwo[rand2] + " " + wordListOne[rand1] + " " + wordListThree[rand3] ;

        System.out.println("You look like a " + phrase);

    }
}
