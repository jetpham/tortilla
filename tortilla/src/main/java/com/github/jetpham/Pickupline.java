package com.github.jetpham;

public class Pickupline {
    static String[] pronoun = {"Crab Person", "Fish Fellow", "Cow Conisour", "Cheese Consumer", "Llama Licker", "Spicy Butter Chicken Wing Soup", "General Kanobe", "Tonka Truck", "Logan Padilla", "Xzavier Padilla", "Tess Padilla", "Robert Padilla", "Sickle of the Dead God", "Pig *oink* *oink*", "Cow *moo* *moo*", "Alvin Liu", "Pickle", "Frank", "Bartholomew Jackson", "Steve Wallis", "Pineapple", "Mason Beard"};
    static String[] interest = {"cheese", "chedder", "milk", "swiss cheese", "bottle flipping", "programming", "stealing from the poor", "farting on dogs", "smashing balls on the kitchen counter", "jousting", "to torment my children", "talking to David Urethra", "stuff", "pickles", "curb stomping", "Baka Mitai", "Pineapple", "Mason Beard", "Joseph Beard", "Matt Beard", "Kim Beard", "Fat Rats", "Jet Pham, and Jet Pham, and Jet Pham, and Jet Pham, and Jet Pham"};
    static String[] activity = {"climb a mountain", "program", "log our robotics hours", "plant a carnivorous plant", "ride a cow", "create a discord bot", "commit war crimes", "camp at Logan's front lawn", "comemos pizza y fruita azul", "want to go out with me", "talk to David Urethra", "dance with the elderly", "compare toilets", "eat pickles", "Pineapple", "go to the Beards' house", "break a fan"};

    // hey  there {pronoun}, I like {interest}. Want to go out with me and {activity}?
    public Pickupline() {

    }

    public String getPickupLine() {
        return "hey there " + randomElement(pronoun) + ", I like " + randomElement(interest) + ". Want to go out with me and " + randomElement(activity) + " because it would be funny?";
    }

    private String randomElement(String[] array) {
        return array[(int) (Math.random() * array.length)];
    }
}
