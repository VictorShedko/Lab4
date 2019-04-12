package Logic;


import java.util.concurrent.Exchanger;

public class StringComparator {



  public StringComparator(){



  }
    public void doWork(String firstString,String secondString){
        ///start new thread

        ///send data
        int cmpFlag=0;
        int size=firstString.length();
        if(secondString.length()<size)size=secondString.length();
        /// wait for data
        for(int i=0;i<size;i++) {
            CharComparator charCompare= new CharComparator();
            charCompare.setChars(firstString.charAt(i),secondString.charAt(i));
            new Thread(charCompare).start();

            wait();
            if(charCompare.getEqual()==0)cmpFlag=1;
        }
        /// get data

        ///end


    }




}
