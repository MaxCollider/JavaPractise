public class App {
    public static void main(String[] args) {
        Youtube youtube = new Youtube();
        Subscriber sub1 = new Subscriber("Pavel228", youtube);
        Subscriber sub2 = new Subscriber("Gamer", youtube);

        youtube.publishNewVideo("Java course");
        Subscriber sub3 = new Subscriber("MIPTstudent", youtube);
        youtube.unsubscribe(sub2);

        youtube.publishNewVideo("Math Lections");
    }
}
