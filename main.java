
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
    boolean finished = false;
    int meals = 0, mealsListSize = 4;
    String mealsList[];

    public main()
    {
        // initialise instance variables
        //constructor
        while(!done1)
        {
            init_Meals_List();
            pickO1(meals);
            /*while (!done2)
            {
                if (meals == 1)//breakfast
                {
                    while (!done3)
                    {
                        randomize(breakMain);
                        pick(breakMain);
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
                                randomize(breakSide);
                                pick(breakSide);
                            }
                        }
                    }
                }
                else if (meals == 2)//lunch
                {
                    while (!done3)
                    {
                        randomize(lunchMain);
                        pick(lunchMain);
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
                                randomize(lunchSide);
                                pick(lunchSide);
                            }
                        }
                    }
                }
                else if (meals == 3)//snacks
                {
                    while (!done3)
                    {
                        randomize(snacks);
                        pick(snacks);
                        if (finished == true)
                        {
                            done3 = true;
                            done2 = true;
                        }
                    }
                }
                else if (meals == 4)//dinner
                {
                    while (!done3)
                    {
                        randomize(dinnerMain);
                        pick(dinnerMain);
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
                                randomize(dinnerSide);
                                pick(dinnerSide);
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
                                        randomize(dinnerDesert);
                                        pick(dinnerDesert);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            displayMenu();*/
        }
    }

    public void init_Meals_List()
    {
        mealsList = new String[] {"Breakfast", "Lunch", "Snacks", "Dinner"};
    }
    
    /*public void displayMenu()
    {
        for (int i = 0; i < menuSize; i++)
        {
            print(menu[i]);
        }
    }*/
    
    public int pickO1(int meals)
    {
        for(int i = 0; i < mealsListSize; i++)
        {
            print("\n\nOption " + (i+1) + "is " + meals[i]);
        }
        meals = inputInt("Enter your option: ");
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
