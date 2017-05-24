/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpsons.episode.selector;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.Toolkit;
import java.util.ArrayList;
/**
 *
 * @author Michael
 */
public class SimpsonsEpisodeSelector extends JFrame implements ActionListener, ItemListener{

    String[] episodeNames1 = {"Simpsons Roasting on an Open Fire", "Bart the Genius", "Homer's Odyssey", 
"There's No Disgrace Like Home", "Bart the General", "Moaning Lisa", "The Call of the Simpsons", "The Telltale Head", 
"Life on the Fast Lane", "Homer's Night Out", "The Crepes of Wrath", "Krusty Gets Busted", "Some Enchanted Evening"};
    
    String[] episodeNames2 = {"Bart Gets an \"F\"", "Simpson and Delilah", "Treehouse of Horror", "Two Cars in Every Garage and Three Eyes on Every Fish", 
"Dancin' Homer", "Dead Putting Society", "Bart vs. Thanksgiving", "Bart the Daredevil", "Itchy & Scratchy & Marge", 
"Bart Gets Hit by a Car", "One Fish, Two Fish, Blowfish, Blue Fish", "The Way We Was", "Homer vs. Lisa and the 8th Commandment", 
"Principal Charming", "Oh Brother, Where Art Thou?", "Bart's Dog Gets an F", "Old Money", "Brush with Greatness", 
"Lisa's Substitute", "The War of the Simpsons", "Three Men and a Comic Book", "Blood Feud"};
    
    String[] episodeNames3 = {"Stark Raving Dad", 
"Mr. Lisa Goes to Washington", "When Flanders Failed", "Bart the Murderer", "Homer Defined", "Like Father, Like Clown", 
"Treehouse of Horror II", "Lisa's Pony", "Saturdays of Thunder", "Flaming Moe's", "Burns Verkaufen der Kraftwerk", 
"I Married Marge", "Radio Bart", "Lisa the Greek", "Homer Alone", "Bart the Lover", "Homer at the Bat", "Separate Vocations", 
"Dog of Death", "Colonel Homer", "Black Widower", "The Otto Show", "Bart's Friend Falls in Love", 
"Brother, Can You Spare Two Dimes?"};
    
    String[] episodeNames4 = {"Kamp Krusty", "A Streetcar Named Marge", "Homer the Heretic", "Lisa the Beauty Queen", 
"Treehouse of Horror III", "Itchy & Scratchy: The Movie", "Marge Gets a Job", "New Kid on the Block", "Mr. Plow", 
"Lisa's First Word", "Homer's Triple Bypass", "Marge vs. the Monorail", "Selma's Choice", "Brother from the Same Planet", 
"I Love Lisa", "Duffless", "Last Exit to Springfield", "So It's Come to This: A Simpsons Clip Show", "The Front", "Whacking Day", 
"Marge in Chains", "Krusty Gets Kancelled"};
    
    String[] episodeNames5 = {"Homer's Barbershop Quartet", "Cape Feare", "Homer Goes to College", "Rosebud", 
"Treehouse of Horror IV", "Marge on the Lam", "Bart's Inner Child", "Boy-Scoutz 'n the Hood", "The Last Temptation of Homer", 
"$pringfield (Or, How I Learned to Stop Worrying and Love Legalized Gambling)", "Homer the Vigilante", "Bart Gets Famous", 
"Homer and Apu", "Lisa vs. Malibu Stacy", "Deep Space Homer", "Homer Loves Flanders", "Bart Gets an Elephant", "Burns' Heir", 
"Sweet Seymour Skinner's Baadasssss Song", "The Boy Who Knew Too Much", "Lady Bouvier's Lover", "Secrets of a Successful Marriage"};
    
    String[] episodeNames6 = {"Bart of Darkness", "Lisa's Rival", "Another Simpsons Clip Show", "Itchy & Scratchy Land", "Sideshow Bob Roberts", 
"Treehouse of Horror V", "Bart's Girlfriend", "Lisa on Ice", "Homer Badman", "Grampa vs. Sexual Inadequacy", "Fear of Flying", 
"Homer the Great", "And Maggie Makes Three", "Bart's Comet", "Homie the Clown", "Bart vs. Australia", "Homer vs. Patty and Selma", 
"A Star is Burns", "Lisa's Wedding", "Two Dozen and One Greyhounds", "The PTA Disbands", "'Round Springfield", 
"The Springfield Connection", "Lemon of Troy", "Who Shot Mr. Burns? (Part One)"};
    
    String[] episodeNames7 = {"Who Shot Mr. Burns? (Part Two)", "Radioactive Man", "Home Sweet Homediddly-Dum-Doodily", "Bart Sells His Soul", "Lisa the Vegetarian", "Treehouse of Horror VI", "King-Size Homer", 
"Mother Simpson", "Sideshow Bob's Last Gleaming", "The Simpsons 138th Episode Spectacular", "Marge Be Not Proud", "Team Homer", 
"Two Bad Neighbors", "Scenes from the Class Struggle in Springfield", "Bart the Fink", "Lisa the Iconoclast", "Homer the Smithers", 
"The Day the Violence Died", "A Fish Called Selma", "Bart on the Road", "22 Short Films About Springfield", 
"Raging Abe Simpson and His Grumbling Grandson in \"The Curse of the Flying Hellfish\"", "Much Apu About Nothing", "Homerpalooza",
"Summer of 4 Ft. 2"};
    
