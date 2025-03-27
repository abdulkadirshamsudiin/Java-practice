// //###################3 Java Data types ####################################
// public class Main{ 
//     // Public  funcition - Is an access modifier. allow all the code to be accessible
//     // void returns nothing. the name of the fucition is
//     public static void main(String[] args){
        
//         //Java data types
//         String name ="alex";
//         int Age = 17;
//         byte ByteMax = Byte.MAX_VALUE;
//         short shortMax = Short.MAX_VALUE;
//         Long longMax = Long.MAX_VALUE;
//         float number = Float.MAX_VALUE;
//         double maxdouble = Double.MAX_VALUE;
//         char mychar = 'A';
//         boolean isActive = true;

//         System.out.println("hello, My name is " + name);
//         System.out.println("I am " + Age +" years old" );
//         System.out.println(ByteMax);
//         System.out.println(shortMax);
//         System.out.println(longMax);
//         System.out.println(number);
//         System.out.println(maxdouble);
//         System.out.println(mychar);
//         System.out.println(isActive);



//     }
// }





// //###################  opperations & experssions ##############################################################3
// public class Main {
//     public static void main(String[] args) {
//         float num1 = 11f;
//         float num2 = 2f;

//         System.out.println(num1 + num2); // addition
//         System.out.println(num1 * num2); // multiplication
//         System.out.println(num1 / num2); // division
//         System.out.println(num1 - num2); // subtraction
//         System.out.println(5 % 3); // modulus operator

//         // ***************** abbreviations **************
//         System.out.println("This is how to abreaiate");
    
//         int mynum = 13;

//         mynum += 4;
//         System.out.println(mynum);
//         mynum -= 4;
//         System.out.println(mynum);
//         mynum /= 4;
//         System.out.println(mynum);
//         mynum %= 4;
//         System.out.println(mynum);

//         // Postfix incrementation
//         mynum  = 0;
//         System.out.println(mynum++);

//         // prefix incrementation
//         mynum  = 14;
//         System.out.println(++mynum);


//     }
// }





//###################################################### If/else Statements##########################################################################33

// public class Main{
//     public static void main(String[] args){
//         int age = 17;
        
//         if (age >= 18){
//             System.out.println("you can vote");       //sot abreviaton for print funciton
//         }else{
//             System.out.println("you can not vote, Please come in " + ( 18 - age ) + " years");
//         }
        


//     }
        
// }




// // ********************** else if statements ***********************

// public class Main{
//     public static void main(String[] args){
        
//         int year =2020;
//         if (year == 2019){
//             System.out.println("the year is =" + year);
//         }else if (year == 2020){
//             System.out.println("The year is = " + year);
//         } else{
//             System.out.println("all conditions fail");
//         }
//     }
// }





// ************************** Nested ifs ********************************

// public class Main{
//     public static void main(String[] args){
//         int age = 22;
//         if (age >= 18){
//             System.out.println("you can vote");
//             System.out.println("please put an x in the ballot");

//         }else{
//             if( 18 - age == 1){
//                 System.out.println("you can't vote;\n please come back  " + (18 - age) + " year");
//             } else {
//                 System.out.println("you can't vote:\n pease come back " + (18 - age) + " year");

//             }
//         }

//     }
// }


// ****************** Logical AND(&&) operator **************************

// public class Main{
//     public static void main(String[] args){
//         boolean isActive = false;
//         int score = 100;
//         // b0th conditions have to be true fo r it to work

//         if (score >=100 && isActive) {
//             System.out.println("you opened the next level");
//         } else {
//             System.out.println("you are at the same lever");
//         }
        
//     }
// }



//  ********************** Logical OR(||) Operator ****************************

// public class Main{
//     public static void main(String[] args){
//         int num1 = 5;
//         int num2 = 2;
        
//         if (num1 > 0 || num2 > 0){
//             System.out.println("the condition is ture.");
//         } else{
//             System.out.println("all conditions failed");
//         }
//     }
// }


// import java.util.Scanner;

