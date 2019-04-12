package Logic;
import java.util.concurrent.Exchanger;
public class CharComparator implements Runnable{

  char first;
    char second;
    Integer equal=0;
    CharComparator() {



    }

    public void run() {




            if(first==second){
                equal=1;
            }else{
                equal=0;
            }

            notify();


    }

    public Integer getEqual() {
        return equal;
    }
    public void setChars(char a,char b){
        this.first=a;
        this.second=b;
    }


}