    String[] episodeNames8 = {"Treehouse of Horror VII", "You Only Move Twice", "The Homer They Fall", "Burns, Baby Burns", 
"Bart After Dark", "A Milhouse Divided", "Lisa's Date with Density", "Hurricane Neddy", "The Mysterious Voyage of Homer", 
"The Springfield Files", "The Twisted World of Marge Simpson", "Mountain of Madness", 
"Simpsoncalifragilisticexpiala(Annoyed Grunt)cious", "The Itchy & Scratchy & Poochie Show", "Homer's Phobia", 
"Brother from Another Series", "My Sister, My Sitter", "Homer vs. the Eighteenth Amendment", "Grade School Confidential", 
"The Canine Mutiny", "The Old Man and the Lisa", "In Marge We Trust ", "Homer's Enemy", "The Simpsons Spin-Off Showcase", 
"The Secret War of Lisa Simpson"};
    
    String[] episodeNames9 = {"The City of New York vs. Homer Simpson", "The Principal and the Pauper", "Lisa's Sax", 
"Treehouse of Horror VIII", "The Cartridge Family", "Bart Star", "The Two Mrs. Nahasapeemapetilons", "Lisa the Skeptic", 
"Realty Bites", "Miracle on Evergreen Terrace", "All Singing, All Dancing", "Bart Carny", "The Joy of Sect", "Das Bus", 
"The Last Temptation of Krust", "Dumbbell Indemnity", "Lisa the Simpson", "This Little Wiggy", "Simpson Tide", 
"The Trouble with Trillions", "Girly Edition", "Trash of the Titans", "King of the Hill", "Lost Our Lisa", "Natural Born Kissers"};
    
    String[] episodeNames10 = {"Lard of the Dance", "The Wizard of Evergreen Terrace", "Bart the Mother", "Treehouse of Horror IX", "When You Dish Upon a Star", 
"D'oh-in' in the Wind", "Lisa Gets an \"A\"", "Homer Simpson in: \"Kidney Trouble\"", "Mayored to the Mob", "Viva Ned Flanders", 
"Wild Barts Can't Be Broken", "Sunday, Cruddy Sunday", "Homer to the Max", "I'm with Cupid", 
"Marge Simpson in: \"Screaming Yellow Honkers\"", "Make Room for Lisa", "Maximum Homerdrive", "Simpsons Bible Stories", 
"Mom and Pop Art", "The Old Man and the \"C\" Student", "Monty Can't Buy Me Love", "They Saved Lisa's Brain", 
"Thirty Minutes Over Tokyo"};
    
    String[] episodeNames11 = {"Beyond Blunderdome", "Brother's Little Helper", "Guess Who's Coming to Criticize Dinner?", 
"Treehouse of Horror X", "E-I-E-I-D'oh", "Hello Gutter, Hello Fadder", "Eight Misbehavin'", "Take My Wife, Sleaze", 
"Grift of the Magi", "Little Big Mom", "Faith Off", "The Mansion Family", "Saddlesore Galactica", "Alone Again, Natura-Diddily", 
"Missionary: Impossible", "Pygmoelian", "Bart to the Future", "Days of Wine and D'oh'ses", "Kill the Alligator and Run", 
"Last Tap Dance in Springfield", "It's a Mad, Mad, Mad, Mad Marge", "Behind the Laughter"};
    
    String[] episodeNames12 = {"Treehouse of Horror XI", "A Tale of Two Springfields", "Insane Clown Poppy", "Lisa the Tree Hugger", "Homer vs. Dignity", "The Computer Wore Menace Shoes", 
"The Great Money Caper", "Skinner's Sense of Snow", "HOMЯ", "Pokey Mom", "Worst Episode Ever", "Tennis the Menace", 
"Day of the Jackanapes", "New Kids on the Blecch", "Hungry, Hungry Homer", "Bye Bye Nerdie", "Simpson Safari", "Trilogy of Error", 
"I'm Goin' to Praiseland", "Children of a Lesser Clod", "Simpsons Tall Tales"};
    
    String[] episodeNames13 = {"Treehouse of Horror XII", "The Parent Rap", "Homer the Moe", "A Hunka Hunka Burns in Love", "The Blunder Years", "She of Little Faith", "Brawl in the Family", 
"Sweets and Sour Marge", "Jaws Wired Shut", "Half-Decent Proposal", "The Bart Wants What It Wants", "The Lastest Gun in the West", 
"The Old Man and the Key", "Tales from the Public Domain", "Blame It on Lisa", "Weekend at Burnsie's", "Gump Roast", 
"I Am Furious (Yellow)", "The Sweetest Apu", "Little Girl in the Big Ten", "The Frying Game", "Poppa's Got a Brand New Badge"};
    
