import java.util.*;
import org.jpl7.Atom;
import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.Variable;

public class MyBot {
    HashMap<String, String> s = new HashMap<String, String>();
    
    /**
     * This is a default constructor.
     */
      static void quit(){
            System.exit(0);
        }
   public  MyBot() {
        Query q1 = new Query("consult", new Term[] {new Atom("C:/Users/lenovo/Desktop/Javaconnectivity/sssss.pl")});
        System.out.println(q1.hasSolution() ? "knowledge base loaded" : "error loading knowledge base");
        
        // get user's symptoms
        Scanner scanner = new Scanner(System.in);
         String command;
        do {
            // get user's disease
            System.out.print("Bot: Enter the symptom or symptoms separated by commas(,) or type 'quit' to exit");
            System.out.print("\n");
            System.out.print("User: ");
            command = scanner.nextLine();
            if (!command.equals("quit")) {
                
                    command = command.toLowerCase();
               
                // query the knowledge base with the user's disease
                Query q2 = new Query("symptom_match", new Term[] {new Atom(command), new Variable("Disease")});
                if (q2.hasSolution()) {
                    java.util.Map<String, Term> solution = q2.oneSolution();
                    System.out.println("Disease: " + solution.get("Disease"));
                } else {
                    System.out.println("Sorry! No disease found for the entered symptom.\n");
                }
            }
        } 
        while (!command.equals("quit"));
     
   
        Query q3 = new Query("consult", new Term[] {new Atom("C:/Users/lenovo/Desktop/Javaconnectivity/sssss.pl")});
        System.out.println(q3.hasSolution()? "knowledge base loaded" : "error loading knowledge base");
         // get user's symptoms
      // query the knowledge base with the user's symptoms   
       System.out.println("Do you want the treatment of your disease? (yes/no)");
       
                    String answer = scanner.nextLine();
                      answer = answer.toLowerCase();
                if (answer.equals("yes"))
                {
                    
                    
        do {
            // get user's disease
            System.out.print("Bot: Enter the disease or type 'quit' to exit");
            System.out.print("\n");
            System.out.print("User: ");
            command = scanner.nextLine();
            if (!command.equals("quit")) {
                   command = command.toLowerCase();
                // query the knowledge base with the user's disease
                Query q4 = new Query("disease_match", new Term[] {new Atom(command), new Variable("Treatment")});
                if (q4.hasSolution()) {
                    java.util.Map<String, Term> solution = q4.oneSolution();
                    
                        System.out.println("Treatment: " + solution.get("Treatment"));
                    
                } else{
                    System.out.println("Sorry! No treatment found for the entered disease.\n");
                    System.out.println("You may viist these websites for more information.");
                        System.out.println("Mayo Clinic(\"http://mayoclinic.org/\")\n" +"\n" +"MD (\"http://webmd.com/\")\n" +
                                "\n" +"MedlinePlus(\"http://medlineplus.gov/\")\n" +"\n" +
                                "Centers for Disease Control and Prevention (CDC)(\"http://cdc.gov/\")\n" +"\n" +
                                "World Health Organization (WHO)(\"http://who.int/\") .\n");
                        quit();
                }
                 
            }
           
        } 
        while (!command.equals("quit"));
        
    }               
                else if(answer.equals("no")){
                      quit();
                }     
   }
}