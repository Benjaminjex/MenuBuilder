/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
    // instance variables - replace the example below with your own
    boolean done1 = false, done2 = false, done3 = false, done4 = false, done5 = false;
    boolean donePick1 = false;
    boolean finished = false;
    int mealsListSize = 4, menuSize = 0;
    int meals = 0;
    String breakMain, breakSide, lunchMain, lunchSide, snacks, dinnerMain, dinnerSide, dinnerDesert;
    String mealsList[], menuList[], breakMainList[], breakSideList[], lunchMainList[], lunchSideList[], snacksList[], dinnerMainList[], dinnerSideList[], dinnerDesertList[];

    public main()
    {
        // initialise instance variables
        //constructor
        while(!done1)
        {
            init_Meals_Lists();
            init_values_again();
            cl();
            pickO1();
            while (!done2)
            {
                if (meals == 1)//breakfast
                {
                    cl();
                    while (!done3)
                    {
                        //randomize(breakMainList[]);
                        pickR();
                        pickBreakMain();
                        while (!done4)
                        {
                            if (finished == true)
                            {
                                done4 = true;
                                done3 = true;
                                done2 = true;
                            }
                            else
                            {
                                //randomize(breakSideList[]);
                                pickR();
                                pickBreakSide();
                            }
                        }
                    }
                }
                else if (meals == 2)//lunch
                {
                    cl();
                    while (!done3)
                    {
                        //randomize(lunchMainList[]);
                        pickR();
                        pickLunchMain();
                        while (!done4)
                        {
                            if (finished == true)
                            {
                                done4 = true;
                                done3 = true;
                                done2 = true;
                            }
                            else
                            {
                                //randomize(lunchSideList[]);
                                pickR();
                                pickLunchSide();
                            }
                        }
                    }
                }
                else if (meals == 3)//snacks
                {
                    cl();
                    while (!done3)
                    {
                        //randomize(snacksList[]);
                        pickR();
                        pickSnacks();
                        if (finished == true)
                        {
                            done3 = true;
                            done2 = true;
                        }
                    }
                }
                else if (meals == 4)//dinner
                {
                    cl();
                    while (!done3)
                    {
                        //randomize(dinnerMainList[]);
                        pickR();
                        pickDinnerMain();
                        while (!done4)
                        {
                            if (finished == true)
                            {
                                done4 = true;
                                done3 = true;
                                done2 = true;
                            }
                            else
                            {
                                //randomize(dinnerSideList[]);
                                pickR();
                                pickDinnerSide();
                                while (!done5)
                                {
                                    if (finished == true)
                                    {   
                                        done5 = true;
                                        done4 = true;
                                        done3 = true;
                                        done2 = true;
                                    }
                                    else
                                    {
                                        //randomize(dinnerDesertList[]);
                                        pickR();
                                        pickDinnerDesert();
                                    }
                                }
                            }
                        }
                    }
                }
                else if (meals == 5)
                {
                    done2 = true;
                    done1 = true;
                    menuSize = 1;
                }
            }
            cl();
            displayMenu();
        }
    }
    
    public void pickR(){ donePick1 = false;}
    
    public void init_Meals_Lists()//dont forget to add ways to add to lists within program
    {
        mealsList = new String[] {"Breakfast", "Lunch", "Snacks", "Dinner", "Quit"};
        breakMainList = new String[] {"Cereal", "Oatmeal", "French Toast", "Waffles", "Yogurt"};
        breakSideList = new String[] {"Smoothie", "Eggs", "Orange Juice", "Sausage", "Bagels"};
        lunchMainList = new String[] {"Meat Sandwich", "Ramen Noodles", "Burger", "Tacos", "Enchilladas"};
        lunchSideList = new String[] {"Lemonade", "Salad", "Cucumber", "Tomato", "Crackers"};
        snacksList = new String[] {"Pudding", "Pretzels", "Salami", "Granola Bars", "Cookies"};
        dinnerMainList = new String[] {"Spaghetti","Pizza","Burritos","Burgers","Polish Dogs"};
        dinnerSideList = new String[] {"Fries","Rice","Corn","Peas","Asparagus"};
        dinnerDesertList = new String[] {"Ice Cream","Cake","Cookies","Pie","Lemon Bar"};
    }
    
    //--------------- Functions
    public void cl() {output("\u000c");}
    public void doneYet()
    {
        boolean doneYet1 = false;
        String choice;
        while(!doneYet1)
        {
            choice = input("Would  you like to add another dish to your meal? \ty/n: ");
            if (choice.equalsIgnoreCase("Y"))
            {
                menuSize = menuSize + 1;
                doneYet1 = true;
                finished = false;
            }
            else if (choice.equalsIgnoreCase("N"))
            {
                doneYet1 = true;
                finished = true;                
            }
        }
    }

    //--------------- Methods
    public void pickO1()
    {
        for(int i = 0; i < mealsListSize+1; i++)
        {
            System.out.println("\nOption " + (i+1) + " is " + mealsList[i]);
        }
        meals = inputInt("\n\nEnter your option: ");
        input("\nYou chose " + mealsList[meals-1] + " as your meal. Press <return> to continue");
    }
    
    public void pickBreakMain()
    {
        while (!donePick1)
        {
            int optionsLeft = 4;
            String choice;
            for (int i = 0; i < 5; i++)
            {
                cl();
                System.out.println("You have " + optionsLeft + " left to choose from. \nIf you do not choose by the last option, you will not get another option.");
                System.out.println("\n\n" + breakMainList[i]);
                choice = input("\n\nIs this a food you would be O.K. with eating?\ty/n: ");
                if(choice.equalsIgnoreCase("Y"))
                {
                    breakMain = breakMainList[i];
                    i = 5;
                    doneYet();
                    donePick1 = true;
                }
                else if ((choice.equalsIgnoreCase("N"))&&(optionsLeft == 0))
                {
                    breakMain = breakMainList[i];
                    cl();
                    input("Tough Luck. You are stuck with " + breakMain + " for breakfast. \n\nPress <return> to continue.");
                    doneYet();
                    donePick1 = true;
                }
                else if(choice.equalsIgnoreCase("N")) optionsLeft = optionsLeft - 1 ;
                else i = i - 1;
            }
        }
    }
    public void pickBreakSide()
    {
        while (!donePick1)
        {
            int optionsLeft = 4;
            String choice;
            for (int i = 0; i < 5; i++)
            {
                cl();
                System.out.println("You have " + optionsLeft + " left to choose from. \nIf you do not choose by the last option, you will not get another option.");
                System.out.println("\n\n" + breakSideList[i]);
                choice = input("\nIs this a food you would be O.K. with eating?\ty/n: ");
                if(choice.equalsIgnoreCase("Y"))
                {
                    breakSide = breakSideList[i];
                    donePick1 = true;
                    i = 5;
                    doneYet();
                }
                else if ((choice.equalsIgnoreCase("N"))&&(optionsLeft == 0))
                {
                    breakSide = breakSideList[i];
                    cl();
                    input("Tough Luck. You are stuck with " + breakSide + " for breakfast. \n\nPress <return> to continue.");
                    doneYet();
                    donePick1 = true;
                }
                else if(choice.equalsIgnoreCase("N")) optionsLeft = optionsLeft - 1 ;
                else i = i - 1;
            }
        }
    }
    public void pickLunchMain()
    {
        while (!donePick1)
        {
            int optionsLeft = 4;
            String choice;
            for (int i = 0; i < 5; i++)
            {
                cl();
                System.out.println("You have " + optionsLeft + " left to choose from. \nIf you do not choose by the last option, you will not get another option.");
                System.out.println("\n\n" + lunchMainList[i]);
                choice = input("\n\nIs this a food you would be O.K. with eating?\ty/n: ");
                if(choice.equalsIgnoreCase("Y"))
                {
                    lunchMain = lunchMainList[i];
                    donePick1 = true;
                    i = 5;
                    doneYet();
                }
                else if ((choice.equalsIgnoreCase("N"))&&(optionsLeft == 0))
                {
                    lunchMain = lunchMainList[i];
                    cl();
                    input("Tough Luck. You are stuck with " + lunchMain + " for lunch. \n\nPress <return> to continue.");
                    doneYet();
                    donePick1 = true;
                }
                else if(choice.equalsIgnoreCase("N")) optionsLeft = optionsLeft - 1 ;
                else i = i - 1;          
            }
        }
    }
    public void pickLunchSide()
    {
        while (!donePick1)
        {
            int optionsLeft = 4;
            String choice;
            for (int i = 0; i < 5; i++)
            {
                cl();
                System.out.println("You have " + optionsLeft + " left to choose from. \nIf you do not choose by the last option, you will not get another option.");
                System.out.println("\n\n" + lunchSideList[i]);
                choice = input("\n\nIs this a food you would be O.K. with eating?\ty/n: ");
                if(choice.equalsIgnoreCase("Y"))
                {
                    donePick1 = true;
                    lunchSide = lunchSideList[i];
                    i = 5;
                    doneYet();
                }
                else if ((choice.equalsIgnoreCase("N"))&&(optionsLeft == 0))
                {
                    lunchSide = lunchSideList[i];
                    cl();
                    input("Tough Luck. You are stuck with " + lunchSide + " for lunch. \n\nPress <return> to continue.");
                    doneYet();
                    donePick1 = true;
                }
                else if(choice.equalsIgnoreCase("N")) optionsLeft = optionsLeft - 1 ;
                else i = i - 1;
            }
        }
    }
    public void pickSnacks()
    {
        while (!donePick1)
        {
            int optionsLeft = 4;
            String choice;
            for (int i = 0; i < 5; i++)
            {
                cl();
                System.out.println("You have " + optionsLeft + " left to choose from. \nIf you do not choose by the last option, you will not get another option.");
                System.out.println("\n\n" + snacksList[i]);
                choice = input("\nIs this a food you would be O.K. with eating?\ty/n: ");
                if(choice.equalsIgnoreCase("Y"))
                {
                    donePick1 = true;
                    snacks = snacksList[i];
                    i = 5;
                    doneYet();
                }
                else if ((choice.equalsIgnoreCase("N"))&&(optionsLeft == 0))
                {
                    snacks = snacksList[i];
                    cl();
                    input("Tough Luck. You are stuck with " + snacks + " for a snack. \n\nPress <return> to continue.");
                    doneYet();
                    donePick1 = true;
                }
                else if(choice.equalsIgnoreCase("N")) optionsLeft = optionsLeft - 1 ;
                else i = i - 1;            
            }
        }
    }
    public void pickDinnerMain()
    {
        while (!donePick1)
        {
            int optionsLeft = 4;
            String choice;
            for (int i = 0; i < 5; i++)
            {
                cl();
                System.out.println("You have " + optionsLeft + " left to choose from. \nIf you do not choose by the last option, you will not get another option.");
                System.out.println("\n\n" + dinnerMainList[i]);
                choice = input("\nIs this a food you would be O.K. with eating?\ty/n: ");
                if(choice.equalsIgnoreCase("Y"))
                {
                    donePick1 = true;
                    dinnerMain = dinnerMainList[i];
                    i = 5;
                    doneYet();
                }
                else if ((choice.equalsIgnoreCase("N"))&&(optionsLeft == 0))
                {
                    dinnerMain = dinnerMainList[i];
                    cl();
                    input("Tough Luck. You are stuck with " + dinnerMain + " for dinner. \n\nPress <return> to continue.");
                    doneYet();
                    donePick1 = true;
                }
                else if(choice.equalsIgnoreCase("N")) optionsLeft = optionsLeft - 1 ;
                else i = i - 1;
            }
        }
    }
    public void pickDinnerSide()
    {
        while (!donePick1)
        {
            int optionsLeft = 4;
            String choice;
            for (int i = 0; i < 5; i++)
            {
                cl();
                System.out.println("You have " + optionsLeft + " left to choose from. \nIf you do not choose by the last option, you will not get another option.");
                System.out.println("\n\n" + dinnerSideList[i]);
                choice = input("\nIs this a food you would be O.K. with eating?\ty/n: ");
                if(choice.equalsIgnoreCase("Y"))
                {
                    donePick1 = true;
                    dinnerSide = dinnerSideList[i];
                    i = 5;
                    doneYet();
                }
                else if ((choice.equalsIgnoreCase("N"))&&(optionsLeft == 0))
                {
                    dinnerSide = dinnerSideList[i];
                    cl();
                    input("Tough Luck. You are stuck with " + dinnerSide + " for dinner. \n\nPress <return> to continue.");
                    doneYet();
                    donePick1 = true;
                }
                else if(choice.equalsIgnoreCase("N")) optionsLeft = optionsLeft - 1 ;
                else i = i - 1;
            }
        }
    }
    public void pickDinnerDesert()
    {
        while (!donePick1)
        {
            int optionsLeft = 4;
            String choice;
            for (int i = 0; i < 5; i++)
            {
                cl();
                System.out.println("You have " + optionsLeft + " left to choose from. \nIf you do not choose by the last option, you will not get another option.");
                System.out.println("\n\n" + dinnerDesertList[i]);
                choice = input("\nIs this a food you would be O.K. with eating?\ty/n: ");
                if(choice.equalsIgnoreCase("Y"))
                {
                    donePick1 = true;
                    dinnerDesert = dinnerDesertList[i];
                    i = 5;
                    doneYet();
                }
                else if ((choice.equalsIgnoreCase("N"))&&(optionsLeft == 0))
                {
                    dinnerDesert = dinnerDesertList[i];
                    cl();
                    input("Tough Luck. You are stuck with " + dinnerDesert + " for dissert. \n\nPress <return> to continue.");
                    doneYet();
                    donePick1 = true;
                }
                else if(choice.equalsIgnoreCase("N")) optionsLeft = optionsLeft - 1 ;
                else i = i - 1;         
            }
        }
    }
    
    public void displayMenu()
    {
        if (meals == 1) menuList = new String[] {breakMain, breakSide};
        else if (meals == 2) menuList = new String[] {lunchMain, lunchSide};
        else if (meals == 3) menuList = new String[] {snacks};
        else if (meals == 4) menuList = new String[] {dinnerMain, dinnerSide, dinnerDesert};
        if (meals != 5)
        {
            System.out.println("Here is your menu!\n");
            for (int i = 0; i < menuSize+1; i++)
            {
                System.out.println("\n" + menuList[i]);
            }
            input("\nPress <return> to continue.");
        }
    }
    
    
    public void init_values_again()
    {
        done1 = false; done2 = false; done3 = false; done4 = false; done5 = false;
        donePick1 = false;
        finished = false;
    }
    
    
    
    //Easy IO methods-------------------------

    //methods for output
    static void output(String info) { System.out.print(info); }
    static void output(double info) { System.out.println(info); }
    static void output(int info)    { System.out.println(info); }

    //method for input
    static int inputInt(String prompt)
    {
        int result = 0;

        try
        {
            result = Integer.parseInt(input(prompt).trim());
        }
        catch (Exception e)
        {
            result = 0;
        }
    
        return result;
    }


    static double inputDouble(String prompt)
    {
        double result = 0;

        try
        {
            result = Double.valueOf(input(prompt).trim()).doubleValue();
        }
        catch (Exception e)
        {
            result = 0;
        }

        return result;
    }

    
    static String input(String prompt)
    {
        String inputLine = "";

        System.out.print(prompt);
        try
        {
            java.io.InputStreamReader sys = new java.io.InputStreamReader(System.in);
            java.io.BufferedReader inBuffer = new java.io.BufferedReader(sys);
            inputLine = inBuffer.readLine();
        }
        catch (Exception e)
        {
            String err = e.toString();

            System.out.println(err);
        }
        
        return inputLine;
    }


    static String input()
    {
        return input("");
    }


}