    String[] episodeNames14 = {"Treehouse of Horror XIII", "How I Spent My Strummer Vacation", "Bart vs. Lisa vs. the Third Grade", "Large Marge", 
"Helter Shelter", "The Great Louse Detective", "Special Edna", "The Dad Who Knew Too Little", "The Strong Arms of the Ma", 
"Pray Anything", "Barting Over", "I'm Spelling as Fast as I Can", "A Star Is Born-Again", "Mr. Spritz Goes to Washington", 
"C.E. D'oh", "'Scuse Me While I Miss the Sky", "Three Gays of the Condo", "Dude, Where's My Ranch?", "Old Yeller-Belly", 
"Brake My Wife, Please", "The Bart of War", "Moe Baby Blues"};
    
    String[] episodeNames15 = {"Treehouse of Horror XIV", "My Mother the Carjacker", 
"The President Wore Pearls", "The Regina Monologues", "The Fat and the Furriest", "Today, I Am a Clown", 
"'Tis the Fifteenth Season", "Marge vs. Singles, Seniors, Childless Couples and Teens and Gays", "I, (Annoyed Grunt)-Bot", 
"Diatribe of a Mad Housewife", "Margical History Tour", "Milhouse Doesn't Live Here Anymore", "Smart and Smarter", 
"The Ziff Who Came to Dinner", "Co-Dependent's Day", "The Wandering Juvie", "My Big Fat Geek Wedding", "Catch 'Em if You Can", 
"Simple Simpson", "The Way We Weren't", "Bart-Mangled Banner", "Fraudcast News"};
    
    ArrayList<String> episodeNames = new ArrayList<String>();
    
    String[] season1List = {"Season 1, Episode 1", "Season 1, Episode 2", "Season 1, Episode 3", "Season 1, Episode 4", 
"Season 1, Episode 5", "Season 1, Episode 6", "Season 1, Episode 7", "Season 1, Episode 8", "Season 1, Episode 9", 
"Season 1, Episode 10", "Season 1, Episode 11", "Season 1, Episode 12", "Season 1, Episode 13"};
    
    String[] season2List = {"Season 2, Episode 1", "Season 2, Episode 2", "Season 2, Episode 3", "Season 2, Episode 4", "Season 2, Episode 5", "Season 2, Episode 6", 
"Season 2, Episode 7", "Season 2, Episode 8", "Season 2, Episode 9", "Season 2, Episode 10", "Season 2, Episode 11", 
"Season 2, Episode 12", "Season 2, Episode 13", "Season 2, Episode 14", "Season 2, Episode 15", "Season 2, Episode 16", 
"Season 2, Episode 17", "Season 2, Episode 18", "Season 2, Episode 19", "Season 2, Episode 20", "Season 2, Episode 21", 
"Season 2, Episode 22"};
    
    String[] season3List = {"Season 3, Episode 1", "Season 3, Episode 2", "Season 3, Episode 3", "Season 3, Episode 4", 
"Season 3, Episode 5", "Season 3, Episode 6", "Season 3, Episode 7", "Season 3, Episode 8", "Season 3, Episode 9", 
"Season 3, Episode 10", "Season 3, Episode 11", "Season 3, Episode 12", "Season 3, Episode 13", "Season 3, Episode 14", 
"Season 3, Episode 15", "Season 3, Episode 16", "Season 3, Episode 17", "Season 3, Episode 18", "Season 3, Episode 19", 
"Season 3, Episode 20", "Season 3, Episode 21", "Season 3, Episode 22", "Season 3, Episode 23", "Season 3, Episode 24"};
    
    String[] season4List = {"Season 4, Episode 1", "Season 4, Episode 2", "Season 4, Episode 3", "Season 4, Episode 4", "Season 4, Episode 5", 
"Season 4, Episode 6", "Season 4, Episode 7", "Season 4, Episode 8", "Season 4, Episode 9", "Season 4, Episode 10", 
"Season 4, Episode 11", "Season 4, Episode 12", "Season 4, Episode 13", "Season 4, Episode 14", "Season 4, Episode 15", 
"Season 4, Episode 16", "Season 4, Episode 17", "Season 4, Episode 18", "Season 4, Episode 19", "Season 4, Episode 20", 
"Season 4, Episode 21", "Season 4, Episode 22"};
       
    String[] season5List = {"Season 5, Episode 1", "Season 5, Episode 2", "Season 5, Episode 3", 
"Season 5, Episode 4", "Season 5, Episode 5", "Season 5, Episode 6", "Season 5, Episode 7", "Season 5, Episode 8", 
"Season 5, Episode 9", "Season 5, Episode 10", "Season 5, Episode 11", "Season 5, Episode 12", "Season 5, Episode 13", 
"Season 5, Episode 14", "Season 5, Episode 15", "Season 5, Episode 16", "Season 5, Episode 17", "Season 5, Episode 18", 
"Season 5, Episode 19", "Season 5, Episode 20", "Season 5, Episode 21", "Season 5, Episode 22"};
        
