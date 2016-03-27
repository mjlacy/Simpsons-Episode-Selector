/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpsons.episode.selector;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author Michael
 */
public class SimpsonsEpisodeSelector extends JFrame implements ActionListener{

    String[] episodeNames = {"Simpsons Roasting on an Open Fire", "Bart the Genius", "Homer's Odyssey", 
"There's No Disgrace Like Home", "Bart the General", "Moaning Lisa", "The Call of the Simpsons", "The Telltale Head", 
"Life on the Fast Lane", "Homer's Night Out", "The Crepes of Wrath", "Krusty Gets Busted", "Some Enchanted Evening", 
"Bart Gets an \"F\"", "Simpson and Delilah", "Treehouse of Horror", "Two Cars in Every Garage and Three Eyes on Every Fish", 
"Dancin' Homer", "Dead Putting Society", "Bart vs. Thanksgiving", "Bart the Daredevil", "Itchy & Scratchy & Marge", 
"Bart Gets Hit by a Car", "One Fish, Two Fish, Blowfish, Blue Fish", "The Way We Was", "Homer vs. Lisa and the 8th Commandment", 
"Principal Charming", "Oh Brother, Where Art Thou?", "Bart's Dog Gets an F", "Old Money", "Brush with Greatness", 
"Lisa's Substitute", "The War of the Simpsons", "Three Men and a Comic Book", "Blood Feud", "Stark Raving Dad", 
"Mr. Lisa Goes to Washington", "When Flanders Failed", "Bart the Murderer", "Homer Defined", "Like Father, Like Clown", 
"Treehouse of Horror II", "Lisa's Pony", "Saturdays of Thunder", "Flaming Moe's", "Burns Verkaufen der Kraftwerk", 
"I Married Marge", "Radio Bart", "Lisa the Greek", "Homer Alone", "Bart the Lover", "Homer at the Bat", "Separate Vocations", 
"Dog of Death", "Colonel Homer", "Black Widower", "The Otto Show", "Bart's Friend Falls in Love", 
"Brother, Can You Spare Two Dimes?", "Kamp Krusty", "A Streetcar Named Marge", "Homer the Heretic", "Lisa the Beauty Queen", 
"Treehouse of Horror III", "Itchy & Scratchy: The Movie", "Marge Gets a Job", "New Kid on the Block", "Mr. Plow", 
"Lisa's First Word", "Homer's Triple Bypass", "Marge vs. the Monorail", "Selma's Choice", "Brother from the Same Planet", 
"I Love Lisa", "Duffless", "Last Exit to Springfield", "So It's Come to This: A Simpsons Clip Show", "The Front", "Whacking Day", 
"Marge in Chains", "Krusty Gets Kancelled", "Homer's Barbershop Quartet", "Cape Feare", "Homer Goes to College", "Rosebud", 
"Treehouse of Horror IV", "Marge on the Lam", "Bart's Inner Child", "Boy-Scoutz 'n the Hood", "The Last Temptation of Homer", 
"$pringfield (Or, How I Learned to Stop Worrying and Love Legalized Gambling)", "Homer the Vigilante", "Bart Gets Famous", 
"Homer and Apu", "Lisa vs. Malibu Stacy", "Deep Space Homer", "Homer Loves Flanders", "Bart Gets an Elephant", "Burns' Heir", 
"Sweet Seymour Skinner's Baadasssss Song", "The Boy Who Knew Too Much", "Lady Bouvier's Lover", "Secrets of a Successful Marriage",
"Bart of Darkness", "Lisa's Rival", "Another Simpsons Clip Show", "Itchy & Scratchy Land", "Sideshow Bob Roberts", 
"Treehouse of Horror V", "Bart's Girlfriend", "Lisa on Ice", "Homer Badman", "Grampa vs. Sexual Inadequacy", "Fear of Flying", 
"Homer the Great", "And Maggie Makes Three", "Bart's Comet", "Homie the Clown", "Bart vs. Australia", "Homer vs. Patty and Selma", 
"A Star is Burns", "Lisa's Wedding", "Two Dozen and One Greyhounds", "The PTA Disbands", "'Round Springfield", 
"The Springfield Connection", "Lemon of Troy", "Who Shot Mr. Burns? (Part One)", "Who Shot Mr. Burns? (Part Two)", "Radioactive Man", 
"Home Sweet Homediddly-Dum-Doodily", "Bart Sells His Soul", "Lisa the Vegetarian", "Treehouse of Horror VI", "King-Size Homer", 
"Mother Simpson", "Sideshow Bob's Last Gleaming", "The Simpsons 138th Episode Spectacular", "Marge Be Not Proud", "Team Homer", 
"Two Bad Neighbors", "Scenes from the Class Struggle in Springfield", "Bart the Fink", "Lisa the Iconoclast", "Homer the Smithers", 
"The Day the Violence Died", "A Fish Called Selma", "Bart on the Road", "22 Short Films About Springfield", 
"Raging Abe Simpson and His Grumbling Grandson in \"The Curse of the Flying Hellfish\"", "Much Apu About Nothing",
"Summer of 4 Ft. 2", "Homerpalooza", "Treehouse of Horror VII", "You Only Move Twice", "The Homer They Fall", "Burns, Baby Burns", 
"Bart After Dark", "A Milhouse Divided", "Lisa's Date with Density", "Hurricane Neddy", "The Mysterious Voyage of Homer", 
"The Springfield Files", "The Twisted World of Marge Simpson", "Mountain of Madness", 
"Simpsoncalifragilisticexpiala(Annoyed Grunt)cious", "The Itchy & Scratchy & Poochie Show", "Homer's Phobia", 
"Brother from Another Series", "My Sister, My Sitter", "Homer vs. the Eighteenth Amendment", "Grade School Confidential", 
"The Canine Mutiny", "The Old Man and the Lisa", "In Marge We Trust ", "Homer's Enemy", "The Simpsons Spin-Off Showcase", 
"The Secret War of Lisa Simpson", "The City of New York vs. Homer Simpson", "The Principal and the Pauper", "Lisa's Sax", 
"Treehouse of Horror VIII", "The Cartridge Family", "Bart Star", "The Two Mrs. Nahasapeemapetilons", "Lisa the Skeptic", 
"Realty Bites", "Miracle on Evergreen Terrace", "All Singing, All Dancing", "Bart Carny", "The Joy of Sect", "Das Bus", 
"The Last Temptation of Krust", "Dumbbell Indemnity", "Lisa the Simpson", "This Little Wiggy", "Simpson Tide", 
"The Trouble with Trillions", "Girly Edition", "Trash of the Titans", "King of the Hill", "Lost Our Lisa", "Natural Born Kissers", 
"Lard of the Dance", "The Wizard of Evergreen Terrace", "Bart the Mother", "Treehouse of Horror IX", "When You Dish Upon a Star", 
"D'oh-in' in the Wind", "Lisa Gets an \"A\"", "Homer Simpson in: \"Kidney Trouble\"", "Mayored to the Mob", "Viva Ned Flanders", 
"Wild Barts Can't Be Broken", "Sunday, Cruddy Sunday", "Homer to the Max", "I'm with Cupid", 
"Marge Simpson in: \"Screaming Yellow Honkers\"", "Make Room for Lisa", "Maximum Homerdrive", "Simpsons Bible Stories", 
"Mom and Pop Art", "The Old Man and the \"C\" Student", "Monty Can't Buy Me Love", "They Saved Lisa's Brain", 
"Thirty Minutes Over Tokyo", "Beyond Blunderdome", "Brother's Little Helper", "Guess Who's Coming to Criticize Dinner?", 
"Treehouse of Horror X", "E-I-E-I-D'oh", "Hello Gutter, Hello Fadder", "Eight Misbehavin'", "Take My Wife, Sleaze", 
"Grift of the Magi", "Little Big Mom", "Faith Off", "The Mansion Family", "Saddlesore Galactica", "Alone Again, Natura-Diddily", 
"Missionary: Impossible", "Pygmoelian", "Bart to the Future", "Days of Wine and D'oh'ses", "Kill the Alligator and Run", 
"Last Tap Dance in Springfield", "It's a Mad, Mad, Mad, Mad Marge", "Behind the Laughter", "Treehouse of Horror XI", 
"A Tale of Two Springfields", "Insane Clown Poppy", "Lisa the Tree Hugger", "Homer vs. Dignity", "The Computer Wore Menace Shoes", 
"The Great Money Caper", "Skinner's Sense of Snow", "HOMЯ", "Pokey Mom", "Worst Episode Ever", "Tennis the Menace", 
"Day of the Jackanapes", "New Kids on the Blecch", "Hungry, Hungry Homer", "Bye Bye Nerdie", "Simpson Safari", "Trilogy of Error", 
"I'm Goin' to Praiseland", "Children of a Lesser Clod", "Simpsons Tall Tales", "Treehouse of Horror XII", "The Parent Rap", 
"Homer the Moe", "A Hunka Hunka Burns in Love", "The Blunder Years", "She of Little Faith", "Brawl in the Family", 
"Sweets and Sour Marge", "Jaws Wired Shut", "Half-Decent Proposal", "The Bart Wants What It Wants", "The Lastest Gun in the West", 
"The Old Man and the Key", "Tales from the Public Domain", "Blame It on Lisa", "Weekend at Burnsie's", "Gump Roast", 
"I Am Furious (Yellow)", "The Sweetest Apu", "Little Girl in the Big Ten", "The Frying Game", "Poppa's Got a Brand New Badge", 
"Treehouse of Horror XIII", "How I Spent My Strummer Vacation", "Bart vs. Lisa vs. the Third Grade", "Large Marge", 
"Helter Shelter", "The Great Louse Detective", "Special Edna", "The Dad Who Knew Too Little", "The Strong Arms of the Ma", 
"Pray Anything", "Barting Over", "I'm Spelling as Fast as I Can", "A Star Is Born-Again", "Mr. Spritz Goes to Washington", 
"C.E. D'oh", "'Scuse Me While I Miss the Sky", "Three Gays of the Condo", "Dude, Where's My Ranch?", "Old Yeller-Belly", 
"Brake My Wife, Please", "The Bart of War", "Moe Baby Blues", "Treehouse of Horror XIV", "My Mother the Carjacker", 
"The President Wore Pearls", "The Regina Monologues", "The Fat and the Furriest", "Today, I Am a Clown", 
"'Tis the Fifteenth Season", "Marge vs. Singles, Seniors, Childless Couples and Teens and Gays", "I, (Annoyed Grunt)-Bot", 
"Diatribe of a Mad Housewife", "Margical History Tour", "Milhouse Doesn't Live Here Anymore", "Smart and Smarter", 
"The Ziff Who Came to Dinner", "Co-Dependent's Day", "The Wandering Juvie", "My Big Fat Geek Wedding", "Catch 'Em if You Can", 
"Simple Simpson", "The Way We Weren't", "Bart-Mangled Banner", "Fraudcast News"};
    
