import com.techventus.server.voice.Voice;

import java.util.*;
import java.util.regex.*;

public class catfacts {

    private static String username = null;
    private static String password = null;
    // TODO load facts from file
    private static String filename = "catfacts.txt";
    private static List<String> recipients = new ArrayList<String>();

public static void main(String[] args) {

        parseArgs(args);

String[] facts = {
"The word cat refers to a family of meat-eating animals that include tigers, lions, leopards, and panthers.",
"Cats have five toes on each front paw, but only four toes on each back paw.",
"Cats are sometimes born with extra toes. This is called polydactly. These toes will not harm the cat, but you should keep his claws trimmed just like any toe.",
"Cats have true fur, in that they have both an undercoat and an outer coat.",
"Newborn kittens have closed ear canals that don't begin to open for nine days.When the eyes open, they are always blue at first. They change color over a period of months to the final eye color.",
"Most cats have no eyelashes.",
"Cats have a full inner-eyelid, or nictitating membrane. This inner-eyelid serves to help protect the eyes from dryness and damage. When the cat is ill, the inner-eyelid will frequently close partially, making it visible to the observer.",
"A cat cannot see directly under its nose. This is why the cat cannot seem to find tidbits on the floor.",
"You can tell a cat's mood by looking into its eyes. A frightened or excited cat will have large, round pupils. An angry cat will have narrow pupils. The pupil size is related as much to the cat's emotions as to the degree of light.",
"It is a common belief that cats are color blind. However, recent studies have shown that cats can see blue, green and red.",
"A large majority of white cats with blue eyes are deaf. White cats with only one blue eye are deaf only in the ear closest to the blue eye. White cats with orange eyes do not have this disability.",
"Cats with white fur and skin on their ears are very prone to sunburn. Frequent sunburns can lead to skin cancer. Many white cats need surgery to remove all or part of a cancerous ear. Preventive measures include sunscreen, or better, keeping the cat indoors.",
"A cat can jump even seven times as high as it is tall.",
"The cat's footpads absorb the shocks of the landing when the cat jumps.",
"Cats lack a true collarbone. Because of this lack, cats can generally squeeze their bodies through any space they can get their heads through. You may have seen a cat testing the size of an opening by careful measurement with the head.",
"If left to her own devices, a female cat may have three to seven kittens every four months. This is why population control using neutering and spaying is so important.",
"A cat is pregnant for about 58-65 days.",
"Mother cats teach their kittens to use the litter box.",
"The way you treat kittens in the early stages of it's life will render it's personality traits later in life.",
"Contrary to popular belief, the cat is a social animal. A pet cat will respond and answer to speech , and seems to enjoy human companionship.",
"When well treated, a cat can live twenty or more years but the average life span of a domestic cat is 14 years.",
"Neutering a cat extends its life span by two or three years.",
"Cats, especially older cats, do get cancer. Many times this disease can be treated successfully.",
"Cats can't taste sweets.",
"Cats must have fat in their diet because they can't produce it on their own.",
"Some common houseplants poisonous to cats include: English Ivy, iris, mistletoe, philodendron, and yew.",
"Tylenol and chocolate are both poisionous to cats.",
"Many cats cannot properly digest cow's milk. Milk and milk products give them diarrhea.",
"The average cat food meal is the equivalent to about five mice.",
"Cats can get tapeworms from eating fleas. These worms live inside the cat forever, or until they are removed with medication. They reproduce by shedding a link from the end of their long bodies. This link crawls out the cat's anus, and sheds hundreds of eggs. These eggs are injested by flea larvae, and the cycles continues. Humans may get these tapeworms too, but only if they eat infected fleas. Cats with tapeworms should be dewormed by a veterinarian.",
"Cats can get tapeworms from eating mice. If your cat catches a mouse it is best to take the prize away from it.",
"Though rare, cats can contract canine heart worms.",
"The gene in cats that causes the orange coat color is sexed linked, and is on the X sex chromosome. This gene may display orange or black. Thus, as female cat with two X chromosomes may have orange and black colors in its coat. A male, with only one X chromosome, can have only orange or black, not both.",
"If a male cat is both orange and black it is ( besides being extremely rare ) sterile. To have both the orange and the black coat colors, the male cat must have all or part of both female X chromosomes. This unusual sex chromosome combination will render the male cat sterile.",
"Cats have AB blood groups just like people.",
"A form of AIDS exists in cats.",
"The color of the points in Siamese cats is heat related. Cool areas are darker.",
"Siamese kittens are born white because of the heat inside the mother's uterus before birth. This heat keeps the kittens' hair from darkening on the points.",
"People who are allergic to cats are actually allergic to cat saliva or to cat dander. If the resident cat is bathed regularly the allergic people tolerate it better.",
"Studies now show that the allergen in cats is related to their scent glands. Cats have scent glands on their faces and at the base of their tails. Entire male cats generate the most scent. If this secretion from the scent glands is the allergen, allergic people should tolerate spayed female cats the best.",
"Cats do not think that they are little people. They think that we are big cats. This influences their behavior in many ways.",
"Cats are subject to gum disease and to dental caries. They should have their teeth cleaned by the vet or the cat dentist once a year.",
"Many people fear catching a protozoan disease, Toxoplasmosis, from cats. This disease can cause illness in the human, but more seriously, can cause birth defects in the unborn. Toxoplasmosis is a common disease, sometimes spread through the feces of cats. It is caused most often from eating raw or rare beef. Pregnant women and people with a depressed immune system should not touch the cat litter box. Other than that, there is no reason that these people have to avoid cats.",
"The ancestor of all domestic cats is the African Wild Cat which still exists today.",
"In ancient Egypt, killing a cat was a crime punishable by death.",
"In ancient Egypt, mummies were made of cats, and embalmed mice were placed with them in their tombs. In one ancient city, over 300,000 cat mummies were found.",
"In the Middle Ages, during the Festival of Saint John, cats were burned alive in town squares.",
"The first cat show was in 1871 at the Crystal Palace in London.",
"Today there are about 100 distinct breeds of the domestic cat.",
"Like birds, cats have a homing ability that uses its biological clock, the angle of the sun, and the Earth's magnetic field. A cat taken far from its home can return to it. But if a cat's owners move far from its home, the cat can't find them.",
"Cats bury their feces to cover their trails from predators.",
"Cats sleep 16 to 18 hours per day. When cats are asleep, they are still alert to incoming stimuli. If you poke the tail of a sleeping cat, it will respond accordingly.",
"Besides smelling with their nose, cats can smell with an additional organ called the Jacobson's organ, located in the upper surface of the mouth.",
"The chlorine in fresh tap water irritates sensitive parts of the cat's nose. Let tap water sit for 24 hours before giving it to a cat.",
"Abraham Lincoln loved cats. He had four of them while he lived in the White House.",
"Julius Ceasar, Henri II, Charles XI, and Napoleon were all afraid of cats.",
"Cats have an average of 24 whiskers, arranged in four horizontal rows on each side.",
"The word 'cat' in various languages: French: chat; German: katze; Italian: gatto; Spanish/Portugese: gato; Yiddish: kats; Maltese: qattus; Swedish/Norwegian: katt; Dutch: kat; Icelandic: kottur; Greek: catta; Hindu: katas; Japanese:neko; Polish: kot; Ukranian: kotuk; Hawiian: popoki; Russian: koshka; Latin: cattus; Egyptian: mau; Turkish: kedi; Armenian: Gatz; Chinese: mio; Arabic: biss; Indonesian: qitta; Bulgarian: kotka; Malay: kucing; Thai/Vietnamese: meo; Romanian: pisica; Lithuanian: katinas; Czech: kocka; Slovak: macka; Armenian: gatz; Basque: catua; Estonian: kass; Finnish: kissa; Swahili: paka.",
"Statistics indicate that animal lovers in recent years have shown a preference for cats over dogs!",
"Cats can be taught to walk on a leash, but a lot of time and patience is required to teach them. The younger the cat is, the easier it will be for them to learn.",
"Purring not always means happiness. Purring could mean a cat is in terrible pain such as during childbirth. Kitten will purr to their mother to let her know they are getting enough milk while nursing. Purring is a process of inhaling and exhaling, usually performed while the mouth is closed. But don't worry, if your cat is purring while your gently petting her and holding her close to you - that is a happy cat!",
"The catnip plant contains an oil called hepetalactone which does for cats what marijuana does to some people. Not all cats react to it those that do appear to enter a trancelike state. A positive reaction takes the form of the cat sniffing the catnip, then licking, biting, chewing it, rub & rolling on it repeatedly, purring, meowing & even leaping in the air.",
"Of all the species of cats, the domestic cat is the only species able to hold its tail vertically while walking. All species of wild cats hold their talk horizontally or tucked between their legs while walking.",
"A happy cat holds her tail high and steady.",
"Almost 10% of a cat's bones are in its tail, and the tail is used to maintain balance.",
"Cat families usually play best in even numbers. Cats and kittens should be aquired in pairs whenever possible.",
"Baking chocolate is the most dangerous chocolate to your cat.",
"You check your cats pulse on the inside of the back thigh, where the leg joins to the body. Normal for cats: 110-170 beats per minute.",
"Jaguars are the only big cats that don't roar.",
"A cats field of vision is about 185 degrees.",
"Cats have individual preferences for scratching surfaces and angles. Some are horizontal scratchers while others exercise their claws vertically.",
"The Maine Coone is the only native American long haired breed.",
"The Maine Coon is 4 to 5 times larger than the Singapura, the smallest breed of cat.",
"Tabby cats are thought to get their name from Attab, a district in Baghdad, now the capital of Iraq.",
"Retractable claws are a physical phenomenon that sets cats apart from the rest of the animal kingdom. I n the cat family, only cheetahs cannot retract their claws.",
"Not every cat gets 'high' from catnip. Whether or not a cat responds to it depends upon a recessive gene: no gene, no joy.",
"A cat can sprint at about thirty-one miles per hour.",
"In ancient Egypt, when a family cat died, all family members would shave their eyebrows as a sign of mourning.",
"Cats have been domesticated for half as long as dogs have been.",
"A cat's whiskers are thought to be a kind of radar, which helps a cat gauge the space it intends to walk through.",
"A cat can spend five or more hours a day grooming himself.",
"All cats have three sets of long hairs that are sensitive to pressure - whiskers, eyebrows,and the hairs between their paw pads.",
"Both humans and cats have identical regions in the brain responsible for emotion.",
"A cat's brain is more similar to a man's brain than that of a dog.",
"A cat has more bones than a human; humans have 206, and the cat - 230.",
"Cats have 30 vertebrae--5 more than humans have.",
"The cat has 500 skeletal muscles (humans have 650).",
"Cats have 32 muscles that control the outer ear (compared to human's 6 muscles each). A cat can rotate its ears independently 180 degrees, and can turn in the direction of sound 10 times faster than those of the best watchdog.",
"Cats' hearing stops at 65 khz (kilohertz); humans' hearing stops at 20 khz.",
"In relation to their body size, cats have the largest eyes of any mammal.",
"Cats have 30 teeth (12 incisors, 10 premolars, 4 canines, and 4 molars), while dogs have 42. Kittens have baby teeth, which are replaced by permanent teeth around the age of 7 months.",
"When a cat drinks, its tongue - which has tiny barbs on it - scoops the liquid up backwards.",
"Cats purr at the same frequency as an idling diesel engine, about 26 cycles per second.",
"Cats step with both left legs, then both right legs when they walk or run.",
"Cats walk on their toes.",
"Cats take between 20-40 breaths per minute.",
"Normal body temperature for a cat is 102 degrees F.",
"Cats respond most readily to names that end in an 'ee' sound.",
"A cat will tremble or shiver when it is extreme pain.",
"When a domestic cat goes after mice, about 1 pounce in 3 results in a catch.",
"Declawing a cat is the same as cutting a human's fingers off at the knuckle. There are several alternatives to a complete declawing, including trimming or a less radical (though more involved) surgery to remove the claws. Preferably, try to train your cat to use a scratching post.",
"Cats with long, lean bodies are more likely to be outgoing, and more protective and vocal than those with a stocky build.",
"A steady diet of dog food may cause blindness in your cat - it lacks taurine.",
"It has been scientifically proven that stroking a cat can lower one's blood pressure.",
"If your cat snores, or rolls over on his back to expose his belly, it means he trusts you.",
"Cats respond better to women than to men, probably due to the fact that women's voices have a higher pitch.",
"Florence Nightingale owned more than 60 cats in her lifetime.",
"When your cats rubs up against you, she is actually marking you as 'hers' with her scent. If your cat pushes his face against your head, it is a sign of acceptance and affection.",
"Tests done by the Behavioral Department of the Musuem of Natural History conclude that while a dog's memory lasts about 5 minutes, a cat's recall can last as long as 16 hours.",
"Has your cat ever brought its prey to your door? Cats do that because they regard their owners as their 'kittens.' The cats are teaching their 'kittens' how to hunt by bringing them food. Most people aren't too delighted when a pet brings in their kill. Instead of punishing your cat, praise it for its efforts, accept the prey, and then secretly throw it away.",
"Cats can predict earthquakes. We humans are not 100% sure how they do it. There are several different theories.",
"A queen (female cat) can begin mating when she is between 5 and 9 months old.",
"A tomcat (male cat) can begin mating when he is between 7 and 10 months old.",
"Tomcats can mate at anytime, while quenns can only mate during a period of time called heat or estrus.",
"Heat occurs several times a year and can last anywhere from 3 to 15 days.",
"At 4 weeks, it is important to play with kittens so that they do not develope a fear of people.",
"Kittens remain with their mother till the age of 9 weeks.",
"It is estimated that cats can make over 60 different sounds.",
"The cat's footpads absorb the shocks of the landing when the cat jumps.",
"Ailurophile - that's what we're officially called. It's what cat lovers are known as.",
"A cat that bites you for rubbing his stomach is often biting from pleasure, not anger.",
"The more cats are spoken to, the more they will speak back. You will learn a lot from your cat's wide vocabulary of chirps and meows.",
"Cats often overract to unexpected stimuli because of their extremely sensitive nervous system.",
"Kittens who are taken along on short, trouble-free car trips to town tend to make good passengers when they get older. They get used to the sounds and motions of traveling and make less connection between the car and the visits to the vet.",
"Cats, just like people, are subject to asthma. Dust, smoke, and other forms of air pullution in your cat's environment can be troublesome sources of irritation.",
"Since cats are so good at hiding illness, even a single instance of a symptom should be taken very seriously.",
"There is a species of cat smaller than the average housecat. It is native to Africa and it is the Black-footed cat (Felis nigripes). Its top weight is 5.5 pounds.",
"A tortoiseshell is black with red or orange markings and a calico is white with patches of red, orange and black.",
"The Ancient Egyptian word for cat was mau, which means 'to see'.",
"Cats that live together sometimes rub each others heads to show that they have no intention of fighting. Young cats do this more often, especially when they are excited.",
"In 1987 cats overtook dogs as the number one pet in America.",
"Kittens lose their baby teeth!! At three to four months the incisors erupt. Then at four to six months, they lose their canines, premolars and molars. By the time they are seven months old, their adult teeth are fully developed. This is one of the ways a vet (or you) can tell the age of a kitten."
};

    try {
            System.out.println("username: " + username);
            System.out.println("password: " + password);
            if (username != null && password != null)
            {
                Voice v = new Voice(username, password);
                //System.out.println(v.getSMS());
       java.util.Random r = new java.util.Random();

                //String test = "12345678900";

                //String[] recipients = {test};

       int everyTenSeconds = 10 * 1000;
       int fivemin = 5 * 60 * 1000;
       int hourly = 60 * 60 * 1000;
       int daily = hourly * 24;
       int timeperiod = everyTenSeconds;
       
       //v.sendSMS(dest, "Thanks for signing up for CAT FACTS! your daily source of feline fun!");
      
       for (String dest : recipients) {
           v.sendSMS(dest, "Did you know " + facts[r.nextInt(facts.length)].replaceAll("\\.$", "") + "!?! Thx for using CAT FACTS!");
                    System.out.println("Sent cat fact to: " + dest);
           //java.lang.Thread.sleep(timeperiod);
       }
            }
    } catch (Exception e) {
        System.out.println(e);
    }
    }

