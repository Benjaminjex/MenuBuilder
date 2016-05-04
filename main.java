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
    int meals = 0, mealsListSize = 4, menuSize = 3;//remove size of menuSize later
    String mealsList[], menu[], breakMain[], breakSide[], lunchMain[], lunchSide[], snacks[], dinnerMain[], dinnerSide[], dinnerDesert[];

    public main()
    {
        // initialise instance variables
        //constructor
        while(!done1)
        {
            init_Meals_Lists();
            cl();
            pickO1(meals);
            while (!done2)
            {
                if (meals == 1)//breakfast
                {
                    cl();
                    while (!done3)
                    {
                        randomize(breakMain[]);
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
                    cl();
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
                    cl();
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
                    cl();
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
            cl();
            displayMenu();
        }
    }

    public void cl() {output("\u000c");}
    
    public void init_Meals_Lists()//dont forget to add ways to add to lists within program
    {
        mealsList = new String[] {"Breakfast", "Lunch", "Snacks", "Dinner"};
        menu = new String[] {"test1", "test2", "test3"};//remove later
        breakMain = new String[] {"Cereal", "Oatmeal", "French Toast", "Waffles", "Yogurt"};
        breakSide = new String[] {"Smoothie", "Eggs", "Orange Juice", "Sausage", "Bagels"};
        lunchMain = new String[] {"Meat Sandwich", "Ramen Noodles", "Burger", "Tacos", "Enchilladas"};
        lunchSide = new String[] {"Lemonade", "Salad", "Cucumber", "Tomato", "Crackers"};
        snacks = new String[] {"Pudding", "Pretzels", "Salami", "Granola Bars", "Cookies"};
        dinnerMain = new String[] {"Spaghetti","Pizza","Burritos","Burgers","Polish Dogs"};
        dinnerSide = new String[] {"Fries","Rice","Corn","Peas","Asparagus"}
        dinnerDesert = new String[] {"Ice Cream","Cake","Cookies","Pie","Lemon Bar"};
    }
    
    public void displayMenu()
    {
        for (int i = 0; i < menuSize; i++)
        {
            System.out.println("\n" + menu[i]);
        }
        input("\nPress <return> to continue.");
    }
    
    public int pickO1(int meals)
    {
        for(int i = 0; i < mealsListSize; i++)
        {
            System.out.println("\nOption " + (i+1) + " is " + mealsList[i]);
        }
        meals = inputInt("\n\nEnter your option: ");
        return meals;
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