    String[] season6List = {"Season 6, Episode 1", "Season 6, Episode 2", "Season 6, Episode 3", "Season 6, Episode 4", "Season 6, Episode 5", "Season 6, Episode 6", 
"Season 6, Episode 7", "Season 6, Episode 8", "Season 6, Episode 9", "Season 6, Episode 10", "Season 6, Episode 11", 
"Season 6, Episode 12", "Season 6, Episode 13", "Season 6, Episode 14", "Season 6, Episode 15", "Season 6, Episode 16", 
"Season 6, Episode 17", "Season 6, Episode 18", "Season 6, Episode 19", "Season 6, Episode 20", "Season 6, Episode 21", 
"Season 6, Episode 22", "Season 6, Episode 23", "Season 6, Episode 24", "Season 6, Episode 25"};
     
    String[] season7List = {"Season 7, Episode 1", "Season 7, Episode 2", "Season 7, Episode 3", "Season 7, Episode 4", "Season 7, Episode 5", "Season 7, Episode 6", 
"Season 7, Episode 7", "Season 7, Episode 8", "Season 7, Episode 9", "Season 7, Episode 10", "Season 7, Episode 11", 
"Season 7, Episode 12", "Season 7, Episode 13", "Season 7, Episode 14", "Season 7, Episode 15", "Season 7, Episode 16", 
"Season 7, Episode 17", "Season 7, Episode 18", "Season 7, Episode 19", "Season 7, Episode 20", "Season 7, Episode 21", 
"Season 7, Episode 22", "Season 7, Episode 23", "Season 7, Episode 24", "Season 7, Episode 25"};
       
    String[] season8List = {"Season 8, Episode 1", "Season 8, Episode 2", "Season 8, Episode 3", "Season 8, Episode 4", "Season 8, Episode 5", "Season 8, Episode 6", 
"Season 8, Episode 7", "Season 8, Episode 8", "Season 8, Episode 9", "Season 8, Episode 10", "Season 8, Episode 11", 
"Season 8, Episode 12", "Season 8, Episode 13", "Season 8, Episode 14", "Season 8, Episode 15", "Season 8, Episode 16", 
"Season 8, Episode 17", "Season 8, Episode 18", "Season 8, Episode 19", "Season 8, Episode 20", "Season 8, Episode 21", 
"Season 8, Episode 22", "Season 8, Episode 23", "Season 8, Episode 24", "Season 8, Episode 25"};
        
    String[] season9List = {"Season 9, Episode 1", "Season 9, Episode 2", "Season 9, Episode 3", "Season 9, Episode 4", "Season 9, Episode 5", "Season 9, Episode 6", 
"Season 9, Episode 7", "Season 9, Episode 8", "Season 9, Episode 9", "Season 9, Episode 10", "Season 9, Episode 11", 
"Season 9, Episode 12", "Season 9, Episode 13", "Season 9, Episode 14", "Season 9, Episode 15", "Season 9, Episode 16", 
"Season 9, Episode 17", "Season 9, Episode 18", "Season 9, Episode 19", "Season 9, Episode 20", "Season 9, Episode 21", 
"Season 9, Episode 22", "Season 9, Episode 23", "Season 9, Episode 24", "Season 9, Episode 25"};
        
    String[] season10List = {"Season 10, Episode 1", "Season 10, Episode 2", "Season 10, Episode 3", "Season 10, Episode 4", "Season 10, Episode 5", "Season 10, Episode 6", 
"Season 10, Episode 7", "Season 10, Episode 8", "Season 10, Episode 9", "Season 10, Episode 10", "Season 10, Episode 11", 
"Season 10, Episode 12", "Season 10, Episode 13", "Season 10, Episode 14", "Season 10, Episode 15", "Season 10, Episode 16", 
"Season 10, Episode 17", "Season 10, Episode 18", "Season 10, Episode 19", "Season 10, Episode 20", "Season 10, Episode 21", 
"Season 10, Episode 22", "Season 10, Episode 23"};
       
    String[] season11List = {"Season 11, Episode 1", "Season 11, Episode 2", "Season 11, Episode 3", 
"Season 11, Episode 4", "Season 11, Episode 5", "Season 11, Episode 6", "Season 11, Episode 7", "Season 11, Episode 8", 
"Season 11, Episode 9", "Season 11, Episode 10", "Season 11, Episode 11", "Season 11, Episode 12", "Season 11, Episode 13", 
"Season 11, Episode 14", "Season 11, Episode 15", "Season 11, Episode 16", "Season 11, Episode 17", "Season 11, Episode 18", 
"Season 11, Episode 19", "Season 11, Episode 20", "Season 11, Episode 21", "Season 11, Episode 22"};
       
    String[] season12List = {"Season 12, Episode 1", "Season 12, Episode 2", "Season 12, Episode 3", "Season 12, Episode 4", "Season 12, Episode 5", "Season 12, Episode 6", 
"Season 12, Episode 7", "Season 12, Episode 8", "Season 12, Episode 9", "Season 12, Episode 10", "Season 12, Episode 11", 
"Season 12, Episode 12", "Season 12, Episode 13", "Season 12, Episode 14", "Season 12, Episode 15", "Season 12, Episode 16", 
"Season 12, Episode 17", "Season 12, Episode 18", "Season 12, Episode 19", "Season 12, Episode 20", "Season 12, Episode 21"};
    