    String[] seasonList = {"Season 1, Episode 1", "Season 1, Episode 2", "Season 1, Episode 3", "Season 1, Episode 4", 
"Season 1, Episode 5", "Season 1, Episode 6", "Season 1, Episode 7", "Season 1, Episode 8", "Season 1, Episode 9", 
"Season 1, Episode 10", "Season 1, Episode 11", "Season 1, Episode 12", "Season 1, Episode 13", "Season 2, Episode 1", 
"Season 2, Episode 2", "Season 2, Episode 3", "Season 2, Episode 4", "Season 2, Episode 5", "Season 2, Episode 6", 
"Season 2, Episode 7", "Season 2, Episode 8", "Season 2, Episode 9", "Season 2, Episode 10", "Season 2, Episode 11", 
"Season 2, Episode 12", "Season 2, Episode 13", "Season 2, Episode 14", "Season 2, Episode 15", "Season 2, Episode 16", 
"Season 2, Episode 17", "Season 2, Episode 18", "Season 2, Episode 19", "Season 2, Episode 20", "Season 2, Episode 21", 
"Season 2, Episode 22", "Season 3, Episode 1", "Season 3, Episode 2", "Season 3, Episode 3", "Season 3, Episode 4", 
"Season 3, Episode 5", "Season 3, Episode 6", "Season 3, Episode 7", "Season 3, Episode 8", "Season 3, Episode 9", 
"Season 3, Episode 10", "Season 3, Episode 11", "Season 3, Episode 12", "Season 3, Episode 13", "Season 3, Episode 14", 
"Season 3, Episode 15", "Season 3, Episode 16", "Season 3, Episode 17", "Season 3, Episode 18", "Season 3, Episode 19", 
"Season 3, Episode 20", "Season 3, Episode 21", "Season 3, Episode 22", "Season 3, Episode 23", "Season 3, Episode 24", 
"Season 4, Episode 1", "Season 4, Episode 2", "Season 4, Episode 3", "Season 4, Episode 4", "Season 4, Episode 5", 
"Season 4, Episode 6", "Season 4, Episode 7", "Season 4, Episode 8", "Season 4, Episode 9", "Season 4, Episode 10", 
"Season 4, Episode 11", "Season 4, Episode 12", "Season 4, Episode 13", "Season 4, Episode 14", "Season 4, Episode 15", 
"Season 4, Episode 16", "Season 4, Episode 17", "Season 4, Episode 18", "Season 4, Episode 19", "Season 4, Episode 20", 
"Season 4, Episode 21", "Season 4, Episode 22", "Season 5, Episode 1", "Season 5, Episode 2", "Season 5, Episode 3", 
"Season 5, Episode 4", "Season 5, Episode 5", "Season 5, Episode 6", "Season 5, Episode 7", "Season 5, Episode 8", 
"Season 5, Episode 9", "Season 5, Episode 10", "Season 5, Episode 11", "Season 5, Episode 12", "Season 5, Episode 13", 
"Season 5, Episode 14", "Season 5, Episode 15", "Season 5, Episode 16", "Season 5, Episode 17", "Season 5, Episode 18", 
"Season 5, Episode 19", "Season 5, Episode 20", "Season 5, Episode 21", "Season 5, Episode 22", "Season 6, Episode 1", 
"Season 6, Episode 2", "Season 6, Episode 3", "Season 6, Episode 4", "Season 6, Episode 5", "Season 6, Episode 6", 
"Season 6, Episode 7", "Season 6, Episode 8", "Season 6, Episode 9", "Season 6, Episode 10", "Season 6, Episode 11", 
"Season 6, Episode 12", "Season 6, Episode 13", "Season 6, Episode 14", "Season 6, Episode 15", "Season 6, Episode 16", 
"Season 6, Episode 17", "Season 6, Episode 18", "Season 6, Episode 19", "Season 6, Episode 20", "Season 6, Episode 21", 
"Season 6, Episode 22", "Season 6, Episode 23", "Season 6, Episode 24", "Season 6, Episode 25", "Season 7, Episode 1", 
"Season 7, Episode 2", "Season 7, Episode 3", "Season 7, Episode 4", "Season 7, Episode 5", "Season 7, Episode 6", 
"Season 7, Episode 7", "Season 7, Episode 8", "Season 7, Episode 9", "Season 7, Episode 10", "Season 7, Episode 11", 
"Season 7, Episode 12", "Season 7, Episode 13", "Season 7, Episode 14", "Season 7, Episode 15", "Season 7, Episode 16", 
"Season 7, Episode 17", "Season 7, Episode 18", "Season 7, Episode 19", "Season 7, Episode 20", "Season 7, Episode 21", 
"Season 7, Episode 22", "Season 7, Episode 23", "Season 7, Episode 24", "Season 7, Episode 25", "Season 8, Episode 1", 
"Season 8, Episode 2", "Season 8, Episode 3", "Season 8, Episode 4", "Season 8, Episode 5", "Season 8, Episode 6", 
"Season 8, Episode 7", "Season 8, Episode 8", "Season 8, Episode 9", "Season 8, Episode 10", "Season 8, Episode 11", 
"Season 8, Episode 12", "Season 8, Episode 13", "Season 8, Episode 14", "Season 8, Episode 15", "Season 8, Episode 16", 
"Season 8, Episode 17", "Season 8, Episode 18", "Season 8, Episode 19", "Season 8, Episode 20", "Season 8, Episode 21", 
"Season 8, Episode 22", "Season 8, Episode 23", "Season 8, Episode 24", "Season 8, Episode 25", "Season 9, Episode 1", 
"Season 9, Episode 2", "Season 9, Episode 3", "Season 9, Episode 4", "Season 9, Episode 5", "Season 9, Episode 6", 
"Season 9, Episode 7", "Season 9, Episode 8", "Season 9, Episode 9", "Season 9, Episode 10", "Season 9, Episode 11", 
"Season 9, Episode 12", "Season 9, Episode 13", "Season 9, Episode 14", "Season 9, Episode 15", "Season 9, Episode 16", 
"Season 9, Episode 17", "Season 9, Episode 18", "Season 9, Episode 19", "Season 9, Episode 20", "Season 9, Episode 21", 
"Season 9, Episode 22", "Season 9, Episode 23", "Season 9, Episode 24", "Season 9, Episode 25", "Season 10, Episode 1", 
"Season 10, Episode 2", "Season 10, Episode 3", "Season 10, Episode 4", "Season 10, Episode 5", "Season 10, Episode 6", 
"Season 10, Episode 7", "Season 10, Episode 8", "Season 10, Episode 9", "Season 10, Episode 10", "Season 10, Episode 11", 
"Season 10, Episode 12", "Season 10, Episode 13", "Season 10, Episode 14", "Season 10, Episode 15", "Season 10, Episode 16", 
"Season 10, Episode 17", "Season 10, Episode 18", "Season 10, Episode 19", "Season 10, Episode 20", "Season 10, Episode 21", 
"Season 10, Episode 22", "Season 10, Episode 23", "Season 11, Episode 1", "Season 11, Episode 2", "Season 11, Episode 3", 
"Season 11, Episode 4", "Season 11, Episode 5", "Season 11, Episode 6", "Season 11, Episode 7", "Season 11, Episode 8", 
"Season 11, Episode 9", "Season 11, Episode 10", "Season 11, Episode 11", "Season 11, Episode 12", "Season 11, Episode 13", 
"Season 11, Episode 14", "Season 11, Episode 15", "Season 11, Episode 16", "Season 11, Episode 17", "Season 11, Episode 18", 
"Season 11, Episode 19", "Season 11, Episode 20", "Season 11, Episode 21", "Season 11, Episode 22", "Season 12, Episode 1", 
"Season 12, Episode 2", "Season 12, Episode 3", "Season 12, Episode 4", "Season 12, Episode 5", "Season 12, Episode 6", 
"Season 12, Episode 7", "Season 12, Episode 8", "Season 12, Episode 9", "Season 12, Episode 10", "Season 12, Episode 11", 
"Season 12, Episode 12", "Season 12, Episode 13", "Season 12, Episode 14", "Season 12, Episode 15", "Season 12, Episode 16", 
"Season 12, Episode 17", "Season 12, Episode 18", "Season 12, Episode 19", "Season 12, Episode 20", "Season 12, Episode 21", 
"Season 13, Episode 1", "Season 13, Episode 2", "Season 13, Episode 3", "Season 13, Episode 4", "Season 13, Episode 5", 
"Season 13, Episode 6", "Season 13, Episode 7", "Season 13, Episode 8", "Season 13, Episode 9", "Season 13, Episode 10", 
"Season 13, Episode 11", "Season 13, Episode 12", "Season 13, Episode 13", "Season 13, Episode 14", "Season 13, Episode 15", 
"Season 13, Episode 16", "Season 13, Episode 17", "Season 13, Episode 18", "Season 13, Episode 19", "Season 13, Episode 20", 
"Season 13, Episode 21", "Season 13, Episode 22", "Season 14, Episode 1", "Season 14, Episode 2", "Season 14, Episode 3", 
"Season 14, Episode 4", "Season 14, Episode 5", "Season 14, Episode 6", "Season 14, Episode 7", "Season 14, Episode 8", 
"Season 14, Episode 9", "Season 14, Episode 10", "Season 14, Episode 11", "Season 14, Episode 12", "Season 14, Episode 13", 
"Season 14, Episode 14", "Season 14, Episode 15", "Season 14, Episode 16", "Season 14, Episode 17", "Season 14, Episode 18", 
"Season 14, Episode 19", "Season 14, Episode 20", "Season 14, Episode 21", "Season 14, Episode 22", "Season 15, Episode 1", 
"Season 15, Episode 2", "Season 15, Episode 3", "Season 15, Episode 4", "Season 15, Episode 5", "Season 15, Episode 6", 
"Season 15, Episode 7", "Season 15, Episode 8", "Season 15, Episode 9", "Season 15, Episode 10", "Season 15, Episode 11", 
"Season 15, Episode 12", "Season 15, Episode 13", "Season 15, Episode 14", "Season 15, Episode 15", "Season 15, Episode 16", 
"Season 15, Episode 17", "Season 15, Episode 18", "Season 15, Episode 19", "Season 15, Episode 20", "Season 15, Episode 21", 
"Season 15, Episode 22"};
    