// public class Main {
//     public static Scanner scanner = new Scanner(System.in);

//     public static void main(String[] args) {
//         System.out.print("What day do you want it to be? ");
//         int day = scanner.nextInt(); // Corrected Scanner method and removed duplicate declaration

//         switch (day) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             default:
//                 System.out.println("Invalid day");
//         }
//     }
// }





//  ############################################### For Loops #####################################################


// ** for loops demonstration with addition of break statement 

// public class Main {
//     public static void main(String[] args){

//         for (int i =0; i <=50; i++){
//             if (i == 20){
//                 break; // this stops the code from runnig once it reaches 19
//             }
//             System.out.println("i = " + i);
//         }
//     }
// }


// **** forloop with addition of contiune statement *** 

// public class Main{
//     public static void main(String[] args){

//         for (int i = 0; i <=100; i++){
//             if(i >= 30 && i <+ 50){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }


// ################################# While loop ##################################

// public class Main{
//     public static void main(String[] args){
        
//         int num = 0;
//         while (num <= 10){
//             num++;
//             System.out.println(num);
//         }
//     }
// }


// *********** Do while loop **************
// This allows the code to run atleast once evern if the condition is false

// public class Main{
//     public static void main(String[] args) {
        
//         int num = 0;

//         do {
//             System.out.println(num);
//         } while (num >= 1); // this is false because num = 0, but the code still runs

//     }
// }





// ############################################### Functions/methods  ############################//#endregio

// funcitions are lines of code which are grouped to gether to do a specific task examples: Math.sqrt(), System.out.println()).

// syntax:
// returnType functionName(parameters) {
//     // Function body (statements to execute)
//     return value;  // (if returnType is not void)
// }

// returnType: Type of value the function returns (e.g., int, double, String, or void for no return).

// functionName: The name of the function.

// parameters: Input values passed to the function.

// return value: The function can return a value (except if it is void).


// *** user defined funcitions ******

// public class Main{
//     public static void main(String[] args) {
//         sayhello("john", 23); // here we call the user defined funciton. if we dont put this then no output will be given
//         sayhello("shamsudin", 25); // here we call the functiona and add the desired output we want to get.
//     }
//     public static void sayhello(String name, int age){ // void means function does not return any value, () is for parameters
// // The static keyword allows it to be called directly inside main() without creating an object.
// // string name and int age are parameters

//         System.out.println("hello " + name + "your age is: " + age);
//     }
// }


// ***************** how to return value from funcitions ********************* 

// public class Main {
//     public static void main(String[] args) {
//         int max = getMax(1, 5); // Step 1: Calls the getMax() function with arguments 1 and 5
//         System.out.println(max); // Step 5: Prints the returned maximum value
//     }

//     public static int getMax(int num1, int num2) { // Step 2: Function definition, takes two integer parameters
//         if (num1 > num2) { // Step 3: Checks if num1 is greater than num2
//             return num1; // Step 4: If num1 is greater, return num1
//         } else {
//             return num2; // Step 4: Otherwise, return num2 and this is where the code stops. if you try adding nothing happens.
//         }
//     }
// }









// ####################################3 Arrays #############################################################################################//#endregion

public class Main{
    public static void main(String[] args) {
        
        int[] numbers = {12,25,30,100,22,50}; // dont forget array index starts with 0, the 1 the 2 etc

        for (int number: numbers){
            System.out.println(number);
          
    }
    // System.out.println("\n printing out: specific number, length, and name. just comment out the block of code you need");
    // System.out.println(numbers[3]);

    // **** **how to print the length frr the array ***********************
    // for (int i = 0; i < numbers.length; i++) {
    //     System.out.println(numbers[i]);
    //}

    // ***************** Stirng demonstration

    System.out.println(" \n ");
    System.out.println("how to print names in an array");
    String[] friends = {"hassan","Karanei","John","Enoch","shariff"};
    for (String friend : friends) {
        System.out.println(friend);
    }


}

}





















































































































































































































































































































































































































