    String[] season13List = {"Season 13, Episode 1", "Season 13, Episode 2", "Season 13, Episode 3", "Season 13, Episode 4", "Season 13, Episode 5", 
"Season 13, Episode 6", "Season 13, Episode 7", "Season 13, Episode 8", "Season 13, Episode 9", "Season 13, Episode 10", 
"Season 13, Episode 11", "Season 13, Episode 12", "Season 13, Episode 13", "Season 13, Episode 14", "Season 13, Episode 15", 
"Season 13, Episode 16", "Season 13, Episode 17", "Season 13, Episode 18", "Season 13, Episode 19", "Season 13, Episode 20", 
"Season 13, Episode 21", "Season 13, Episode 22"};
    
    String[] season14List = {"Season 14, Episode 1", "Season 14, Episode 2", "Season 14, Episode 3", 
"Season 14, Episode 4", "Season 14, Episode 5", "Season 14, Episode 6", "Season 14, Episode 7", "Season 14, Episode 8", 
"Season 14, Episode 9", "Season 14, Episode 10", "Season 14, Episode 11", "Season 14, Episode 12", "Season 14, Episode 13", 
"Season 14, Episode 14", "Season 14, Episode 15", "Season 14, Episode 16", "Season 14, Episode 17", "Season 14, Episode 18", 
"Season 14, Episode 19", "Season 14, Episode 20", "Season 14, Episode 21", "Season 14, Episode 22"};
    
    String[] season15List = {"Season 15, Episode 1", "Season 15, Episode 2", "Season 15, Episode 3", "Season 15, Episode 4", "Season 15, Episode 5", "Season 15, Episode 6", 
"Season 15, Episode 7", "Season 15, Episode 8", "Season 15, Episode 9", "Season 15, Episode 10", "Season 15, Episode 11", 
"Season 15, Episode 12", "Season 15, Episode 13", "Season 15, Episode 14", "Season 15, Episode 15", "Season 15, Episode 16", 
"Season 15, Episode 17", "Season 15, Episode 18", "Season 15, Episode 19", "Season 15, Episode 20", "Season 15, Episode 21", 
"Season 15, Episode 22"};
    
    ArrayList<String> seasonList = new ArrayList<String>();
    
    JTextField episodeName;
    JTextField seasonPlace;
    JButton selectionButton;
    JButton previousButton;
    String selectedEpisode;
    String selectedSeason;
    String previousEpisode;
    String previousSeason;
    int clickCount;
    JCheckBox s1;
    JCheckBox s2;
    JCheckBox s3;
    JCheckBox s4;
    JCheckBox s5;
    JCheckBox s6;
    JCheckBox s7;
    JCheckBox s8;
    JCheckBox s9;
    JCheckBox s10;
    JCheckBox s11;
    JCheckBox s12;
    JCheckBox s13;
    JCheckBox s14;
    JCheckBox s15;
    JCheckBox sAll;
    JCheckBox sNone;
    
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
        previousButton = new JButton("Previous");
        previousButton.addActionListener(this);
        s1 = new JCheckBox("1", true);
        s1.setBounds(20, 20, 40, 50);
        s1.addItemListener(this);
        s2 = new JCheckBox("2", true);
        s2.setBounds(65, 20, 40, 50);
        s2.addItemListener(this);
        s3 = new JCheckBox("3", true);
        s3.setBounds(110, 20, 40, 50);
        s3.addItemListener(this);
        s4 = new JCheckBox("4", true);
        s4.setBounds(155, 20, 40, 50);
        s4.addItemListener(this);
        s5 = new JCheckBox("5", true);
        s5.setBounds(200, 20, 40, 50);
        s5.addItemListener(this);
        s6 = new JCheckBox("6", true);
        s6.setBounds(245, 20, 40, 50);
        s6.addItemListener(this);
        s7 = new JCheckBox("7", true);
        s7.setBounds(290, 20, 40, 50);
        s7.addItemListener(this);
        s8 = new JCheckBox("8", true);
        s8.setBounds(335, 20, 40, 50);
        s8.addItemListener(this);
        s9 = new JCheckBox("9", true);
        s9.setBounds(380, 20, 40, 50);
        s9.addItemListener(this);
        s10 = new JCheckBox("10", true);
        s10.setBounds(425, 20, 40, 50);
        s10.addItemListener(this);
        s11 = new JCheckBox("11", true);
        s11.setBounds(65, 55, 40, 50);
        s11.addItemListener(this);
        s12 = new JCheckBox("12", true);
        s12.setBounds(110, 55, 40, 50);
        s12.addItemListener(this);
        s13 = new JCheckBox("13", true);
        s13.setBounds(155, 55, 40, 50);
        s13.addItemListener(this);
        s14 = new JCheckBox("14", true);
        s14.setBounds(200, 55, 40, 50);
        s14.addItemListener(this);
        s15 = new JCheckBox("15", true);
        s15.setBounds(245, 55, 40, 50);
        s15.addItemListener(this);
        sAll = new JCheckBox("All");
        sAll.setBounds(290, 55, 40, 50);
        sAll.addItemListener(this);
        sNone = new JCheckBox("None");
        sNone.setBounds(335, 55, 65, 50);
        sNone.addItemListener(this);
   
