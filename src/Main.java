//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задача 1");
        int[]intsArray = new int[]{1, 2, 3}; // = {1, 2, 3};
        float[]floatsArray = {1.57f, 7.654f, 9.986f}; // new float[]
        String[]animals = new String[]{"cat","dog","humster"};
        System.out.println("");

        System.out.println("Задача 2");
        for(int i = 0; i < intsArray.length - 1; i++)
        {
            System.out.print(intsArray[i] + ", ");
        }
        System.out.println(intsArray[intsArray.length - 1]);

        for(int i = 0; i < floatsArray.length - 1; i++)
        {
            System.out.print(floatsArray[i] + ", ");
        }
        System.out.println(floatsArray[floatsArray.length - 1]);

        for(int i = 0; i < animals.length - 1; i++)
        {
            System.out.print(animals[i] + ", ");
        }
        System.out.println(animals[animals.length - 1]);

        System.out.println("");


        System.out.println("Задача 3");
        for(int i = intsArray.length - 1; i > 0; i--)
        {
            System.out.print(intsArray[i] + ", ");
        }
        System.out.println(intsArray[0]);

        for(int i = floatsArray.length - 1; i > 0; i--)
        {
            System.out.print(floatsArray[i] + ", ");
        }
        System.out.println(floatsArray[0]);

        for(int i = animals.length - 1; i > 0; i--)
        {
            System.out.print(animals[i] + ", ");
        }
        System.out.println(animals[0]);

        System.out.println("");


        System.out.println("Задача 4");
        for(int i = 0; i <= intsArray.length - 1; i++)
        {
            if(intsArray[i] % 2 != 0)
                intsArray[i]++;
        }

        for(int i = 0; i < intsArray.length - 1; i++)
        {
            System.out.print(intsArray[i] + ", ");
        }
        System.out.println(intsArray[intsArray.length - 1]);
    }
}