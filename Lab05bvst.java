// Lab05bvst.java
// Open-Ended "Writing Classes Assignment
// This is the student starting Version of the Lab05b assignment.

public class Lab05bvst { // Main user defined class 
    public static void main(String[] args) {

        // Begining of display text and getting inputs  
        System.out.print("Please enter Y or N, based on how you are feeling");
        System.out.print("\nYou can enter multiple emotions that you are feeling at once, or if you only feel one of the emotions you can also only select one.");
        System.out.print("\n\nHappy?----> ");
        String happyString = Keyboard.getString();
        System.out.print("\nSad?--> ");
        String sadString = Keyboard.getString();
        System.out.print("\nAngry--> ");
        String angryString = Keyboard.getString();
        System.out.print("\nConfused?--> ");
        String confusedString = Keyboard.getString();
        System.out.println();
        System.out.print("For the emotions you picked, how would you rate the intensity of it between 1 and 10? -->");
        int rating = Keyboard.getInt();
        
        // Pulls Image Display Code 
        ImageDisplay.main(args);

        // Sets up the constructor 
        Oogway r = new Oogway(happyString, sadString, angryString, confusedString, rating);
        r.setdisplayData();

    }
}

// Class 2 
class Oogway {

    // Defining Varaibles 
    private String Happy;
    private String Sad;
    private String Angry;
    private String Confused;
    private int Rating;

    Double Random;

    String HappyMessage;
    String SadMessage;
    String AngryMessage;
    String ConfusedMessage;

    Boolean failureVar;
    String FailureMessage;



    public Oogway(String happy, String sad, String angry, String confused, int rating) {
        // Pulls objects from constructor 
        Happy = happy;
        Sad = sad;
        Angry = angry;
        Confused = confused;
        Rating = rating;
    }

