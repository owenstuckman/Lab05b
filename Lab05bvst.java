// Lab05bvst.java
// Open-Ended "Writing Classes Assignment
// This is the student starting Version of the Lab05b assignment.

public class Lab05bvst {
    public static void main(String[] args) {
        System.out.print("Enter Y or N, based on how you are feeling");
        System.out.print("\nHappy?----> ");
        String happyString = Keyboard.getString();
        System.out.print("\nSad?--> ");
        String sadString = Keyboard.getString();
        System.out.print("\nAngry--> ");
        String angryString = Keyboard.getString();
        System.out.print("\nConfused?--> ");
        String confusedString = Keyboard.getString();
        System.out.print("For the emotion you picked, how would you rate the intensity of it between 1 and 10? -->");
        int rating = Keyboard.getInt();
  
        Oogway r = new Oogway(happyString, sadString, angryString, confusedString, rating);
        r.displayData();
    }
}

class Oogway {

    String Happy;
    String Sad;
    String Angry;
    String Confused;
    int Rating;

    Double Random;

    String HappyMessage;
    String SadMessage;
    String AngryMessage;
    String ConfusedMessage;

    public Oogway(String happy, String sad, String angry, String confused, int rating) {
      
        Happy = happy;
        Sad = sad;
        Angry = angry;
        Confused = confused;
        Rating = rating;
    }

    public String Happiness(){

        String Low = "Shifu: “But a peach cannot defeat Tai Lung!” Oogway: “Maybe it can… If you are willing to guide it, to nurture it. To believe in it.”/n As you probably remember, Master Shifu doubts Po being chosen for being the Dragon Warrior. So he argues with Oogway and tells him he can not defeat the enemy.However, the wise Master Oogway tells him to lead Po and train him so that he will achieve his destiny. This means that we should always have faith and belief in ourselves. Also by training, practicing, and hard work we will achieve what we want.";
        String Mid1 = "“Use your skills for the good, young warrior. Find the one thing you were denied so long ago — compassion.”/n Using the abilities and skills that you have in a good way, makes you much closer to what you really want. This also makes you become an inspiration for others to follow in your footsteps. This quote also means that nothing can be solved with a negative mindset and the best way to approach a problem would be positivity.";
        String Mid2 = "“Look at this tree. I cannot make it blossom when it suits me, nor make it bear fruit before its time.”/n From this quote, we can realize that not everything is in our hands. For instance, we can not turn daylight into the night nor travel to the past and change our previous regrets. Everything needs time and patience, so be patient and know that everything happens when it needs to happen.";
        String Top = "“Inner peace, inner peace.” /n As simple as this quote may seem, Master Oogway always looked for peace and suggested others to look for it as well. So what we suggest you do is seek inner peace and always prioritize the clarity of your mind above anything else.This way you will become a better person and improve in many aspects of your life.";
        
        

        if (Happy == "Y"){
            if (Rating <= 3){
                HappyMessage = Low;
            }
            if (Rating > 3  && Rating < 6){
                Random = Math.random();
                if(Random >= .5){
                    HappyMessage = Mid1;
                }
                if(Random <= .5){
                    HappyMessage = Mid2;
                }

            }
            if (Rating >= 6){
                HappyMessage = Top;

            }


        }
        return HappyMessage;
    }

    public void displayData() {

        System.out.print(Happy);
        System.out.print(Happiness());
    
    }

}