    JTextField episodeName;
    JTextField seasonPlace;
    JButton selectionButton;
    
    public static void main(String[] args) 
    {
        SimpsonsEpisodeSelector SES = new SimpsonsEpisodeSelector();
        SES.buildGUI();
        SES.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
    }
    
    void buildGUI()
    {
        Container c = getContentPane();
        c.setLayout(null);
 
        episodeName = new JTextField(20);
        seasonPlace = new JTextField(20);
        selectionButton = new JButton("Choose an Episode");
        selectionButton.addActionListener(this);
        
        JPanel labelPanel = new JPanel();
        labelPanel.setBounds(0, 60, 480, 40);
        labelPanel.setLayout(null);
        
        JPanel episodePanel = new JPanel();
        episodePanel.setBounds(0, 100, 480, 40);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(0, 150, 480, 40);
                 
        JLabel epName = new JLabel("Episode Name");
        epName.setBounds(85, 22, 120, 20);
        labelPanel.add(epName);
        
        JLabel seasonName = new JLabel("Season & Episode Number");
        seasonName.setBounds(285, 22, 250, 20);
        labelPanel.add(seasonName);
        
        episodePanel.add(episodeName);
        episodePanel.add(seasonPlace);
        
        buttonPanel.add(selectionButton);
        
        c.add(labelPanel);
        c.add(episodePanel);
        c.add(buttonPanel);
        
        setTitle("The Simpsons");
        setSize(500,300);
        setVisible(true);     
    }
    
    public void actionPerformed(ActionEvent e)
    {
        int selection = (int) (Math.random() * episodeNames.length);
        episodeName.setText(episodeNames[selection]);
        seasonPlace.setText(seasonList[selection]);
    }    
}