    // Emotion Method 
    public String getHappiness(){

        // Pulls Object
        String NewHappy = Happy;

        // All possible Responses 
        String Low = "Shifu: But a peach cannot defeat Tai Lung! Oogway: Maybe it can… If you are willing to guide it, to nurture it. To believe in it. \n As you probably remember, Master Shifu doubts Po being chosen for being the Dragon Warrior. So he argues with Oogway and tells him he can not defeat the enemy.However, the wise Master Oogway tells him to lead Po and train him so that he will achieve his destiny. This means that we should always have faith and belief in ourselves. Also by training, practicing, and hard work we will achieve what we want.";
        String Mid1 = "Use your skills for the good, young warrior. Find the one thing you were denied so long ago — compassion.\n Using the abilities and skills that you have in a good way, makes you much closer to what you really want. This also makes you become an inspiration for others to follow in your footsteps. This quote also means that nothing can be solved with a negative mindset and the best way to approach a problem would be positivity.";
        String Mid2 = "Look at this tree. I cannot make it blossom when it suits me, nor make it bear fruit before its time.\n From this quote, we can realize that not everything is in our hands. For instance, we can not turn daylight into the night nor travel to the past and change our previous regrets. Everything needs time and patience, so be patient and know that everything happens when it needs to happen.";
        String Top = "Inner peace, inner peace. \n As simple as this quote may seem, Master Oogway always looked for peace and suggested others to look for it as well. So what we suggest you do is seek inner peace and always prioritize the clarity of your mind above anything else.This way you will become a better person and improve in many aspects of your life.";        

        // Uses if statments to determine which string to return based off of happiness value 
        if (NewHappy.equals("Y") || NewHappy.equals("y")){
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

        // If anything else then a Y or y is entered, returns nothing 
        else{
            HappyMessage = "";
        }

        // Returns message 
        return HappyMessage;
    }

    // Does exact same thing as 1st get method 
    public String getSadness(){

        String NewSad = Sad;
        Random = Math.random();

        String Low = "There is just news. There is no good or bad.\n In this quote, what Master Oogway tries to point out is that when we hear certain news the first thing we do would be to interpret that news as bad or good. But in real life, it is not about the context of that news but about the way our minds interpret that piece of information. Therefore, instead of categorizing things as good or bad, let us try to shape our minds in a way that they react to things in a calm way before jumping to any conclusions.";
        String Low2 = "There are no accidents\n When something bad happens to you, never say why me. Everything happens for a reason whether it is good or bad. Learn from your mistakes and be optimistic. Because life has its ups and downs and there is always a reason behind each occurrence no matter how small or big.So rather than losing your hope, believe that great things will happen at the right time and place.";
        String Mid1 = "You just need to believe. You must believe.\n There are times when we become desperate and feel down. So in order to overcome this despair and frustration, the first thing we need to do is believe in ourselves and the things that we want to achieve. By having faith in what we do, we will prove that nothing can get in our way to reach our main goal.";
        String Mid2 = "You are the master of your destiny: No one and nothing can come in between you and your destiny except you. Take destiny by the horns and have fun.”/n You are the leader in your life. controlling and moving toward your fate and destiny is only in your own hands. And nobody can manipulate what is destined for you. So believe in what you are and keep moving forward in the direction that you desire.";
        String Top = "It matters not what someone is born, but what they grow to be.\n In other words, your family s past and where you come from are not a representation of yourself and it is you, who choose to define your character and being in this massive world.";
        String Top2 = "If you only do what you can do, you will never be more than you are now.\n This Master Oogway quote points to a fact that some of us do not really know what we are capable of doing and we only keep repeating the things that we know. For those, who want to see a change in their lives going further means making altercations in their lives instead of sticking to the same habits that they overdo on a daily basis. When you do something different from what you were doing before, you will have better chances of reaching a better place in your life. And as the saying goes “old ways will not open new doors!.";
        String Top3 = "Nothing is impossible.\n If you want to reach your ultimate goal, you will experience a moment when you think that nothing is going to get in your way of achieving it. If you really think about it, this quote is true and despite the obstacles, you might encounter along the way, nothing could hold you back except yourself.";

        if (NewSad.equals("Y")  || NewSad.equals("y")){
            if (Rating <= 3){
                if(Random >= .5){
                    SadMessage = Low;
                }
                if(Random <= .5){
                    SadMessage = Low2;
                }
            }
            if (Rating > 3  && Rating < 6){
                
                if(Random >= .5){
                    SadMessage = Mid1;
                }
                if(Random <= .5){
                    SadMessage = Mid2;
                }

            }
            if (Rating >= 6){
                if(Random <= .3){
                    SadMessage = Top;
                }
                if(Random > .3 && Random <.7){
                    SadMessage = Top2;
                }
                if(Random >= .7){
                    SadMessage = Top3;
                }

            }
        }
        else{
            SadMessage = "";
        }
        
        return SadMessage;
    }

    // Does exact same thing as 1st get method 
    public String getAngriness(){

        String NewAngry = Angry;

        String Low = "“Quit, do not quit. Noodles, do not noodles… You are too concerned with what was and what will be. There is a saying: Yesterday is history, tomorrow is a mystery, but today is a gift. That is why it is called the present.”\n Keep in mind that the unnecessary worries will force us into missing out on the good parts of our lives and they will do nothing but occupy our minds with the regrets of the past and the unknowns of the future.";
        String Mid1 = "“Your mind is like this water my friend, when it is agitated it becomes difficult to see, but if you allow it to settle, the answer becomes clear.”/n That is why you need to be calm and have your mind cleared when making life-changing and vital decisions because if you do not consider this approach you will very likely end up regretting your decisions. Taking this step will help you choose more wisely and decide what is best for you. So keep your mind settled and away from what may distort you.";
        String Mid2 = "“When will you realize? The more you take, the less you have.”/n In life, there is a certain capacity for everything. We should use anything that we have in our hands in the correct way and not go for too much. For this to be possible, we need to understand the limitations of everything and never use them far from what is expected. Because if we go for too much abundance we may not like the result in the end. In other words, don’t go for too much but at the same time don’t go for too less, and balance your life by respecting the needs of others.";
        String Top =  "“I think they will all lose until they find a battle worth fighting.”/n Here we can understand from this quote that not everything is worth fighting for. There are certain battles, or in other words, problems that are worth fighting because by solving them we achieve what we want and get closer to our main purpose.";        

        if (NewAngry.equals("Y")|| NewAngry.equals("y")){
            if (Rating <= 3){
                AngryMessage = Low;
            }
            if (Rating > 3  && Rating < 6){
                Random = Math.random();
                if(Random >= .5){
                    AngryMessage = Mid1;
                }
                if(Random <= .5){
                    AngryMessage = Mid2;
                }

            }
            if (Rating >= 6){
                AngryMessage = Top;

            }

        }
        else{
            AngryMessage = "";
        }
       
        return AngryMessage;
    }

    // Does exact same thing as 1st get method 
    public String getConfusedness(){

        String NewConfused = Confused;

        String Low = "There is always something more to learn. Even for a master.\n Even when you become a professional at what you do, there’s always something new to learn and a chance to grow further from where you are now. Therefore, you should always try and learn new things by seeking knowledge in your area of expertise. This way you will keep on growing every single day and become a better version of yourself than you were yesterday.";
        String Mid1 = "When the path you walk always leads back to yourself, you never get anywhere.\n This quote means that you’ll go round in circles and never change your place if you never alter something in your life. Always be open to change, especially the change that you are sure will bring you good results.If you make different but better choices from now on, you will feel the difference as time goes by.";
        String Mid2 = "One often meets his destiny on the road he takes to avoid it.\n We sometimes neglect what’s truly good for us on our journey to success and only focus on the goal, not the lessons we learn on the way. To avoid getting distracted by unimportant things or focusing solely on your goals instead of the journey itself, try to enjoy the ride and be aware of your surroundings as you move forward.";
        String Top = "You must let go of the illusion of control.\n Keep in mind that you can’t control everything in your life and only control things that you are sure you can handle. For instance, who to befriend with, when to sleep, who to go out with and etc. This way you’ll get to know what to choose as your priority first and manage your time and energy of yours in the best possible way.";


        if (NewConfused.equals("Y") || NewConfused.equals("y") ){
            if (Rating <= 3){
                ConfusedMessage = Low;
            }
            if (Rating > 3  && Rating < 6){
                Random = Math.random();
                if(Random >= .5){
                    ConfusedMessage = Mid1;
                }
                if(Random <= .5){
                    ConfusedMessage = Mid2;
                }

            }
            if (Rating >= 6){
                ConfusedMessage = Top;

            }
        }
        else{
            ConfusedMessage = "";
        }
        
        return ConfusedMessage;
    }

    // Private helper method that creates falire check to see if user entered values are compatiable with the code  
    private void failureCheck(){
         
        if ((Sad.equals("Y") || Sad.equals("y")) || Confused.equals("Y") || Confused.equals("y") || Angry.equals("Y")|| Angry.equals("y") || Happy.equals("Y") || Happy.equals("y") ){

            failureVar = false;
        }
        else{
            failureVar = true;
        }

    }

    // Set Method
    public void setdisplayData() {

        // Runs the Failure Check 
        failureCheck();
        

        if (failureVar == true){

            System.out.print("\n\n Master Oogway has no wisdom to share with you at this time. \n \n He is disappointed in your inability to type in the letter 'y' or 'n'.");

        }

        // Normal return with no failure 
        else{

            // Prints emotion methods to terminal
            
            //initial message
            System.out.flush();
            System.out.print("\n\nMaster Oogway will now share his wisdom with you on how you are feeling and what advice he would give to you based on each emotions.");
            System.out.println("\n\n");


            // emotion methods and check if need spacs if multiple emotions are called
            System.out.print(getHappiness());
            if(getHappiness() == ""){
            
            }else{System.out.println("\n\n");}

            System.out.print(getSadness());
            if(getSadness() == ""){

            }else{System.out.println("\n\n");}

            System.out.print(getAngriness());
            if(getAngriness() == ""){
                
            }else{System.out.println("\n\n");}
    
            System.out.print(getConfusedness());
            if(getConfusedness() == ""){
                
            }else{System.out.println("\n\n");}
        }        
    }
}