    private static final String FLAG_USERNAME_SHORT = "-u";
    private static final String FLAG_USERNAME_LONG = "--username";
    private static final String FLAG_PASSWORD_SHORT = "-p";
    private static final String FLAG_PASSWORD_LONG = "--password";
    private static final String FLAG_FILENAME_SHORT = "-f";
    private static final String FLAG_FILENAME_LONG = "--file";

    // TODO improve pattern
    private static final Pattern phoneNumberPattern = Pattern.compile("\\d+");

    private static void parseArgs(String[] args)
    {
        List<String> argList = Arrays.asList(args);
        Iterator<String> it = argList.iterator();

        while (it.hasNext())
        {
            String arg = it.next();

            if (FLAG_USERNAME_SHORT.equals(arg) || FLAG_USERNAME_LONG.equals(arg))
            {
                if (it.hasNext())
                {
                    username = it.next();
                }
            }
            else if (FLAG_PASSWORD_SHORT.equals(arg) || FLAG_PASSWORD_LONG.equals(arg))
            {
                if (it.hasNext())
                {
                    password = it.next();
                }
            }
            else if (FLAG_FILENAME_SHORT.equals(arg) || FLAG_FILENAME_LONG.equals(arg))
            {
                if (it.hasNext())
                {
                    filename = it.next();
                }
            }
            else
            {
                Matcher m = phoneNumberPattern.matcher(arg);
                if (m.matches())
                {
                    recipients.add(arg);
                }
            }
        }
}
}