        JPanel labelPanel = new JPanel();
        labelPanel.setBounds(0, 10, 480, 40);
        labelPanel.setLayout(null);
        
        JPanel episodePanel = new JPanel();
        episodePanel.setBounds(0, 50, 480, 40);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(-44, 100, 480, 40);
        
        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.setLayout(null);
        checkBoxPanel.setBounds(0, 150, 480, 120);
                 
        JLabel epName = new JLabel("Episode Name");
        epName.setBounds(85, 22, 120, 20);
        labelPanel.add(epName);
        
        JLabel seasonName = new JLabel("Season & Episode Number");
        seasonName.setBounds(285, 22, 250, 20);
        labelPanel.add(seasonName);
        
        JLabel selectionTip = new JLabel("Only Include Seasons:");
        selectionTip.setBounds(175, 5, 250, 20);
        checkBoxPanel.add(selectionTip);
        checkBoxPanel.add(s1); checkBoxPanel.add(s2); checkBoxPanel.add(s3); checkBoxPanel.add(s4); checkBoxPanel.add(s5);
        checkBoxPanel.add(s6); checkBoxPanel.add(s7); checkBoxPanel.add(s8); checkBoxPanel.add(s9); checkBoxPanel.add(s10);
        checkBoxPanel.add(s11); checkBoxPanel.add(s12); checkBoxPanel.add(s13); checkBoxPanel.add(s14);
        checkBoxPanel.add(s15); checkBoxPanel.add(sAll); checkBoxPanel.add(sNone);
        
        episodePanel.add(episodeName);
        episodePanel.add(seasonPlace);
        
        buttonPanel.add(previousButton);
        buttonPanel.add(selectionButton);
        previousButton.setEnabled(false);
        
        c.add(labelPanel);
        c.add(episodePanel);
        c.add(buttonPanel);
        c.add(checkBoxPanel);
        
        element1Adder();
        element2Adder();
        element3Adder();
        element4Adder();
        element5Adder();
        element6Adder();
        element7Adder();
        element8Adder();
        element9Adder();
        element10Adder();
        element11Adder();
        element12Adder();
        element13Adder();
        element14Adder();
        element15Adder();
        
