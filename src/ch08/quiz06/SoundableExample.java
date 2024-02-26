package ch08.quiz06;

public class SoundableExample {
    public static void printsound(Soundable soundable) {
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
        printsound(new Cat());
        printsound(new Dog());
    }
}
