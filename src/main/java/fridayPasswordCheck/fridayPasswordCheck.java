package fridayPasswordCheck;

import java.util.stream.IntStream;

public class fridayPasswordCheck {




                public static boolean lengthOfPassword (String password){
                       if (password.length() < 8) {

                           return false;

                        } else {

                           return true;

                        }
                }
                public static boolean numberIncluded (String password){

                   int [] numberArray = new int[10];

                    for(int i = 0; i < numberArray.length; i++){

                        numberArray[i] = 0;
                        numberArray[i] = 1;
                        numberArray[i] = 2;
                        numberArray[i] = 3;
                        numberArray[i] = 4;
                        numberArray[i] = 5;
                        numberArray[i] = 6;
                        numberArray[i] = 7;
                        numberArray[i] = 8;
                        numberArray[i] = 9;

                        }
                    return true;
                    }



                public static boolean containsLetter (String password){

                    //var trial = password.contains("[A-Z].");

                    if(password.contains("[A-Z].")){
                        return true;
                    }else {
                        return false;
                    }

                    }

                }