        setTitle("The Simpsons");
        setSize(500,300);
        setVisible(true);   
    }
    
    public String[] concat(String[] a, String[] b) {
        int aLen = a.length;
        int bLen = b.length;
        String[] c = new String[aLen+bLen];
        System.arraycopy(a, 0, c, 0, aLen);
        System.arraycopy(b, 0, c, aLen, bLen);
        return c;
}
    
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == selectionButton){
            if(episodeNames.isEmpty()){
                episodeName.setText("Please Select At Least 1 Season");
                seasonPlace.setText("Please Select At Least 1 Season");
                return;
            }
            int selection = (int) (Math.random() * episodeNames.size());
            previousEpisode = selectedEpisode; 
            selectedEpisode = episodeNames.get(selection);
            episodeName.setText(selectedEpisode);
            previousSeason = selectedSeason;
            selectedSeason = seasonList.get(selection);
            seasonPlace.setText(selectedSeason);
            StringSelection stringSelection = new StringSelection(selectedEpisode);
            Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
            clpbrd.setContents(stringSelection, null);
            clickCount++;
            if(clickCount >1)
                previousButton.setEnabled(true);
        }
        else if(event.getSource() == previousButton){
            selectedEpisode = previousEpisode;
            selectedSeason = previousSeason;
            episodeName.setText(selectedEpisode);
            seasonPlace.setText(selectedSeason);
            StringSelection stringSelection = new StringSelection(selectedEpisode);
            Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
            clpbrd.setContents(stringSelection, null);
            previousButton.setEnabled(false);
        }
    }
    
    public void itemStateChanged(ItemEvent event ){
        if (event.getSource() == s1){
            if (event.getStateChange() == ItemEvent.SELECTED){
               element1Adder();
               sNone.setSelected(false);
            }
            else{
               element1Remover();
               sAll.setSelected(false);
            }
        }
        
        if (event.getSource() == s2){
            if (event.getStateChange() == ItemEvent.SELECTED){
               element2Adder();
               sNone.setSelected(false);
            }
            else{
               element2Remover();
               sAll.setSelected(false);
            }
        }
        
        if (event.getSource() == s3){
            if (event.getStateChange() == ItemEvent.SELECTED){
               element3Adder();
               sNone.setSelected(false);
            }
            else{
               element3Remover();
               sAll.setSelected(false);
            }
        }
        
        if (event.getSource() == s4){
            if (event.getStateChange() == ItemEvent.SELECTED){
               element4Adder();
               sNone.setSelected(false);
            }
            else{
               element4Remover();
               sAll.setSelected(false);
            }
        }
        
        if (event.getSource() == s5){
            if (event.getStateChange() == ItemEvent.SELECTED){
               element5Adder();
               sNone.setSelected(false);
            }
            else{
               element5Remover();
               sAll.setSelected(false);
            }
        }
        
        if (event.getSource() == s6){
            if (event.getStateChange() == ItemEvent.SELECTED){
               element6Adder();
               sNone.setSelected(false);
            }
            else{
               element6Remover();
               sAll.setSelected(false);
            }
        }
        
        if (event.getSource() == s7){
            if (event.getStateChange() == ItemEvent.SELECTED){
               element7Adder();
               sNone.setSelected(false);
            }
            else{
               element7Remover();
               sAll.setSelected(false);
            }
        }
        
        if (event.getSource() == s8){
            if (event.getStateChange() == ItemEvent.SELECTED){
               element8Adder();
               sNone.setSelected(false);
            }
            else{
               element8Remover();
               sAll.setSelected(false);
            }
        }
        
        if (event.getSource() == s9){
            if (event.getStateChange() == ItemEvent.SELECTED){
               element9Adder();
               sNone.setSelected(false);
            }
            else{
               element9Remover();
               sAll.setSelected(false);
            }
        }
        
        if (event.getSource() == s10){
            if (event.getStateChange() == ItemEvent.SELECTED){
               element10Adder();
               sNone.setSelected(false);
            }
            else{
               element10Remover();
               sAll.setSelected(false);
            }
        }
        
        if (event.getSource() == s11){
            if (event.getStateChange() == ItemEvent.SELECTED){
               element11Adder();
               sNone.setSelected(false);
            }
            else{
               element11Remover();
               sAll.setSelected(false);
            }
        }
        
        if (event.getSource() == s12){
            if (event.getStateChange() == ItemEvent.SELECTED){
               element12Adder();
               sNone.setSelected(false);
            }
            else{
               element12Remover();
               sAll.setSelected(false);
            }
        }
        
        if (event.getSource() == s13){
            if (event.getStateChange() == ItemEvent.SELECTED){
               element13Adder();
               sNone.setSelected(false);
            }
            else{
               element13Remover();
               sAll.setSelected(false);
            }
        }
        
        if (event.getSource() == s14){
            if (event.getStateChange() == ItemEvent.SELECTED){
               element14Adder();
               sNone.setSelected(false);
            }
            else{
               element14Remover();
               sAll.setSelected(false);
            }
        }
        
        if (event.getSource() == s15){
            if (event.getStateChange() == ItemEvent.SELECTED){
               element15Adder();
               sNone.setSelected(false);
            }
            else{
               element15Remover();
               sAll.setSelected(false);
            }
        }
        
        if (event.getSource() == sAll){
            if (event.getStateChange() == ItemEvent.SELECTED){
               episodeNames.clear();
               seasonList.clear();
               s1.setSelected(true); s2.setSelected(true); s3.setSelected(true); s4.setSelected(true); s5.setSelected(true);
               s6.setSelected(true); s7.setSelected(true); s8.setSelected(true); s9.setSelected(true); s10.setSelected(true);
               s11.setSelected(true); s12.setSelected(true); s13.setSelected(true); s14.setSelected(true); s15.setSelected(true);
               sNone.setSelected(false);
               element1Adder(); element2Adder(); element3Adder(); element4Adder(); element5Adder();
               element6Adder(); element7Adder(); element8Adder(); element9Adder(); element10Adder();
               element11Adder(); element12Adder(); element13Adder(); element14Adder(); element15Adder();
            }
        }
        
        if (event.getSource() == sNone){
            if (event.getStateChange() == ItemEvent.SELECTED){
               episodeNames.clear();
               seasonList.clear();
               s1.setSelected(false); s2.setSelected(false); s3.setSelected(false); s4.setSelected(false); s5.setSelected(false);
               s6.setSelected(false); s7.setSelected(false); s8.setSelected(false); s9.setSelected(false); s10.setSelected(false);
               s11.setSelected(false); s12.setSelected(false); s13.setSelected(false); s14.setSelected(false); s15.setSelected(false);
               sAll.setSelected(false);
               
            }
        }
    }
    
    void element1Adder(){
        for(int i = 0; i < episodeNames1.length; i++){
            episodeNames.add(episodeNames1[i]);
            seasonList.add(season1List[i]);
        }
    }
    
    void element2Adder(){
        for(int i = 0; i < episodeNames2.length; i++){
            episodeNames.add(episodeNames2[i]);
            seasonList.add(season2List[i]);
        }
    }
    
    void element3Adder(){
        for(int i = 0; i < episodeNames3.length; i++){
            episodeNames.add(episodeNames3[i]);
            seasonList.add(season3List[i]);
        }
    }
    
    void element4Adder(){
        for(int i = 0; i < episodeNames4.length; i++){
            episodeNames.add(episodeNames4[i]);
            seasonList.add(season4List[i]);
        }
    }
    
    void element5Adder(){
        for(int i = 0; i < episodeNames5.length; i++){
            episodeNames.add(episodeNames5[i]);
            seasonList.add(season5List[i]);
        }
    }
    
    void element6Adder(){
        for(int i = 0; i < episodeNames6.length; i++){
            episodeNames.add(episodeNames6[i]);
            seasonList.add(season6List[i]);
        }
    }
    
    void element7Adder(){
        for(int i = 0; i < episodeNames7.length; i++){
            episodeNames.add(episodeNames7[i]);
            seasonList.add(season7List[i]);
        }
    }
    
    void element8Adder(){
        for(int i = 0; i < episodeNames8.length; i++){
            episodeNames.add(episodeNames8[i]);
            seasonList.add(season8List[i]);
        }
    }
    
    void element9Adder(){
        for(int i = 0; i < episodeNames9.length; i++){
            episodeNames.add(episodeNames9[i]);
            seasonList.add(season9List[i]);
        }
    }
    
    void element10Adder(){
        for(int i = 0; i < episodeNames10.length; i++){
            episodeNames.add(episodeNames10[i]);
            seasonList.add(season10List[i]);
        }
    }
    
    void element11Adder(){
        for(int i = 0; i < episodeNames11.length; i++){
            episodeNames.add(episodeNames11[i]);
            seasonList.add(season11List[i]);
        }
    }
    
    void element12Adder(){
        for(int i = 0; i < episodeNames12.length; i++){
            episodeNames.add(episodeNames12[i]);
            seasonList.add(season12List[i]);
        }
    }
    
    void element13Adder(){
        for(int i = 0; i < episodeNames13.length; i++){
            episodeNames.add(episodeNames13[i]);
            seasonList.add(season13List[i]);
        }
    }
    
    void element14Adder(){
        for(int i = 0; i < episodeNames14.length; i++){
            episodeNames.add(episodeNames14[i]);
            seasonList.add(season14List[i]);
        }
    }
    
    void element15Adder(){
        for(int i = 0; i < episodeNames15.length; i++){
            episodeNames.add(episodeNames15[i]);
            seasonList.add(season15List[i]);
        }
    }
    
    void element1Remover(){
        for(int i = 0; i < episodeNames1.length; i++){
            episodeNames.remove(episodeNames1[i]);
            seasonList.remove(season1List[i]);
        }
    }
    
    void element2Remover(){
        for(int i = 0; i < episodeNames2.length; i++){
            episodeNames.remove(episodeNames2[i]);
            seasonList.remove(season2List[i]);
        }
    }
    
    void element3Remover(){
        for(int i = 0; i < episodeNames3.length; i++){
            episodeNames.remove(episodeNames3[i]);
            seasonList.remove(season3List[i]);
        }
    }
    
    void element4Remover(){
        for(int i = 0; i < episodeNames4.length; i++){
            episodeNames.remove(episodeNames4[i]);
            seasonList.remove(season4List[i]);
        }
    }
    
    void element5Remover(){
        for(int i = 0; i < episodeNames5.length; i++){
            episodeNames.remove(episodeNames5[i]);
            seasonList.remove(season5List[i]);
        }
    }
    
    void element6Remover(){
        for(int i = 0; i < episodeNames6.length; i++){
            episodeNames.remove(episodeNames6[i]);
            seasonList.remove(season6List[i]);
        }
    }
    
    void element7Remover(){
        for(int i = 0; i < episodeNames7.length; i++){
            episodeNames.remove(episodeNames7[i]);
            seasonList.remove(season7List[i]);
        }
    }
    
    void element8Remover(){
        for(int i = 0; i < episodeNames8.length; i++){
            episodeNames.remove(episodeNames8[i]);
            seasonList.remove(season8List[i]);
        }
    }
    
    void element9Remover(){
        for(int i = 0; i < episodeNames9.length; i++){
            episodeNames.remove(episodeNames9[i]);
            seasonList.remove(season9List[i]);
        }
    }
    
    void element10Remover(){
        for(int i = 0; i < episodeNames10.length; i++){
            episodeNames.remove(episodeNames10[i]);
            seasonList.remove(season10List[i]);
        }
    }
    
    void element11Remover(){
        for(int i = 0; i < episodeNames11.length; i++){
            episodeNames.remove(episodeNames11[i]);
            seasonList.remove(season11List[i]);
        }
    }
    
    void element12Remover(){
        for(int i = 0; i < episodeNames12.length; i++){
            episodeNames.remove(episodeNames12[i]);
            seasonList.remove(season12List[i]);
        }
    }
    
    void element13Remover(){
        for(int i = 0; i < episodeNames13.length; i++){
            episodeNames.remove(episodeNames13[i]);
            seasonList.remove(season13List[i]);
        }
    }
    
    void element14Remover(){
        for(int i = 0; i < episodeNames14.length; i++){
            episodeNames.remove(episodeNames14[i]);
            seasonList.remove(season14List[i]);
        }
    }
    
    void element15Remover(){
        for(int i = 0; i < episodeNames15.length; i++){
            episodeNames.remove(episodeNames15[i]);
            seasonList.remove(season15List[i]);
        }
    }
}