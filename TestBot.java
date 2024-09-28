import java.util.*;
import org.jpl7.Atom;
import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.Variable;
public class TestBot {
   static void fever(){
 //5% of the population is diagnosed with the disease (fever) 
 float P_D = (float) 0.05;
 //80% of people with the fever have a flu as a symptom 
 float P_Ofever1_D =(float) 0.8;
 //60% of people with the fever have a cough as a symptom
 float P_Ofever2_D =(float) 0.6;
 //70% of people with the fever have a body pain as a symptom
 float P_Ofever3_D =(float) 0.7;
 //4% of the population has a flu, a cough, and a body pain 
 float P_Ofever1_Ofever2_Ofever3 =(float) 0.04;
 //the probability of a patient having the fever given that they have a flu, a cough, and a body pain
 float P_D_Ofever1_Ofever2_Ofever3;  
   P_D_Ofever1_Ofever2_Ofever3  = (float) ((0.8 * 0.6 * 0.7) * 0.05 / 0.04) ;
   System.out.print("Probablity of Fever: " +   P_D_Ofever1_Ofever2_Ofever3);
   System.out.print("\n");
}
     static void migraine(){
  //4% of the population is diagnosed with the disease (migraine)  
  float P_Migraine_D = (float) 0.04;
 //80% of people with the migraine have a half headache as a symptom 
 float P_OMigraine1_D =(float) 0.7;
 //30% of people with the migraine have a nausea as a symptom 
 float P_OMigraine2_D =(float) 0.3;
 //6% of the population have a half headache and nausea
 float P_OMigraine1_OMigraine2 =(float) 0.06;
 //the probability of a patient having the migraine given that they have half headache and nausea
 float P_D_OMigraine1_OMigraine2;
      
    P_D_OMigraine1_OMigraine2  = (float) ((0.7 * 0.3) * 0.04 / 0.06) ;
    System.out.print("Probablity of Migraine: " + P_D_OMigraine1_OMigraine2);
    System.out.print("\n");
   
 } 
     static void tensionheadache(){
  //8% of the population is diagnosed with the disease (tension headache)  
  float P_TensionHeadache_D = (float) 0.08;
 //90% of people with the tension headache have a headache as a symptom 
 float P_OTensionHeadache1_D =(float) 0.9;
 //50% of people with the tension headache have a stiff neck as a symptom 
 float P_OTensionHeadache2_D =(float) 0.5;
 //7% of the population have a headache and stiff neck
 float P_OTensionHeadache1_OTensionHeadache2 =(float) 0.07;
 //the probability of a patient having the tension headache given that they have headache and stiff neck
 float P_D_OTensionHeadache1_OTensionHeadache2;
      
    P_D_OTensionHeadache1_OTensionHeadache2 = (float) ((0.9 * 0.5) * 0.08 / 0.07) ;
    System.out.print("Probablity of Tension Headache: " + P_D_OTensionHeadache1_OTensionHeadache2 );
    System.out.print("\n");
}
static void pneumonia(){
    //3% of the population is diagnosed with the disease (Pneumonia)  
  float P_Pneumonia_D = (float) 0.03;
 //30% of people with the Pneumonia have a cough as a symptom 
 float P_OPneumonia1_D =(float) 0.3;
 //20% of people with the Pneumonia have a breathlessness as a symptom 
 float P_OPneumonia2_D =(float) 0.2;
 //4% of the population  have a cough and breathlessness
 float P_OPneumonia =(float) 0.04;
 //the probability of a patient having the tension headache given that they have headache
 float P_D_OPneumonia;
      
    P_D_OPneumonia= (float) ((0.3 * 0.2) * 0.03 / 0.04) ;
    System.out.print("Probablity of Pneumonia: " +   P_D_OPneumonia );
    System.out.print("\n");
}
static void strepthroat(){
  //9% of the population is diagnosed with the disease (strep throat)  
  float P_StrepThroat_D = (float) 0.09;
 //80% of people with have a sore throat as a symptom 
 float P_OStrepThroat1_D =(float) 0.8;
 //70% of people with have a hoarse voice as a symptom 
 float P_OStrepThroat2_D =(float) 0.7;
 //6% of population have a sore throat and hoarse voice
 float P_OStrepThroat1_OSoreThroat2=(float) 0.06;
 //the probability of a patient having the strep throat given that they have sore throat and hoarse voice
 float P_D_OStrepThroat1_OSoreThroat2;
      
   P_D_OStrepThroat1_OSoreThroat2= (float) ((0.8 * 0.7) * 0.09/ 0.06) ;
    System.out.print("Probablity of Sore Throat: " +   P_D_OStrepThroat1_OSoreThroat2 );
    System.out.print("\n");
}
static void anemia(){
   //8% of the population is diagnosed with the disease (Anemia)  
  float P_Anemia_D = (float) 0.08;
 //60% of people with have a fatigue as a symptom 
 float P_OAnemia1_D =(float) 0.6;
 //80% of people with have a weakness as a symptom 
 float P_OAnemia2_D =(float) 0.8;
 //7% of population have a fatigue and weakness
 float P_OAnemia1_OAnemia2=(float) 0.07;
 //the probability of a patient having the anemia given that they have  fatigue and weakness
 float P_D_OAnemia1_OAnemia2;
      
   P_D_OAnemia1_OAnemia2= (float) ((0.6 * 0.8) * 0.08/ 0.07) ;
    System.out.print("Probablity of Anemia: " +   P_D_OAnemia1_OAnemia2 );
    System.out.print("\n");
}

static void CFS(){      
 //6% of the population is diagnosed with the disease (Chronic Fatigue Syndrome)  
  float P_Chronic_Fatigue_Syndrome_D = (float) 0.06;
 //40% of people with have a severe fatigue as a symptom 
 float P_OChronic_Fatigue_Syndrome1_D =(float) 0.4;
 //60% of people with have a sleeplessness as a symptom 
 float P_OChronic_Fatigue_Syndrome2_D =(float) 0.6;
 //7% of population have a severe fatigue and sleeplessness
 float P_OChronic_Fatigue_Syndrome1_OChronic_Fatigue_Syndrome2=(float) 0.07;
 //the probability of a patient having the Chronic Fatigue Syndrome given that they have severe fatigue and sleeplessness
 float P_D_OChronic_Fatigue_Syndrome1_OChronic_Fatigue_Syndrome2;
      
   P_D_OChronic_Fatigue_Syndrome1_OChronic_Fatigue_Syndrome2= (float) ((0.4 * 0.6) * 0.06/ 0.07) ;
    System.out.print("Probablity of Chronic Fatigue Syndrome: " +   P_D_OChronic_Fatigue_Syndrome1_OChronic_Fatigue_Syndrome2 );
    System.out.print("\n");
}
static void conjuctivitis(){
    //6% of the population is diagnosed with the disease (conjuctivitis)  
  float P_Conjuctivitis_D = (float) 0.06;
 //70% of people with have a itchiness as a symptom 
 float P_OConjuctivitis1_D =(float) 0.7;
 //80% of people with have a redness as a symptom 
 float P_OConjuctivitis2_D =(float) 0.8;
  //90% of people with have a discharge of tearing from eyes a symptom 
 float P_OConjuctivitis3_D =(float) 0.9;
 //8% of population have a itchiness,redness and discharge of tearing from eyes
 float P_OConjuctivitis1_OConjuctivitis2_OConjuctivitis3=(float) 0.08;
 //the probability of a patient having the conjuctivitis given that they have itchiness,redness and discharge of tearing from eyes
 float P_D_OConjuctivitis1_OConjuctivitis2_OConjuctivitis3;
      
   P_D_OConjuctivitis1_OConjuctivitis2_OConjuctivitis3= (float) ((0.6 * 0.8) * 0.06/ 0.08) ;
    System.out.print("Probablity of Conjunctivitis: " +   P_D_OConjuctivitis1_OConjuctivitis2_OConjuctivitis3 );
    System.out.print("\n");
}  
    static void gastroenteritis(){
   //9% of the population is diagnosed with the disease (Gastroenteritis)  
  float P_Gastroenteritis_D = (float) 0.09;
 //80% of people with have a diarrhoea as a symptom 
 float P_OGastroenteritis1_D =(float) 0.8;
 //60% of people with have a vomiting as a symptom 
 float P_OGastroenteritis2_D =(float) 0.6;
  //90% of people with have a stomach pain as a symptom 
 float P_OGastroenteritis3_D =(float) 0.9;
 //70% of people with have a diarrhoea and vomiting as a symptom 
 float P_OGastroenteritis4_D =(float) 0.7;
 //8% of population have a diarrhoea,vomiting and stomach pain
 float P_OGastroenteritis1_OGastroenteritis2_OGastroenteritis3_OGastroenteritis4=(float) 0.08;
 //the probability of a patient having the conjuctivitis given that they have itchiness,redness and discharge of tearing from eyes
 float P_D_OGastroenteritis1_OGastroenteritis2_OGastroenteritis3_OGastroenteritis4;
      
   P_D_OGastroenteritis1_OGastroenteritis2_OGastroenteritis3_OGastroenteritis4= (float) ((0.8 * 0.6 * 0.9 * 0.7) * 0.09/ 0.08) ;
    System.out.print("Probablity of Gastroenteritis: " +   P_D_OGastroenteritis1_OGastroenteritis2_OGastroenteritis3_OGastroenteritis4);
    System.out.print("\n");
    }
    static void highcholestrol(){
    //5% of the population is diagnosed with the disease (High Cholestrol)  
  float P_High_Cholestrol_D = (float) 0.05;
 //40% of people with have a heart attack as a symptom 
 float P_OHigh_Cholestrol1_D =(float) 0.4;
 //3% of population have a heart attack
 float P_OHigh_Cholestrol1=(float) 0.03;
 //the probability of a patient having the High Cholestrol given that they have heart attack
 float P_D_OHigh_Cholestrol1;
      
   P_D_OHigh_Cholestrol1= (float) ((0.4 * 0.05)/ 0.03) ;
    System.out.print("Probablity of High Cholestrol: " +   P_D_OHigh_Cholestrol1);
    System.out.print("\n");
    }
    static void lunginfection(){
   //6% of the population is diagnosed with the disease (Lung Infection)  
  float P_Lung_Infection_D = (float) 0.06;
 //50% of people with have a excess mucus as a symptom 
 float P_OLung_Infection1_D =(float) 0.5;
 //60% of people with have a chest pain as a symptom 
 float P_OLung_Infection2_D =(float) 0.6;
 //7% of population have a excess mucus and chest pain
 float P_OLung_Infection1_OLung_Infection2=(float) 0.07;
 //the probability of a patient having the Chronic Fatigue Syndrome given that they have excess mucus and chest pain
 float P_D_OLung_Infection1_OLung_Infection2;
      
   P_D_OLung_Infection1_OLung_Infection2= (float) ((0.5 * 0.6) * 0.06/ 0.07) ;
    System.out.print("Probablity of Chronic Fatigue Syndrome: " +   P_D_OLung_Infection1_OLung_Infection2);
    System.out.print("\n");
    }
    
    
    public static void main(String[] args) {
        MyBot mb = new MyBot();   
  
       System.out.print("Press 1 for fever's probability");
        System.out.print("\n");
       System.out.print("Press 2 for migraine's probability");
        System.out.print("\n");
       System.out.print("Press 3 for tension headache's probability");
        System.out.print("\n");
       System.out.print("Press 4 for pneumonia's probability");
        System.out.print("\n");
       System.out.print("Press 5 for strep throat's probability");
        System.out.print("\n");
       System.out.print("Press 6 for anemia's probability");
        System.out.print("\n");
       System.out.print("Press 7 for chronic fatigue syndrome's probability");
        System.out.print("\n");
       System.out.print("Press 8 for conjuctivitis' probability");
        System.out.print("\n");
       System.out.print("Press 9 for gastroenteritis' probability");
        System.out.print("\n");
       System.out.print("Press 10 for highcholestrol's probability");
        System.out.print("\n");
       System.out.print("Press 11 for lunginfection's probability");
       System.out.print("\n");
       System.out.print("Please Enter your choice (1 - 11)");
      System.out.print("\n");
            Scanner keyboard = new Scanner(System.in);
            int choice;
           choice = keyboard.nextInt();
       if(choice ==1){
             fever();
       }
       else if(choice ==2){
             migraine();
       }
       else if(choice ==3){
            tensionheadache();
       }
       else if(choice == 4){   
             pneumonia();
       }
       else if(choice == 5){
             strepthroat();
       }
       else if (choice == 6){
            anemia();
       }
       else if (choice == 7){
             CFS();
       }
       else if (choice == 8){
             conjuctivitis();
       }
       else if(choice == 9){
             gastroenteritis();
       }
       else if(choice == 10){
            highcholestrol();
       }
       else if(choice == 11){
             lunginfection();
       }
         else {

                    System.out.println("Invalid Choice!");
       }
       System.out.println("Bot: Thank You! I am all here to help you again :)");
              System.out.println("Exiting the program");  

    }
   
 

}